package tema8;

public class ejercicio8 {
    public static void main(String[] args){
        System.out.println("--------------------------------------------------");
        System.out.println("ACTIVIDAD 1:");
        personas persona = new personas();
        persona.setNombre("Benjamin Olmos Cuello");
        persona.setEdad(16);
        persona.setTelefono(351268915);
        System.out.println("                    ");
        System.out.println(" Los datos de la persona se ingresaron correctamente");
        System.out.println(" Se mostraran a continuacion:");
        System.out.println(" -Nombre:" + persona.getNombre());
        System.out.println(" -Edad:"+persona.getEdad());
        System.out.println(" -Telefono:"+persona.getTelefono());
        System.out.println("--------------------------------------------------");
    }
}

class personas{
    private int edad;
    private String nombre;
    private long telefono;
    //edad
    public void setEdad(int edad){
        this.edad=edad;
        System.out.println(" /se ingreso edad");
    }
    public int getEdad(){
        return this.edad;
    }
    //telefono
    public void setTelefono(long telefono){
        this.telefono=telefono;
        System.out.println(" /se ingreso telefono");
    }
    public long getTelefono(){
        return this.telefono;
    }
    //nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
        System.out.println(" /se ingreso nombre");
    }
    public String getNombre(){
            return this.nombre;
        }
}
