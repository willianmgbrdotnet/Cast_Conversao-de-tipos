package castCoversao;

public class Cast {
    public static void main(String[] args) {

        double salario = 2750.55;
        //O java não permite atribuir um valor do tipo double em uma variável do tipo inteiro.
        //int valor = salario;

        int valor = (int) salario;//usando a expressão "cast", forçamos a atribuição de valor.

        System.out.println(valor);
        //No entanto, nota-se que que apenas a parte inteira do numero com valor flutuante foi atribuida.
        //Print: 2750

        int valor2 = 2000_000_000;
        //é necessário colocar o "L" depois do numero para declarar que é um numero Literal.
        long numeroGrande = 5000_000_000_000_000_000L;
        short numeroPequeno = 2105;
        byte umaCentena = 127;

        //Numeros decimais do tipo float têm precisão menor. O java recomenda double.
        //Precisa declarar de forma literal "f" caso queira insistir.
        float pontoFlutuante = 3.14f;
    }
}
