import java.util.Random;

// https://refactoring.guru/design-patterns/abstract-factory
// https://www.youtube.com/watch?v=QNpwWkdFvgQ

public class App {

  public static void main(String[] args) {
    AbstractFactory factory;

    // fábricas concretas são selecionadas aleatoriamente, demonstrando desacoplamento
    if (new Random().nextInt(2) == 0) {
      factory = new AsusFactory();
    } else {
      factory = new MsiFactory();
    }

    Monitor monitor = factory.makeMonitor();
    Gpu gpu = factory.makeGpu();

    monitor.turnOn();
    gpu.turnOn();
  }
}
