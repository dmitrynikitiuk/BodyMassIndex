public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double height = 1.8;
        double heightSquared = height * height;
        int mass = 120;
        double index = service.calculate(mass, heightSquared);
        System.out.println(index);
    }
}