public class EmpleadoEfectivo extends Empleado {

    private int sueldo;
    private int antiguedad;

    public EmpleadoEfectivo(int _dni, String _nombre, String _apellido, int _sueldo, int _antiguedad) {
        super(_dni, _nombre, _apellido);
        this.sueldo = _sueldo;
        this.antiguedad = _antiguedad;

    }

   @Override
   public int CalcularSueldo() {
       return (this.sueldo + (this.antiguedad * 1000));
   }

}
