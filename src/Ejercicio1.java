import java.util.*;

public class Ejercicio1 {
    int suma= 0;
    int verificador = 0;
    int num= 0;

    public void hashSimple(int Matricula){

        num = Matricula;
        int [] numbers = Ejercicio1.toarrayInt(num);
        int resultado = 0;
        //se recorre el array de los numeros
        for (int n :numbers) {
            resultado += n;
        }
        suma = resultado;
    }

    //se convierte la matricula en un array
    static int[] toarrayInt (int numero) {
        return Integer
                .toString(numero)//se convierte a cadena
                .chars()//agarra los chars
                .map((c)-> (c-'0')) //a cada char
                .toArray();
    }

    //Metodo de Digito Verificador
    public void Verificador() {

        if (suma >= 0 && suma <= 19) {
            verificador= 0;
        } else if (suma >= 20 && suma <= 29) {
            verificador= 1;
        } else if (suma >= 30) {
            verificador= 2;
        }
        System.out.println(num);
        System.out.println("Tu hash es: "+this.suma);
        System.out.println("tu numero verificador es: " +this.verificador);
    }
}
