public class condicional {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

            boolean SimNao = num1 == num2;
                if (num1 == num2) {
                    System.out.println("Condição verdadeira");
                }

            boolean Sim2Nao2 = num1 != num2;
                if(num1 != num2){
                    System.out.println("Condição verdadeira");
                }

            boolean Sim3Nao3 = num1 >= num2;
                if(num1 >= num2){
                    System.out.println("Condição verdadeira");
                }

            boolean Sim4Nao4 = num1 <= num2;
                if(num1 <= num2){
                    System.out.println("Condição verdadeira");
                }

            System.out.println(SimNao);
            System.out.println(Sim2Nao2);
            System.out.println(Sim3Nao3);
            System.out.println(Sim4Nao4);
    }
}
