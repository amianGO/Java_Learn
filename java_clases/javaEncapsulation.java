package java_clases;

public class javaEncapsulation {
    /* La encapsulacion tiene como objetivo esconder los datos sensibles del usuario
     * -> Declarado clases o Variables/Atributos de tipo privado
     * -> Brindando metodos como get y set, para acceder y actualizar valores de una variable privada
     */

    /* Get y Set
     * En Capitulos anteriores hemos usado variables de tipo privado, las cuales solo podemos acceder mediante los metodos get y set
     * 
     * -> El metodo get retorna el valor de la variable
     * -> El metodo Set define el valor
     *///Ejemplo

     private String name;

     //Getter
     public String getName(){ //Retorna el valor de la variable
        return name;
     }

     //Setter
     public void setName(String Name){ //Toma un parametro y lo asigna a la variable, en este caso (name)
        this.name = Name;
     }

}

class Person{
    public static void main(String[] args) {
        javaEncapsulation newObject = new javaEncapsulation();
        //newObject.name = "John"; //Esto genera un error ya que la variable esta declarada como privada
        //System.out.println(newObject.name); //Esto genera un error

        //Para generarle valor
        newObject.setName("Edwin"); //Asignamos el valor de la variable
        System.out.println(newObject.getName());
    }

    /* ¿Porque usar la Encapsulacion? 
     * -> Mejor Cintrol de clases, atributos y metodos
     * -> Podemos definir si solo se lee o se edita usando get y set
     * -> Ayuda a la flexibilidad del codigo
     * -> Incrementa la seguridad de los datos
    */
}
