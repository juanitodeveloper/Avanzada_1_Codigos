
package com.mycompany.fig14x20;

/**
Fig. 14.20: ValidacionEntrada.java
 Valida la informacion del usuario mediante expresiones regulares.
*/

public class ValidacionEntrada {
    
    //Valida el primer nombre
    public static boolean validarPrimerNombre(String primerNombre){
        return primerNombre.matches("[A-Z][a-zA-Z]*");
    }           

    //Valida el apellido
    public static boolean validarApellidoPaterno(String apellidoPaterno){
        return apellidoPaterno.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
    }

    //Valida la direccion
    public static boolean validarDireccion(String direccion){
        return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)*");
    }

    //Valida la ciudad
    public static boolean validarCiudad(String ciudad){
        return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)*");
    }
    
    //Valida el estado
    public static boolean validarEstado(String estado){
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)*");
    }
    
    //Valida el codigo postal
    public static boolean validarCP(String cp){
        return cp.matches("\\d{5}");
    }
    
    //Valida el telefono
    public static boolean validarTelefono(String telefono){
        return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
    
}
