public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double height = 1.8;
        int mass = 110;
        double index = service.calculate(mass, height);
        System.out.println(index);
    }
}