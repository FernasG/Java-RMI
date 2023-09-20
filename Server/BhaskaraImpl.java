public class BhaskaraImpl implements Bhaskara {
    public String calculate(double a, double b, double c) {
        double delta = (b * b) + (-4 * (a * c));
        double x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));

        String text = String.format("Bhaskara:\na = %.2f, b = %.2f, c = %.2f\nX1 = %.2f\nX2 = %.2f", a, b, c, x1, x2);
        System.out.println(text);
        return text;
    }
}