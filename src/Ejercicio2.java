
public class Ejercicio2 {
    int suma= 0;
    String Calificacion = null;
    int num= 0;

    public void hashSimple(int Matricula){
        //se guarda el valor ingresado
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

    //se vuelve a sumar los digitos resultado de los digitos de la matricula
    public void segundaPasada(){
        this.hashSimple(suma);
    }

    //Metodo de Calificación
    public void calificacion() {

        if (suma >= 0 && suma <= 6) {
            Calificacion= "Reprobado";
        } else if (suma >= 7 && suma <= 9) {
            Calificacion= "Aprobado";
        } else if (suma >= 10) {
            Calificacion= "Excelente";
        }
        System.out.println("Tu suma de caracteres es: "+this.suma);
        System.out.println("tu calificaciòn es: " +this.Calificacion);
    }
}
