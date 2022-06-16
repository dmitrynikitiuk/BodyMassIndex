public class BodyMassIndexService {
    public double calculate(int mass, double height) {
        double index = mass / (height * height);
        return index;
    }
}