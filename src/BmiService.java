public class BmiService {

    public int calculate(int weightKg, double heightMeters) {
        int result = (int) (weightKg / (heightMeters * heightMeters));
        return result;
    }
}
