module at.htl {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.postgresql.jdbc;
    requires commons.dbcp2;
    requires java.management;
    requires java.sql;
    requires java.naming;

    opens at.htl.binding.gui.controllers to javafx.fxml;
    exports at.htl.binding.gui;
}