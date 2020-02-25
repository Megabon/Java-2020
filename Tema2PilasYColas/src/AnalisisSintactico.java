public class AnalisisSintactico {
    public boolean esApertura(char c) {
        if (c == '(' || c == '[') {
            return true;
        } else {
            return false;
        }
    }

    public boolean esCierre(char c) {
        if (c == ')' || c == ']') {
            return true;
        } else {
            return false;
        }
    }

    public boolean emparejados(char apertura, char cierre) {
        if ((apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']')) {
            return true;
        } else {
            return false;
        }
    }


    // Método válido si tenemos una pila de carácteres
  /*
    public boolean analizar(String expresion) {

        Pila pila = new Pila();                         //construiremos una Pila de caracteres
        int pos = 0;
        char car, aux;
        boolean error = false;
        while (pos < expresion.length() && !error) {
            car = expresion.charAt(pos);
            if ((this.esApertura(car))) {
                pila.apilar(car);
            } else {
                if ((this.esCierre(car))) {
                    if (!pila.vacia()) {
                        aux = pila.desapilar();
                        if (!this.emparejados(aux, car)) {
                            error = true;
                        }
                    } else {
                        error = true;
                    }
                }
            }
            pos++;
        }
        return !error && pila.vacia()
    }                                                            //Fin del método analizar
*/
    // Método en el que usamos la pila de enteros que tenemos implementada y hacemos conversión de tipos
    public boolean analizar(String expresion) {
        Pila pila = new Pila();
        int pos = 0;
        boolean error = false;
        while (pos < expresion.length() && !error) {
            char car = expresion.charAt(pos);
            if ((this.esApertura(car))) {
                pila.apilar((int) car);
            } else {
                if ((this.esCierre(car))) {
                    if (!pila.vacia()) {
                        char cima = (char) pila.desapilar();
                        if (!this.emparejados(cima, car)) {
                            error = true;
                        }
                    } else {
                        error = true;
                    }
                }
            }
            pos++;
        }
        return !error && pila.vacia();


    }  // Fin de analizar


}
