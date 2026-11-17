module pe.edu.upeu.examenfinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires javafx.base;
    requires javafx.graphics;

    opens pe.edu.upeu.examenfinal to javafx.fxml;
    opens pe.edu.upeu.examenfinal.Modelo to javafx.base,javafx.fxml;
    opens pe.edu.upeu.examenfinal.controladores to javafx.fxml;
    opens pe.edu.upeu.examenfinal.view to javafx.fxml;

    exports pe.edu.upeu.examenfinal;
    exports pe.edu.upeu.examenfinal.Utils;
    exports pe.edu.upeu.examenfinal.Test;
    exports pe.edu.upeu.examenfinal.Modelo;
    exports pe.edu.upeu.examenfinal.interfaces;
    exports pe.edu.upeu.examenfinal.implementaciones;
    exports pe.edu.upeu.examenfinal.controladores;

}