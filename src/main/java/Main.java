public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long bonusCalculator = service.calculate(amount, registered); // Ошибка исправлена. После вызова команды mvn clean compile spotbugs:check - ошибок нет.
        System.out.println(bonusCalculator);
    }
}

