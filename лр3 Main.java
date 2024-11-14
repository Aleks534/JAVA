public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр TemperatureAdapter для Цельсия
        TemperatureAdapter tempAdapter = new TemperatureAdapter("Цельсий", 25.0, 5);
        
        // Устанавливаем новые температуры
        tempAdapter.setTemperature(26.0);
        tempAdapter.setTemperature(27.5);
        tempAdapter.setTemperature(22.0);
        tempAdapter.setTemperature(24.0);
        tempAdapter.setTemperature(28.0);
        // Отображаем изменения температуры
        tempAdapter.displayTemperatureChanges();
        // Преобразуем температуру
        double fahrenheit = tempAdapter.celsiusToFahrenheit(tempAdapter.getTemperature());
        System.out.println("Текущая температура в Фаренгейтах: " + fahrenheit + " °F");
        // Преобразуем обратно в Цельсий
        double celsius = tempAdapter.fahrenheitToCelsius(fahrenheit);
        System.out.println("Температура обратно в Цельсия: " + celsius + " °C");
    }
}