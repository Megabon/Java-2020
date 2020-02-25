public class Cola {
    private Nodo cabeza, fin;
    private int numElem;

    public Cola() {                 //Constructor
        cabeza = null;
        fin = null;
        numElem = 0;
    }

    public boolean vacia() {
        // Comprueba si la cola está vacía
        return cabeza == null;
    }

    public void encolar(int v) {
        Nodo nuevo = new Nodo(v, null);
        if (cabeza != null)
            fin.setSiguiente(nuevo);

        else
            cabeza = nuevo;
        fin = nuevo;
        numElem++;
    }
    public int desencolar() {
        Nodo aux;
        int resul = -9999;

        if (cabeza == null)
            System.out.println("Error, la cola está vacía");
        else {
            aux= cabeza;
            cabeza = aux.getSiguiente();
            resul = aux.getDato();
            if (cabeza == null)
                fin = null;

            numElem--;
        }
        return resul;
    }
    public void quitarPrimero() {
        Nodo aux= cabeza;
        if (!this.vacia()) {
            cabeza = aux.getSiguiente();
            if (cabeza == null)
                fin = null;

            numElem--;
        } else
            System.out.println("Error, la cola está vacía");
    }

    public int getPrimero() {
        int resul = -999;

        if (!this.vacia()) {
            resul = cabeza.getDato();
        } else
            System.out.println("Error, la cola está vacía");
        return resul;
    }

    public int getNumElementos() {
        return numElem;
    }


    public void mostrar() {
        Nodo aux;
        System.out.println();
        System.out.println("Contenido de la cola: ");
        aux = cabeza;
        while (aux != null) {
            System.out.print("  "+aux.getDato());
            aux = aux.getSiguiente();
        }
    }

}
