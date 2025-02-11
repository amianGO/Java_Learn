package java_clases.Resolviendo_Dudas;

public class Main {
    public static void main(String[] args) {
        //Creamos la Instancia de la clase
        Fruit fruit = new Fruit();
        //Definimos los atributos de la clase Fruit
        fruit.setName("Manzana"); //Definimos el Nombre del Objeto
        fruit.setSize(18); //Definimos el tamaño del Objeto
        System.out.println("Una " + fruit.getName() + " Con " + fruit.getSize() +"Cm");
    }
}
