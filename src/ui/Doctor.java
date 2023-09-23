package ui;

public class Doctor {
    //Atributos
    static int id = 0; //Al declararla static, podemos utilizarla más allá de la instanciación del objeto
    String email;
    String name;
    String speciality;

    /*De esta forma definimos nuestro metodo constructor,
    si no lo hacemos por defecto crea uno vacio*/
    Doctor(){
        System.out.println("Construyendo el objeto doctor");
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
    }

    //Comportamientos - metodos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID ui.Doctor: " + id);
    }


}
