package empleados;

public class EmpleadoPorComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre, double salarioBase, double ventas, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventas * porcentajeComision);
    }
}
