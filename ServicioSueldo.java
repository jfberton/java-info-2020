public class ServicioSueldo {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoEfectivo(1234, "Homero", "Simpson", 13000, 2);
        Empleado emp2 = new EmpleadoJornada(5555, "Lisa", "Simpson", 20, 2);
        
        System.out.println(emp1);
        System.out.println(emp1.CalcularSueldo());
        System.out.println(emp2);
        System.out.println(emp2.CalcularSueldo());
    }
}
