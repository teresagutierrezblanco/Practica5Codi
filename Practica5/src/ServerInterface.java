
import java.rmi.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This is a remote interface for illustrating RMI client callback.
 *
 * @author M. L. Liu
 */
public interface ServerInterface extends Remote {

    public String sayHello()
            throws java.rmi.RemoteException;

// This remote method allows an object client to 
// register for callback
// @param callbackClientObject is a reference to the
//        object of the client; to be used by the server
//        to make its callbacks.
    public boolean registerForCallback( Usuario u, String clave
    ) throws java.rmi.RemoteException;

// This remote method allows an object client to 
// cancel its registration for callback
    public void unregisterForCallback(String u, String clave)
            throws java.rmi.RemoteException;
        public boolean cambiarContraseña(String usuario, String claveVieja, String claveNueva) throws java.rmi.RemoteException;

    public String verificarUsuario(String usuario, String clave) throws java.rmi.RemoteException;

    public HashMap<String, Amigo> buscarAmigos(String usuario,String clave) throws java.rmi.RemoteException;

    public boolean usuarioYaExiste(String usuario) throws java.rmi.RemoteException;

    public ArrayList<String> buscarUsuario(String buscar, String usuario) throws java.rmi.RemoteException;

    public void registrarUsuario(String usuario, String clave) throws java.rmi.RemoteException;

    public ArrayList<String> solicitudesAmistad(String usuario) throws java.rmi.RemoteException;

    public boolean aceptarAmistad(String usuario, String usuarioAmigo, String clave) throws java.rmi.RemoteException;

    public boolean solicitarAmistad(String usuario, String usuarioAmigo, String clave) throws java.rmi.RemoteException;
    
    

}
