import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //********************************************** Pilas ************************************************************

        //******************************************Ejemplos transparencias ********************************************

        Pila pila1 = new Pila(); //Se crea el objeto pila1
        for (int i = 0; i < 8; i++)
            pila1.apilar(i);                              //Se mandan mensajes
        // al objeto pila1 con “.”
        pila1.apilar(19);
        pila1.apilar(24);
        pila1.apilar(48);


        System.out.println("El elemento que se ha sacado de la pila es " + pila1.desapilar());

        pila1.quitarCima();           // se elimina un elemento de la pila (la cima)

        System.out.println("La cima de la pila es " + pila1.getCima());
        System.out.println("El número de elementos de la pila es   " + pila1.getNumElementos());
        pila1.mostrar();

        pila1.mostrar();

        //...............................................................................................


        //******************************* Pruebas Clase BorrarElementos ************************************************
        //******************************* Algoritmos Recursivos sobre Pilas ********************************************

        Pila pila = new Pila();
        pila.apilar(4);
        pila.apilar(1);
        pila.apilar(4);
        pila.apilar(5);
        pila.mostrar();
        BorrarElementos borrarElementos = new BorrarElementos(); //
        borrarElementos.eliminarDato(pila, 2);
        pila.mostrar();


        //**************************************************************************************************************

        //******************************* Pruebas Clase AnalisisSintactico ************************************************

        Scanner sc = new Scanner(System.in);
        String expresion;
        System.out.println("Introduce la expresión: ");
        expresion = sc.nextLine();
        AnalisisSintactico analisisSintactico = new AnalisisSintactico();
        if (analisisSintactico.analizar(expresion)) {
            System.out.println("Expresión correcta");
        } else {
            System.out.println("Expresión incorrecta");
        }

        //******************************************************************************************************************


        //******************************************************** Pruebas Ejecicios Pilas**********************************

 /*
        Pila pila2 = new Pila(); //Se crea el objeto pila2
        for (int i =10; i < 18; i++)
            pila2.apilar(i);
        // al objeto pila1 con “.”
        pila2.apilar(100);
        pila2.apilar(200);
        pila2.apilar(300);
        pila2.mostrar();

        UtilizarPilas objUtilizarPilas = new UtilizarPilas();

        System.out.println("Solucion Iterativa el elemento 19 la pila está en la pila1:   " + objUtilizarPilas.estaContenido(pila1, 19));
        pila1.mostrar();
        System.out.println("Solucion Iterativa el elemento 8 la pila está en la pila1:   " + objUtilizarPilas.estaContenido(pila1, 8));
        pila1.mostrar();
        System.out.println("Solucion Recursiva el elemento 19 la pila está en la pila1:   " + objUtilizarPilas.estaContenidoR(pila1, 19));
        pila2.mostrar();
        System.out.println("Solucion Recursiva el elemento 8 la pila está en la pila1:   " + objUtilizarPilas.estaContenidoR(pila1, 19));
        pila2.mostrar();


        System.out.println(" Escribir Pila Solucion Iterativa");
        objUtilizarPilas.escribirPila(pila1);

        System.out.println(" Escribir Pila Solucion Recursiva");
        objUtilizarPilas.escribirPilaR(pila1);



        System.out.println("el fondo de pila1 es:  "+objUtilizarPilas.quitarFondo(pila1));
        pila1.mostrar();
        System.out.println("el fondo de pila2 es:  "+objUtilizarPilas.quitarFondo(pila2));
        pila2.mostrar();



        objUtilizarPilas.unirPilas(pila1,pila2);
        System.out.println(" pila 1 después de la unión");
        pila1.mostrar();
        System.out.println(" pila 2 después de la unión");
        pila2.mostrar();



*/

        //*********************************************************** Colas **************************************************

        //******************************************Ejemplos transparencias ********************************************


        Cola cola1 = new Cola();                       // Se crea el objeto cola1

        for (int i = 0; i < 8; i++)
            cola1.encolar(i);                          // Se mandan mensajes
        // al objeto cola1 con “.”
        cola1.encolar(19);
        cola1.encolar(24);
        cola1.encolar(48);

        System.out.println(" El  elemento que se sacado de la cola es " + cola1.desencolar());

        cola1.quitarPrimero(); // se elimina el primer elemento de la cola

        System.out.println("El primer elemento de la cola es " + cola1.getPrimero());
        System.out.println("La número de elementos de la cola  es   " + cola1.getNumElementos());
        cola1.mostrar();


        //****************************************** Pruebas Encontrar Supervivientes**********************

        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        EncontrarSupervivientes superv = new EncontrarSupervivientes();
        Cola cc = new Cola();
        cc = superv.supervivientes(10);
        cc.mostrar();


        //********************************* Pruebas Ejercicios Colas*************************************************


        UtilizarColas objUtilizarColas = new UtilizarColas();
        /*
        System.out.println("la posición del elemento  del 4 en la cola1 es:  "+ objUtilizarColas.PosicionEnCola(cola1,4));
        System.out.println("la posición del elemento  del 19 en la cola1 es:  "+objUtilizarColas.PosicionEnCola(cola1,19));
        System.out.println("la posición del elemento  del 33 en la cola1 es:  "+objUtilizarColas.PosicionEnCola(cola1,33));


        Cola cola2 = new Cola();                                    // Se crea el objeto cola2
        cola2.encolar(100);
        cola2.encolar(200);
        cola2.encolar(300);
        cola2.mostrar();

        System.out.println("la cola resultante de mesclar cola1 y cola2 es:");

        objUtilizarColas.mezclarColas1(cola1,cola2).mostrar();

        System.out.println("la cola1 después de la mezcla: ");
        cola1.mostrar();

        System.out.println("la cola2 después de la mezcla: ");
        cola2.mostrar();


        System.out.println("**********************************************");
        System.out.println("cola3");
        Cola cola3 = new Cola();                                    // Se crea el objeto cola3
        cola3.encolar(1);
        cola3.encolar(9);
        cola3.encolar(3);
        cola3.encolar(7);
        cola3.encolar(2);
        cola3.encolar(4);
        cola3.encolar(5);
        cola3.encolar(1);

        UtilizarColas objUtilizarColas3= new UtilizarColas();

        objUtilizarColas3.sumarSegmentoInicial(cola3);

         cola3.mostrar();


        System.out.println();
        System.out.println("**********************************************");
        System.out.println("cola4");
        Cola cola4 = new Cola();
        cola4.encolar(2);// Se crea el objeto cola2
        cola4.encolar(9);
        cola4.encolar(2);
        cola4.encolar(3);
        cola4.encolar(4);
        cola4.encolar(4);
        cola4.encolar(5);
        cola4.encolar(1);

        objUtilizarColas3.sumarSegmentoInicial(cola4);

         cola4.mostrar();


   */
    }
}
