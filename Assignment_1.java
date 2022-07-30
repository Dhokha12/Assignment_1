public class Assignment_1 {
    public static void main(String[] args) {
        int i, j, n = 10;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || i == (n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 && i != (n - 1) || j == (n - 1) && i != (n - 1) || i == (n - 1) && j != 0 && j != (n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j != (n - 1) && j != (n - 2) || i == (n - 1) / 2 && j != (n - 1) && j != (n - 2) || i == 1 && j == (n - 2) || i == 2 && j == (n - 2) || i == 3 && j == (n - 2) || i - j == (n - 1) / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (i == 0 && j != 0 && j != (n - 1) || i == (n - 1) && j != 0 && j != (n - 1) || j == 0 && i != 0 && i != (n - 1) || j == (n - 1) && i != 0 && i != (n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                if (j == (n - 1))
                    System.out.print("   ");
            }
            System.out.println();
        }
        for (i=1; i<5; i++){
            System.out.println();
        }
        for (i = 1; i < 5; i++) {
            for (j = 1; j < 5; j++) {
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
        for (i=1; i<5; i++){
            System.out.println();
        }
        n=15;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (j==0||j==(n-1)||i==0||i==(n-1)||i+j<=(n-1)/2||j-i>=(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (i=1; i<5; i++){
            System.out.println();
        }
        for (i=0; i<n; i++){
            for (j=0; j<n; j++){
                if (i==(n-1)||i-j>=(n-1)/2||i+j>=(n-1)+(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (i=1; i<5; i++){
            System.out.println();
        }
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                if (i==0||i==(n-1)||i+j<=(n-1)/2||i-j>=(n-1)/2)
                    System.out.print("**");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
