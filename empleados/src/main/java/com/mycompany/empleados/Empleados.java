package empleados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoTiempoCompleto("Juan", 2000));
        empleados.add(new EmpleadoMedioTiempo("Maria", 1500));
        empleados.add(new EmpleadoPorComision("Carlos", 1000, 5000, 0.10));

        System.out.println("Lista de empleados y sus salarios:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - Salario: $" + e.calcularSalario());
        }
    }
}
