public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int mass = 79;
        double body = 1.68;
        int index = service.raschot(mass, body);
        System.out.println("Индекс твоего тела, бро! Смари:" + index);
    }
}