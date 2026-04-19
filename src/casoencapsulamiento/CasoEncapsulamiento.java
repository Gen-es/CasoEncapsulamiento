/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoencapsulamiento;

/**
 *
 * @author G
 */
public class CasoEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona p = new Persona();

        p.setTipoDocumento("DNI");
        p.setNumeroDocumento("12345678");

        p.setNombre("Luis");
        p.setApellidoPaterno("Perez");
        p.setApellidoMaterno("Gomez");

        p.setCelular("987654321");
        p.setCorreo("luis@gmail.com");

        p.setEdad(20);

        p.mostrarDatos();
        // TODO code application logic here
    }
    
}
