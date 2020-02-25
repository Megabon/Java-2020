public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo(int dato, Nodo sig) {
        this.dato = dato;
        this.siguiente = sig;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo sig) {
        this.siguiente = sig;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dat) {
        this.dato = dat;
    }
}