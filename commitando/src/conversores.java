public class conversores {
    public static void main(String[] args) {
        
        byte b1;
        short s1 = 1000;
            //b1 = s1; - downcast ..resultado - 24, perda de informação 
            System.out.println(s1);
        

        long l1;
        int i1 = 10;
            l1 = i1;
            System.out.println(i1);

        int i2;
        long l2 = 10000000000000L;
            // i2 = l2;  - downcast ..resultado -148664554
            System.out.println(l2);
        
        int i3;
        long l3 = 10000L;
            // i3 = l3; -  downcast sem perca 
            System.out.println(l3);

        double d1;
        float f1 = 10.90f;
            d1 = f1; //upcast
            System.out.println(d1);
        
        float f2;
        float f3;
        double d2 = 1000.45;
            System.out.println(d2);
            // f2 = d2;
        double d5 = 10084551470354.87;
            System.out.println(d5);
            // f3 = d5;

        int i4;
        float f4 = 12.3345f;
           // i4 = f4;
           System.out.println(f4);
        
    }
}
