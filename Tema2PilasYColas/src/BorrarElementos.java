public class BorrarElementos {
    public void eliminarDatoR(Pila pila, int dato){
        int elemento;
        if (!pila.vacia()) {
            elemento = pila.desapilar();
            eliminarDatoR(pila, dato);
            if (elemento != dato) {
                pila.apilar(elemento);
            }
        }
    }

    public void eliminarDato(Pila pila, int dato){
        Pila pilaAux = new Pila();
        int elemento;
        while (!pila.vacia()) {
            elemento = pila.desapilar();
            if (elemento != dato) {
                pilaAux.apilar(elemento);
            }
        }
        while (!pilaAux.vacia()) {
            pila.apilar(pilaAux.desapilar());
        }
    }
    public int eliminarDato2R(Pila pila, int dato){    //Devuelve el número de elementos que se han eliminado
        int elemento, borrados;
        if (!pila.vacia()) {
            elemento = pila.desapilar();
            borrados = eliminarDato2R(pila, dato);
            if (elemento != dato) {
                pila.apilar(elemento);
            } else {
                borrados++;
            }
            return borrados;
        } else {
            return 0;
        }
    }
}
