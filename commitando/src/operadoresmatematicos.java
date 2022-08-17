public class operadoresmatematicos {
    public static void main(String[] args) {
        System.out.println("PrePos"); //metodos que vão ser chamados 
            prePos();
        System.out.println("Aritmeticos");
            aritmetico();
        
        System.out.println("Atribuiçaõ");
            atribuicao();

        System.out.println("Precedencia");
            precedencia();
    }
        private static void prePos () {
            int a = 10;

            int b = ++a; ///soma 1 em 10 = 11
            int c = a--; //c recebe 11 e o a se transforma em 10 - subtrai 1 de 11 

            int d = a;

                System.out.println("b : " + b);
                System.out.println("c : " + c);
                System.out.println("a : " + a);
        }

        private static void aritmetico () {
            int n1 = 10;
            int n2 = 20;
            int n3 = 30;
            int n4 = 40;
            int n5 = 50;

            int soma = n1 + n2;
            int sub = n3 - n1;
            int mult = n4 * n2;
            int div = n5/n1;
            int rest = n3%n2;

                System.out.println("Soma de n1 + n2 = " + soma);
                System.out.println("Subtração de n3 - n1 = " + sub);
                System.out.println("Multiplicação do n4 * n2 = " + mult);
                System.out.println("Divisão do n5 / n1 = " + div);
                System.out.println("Resto de n3 % n2 = " + rest);
            }

            private static void atribuicao () {
                
                int a = 1500;
                short b = 15; 
                long c = 500l;
                int d = 35;
                float e = 3.5f;
                double g = e;

                    System.out.println("G = " + g);

                        a += 5; // a = a + 5;
                        b -= 3; //b = b - 3;
                        g /= 2.7d; //g = g/2.7;
                        c *= 3; //c = c * 3
                        d %= 2; //d = d %2

                            a = d = b; // b = 12, d recebe 12, a recebe 12

                                System.out.println(d);
                                System.out.println(a);
            }

            private static void precedencia () {
                int w = 10;
                int x = 20;
                int y = 30;

                int z = w++ + --x * y; //10 + 19 * 30 = 580
                    System.out.println("z = w++ = --x * y :" + z);
                    System.out.println("z : " + z);

                int a = y / --w % 3 + 1; // 30/10 % 3 + 1 -1
                    System.out.println("y / --w % 3 + 1" + a);
                    System.out.println(w);
                
                int b = 2;
                    b *= w +=5; // b = 2 * w; w = 1 + 5 -> b = 2 * w; w = 10 + 5; -> b = 2 * 15; b = 30
                        System.out.println(b);
            }
}
