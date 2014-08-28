package delfiinipeli.kayttoliittyma;

import delfiinipeli.logiikka.*;
import java.awt.*;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Piirtoalusta piirtoalusta;
    private int ikkunanKorkeus;
    private int ikkunanLeveys;
    private Peli peli;

    public Kayttoliittyma(Peli peli, Piirtoalusta piirtoalusta) {
        this.piirtoalusta = piirtoalusta;
        this.peli = peli;
    }

    @Override
    public void run() {
        this.ikkunanKorkeus = 650;
        this.ikkunanLeveys = 1050;
        frame = new JFrame("Delfiinipeli");
        frame.setPreferredSize(new Dimension(ikkunanLeveys, ikkunanKorkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
        frame.addKeyListener(new NappaimistonKuuntelija(this.peli, piirtoalusta));
    }
// private JPanel luoValikko() {
// JPanel panel = new JPanel
// }

    public JFrame getFrame() {
        return frame;
    }

    public int getIkkunanLeveys() {
        return this.ikkunanLeveys;
    }

    public int getIkkunanKorkeus() {
        return this.ikkunanKorkeus;
    }
}