module eus.ehu.gitexercice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.gitexercice to javafx.fxml;
    exports eus.ehu.gitexercice;
}