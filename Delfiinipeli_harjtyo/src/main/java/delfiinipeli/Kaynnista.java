package delfiinipeli;

import delfiinipeli.kayttoliittyma.*;
import delfiinipeli.logiikka.*;
import delfiinipeli.mallit.Delfiini;
import delfiinipeli.mallit.Hahmo;
import delfiinipeli.mallit.Pallo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingUtilities;

public class Kaynnista {

    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}