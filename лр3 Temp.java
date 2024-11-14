public class TemperatureAdapter {
    private String type; // Тип температуры (Цельсий или Фаренгейт)
    private double temperature; // Текущая температура
    private double[] temperatureChanges; // Температурные изменения за последние N дней
    private int days; // Количество дней для хранения изменений
    // Конструктор
    public TemperatureAdapter(String type, double temperature, int days) {
        this.type = type;
        this.temperature = temperature;
        this.days = days;
        this.temperatureChanges = new double[days];
        this.temperatureChanges[0] = temperature; // Устанавливаем текущую температуру как первое значение
    }
    // Геттер для типа
    public String getType() {
        return type;
    }
    // Сеттер для типа
    public void setType(String type) {
        this.type = type;
    }
    // Геттер для температуры
    public double getTemperature() {
        return temperature;
    }
    // Сеттер для температуры
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        updateTemperatureChanges();
    }
    // Метод для преобразования температуры из Цельсия в Фаренгейт
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    // Метод для преобразования температуры из Фаренгейта в Цельсий
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    // Метод для обновления температурных изменений
    private void updateTemperatureChanges() {
        // Сдвигаем старые значения
        for (int i = days - 1; i > 0; i--) {
            temperatureChanges[i] = temperatureChanges[i - 1];
        }
        temperatureChanges[0] = temperature; // Устанавливаем текущую температуру как первое значение
    }
    // Геттер для температурных изменений
    public double[] getTemperatureChanges() {
        return temperatureChanges;
    }
    // Метод для отображения изменений температуры
    public void displayTemperatureChanges() {
        System.out.println("Температурные изменения за последние " + days + " дней:");
        for (int i = 0; i < days; i++) {
            System.out.println("День " + (i + 1) + ": " + temperatureChanges[i] + " " + type);
        }
    }
}