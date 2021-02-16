package at.htl.binding.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Platform.exit;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage stage) {
        try {
            mainStage = stage;
            setScene("mycars");
            mainStage.show();
        } catch (Exception e) {
            handleException(e);
        }
        Thread.setDefaultUncaughtExceptionHandler((thread, e) -> handleException(e));
    }

    public static void setScene(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent rootNode = fxmlLoader.load();
        mainStage.setScene(new Scene(rootNode));
    }

    private void handleException(Throwable e) {
        e.printStackTrace();
        exit();
    }

    public static void main(String[] args) {
        launch();
    }
}