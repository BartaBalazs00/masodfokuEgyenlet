package barta.balazs.masodfokuegyenlet;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    private TextField a, b, c;
    @FXML
    private Label x1, x2;

    public void szamolClick(ActionEvent actionEvent) {
        if(!a.getText().isEmpty() && !b.getText().isEmpty() && !c.getText().isEmpty()){
            if(!a.getText().equals("0")){
                double aNumber = Double.parseDouble(a.getText());
                double bNumber = Double.parseDouble(b.getText());
                double cNumber = Double.parseDouble(c.getText());
                double diszkriminans = bNumber * bNumber - 4 * aNumber * cNumber;
                if (diszkriminans < 0) {
                    x1.setText("Az egyenletnek nincs valós gyöke");
                    x2.setText("");
                }
                if (diszkriminans == 0) {
                    double eredmeny = (-bNumber / (2 * aNumber));
                    x1.setText("x1 = x2 = " + eredmeny);
                    x2.setText("");
                }
                if (diszkriminans > 0) {
                    double eredmeny1 = (-bNumber + Math.sqrt(diszkriminans)) / (2 * aNumber);
                    double eredmeny2 = (-bNumber - Math.sqrt(diszkriminans)) / (2 * aNumber);
                    x1.setText("x1= " + eredmeny1);
                    x2.setText("x2= " + eredmeny2);
                }
            } else {
                x1.setText("A nem lehet nulla");
                x2.setText("");
            }
        }
    }
}