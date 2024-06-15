package normalClasses;

import java.time.LocalDateTime;

public class Usuario {
    private String name;
    private String mail;
    private int DNI;
    private LocalDateTime FechaNacimiento;
    private String nombreUsuario;
    private String password;
    private String domicilio;

    // CONSTRUCTOR DEL USUARIO

    public Usuario(String name, int DNI, String mail, LocalDateTime fechaNacimiento, String nombreUsuario, String password, String domicilio) {
        this.name = name;
        this.DNI = DNI;
        this.mail = mail;
        FechaNacimiento = fechaNacimiento;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.domicilio = domicilio;
    }

    // GETTERS DEL USUARIO

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getDNI() {
        return DNI;
    }

    public LocalDateTime getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public String getDomicilio() {
        return domicilio;
    }

    // SETTERS DEL USUARIO


    public void setName(String name) {
        this.name = name;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

}
