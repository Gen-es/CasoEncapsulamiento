/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoencapsulamiento;

/**
 *
 * @author G
 */
public class Persona {
    
    private String tipoDocumento;
    private String numeroDocumento;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String celular;
    private String correo;
    private int edad;
    private String Categoria;

    // SETTERS con validaciones

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equals("DNI") || tipoDocumento.equals("carnet de extranjería")) {
            this.tipoDocumento = tipoDocumento;
        } else {
            System.out.println("Tipo de documento inválido");
        }
    }

    public void setNumeroDocumento(String numeroDocumento) {
        if (tipoDocumento == null) {
            System.out.println("Primero debe definir el tipo de documento");
            return;
        }
        if (tipoDocumento.equals("DNI") && numeroDocumento.length() == 8) {
            this.numeroDocumento = numeroDocumento;
        } else if (tipoDocumento.equals("carnet de extranjería") && numeroDocumento.length() == 9) {
            this.numeroDocumento = numeroDocumento;
        } else {
            System.out.println("Número de documento inválido");
        }
    }

    public void setEdad(int edad) {
      if (edad >= 0 && edad <= 100) {
        this.edad = edad;
        if(edad >= 0 && edad <=10 ){
        this.Categoria = "Niño";
        }else if (edad >=11 && edad <=17){
        this.Categoria = "Adolescente";
        }else {
        this.Categoria = "Adulto";
        }
        } else {
        this.Categoria = "Edad inválida";
        }
    }

    // Otros setters (sin validación especial)

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    // MÉTODO PARA MOSTRAR DATOS

    public void mostrarDatos() {
        System.out.println("Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Documento: " + tipoDocumento + " - " + numeroDocumento);
        System.out.println("Celular: " + celular);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
        System.out.println("Categoría: " + Categoria);
    }   
}
// cambio en rama desarrollo