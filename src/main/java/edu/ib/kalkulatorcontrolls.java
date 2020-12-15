package edu.ib;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class kalkulatorcontrolls {
    double memory = 0;
    String operation;
    double wynik = 0;
    double anotherone =0;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button multiply;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button doublezero;

    @FXML
    private Button dot;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private Button equal;

    @FXML
    private Button devide;

    @FXML
    private Button percent;

    @FXML
    private Button plusorminus;

    @FXML
    private Button clear;

    @FXML
    private TextField display;

    @FXML
    void Changesign(ActionEvent event) {
        double current = Double.parseDouble(display.getText());
        current = current*(-1);
            display.setText(String.valueOf(current));


    }

    @FXML
    void Cleartext(ActionEvent event) {
        if(event.getSource() == clear){
            display.setText("");
            memory=0;
        }
    }

    @FXML
    void Devidenum(ActionEvent event) {
        memory = Double.parseDouble(display.getText());
        display.setText("");
        operation = "devide";
    }

    @FXML
    void Equal(ActionEvent event) {
        anotherone=Double.parseDouble(display.getText());
        DecimalFormat format = new DecimalFormat("0.#########");
        if(operation.equals("addition")) {
            wynik = memory + anotherone;
            display.setText(format.format(wynik));

        }
            else if(operation.equals("minus")){
            wynik = memory - anotherone;
            display.setText(format.format(wynik));
            }
            else if(operation.equals("multiply")){
                wynik = memory*anotherone;
            display.setText(format.format(wynik));
        }
            else if(operation.equals("devide")){
                wynik = (Double) memory/anotherone;
            display.setText(format.format(wynik));
        }
            else if(operation.equals("makePercent")) {
            wynik = wynik * 100;
            display.setText(format.format(wynik));
        }


    }

    @FXML
    void Multiplynum(ActionEvent event) {
        memory = Double.parseDouble(display.getText());
        display.setText("");
        operation = "multiply";
    }

    @FXML
    void adddot(ActionEvent event) {
        if(event.getSource() == dot){
            if(display.getText().contains(".")){

            }else if(display.getText().equals("")){

            }
            else {
                display.setText(display.getText()+".");
            }
        }
    }

    @FXML
    void ekran(ActionEvent event) {

    }

    @FXML
    void iseight(ActionEvent event) {
        if(event.getSource() == eight){
            display.setText(display.getText()+"8");
        }
    }

    @FXML
    void isfive(ActionEvent event) {
        if(event.getSource() == five){
            display.setText(display.getText()+"5");
        }
    }

    @FXML
    void isfour(ActionEvent event) {
        if(event.getSource() == four){
            display.setText(display.getText()+"4");
        }
    }

    @FXML
    void isnine(ActionEvent event) {
        if(event.getSource() == nine){
            display.setText(display.getText()+"9");
        }
    }

    @FXML
    void isone(ActionEvent event) {
        if(event.getSource() == one){
            display.setText(display.getText()+"1");
        }

    }

    @FXML
    void isseven(ActionEvent event) {
        if(event.getSource() == seven){
            display.setText(display.getText()+"7");
        }
    }

    @FXML
    void issix(ActionEvent event) {
        if(event.getSource() == six){
            display.setText(display.getText()+"6");
        }
    }

    @FXML
    void isthree(ActionEvent event) {
        if(event.getSource() == three){
            display.setText(display.getText()+"3");
        }
    }

    @FXML
    void istwo(ActionEvent event) {
        if(event.getSource() == two){
            display.setText(display.getText()+"2");
        }
    }

    @FXML
    void makePercent(ActionEvent event) {
        memory = Double.parseDouble(display.getText());
        display.setText(wynik*100+"%");
        operation = "makePercent";
    }


    @FXML
    void numdoubleZero(ActionEvent event) {
        if(event.getSource() == doublezero){
            display.setText(display.getText()+"00");
        }
    }

    @FXML
    void numzero(ActionEvent event) {
        if(event.getSource() == zero){
            display.setText(display.getText()+"0");
        }
    }

    @FXML
    void sum(ActionEvent event) {

            memory = Double.parseDouble(display.getText());
            display.setText("");
            operation="addition";

    }

    @FXML
    void takeaway(ActionEvent event) {
        memory = Double.parseDouble(display.getText());
        display.setText("");
        operation = "minus";
    }

    @FXML
    void initialize() {
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert doublezero != null : "fx:id=\"doublezero\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert equal != null : "fx:id=\"equal\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert devide != null : "fx:id=\"devide\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert plusorminus != null : "fx:id=\"plusorminus\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'scenecalculator.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'scenecalculator.fxml'.";

    }
}
