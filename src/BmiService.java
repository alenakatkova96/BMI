public class BmiService {
    public int calculate(double height, double weight) {
        double bmi = weight/(height * height);
        int result = (int) bmi;
        return result;
    }
}
