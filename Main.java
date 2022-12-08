
public class Main {

public static void main(String[] args) {


 Cliente cliente = new Cliente();

Trabajador trabajador = new Trabajador();


cliente.nombre = "Evelina";


cliente.edad = 37;


cliente.telefono = 123456789;


cliente.credito = 1400;

System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono + " y mi credito disponible es " + cliente.credito + "€");


trabajador.nombre = "Ruzica";


trabajador.edad = 83;

trabajador.telefono = 987654321;

 trabajador.salario = 3000;
System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
+ " y mi salario es de " + trabajador.salario + "€");

}

}


class Persona{




   int edad;




   int telefono;




   String nombre;




}

class Cliente extends Persona{

 double credito;
}

class Trabajador extends Persona {

 double salario;




}




