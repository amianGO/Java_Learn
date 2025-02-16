package java_clases.Resolviendo_Dudas;

//Clase Abstracta
abstract class abstractModifier {
    public String name = "Jhon";
    public int age = 80;
    public abstract void work(); //Metodo abstracto
}

//Subclase que hereda de la clase Principal 'abstractModifier'
class job extends abstractModifier {
    public int pension = 2026;

    public void work(){ //El cuerpo de el metodo abstracto se define aqui
        System.out.println("Trabaja duro mas tiempo");
    }
}

//Creemos una segunda clase, dentro del mismo paquete
class example{
    public static void main(String[] args) {
        job newObject = new job();
        System.out.println("Nombre: " + newObject.name);
        System.out.println("Edad: " + newObject.age);
        System.out.println("Año de retiro: " + newObject.pension);
        newObject.work();//Llamamos al metodo abstracto
    }
}