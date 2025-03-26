package empleados;

public class EmpleadoMedioTiempo extends Empleado {
    
    public EmpleadoMedioTiempo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5;
    }
}
