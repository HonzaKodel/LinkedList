package com.company;

import javafx.scene.control.ChoiceDialog;

public class Main {

    public static void main(String[] args) {
        Uzel main = initSeznam(5);
    }
    public static Uzel initSeznam(int delkaSeznamu){
        Uzel prvniUzel = new Uzel(1);
        Uzel posledniUzel = new Uzel(5);

        for (int i = 2; i <= delkaSeznamu; i++) {
            prvniUzel.getFront();
            posledniUzel.getLast();
        }
        return prvniUzel;
    }
}




