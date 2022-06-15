public class BodyMassIndexService {
    public double calculate(int mass, double heightSquared) {
        double index = mass / heightSquared;
        return index;
    }
}