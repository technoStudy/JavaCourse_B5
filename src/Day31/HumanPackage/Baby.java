package Day31.HumanPackage;

public class Baby extends Human{

    public Baby(String name, String gender, double age) {
        super(name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Babies can only drink milk!");
    }

    @Override
    public void transport() {
        if (age < 0.8)
        System.out.println("Babies are like plants, they cannot move!");
        else
            System.out.println("Baby is crawling!");
    }

}
