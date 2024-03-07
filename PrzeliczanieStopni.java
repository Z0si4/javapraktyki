public class PrzeliczanieStopni {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
        }
    }
}
