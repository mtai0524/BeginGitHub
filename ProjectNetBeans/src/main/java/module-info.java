module com.mycompany.projectnetbeans {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projectnetbeans to javafx.fxml;
    exports com.mycompany.projectnetbeans;
}
