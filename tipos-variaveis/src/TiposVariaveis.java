public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //tipos primitivos 
        //estudar a classe String que representa texto 

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //declarando uma variavel imutavel 
        int num = 5;
        num = 10;

        //para deixa-la sem poder fazer alterações usa-se final e declaração em maiuscula
        final double PI = 3.14;
        System.out.println("PI = " + PI);

    }
}
