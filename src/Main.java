public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int mass = 98;
        double body = 1.87;
        int index = service.calculate(mass, body);
        System.out.println("Индекс твоего тела, бро! Смари:" + index);
    }
}