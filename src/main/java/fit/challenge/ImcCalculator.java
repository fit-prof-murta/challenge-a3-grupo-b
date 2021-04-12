package fit.challenge;

public class ImcCalculator {
    public static String calculate(double weight, double height) {
        double imc = weight / Math.pow(height, 2);
        if (imc < 18.5) return "Magreza";
        else if (imc >= 18.5 && imc < 24.9) return "Normal";
        else if (imc >= 24.9 && imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
}
