public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        int weightKg = 98;
        int bmi = service.calculate(weightKg, heightMeters);

        System.out.println(bmi);
    }
}