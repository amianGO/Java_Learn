public class javaConditions {
    public static void main(String[] args) {
        
        /* En java existen formas para validar Cosas, a las cuales llamamos sentencias Condicionales las cuales son:
        - 'if' el cual ejecutara un bloque de codigo si su condicional es true
        - 'else' se ejecutara en caso de que la condicion if, sea false
        - 'else if' se usara para crear una nueva condicion si la anterior condicion if es false
        - 'switch' se usara para crear varias condiciones las cuales ejecutaran su bloque de codigo
        */

         //------------------------------------------------------------------------------------------------------------------\\
         int x = 10;
         int y = 5;
         
         //Condicion 'if'
         if (10 > 5) { //Si esto es Verdadero se ejecutara el Bloque de codigo
            System.out.println("10 si es mayor que 5"); //Este es el bloque de codigo
         }
        
         //Tambien Podemos ejecutar la Condicion 'if' Con variables
        if (x > y) {
            System.out.println("x es mayor que y");
        }
        
        //------------------------------------------------------------------------------------------------------------------\\

        //Condicion 'else'
        if (x < y) { 
            System.out.println("Si es Mayor :0");
        } else { //Si la condicion 'if' es false se ejecutara el bloque de codigo de la sentencia else
            System.out.println("Cuando?");
        }

        //------------------------------------------------------------------------------------------------------------------\\

        //Condicion 'else if'
        int hour = 17;
        if (hour < 12) {
            System.out.println("Buenos Dias");
        } else if (hour < 18) {
            System.out.println("Buenas Tardes");
        } else {
            System.out.println("Buenas Noches");
        }

        //------------------------------------------------------------------------------------------------------------------\\

        //Ternary Operator

        /* Podemos usar esta forma para ahorrarnos multiples lineas de Codigo a una sola linea 
         Syntax: (variable = (condition) ? expressionTrue: expressionFalse)
        *///Ejemplo resumiendo El ejercicio anterior

        String response = (hour < 12) ? "Buenos dias" : "Buenas Tardes";
        System.out.println(response);

        //------------------------------------------------------------------------------------------------------------------\\

        //Ejemplo

        int password = 1234;
        if (password == 1234) {
            System.out.println("Bienvenido Usuario");
        }else {
            System.out.println("Contraseña Incorrecta");
        }

        int num = 10;
        if (num > 0) {
            System.out.println("El numero es Positivo");
        } else if (num < 0) {
            System.out.println("El numero es Negativo");
        } else {
            System.out.println("El numero es 0");
        }

    }
    
}
