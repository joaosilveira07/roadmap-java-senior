package twoWeek;

public class fiveDay {
    public static void main(String[] args){
        int n1 = 5, n2 = 2;
        boolean par = false;
        System.out.println(n1 + n2);
        if (n2 % 2 == 0){
            par = true;
        }
        if ((par && n1 > n2) || (!par)){
            System.out.println("Bla bla bla");
        }
    }
}
