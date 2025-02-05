public class javaMath {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------------------------------------------\\
        // La clase Math Contiene diversos metodos que nos ayudan a resolver Operaciones matematicas de manera mas sencilla

        // Math.max Sirve para encontrar el valor maximo entre 'x' y 'y'
        int x = 10;
        int y = 20;

        System.out.println(Math.max(x, y));

        //Math.min Sirve para encontrar el valor minimo entre 'x' y 'y'
        System.out.println(Math.min(x, y));

        //Math.sqrt Sirve para Encontrar la Raiz Cuadrada de 'x' Numero
        System.out.println(Math.sqrt(x));

        //Math.abs Sirve para Retornar el Valor Absoluto de 'x' (Positivo)
        System.out.println(-4.6);

        //Math.ramdom Sirve para retornar numeros entre 0.0(Incluyendole), y 1.0 (Excluyendole)
        System.out.println(Math.random());
        //Para conseguir numero de 0 a 100 podemos usar la siguiente formula
        int randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);
    }
}