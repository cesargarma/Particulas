package e2;

import dam.Punto;

import java.awt.*;
import java.util.Random;

public class Particula {
    /////////////
    //ATRIBUTOS//
    /////////////
    private Punto pos = null;
    private Color color = null;
    private int tipo = 0;
    private int tamaño = 0;
    private int direccion = 0;
    private int velocidad = 0;

    ///////////////
    //CONSTRUCTOR//
    ///////////////
    public Particula(int x, int y) {
        Random rnd = new Random();
        pos = new Punto(x,y);
        switch(rnd.nextInt(4)) {
            case 0: this.color = Color.RED; break;
            case 1: this.color = Color.BLUE; break;
            case 2: this.color = Color.GREEN; break;
            case 3: this.color = Color.ORANGE; break;
        }
        this.tipo = rnd.nextInt(2); //0-> circulo / 1-> cuadrado
        this.tamaño = rnd.nextInt(11)+6; //6-16
        this.direccion = rnd.nextInt(8); //0-7
        this.velocidad = rnd.nextInt(10)+1; //1-10
    }

    public void mover (int ancho, int alto) {
       switch(this.direccion){
           case 0: this.pos.abajo(velocidad); reboteAbaArr(alto); break;
           case 1: this.pos.arriba(velocidad); reboteArrAba(); break;
           case 2: this.pos.izda(velocidad); reboteIzdaDer(); break;
           case 3: this.pos.drcha(velocidad); reboteDerIzda(ancho); break;
           case 4: this.pos.derArr(velocidad); reboteDiagDerArr(ancho);break;
           case 5: this.pos.derAb(velocidad); reboteDiagDerAb(ancho, alto);break;
           case 6: this.pos.izqAb(velocidad); reboteDiagIzqAb(alto); break;
           case 7: this.pos.izqArr(velocidad); reboteDiagIzqArr(alto); break;
       }
    }

    /*public void rebotes(int ancho, int alto){
        reboteIzdaDer();
        reboteDerIzda(ancho);
        reboteAbaArr(alto);
        reboteArrAba();
        reboteDiagDerArr(ancho);
        reboteDiagDerAb(ancho, alto);
    }*/

    private void reboteDiagIzqArr(int alto) {
        if(this.pos.getX() <= 10){
            this.direccion = 4;
        }
        if(this.pos.getY() <=  20){
            this.direccion = 6;
        }
    }

    private void reboteDiagIzqAb(int alto) {
        if(this.pos.getX() <= 10){
            this.direccion = 5;
        }
        if(this.pos.getY() >= alto - 20){
            this.direccion = 7;
        }
    }

    private void reboteDiagDerAb(int ancho, int alto) {
        if(this.pos.getX() >= ancho-20){
            this.direccion = 6;
        }
        if(this.pos.getY() >= alto - 20){
            this.direccion = 4;
        }
    }

    private void reboteDiagDerArr(int ancho){
        if(this.pos.getX() >= ancho-20){
            this.direccion = 7;
        }
        if(this.pos.getY() <= 10){
            this.direccion = 5;
        }

    }

    private void reboteIzdaDer (){
        if(this.pos.getX() <= 10){
            this.direccion = 3;
        }
    }

    private void reboteDerIzda (int ancho){
        if(this.pos.getX() >= ancho-20){
            this.direccion = 2;
        }
    }

    private void reboteArrAba (){
        if(this.pos.getY() <= 10){
            this.direccion = 0;
        }
    }

    private void reboteAbaArr (int alto){
        if(this.pos.getY() >= alto-20){
            this.direccion = 1;
        }
    }

    public void dibujar (Graphics g) {
        g.setColor(this.color);
        if(this.tipo==0) {
            g.fillOval(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
            g.setColor(Color.BLACK);
            g.drawOval(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
        }else {
            g.fillRect(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
            g.setColor(Color.BLACK);
            g.drawRect(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
        }
    }
}
