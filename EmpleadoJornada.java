public class EmpleadoJornada extends Empleado {

    int horasTrabajadas; 
    int valorPorHora;

    public EmpleadoJornada(int _dni, String _nombre, String _apellido, int _horasTrabajadas, int _valorPorHora) {
        super(_dni, _nombre, _apellido);
        this.horasTrabajadas = _horasTrabajadas;
        this.valorPorHora = _valorPorHora;
    }

    @Override
    public int CalcularSueldo() {
        return this.horasTrabajadas * this.valorPorHora;
    }
    
}
