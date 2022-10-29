module com.study.autocounterjavafx {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.study.autocounterjavafx to javafx.fxml;
    exports com.study.autocounterjavafx;
}