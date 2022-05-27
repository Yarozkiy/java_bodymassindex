public class BmiService {
    public double calculate(double height, double weight) {
        height = height / 100;
        double bmi = weight / (height * height);

        if (bmi < 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("Недостаточная масса тела (дефицит)");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("Нормальная масса тела");
        } else if (bmi >= 24 && bmi < 30) {
            System.out.println("Избыточная масса тела (пред ожирение)");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Ожирение I степени");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Ожирение II степени");
        } else if (bmi >= 40) {
            System.out.println("Ожирение III степени");
        }
        return bmi;
    }
}