public class Main {
    public static void main(String[] args) {
        BmiService bodyMassIndex = new BmiService();

        System.out.println();
        System.out.println("Калькулятор Индекса Массы Тела");
        System.out.println();
        double bmi = bodyMassIndex.calculate(190, 75);  //   Рост   и Вес
        System.out.println("ИМТ равен: " + bmi);

    }
}