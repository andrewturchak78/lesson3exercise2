public class Main {
    public static void main(String[] args) {
        int account = 200;
        int refill = 1200;


        if (refill >= 1000) {
            System.out.println(refill / 100 + refill + account);
        } else {
            System.out.println(account + refill);
        }

    }
}