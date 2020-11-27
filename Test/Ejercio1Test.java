import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ejercio1Test {
    Ejercicio1 numero;

    @Before
    public void iniciador (){
        numero = new Ejercicio1();
    }

    //Pruebas unitarias de hash1
    @Test
    public void sumaTest1(){
        numero.hashSimple(57673);
        int resultado = numero.suma;
        int esperado = 28;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de hash2
    @Test
    public void sumaTest2(){
        numero.hashSimple(58781);
        int resultado = numero.suma;
        int esperado = 29;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de hash3
    @Test
    public void sumaTest3(){
        numero.hashSimple(58808);
        int resultado = numero.suma;
        int esperado =29 ;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de hash4
    @Test
    public void sumaTest4(){
        numero.hashSimple(50126);
        int resultado = numero.suma;
        int esperado = 14;
        assertEquals(esperado,resultado);
    }

    //Pruebas unitarias de hash5
    @Test
    public void sumaTest5MIO(){
        numero.hashSimple(47218);
        int resultado = numero.suma;
        int esperado = 22;
        assertEquals(esperado,resultado);
    }


    //Pruebas unitarias de Digito verificador1
    @Test
    public void DgVTest1(){
        numero.hashSimple(57673);
        numero.Verificador();
        int resultado = numero.verificador;
        int esperado = 1;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de Digito verificador2
    @Test
    public void DgVTest2(){
        numero.hashSimple(58781);
        numero.Verificador();
        int resultado = numero.verificador;
        int esperado = 1;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de Digito verificador3
    @Test
    public void DgVTest3(){
        numero.hashSimple(58808);
        numero.Verificador();
        int resultado = numero.verificador;
        int esperado = 1;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de Digito verificador4
    @Test
    public void DgVTest4(){
        numero.hashSimple(50126);
        numero.Verificador();
        int resultado = numero.verificador;
        int esperado = 0;
        assertEquals(esperado,resultado);
    }
    //Pruebas unitarias de Digito verificador5
    @Test
    public void DgVTest5MIO(){
        numero.hashSimple(47218);
        numero.Verificador();
        int resultado = numero.verificador;
        int esperado = 1;
        assertEquals(esperado,resultado);
    }
}

