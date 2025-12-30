public class Hello {
    public static void main(String[] args) {
        int num = 5; // 32 bit
        byte byNum = 127; // 8 bit (-128 to 127) : 2^8 storage 
        short shNum = 30000; // 16 bit (-32768 to 32767) : 2^16 storage
        long lnNum = 2343566656345l; // 64 bit
        
        float flNum = 4.5f; // 32 bit (6-7 decimal digits)
        double dbNum = 6.6; // 64 bit default double when not specified f
        
        char ch = 'c'; // 16 bit
        boolean boolVar = true;

        // working with binary, hexadecimal format number

        int biNum = 0b111;
        int hexNum = 0xA3;
        // System.out.println(biNum);
        // System.out.println(hexNum);

        // type Conversion & Casting

        byte b = 127;
        byte d = 127;
        int a = 259;
        int c = 34;

        int result = b * d;

        // b = a; // out of byte storage 
        // b = (byte) c; // Explicit type casting
        // a = b; // implicit type conversion

        b = (byte) a;
        if (a > 250) {
            System.out.println("hiiiii");
        }



        System.out.println(result);
        // System.out.println(a);
    }
}