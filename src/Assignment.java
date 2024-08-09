public class Assignment {

    public static void main(String[] args) {

        double v1 = 20.00;
        double v2 = 80.00;
        double v = (v1 + v2) * 100.00;
        double r = v % 40.00;
        boolean noR = (r == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + noR);
        if(!noR) {
            System.out.println("Got some remainder");
        }



    }
}