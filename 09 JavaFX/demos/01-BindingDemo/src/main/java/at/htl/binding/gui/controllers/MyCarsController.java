package at.htl.binding.gui.controllers;

import at.htl.binding.model.cars.Car;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.input.InputEvent;

import java.time.LocalDate;
import java.util.Comparator;

public class MyCarsController {

    @FXML private ListView<Car> carsListView;
    @FXML private TextField modelTextField;
    @FXML private ComboBox<String> makerComboBox;
    @FXML private DatePicker registrationDatePicker;
    @FXML private Spinner<Integer> creationYearSpinner;
    @FXML private CheckBox electricCheckBox;
    @FXML private Button addButton;
    @FXML private CheckBox firstCheckBox;
    @FXML private CheckBox lastCheckBox;
    @FXML private CheckBox firstHalfCheckBox;
    @FXML private CheckBox secondHalfCheckBox;

    private final ObservableList<Car> cars = FXCollections.observableArrayList(
            new Car("Golf", "VW", 2014, LocalDate.of(2015, 1, 7), false),
            new Car("Passat", "VW", 2016, LocalDate.of(2016, 4, 2), false),
            new Car("i3", "BMW", 2020, LocalDate.of(2020, 10, 27), true),
            new Car("X3", "BMW", 2017, LocalDate.of(2017, 12, 13), false),
            new Car("Yaris", "Toyota", 2017, LocalDate.of(2018, 2, 11), false),
            new Car("A3", "Audi", 2019, LocalDate.of(2019, 8, 4), false)
    );

    private final ObservableList<String> makers = FXCollections.observableArrayList(
            "VW",
            "Mercedes",
            "BMW",
            "Toyota",
            "Skoda",
            "Tesla"
    );


    @FXML
    private void initialize() {
        initListView();
        bindCheckBoxes();
        consumeCheckBoxEvents();
        initCarForm();
    }

    private void initListView() {
        Comparator<Car> comparator = Comparator.comparing(Car::getMaker).thenComparing(Car::getModel);
        carsListView.setItems(cars.sorted(comparator));
    }

    private void bindCheckBoxes() {
        ReadOnlyIntegerProperty selectedIndex = carsListView.getSelectionModel().selectedIndexProperty();
        firstCheckBox.selectedProperty().bind(
                selectedIndex.isEqualTo(0)
        );
        lastCheckBox.selectedProperty().bind(
                selectedIndex.isEqualTo(Bindings.size(cars).subtract(1))
        );
        firstHalfCheckBox.selectedProperty().bind(
                selectedIndex.lessThan(Bindings.size(cars).divide(2))
                .and(selectedIndex.greaterThanOrEqualTo(0))
        );
        secondHalfCheckBox.selectedProperty().bind(
                selectedIndex.greaterThanOrEqualTo(Bindings.size(cars).divide(2))
        );
    }

    private void consumeCheckBoxEvents() {
        firstCheckBox.addEventFilter(InputEvent.ANY, Event::consume);
        lastCheckBox.addEventFilter(InputEvent.ANY, Event::consume);
        firstHalfCheckBox.addEventFilter(InputEvent.ANY, Event::consume);
        secondHalfCheckBox.addEventFilter(InputEvent.ANY, Event::consume);
    }

    private void initCarForm() {
        makerComboBox.setItems(makers.sorted());

        creationYearSpinner.setValueFactory(
                new IntegerSpinnerValueFactory(1980, LocalDate.now().getYear(), 2018)
        );

        addButton.setOnAction(actionEvent -> {
            addCar();
            clearCarForm();
        });

        IntegerBinding registrationYear = Bindings.selectInteger(registrationDatePicker.valueProperty(), "year");
        IntegerBinding creationYear = Bindings.selectInteger(creationYearSpinner.valueProperty());
        addButton.disableProperty().bind(
                modelTextField.textProperty().isEmpty()
                .or(makerComboBox.valueProperty().isNull())
                .or(registrationDatePicker.valueProperty().isNull())
                .or(registrationYear.lessThan(creationYear))
        );
    }

    private void addCar() {
        Car car = new Car(
                modelTextField.getText(),
                makerComboBox.getValue(),
                creationYearSpinner.getValue(),
                registrationDatePicker.getValue(),
                electricCheckBox.isSelected()
        );
        cars.add(car);
    }

    private void clearCarForm() {
        modelTextField.clear();
        makerComboBox.setValue(null);
        registrationDatePicker.setValue(null);
        creationYearSpinner.getValueFactory().setValue(2018);
        electricCheckBox.setSelected(false);
    }

}
