import java.util.Objects;

public class persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String Dni;

    public persona(String nombre, String apellidos, int edad, String email, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        Dni = dni;
    }
    public persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        Dni = dni;
    }
    public persona() {
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
        Dni = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public void cumplirannos() {
        edad ++;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", Dni='" + Dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        persona persona = (persona) o;
        return Objects.equals(Dni, persona.Dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Dni);
    }
}
