package ba.unsa.etf.ba.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textfield;
    public Label sumica;

    int sumaCifara(int n) {
        int suma=0;
        while (n!=0){
            int broj=n%10;
            suma+=broj;
            n=n/10;
        }
        return suma;
    }

    public void izracunaj(ActionEvent actionEvent) {
        String unos = textfield.getText();
        String ispis = " ";
        int koliko=0;
        int broj = Integer.parseInt(unos);
        for(int i=1; i<=broj; i++){
            int suma=sumaCifara(i);
            if(i%suma==0) {
                ispis+=(Integer.toString(i));
                ispis+=" ";
                koliko++;
                if(koliko%8==0)ispis+="\n";
            }
        }
        sumica.setText(ispis);
    }
}
