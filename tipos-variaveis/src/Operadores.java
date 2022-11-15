public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //x repetição
        int numero = 5;
        //1 incrementar/decrementar depois de exibir na tela
        System.out.println(numero ++);
        System.out.println(numero);

        //2 incrementar/decrementar antes de exibir na tela
        System.out.println(-- numero);
        System.out.println(numero);

        //uso do operador ternario
        int a = 6;
        int b = 5;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Relacionais
        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;

        if(num1 < num2){
            System.out.println("A nossa condição é verdadeira");
        }
        else {
            System.out.println("A nossa condição é falsa");
        }

        simNao = num1 != num2;
            System.out.println("numUm é diferente do numDois?" + simNao);

        //usando relacionais em Strings 
        String nomeUm = "Andre";
        String nomeDois = "Andre";

        //Nao recomendado pois pode haver alterações ja que sao objetos
        System.out.println(nomeUm == nomeDois);
        
        //usa-se o equals para comparação de objetos
        nomeDois = new String("Andre");
        System.out.println(nomeUm.equals(nomeDois));

        //Operadores Logicos = Tabela Verdade

        boolean condicaoUm = true;
        boolean condicaoDois = false;

        if(condicaoUm && (7 > 4))
            System.out.println("Sao verdadeiras");
        
        if(condicaoDois || (7 > 4))
            System.out.println("Uma das condições é falsa");
    }
    
}
