import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EjercicioTest2 {

    Ejercicio2 numero;

    @Before
    public void iniciador (){
        numero = new Ejercicio2();
    }

    //Pruebas unitarias de suma de caracteres
    @Test
    public void sumaCaracter1(){
        numero.hashSimple(57673);
        numero.segundaPasada();
        int resultado = numero.suma;
        int esperado = 10;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de suma de caracteres
    @Test
    public void sumaCaracter2(){
        numero.hashSimple(58781);
        numero.segundaPasada();
        int resultado = numero.suma;
        int esperado = 11;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de suma de caracteres
    @Test
    public void sumaCaracter3(){
        numero.hashSimple(58808);
        numero.segundaPasada();
        int resultado = numero.suma;
        int esperado = 11;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de suma de caracteres
    @Test
    public void sumaCaracter4(){
        numero.hashSimple(50126);
        numero.segundaPasada();
        int resultado = numero.suma;
        int esperado = 5;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de suma de caracteres
    @Test
    public void sumaCaracter5MIO(){
        numero.hashSimple(47218);
        numero.segundaPasada();
        int resultado = numero.suma;
        int esperado = 4;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de calificación1
    @Test
    public void calificacion1(){
        numero.hashSimple(57673);
        numero.segundaPasada();
        numero.calificacion();
        String resultado = numero.Calificacion;
        String esperado = "Excelente";
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de calificación2
    @Test
    public void calificacion2(){
        numero.hashSimple(58781);
        numero.segundaPasada();
        numero.calificacion();
        String resultado = numero.Calificacion;
        String esperado = "Excelente";
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de calificación3
    @Test
    public void calificacion3(){
        numero.hashSimple(58808);
        numero.segundaPasada();
        numero.calificacion();
        String resultado = numero.Calificacion;
        String esperado = "Excelente";
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de calificación4
    @Test
    public void calificacion4(){
        numero.hashSimple(50126);
        numero.segundaPasada();
        numero.calificacion();
        String resultado = numero.Calificacion;
        String esperado = "Reprobado";
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de calificación5
    @Test
    public void calificacion5(){
        numero.hashSimple(47218);
        numero.segundaPasada();
        numero.calificacion();
        String resultado = numero.Calificacion;
        String esperado = "Reprobado";
        assertEquals(esperado,resultado);
    }
}
