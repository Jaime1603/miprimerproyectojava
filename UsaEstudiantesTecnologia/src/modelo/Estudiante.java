package modelo;

public class Estudiante {
    private int codigo;
    private String nombre;
    private double notaDesarrollo;
    private double notaMate;

    public Estudiante(int codigo, String nombre, double notaDesarrollo, double notaMate) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.notaDesarrollo = notaDesarrollo;
    this.notaMate = notaMate;

    }

    public double calcularDefinitiva() {
        return (notaDesarrollo * 0.60) + (notaMate * 0.40);
    }

    public String calcularAprobacion(){
        if (calcularDefinitiva() < 3.5){
            return "No aprobo";
        }else{
            return "Aprobo";
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 21000) {
            this.codigo = codigo;
        }else{
            System.out.println("Error, el codigo debe ser mayor a 21000");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        if (notaDesarrollo > 5.0 || notaDesarrollo < 0.0){
            System.out.println("Nota invalida, intente de nuevo: ");
        }else {
            this.notaDesarrollo = notaDesarrollo;
        }
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        if (notaMate > 5.0 || notaMate < 0.0){
            System.out.println("Nota invalida intente de nuevo: ");
        }else{
            this.notaMate = notaMate;
        }
    }
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre='" + nombre + '\'' + ", notaDesarrollo= " + notaDesarrollo + ", notaMate= " + notaMate + " Definitiva: " + calcularDefinitiva() + " Estado" + calcularAprobacion() + '}';
    }
}
