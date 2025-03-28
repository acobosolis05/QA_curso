package com.airam;



public class Usuario {
    
    private String nombre;
    private String email;
    private String password;
    private int saldo;
    private String id;

    public Usuario(String nombre, String email, String password, int saldo, String id) {
        
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.saldo = saldo;
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", saldo=" + saldo +
                ", id='" + id + '\'' +
                '}';
    }
}
