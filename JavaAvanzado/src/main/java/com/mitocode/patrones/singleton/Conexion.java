
package com.mitocode.patrones.singleton;

/**
 * Clase Conexion
 * Ejemplo de uso de un Patrón Singleton
 * @author weltonvs
 */
public class Conexion {
    //Método privado estatico para que comparta con otras objetos esa instancia.
    private static Conexion instancia;
    //private static Conexion instancia = new Conexion();

    /**
     * Método constructor privado de la clase Conexion
     * 2º requisito para que cumpla con el patrón.
     */
    private Conexion() {
    }

    /**
     * Método que devuelve una instancia de la Conexion
     * 3ª requisito para que cumpla con el patrón.
     * @return instancia
     */
    public static Conexion getInstancia() {
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    /**
     * Método de prueba conectar
     */
    public void conectar(){
        System.out.println("Me conecté con la BD.");
    }
    
    public void desconectar(){
        System.out.println("Me desconecté de la BD.");
    }
}
