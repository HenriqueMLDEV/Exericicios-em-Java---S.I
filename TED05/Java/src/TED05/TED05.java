package TED05;

public class TED05 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 20)
        {
            System.out.print(a);
            if (a % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            ++a;
        }

    }

}
