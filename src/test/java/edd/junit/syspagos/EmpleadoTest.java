package edd.junit.syspagos;

import edd.junit.syspagos.excepciones.CargoException;
import edd.junit.syspagos.excepciones.MesesTrabajoException;
import edd.junit.syspagos.excepciones.NombreEmpleadoException;
import edd.junit.syspagos.excepciones.NumeroEmpleadoException;
import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class EmpleadoTest {

    @Test @DisplayName("Establecer numero rango valido")
    public void establecerNumero_empleado_Correcto() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("4");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(4,e.getNumero_empleado());
    }

    @Test @DisplayName("Establecer numero limite 000")
    public void establecerNumero_empleado_000() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("000");
        });
    }

    @Test @DisplayName("Establecer numeros negativos")
    public void establecerNumero_empleado_negativo() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("-345");
        });
    }

    @Test @DisplayName("Establecer numero limite 1000")
    public void establecerNumero_empleado_1000() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("1000");
        });
    }

    @Test @DisplayName("Establecer numeros superiores a 1000")
    public void establecerNumero_empleado_superiores_a_1000() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("1239");
        });
    }

    @Test @DisplayName("Establecer numero valido 999")
    public void establecerNumero_empleado_999() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("999");
        } catch (NumeroEmpleadoException ex) {
                Assertions.fail();
        }
        Assertions.assertEquals(999,e.getNumero_empleado());
    }

    @Test @DisplayName("Establecer diferente a numero")
    public void establecerNumero_empleado_diferente_a_numero() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("aaa");
        });
    }

    @Test @DisplayName("Establecer cadena nula")
    public void establecerNumero_empleado_nulo() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("");
        });
    }

    @Test @DisplayName("Establecer nombre valido")
    public void estableceNombre_empleado_Correcto() {

        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("Jorge");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("Jorge",e.getNombre_empleado());
    }

    @Test @DisplayName("Establecer nombre nulo")
    public void estableceNombre_empleado_nulo() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("");
        });
    }

    @Test @DisplayName("Establecer nombre en blanco")
    public void estableceNombre_empleado_blanco() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado(" ");
        });
    }

    @Test @DisplayName("Establecer nombre con mas de 10 posiciones")
    public void estableceNombre_empleado_mas_pos() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("Jose Miguel");
        });
    }

    @Test @DisplayName("Establecer meses valido")
    public void estableceMeses_Trabajo_Correcto() {

        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("333");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(333,e.getMeses_trabajo());
    }

    @Test @DisplayName("Establecer meses negativos")
    public void estableceMeses_Trabajo_negativos() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("-280");
        });
    }

    @Test @DisplayName("Establecer meses decimales")
    public void estableceMeses_Trabajo_decimales() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("456.4");
        });
    }

    @Test @DisplayName("Establecer meses texto")
    public void estableceMeses_Trabajo_texto() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("eee");
        });
    }

    @Test @DisplayName("Establecer meses nulo")
    public void estableceMeses_Trabajo_nulo() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("");
        });
    }

    @Test @DisplayName("Establecer meses mas de tres digitos")
    public void estableceMeses_Trabajo_mas_de_tres_digitos() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("1478");
        });
    }

    @Test @DisplayName("Establecer meses en blanco")
    public void estableceMeses_Trabajo_blanco() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo(" ");
        });
    }

    @Test @DisplayName("Establecer directivo valido")
    public void establecerSerDirectivo_Correcto() {

        Empleado e = new Empleado();
        try {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertTrue(e.getDirectivo());
    }

    @Test @DisplayName("Establecer directivo con cadenas de mas de un caracter")
    public void establecerSerDirectivo_mas_de_un_caracter() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo("++");
        });
    }

    @Test @DisplayName("Establecer directivo con cadenas en blanco")
    public void establecerSerDirectivo_blanco() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo(" ");
        });
    }

    @Test @DisplayName("Establecer directivo con cadenas distintas de las validas")
    public void establecerSerDirectivo_no_validas() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo("y");
        });
    }
}
