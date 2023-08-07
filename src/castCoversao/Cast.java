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


    }
}
