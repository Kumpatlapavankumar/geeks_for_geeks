// User function Template for Java

class Geeks {
    // Function to perform bitwise manipulations
    // a, b and c are input integers
    static void bitWiseOperation(int a, int b, int c) {

        // code here
        int d=a^a;
        int e=c^b;
        int f=a&b;
        int g=c|(a^a);
        int h=~e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
