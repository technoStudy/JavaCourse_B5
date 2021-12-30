package OCA_Questions;

public class Q25 {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D'); // useless
        ta = ta.concat(tb);

        System.out.println(ta);

    }

}
