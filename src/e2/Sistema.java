package e2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Sistema {

    //private Particula p1;
    private ArrayList<Particula> lista = new ArrayList<>();

    public Sistema(int ancho, int alto){
        //p1= new Particula(10,10);
        Random rnd = new Random();

        for (int i = 0; i < 500; i++) {
            int x = rnd.nextInt(ancho-20);
            int y = rnd.nextInt(alto-20);
            Particula p = new Particula(x,y);
            lista.add(p);
        }
    }

    public void mostrar(Graphics g){
        //p1.dibujar(g);
        for (Particula p: lista) {
            p.dibujar(g);
        }
    }

    public void actualizar(int ancho, int alto) {
        //p1.mover();
        for (Particula p: lista) {
            p.mover();
        }
    }
}
