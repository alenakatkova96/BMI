public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int bmiIndex = bmiService.calculate(1.52,57.5);

        System.out.println("BMI index: " + bmiIndex);


    }
}