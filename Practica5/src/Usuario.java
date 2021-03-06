
import java.io.Serializable;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teres
 */
public class Usuario implements Serializable  {
    private  String nombre;
    
    private HashMap<String, Usuario> amigos;
    private ClientInterface interfaz;
    private Client2Interface interfaz2;
    
    public Usuario(String nombre,ClientInterface interfaz, Client2Interface interfaz2) {
        this.nombre = nombre;
        
        this.amigos= new HashMap<>();
        this.interfaz=interfaz;
        this.interfaz2=interfaz2;
    }

    public Client2Interface getInterfaz2() {
        return interfaz2;
    }

   

    

    public ClientInterface getInterfaz() {
        return interfaz;
    }
    
    public HashMap<String, Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(Usuario amigo) {
        this.amigos.put(amigo.getNombre(), amigo);
    }
    public void borrarAmigos(Usuario amigo) {
        this.amigos.remove(amigo.getNombre());
    }
   

    public String getNombre() {
        return nombre;
    }

   
    
    
}
