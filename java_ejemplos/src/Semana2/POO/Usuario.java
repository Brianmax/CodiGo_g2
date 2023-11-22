package Semana2.POO;

public class Usuario {
    // atributos
    private String username;
    private String password;
    private byte edad;
    private Perfil perfil;

    // metodos
    public Usuario(String username, String password, byte edad, Perfil perfil){
        this.username = username;
        this.password = password;
        this.edad = edad;
        this.perfil = perfil;
    }
    public Usuario(String username, String password, byte edad){
        this.username = username;
        this.password = password;
        this.edad = edad;
    }
    public void decirHola(String username){
        System.out.println("Hola " + username + ", soy" + this.username);
        // hola George, soy pepito
    }

    // Getters

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public byte getEdad(){
        return this.edad;
    }

    // setters

    public void setUsername(String username){
        // colocar validaciones extra
        this.username = username;
    }
}
