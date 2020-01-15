public class StarPattern {
    public static void main(String[] args) {

        StarPattern  starPattern=new StarPattern();
        starPattern.printDiamond();
        starPattern.printTable();

    }

    void printDiamond(){
        for (int i=1; i<=10; i++)
        {
            for (int j=10; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(i * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=9; m>=1; m--)
        {
            for (int n=9; n>=m; n--)
            {
                System.out.print(" ");
            }
            for (int p=1; p<=(m * 2) -1; p++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void printTable() {

        System.out.format("      ");
        for (int i = 1; i <= 9; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }

    }
}
