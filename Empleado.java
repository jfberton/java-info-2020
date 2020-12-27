public abstract class Empleado {
    
    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int _dni, String _nombre, String _apellido) {
        this.dni = _dni;
        this.nombre = _nombre;
        this.apellido = _apellido;
    }

    public abstract int CalcularSueldo();

    @Override
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.apellido + ", " + this.nombre;
    }

}
