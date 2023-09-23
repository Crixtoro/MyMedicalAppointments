package ui;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Estas son dos formas diferentes de instanciar un objeto.
        /*Forma 1
        ui.Doctor  myDoctor1;
        myDoctor1 = new ui.Doctor();

        //Forma 2
        ui.Doctor myDoctor = new ui.Doctor("Christian Toro");
        myDoctor.showId();
        myDoctor.showName();

        ui.Doctor myDoctor1 = new ui.Doctor();
        myDoctor1.name = "Alejandro Rodriguez";
        myDoctor1.showId();
        myDoctor1.showName();*/

        //showMenu();
        Patient patient = new Patient("Clara","email@email.com.co");
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());


    }
}