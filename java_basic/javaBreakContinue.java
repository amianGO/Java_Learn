public class javaBreakContinue {
    public static void main(String[] args) {
        
        // 'break' y 'continue' nos permiten salir de una iteracion o continuar en ella

        //la declaracion 'break' nos permite saltar fuera de un bloque de codigo
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // En el momento en que  'i' sea igual a 5, saldra de la iteracion del bloque y se detendra.
            }
            System.out.println(i);
        }

        //La declaracion 'continue' rompe con una sola iteracion (en el bucle) si una condicion especifica se cumple y continua con la siguiente iteracion
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue; //Aqui le damos Skip al valor 6
            }
            System.out.println(i);
        }

        //'break' y 'continue' en el bucle 'While'
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }

        while (i < 10) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
