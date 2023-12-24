public class BodyMassIndex {
    public int calculate(int weightKG, double heightMetr) {
        double calcindex = weightKG / (heightMetr * heightMetr);
        return (int) calcindex;
    }
}
