public class diamondnumpattern {
    public static void main(String args[]) {
        int n = 8;
        int num = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j < (n / 2 - i); j++) {
                System.out.print(" ");
            }
            num += i;
            for (int j = 0; j < i; j++) {
                System.out.print((num - j) + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n / 2 - i); j++) {
                System.out.print((num - j) + " ");
            }
            num -= (n / 2 - i);
            System.out.println();
        }
    }
}
