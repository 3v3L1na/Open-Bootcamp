public class Main {
    public static void main(String[] args) {
        Persona A = new Persona();
        A.setNombre("Evelina");
        A.setEdad(37);
        A.setTelefono(123456789);

        System.out.println(A.getNombre());
        System.out.println(A.getEdad());
        System.out.println(A.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    //Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //Edad
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }

    //Teléfono
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}

