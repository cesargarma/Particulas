package dam;

import java.awt.*;

public class Punto {
    /////////////
    //ATRIBUTOS//
    /////////////
    private int x = 0, y=0;


    ///////////////
    //CONSTRUCTOR//
    ///////////////
    public Punto(int x, int y) {
        mover(x, y);
    }

    //sobrecarga
    //valor por defecto (0,0)
    public Punto () {}
    //valores iguales a un punto ya creado
    public Punto(Punto p) {
        this(p.x, p.y);

        /*Es lo mismo que
         *
         * this.x = p.x;
         * this.y = p.y;
         */
    }

    ///////////////////////////////////////////////
    //METODOS DE ACCESO / CONSULTA DE INFORMACION//
    ///////////////////////////////////////////////
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /////////////////////
    //METODOS GENERALES//
    /////////////////////
    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /////////////////////
    //mover hacia abajo//
    /////////////////////
    public void abajo(int desp) {
        this.y += Math.abs(desp);
    }
    //spobrecarga
    public void abajo() {
        this.abajo(1);
    }

    //////////////////////
    //mover hacia arriba//
    //////////////////////
    public void arriba(int desp) {
        this.y -= Math.abs(desp);
    }
    //sobrecarga
    public void arriba() {
        this.arriba(1);
    }

    ///////////////////////
    //mover hacia derecha//
    ///////////////////////
    public void drcha(int desp) {
        this.x += Math.abs(desp);
    }
    //sobrecarga
    public void drcha() {
        this.drcha(1);
    }

    ////////////////////
    //mover hacia izda//
    ////////////////////
    public void izda(int desp) {
        this.x -= Math.abs(desp);
    }
    //sobrecarga
    public void izda() {
        this.izda(1);
    }

    /////////////////////////////////
    //Mover diagonal derecha-arriba//
    /////////////////////////////////
    public void derArr(int desp){
        this.x += Math.abs(desp);
        this.y -= Math.abs(desp);
    }
    public void derArr(){
        this.derArr(1);
    }

    ////////////////////////////////
    //Mover diagonal derecha-abajo//
    ////////////////////////////////
    public void derAb(int desp){
        this.x += Math.abs(desp);
        this.y += Math.abs(desp);
    }
    public void derAb(){
        this.derAb(1);
    }

    ///////////////////////////////////
    //Mover diagonal izquierda-arriba//
    ///////////////////////////////////
    public void izqArr(int desp){
        this.x -= Math.abs(desp);
        this.y -= Math.abs(desp);
    }
    public void izqArr(){
        this.izqArr(1);
    }

    ///////////////////////////////////
    //Mover diagonal izquierda-abajo//
    ///////////////////////////////////
    public void izqAb(int desp){
        this.x -= Math.abs(desp);
        this.y += Math.abs(desp);
    }
    public void izqAb(){
        this.izqAb(1);
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }


}
