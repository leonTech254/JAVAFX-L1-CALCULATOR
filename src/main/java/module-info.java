module com.leonteqsecurity.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.leonteqsecurity.calculator to javafx.fxml;
    exports com.leonteqsecurity.calculator;
}