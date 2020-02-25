public class EncontrarSupervivientes {

    public Cola supervivientes(int n) {
        Cola caux = new Cola();
        for (int i = 1; i <= n; i++)
            caux.encolar(i);
        int tam = n;                  // numero de elementos de la cola
        int m = 2;
        int x;

        while (m <= n) {

            for (int i = 1; i <= n; i++) {
                x = caux.desencolar();
                if ((i % m) == 0)
                    tam--;
                else
                    caux.encolar(x);
            }
            m++;
            n = tam;
        }
        return caux;
    }

}
