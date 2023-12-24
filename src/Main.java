public class Main {
    public static <String> void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int mass = 113;
        double body = 1.89;
        int index = service.calculate(mass, body);
        System.out.println("Индекс твоего тела, бро! Смари:" + index);
    }
}