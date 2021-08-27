module com.halefakgul.matematiksorusucozucu {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.halefakgul.matematiksorusucozucu to javafx.fxml;
    exports com.halefakgul.matematiksorusucozucu;
    exports com.halefakgul.matematiksorusucozucu.Controllers;
    opens com.halefakgul.matematiksorusucozucu.Controllers to javafx.fxml;
}