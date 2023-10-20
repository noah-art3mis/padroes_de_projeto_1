public class App {

  public static void main(String[] args) {
    AbstractFactory asus = new AsusFactory();
    Monitor asusMonitor = asus.makeMonitor();
    Gpu asusGpu = asus.makeGpu();

    System.out.println("asus monitor: " + asusMonitor.name);
    System.out.println("asus monitor: " + asusMonitor.resolution);
    System.out.println("asus gpu: " + asusGpu.name);
    System.out.println("asus gpu: " + asusGpu.memory);

    AbstractFactory msi = new MsiFactory();
    Monitor msiMonitor = msi.makeMonitor();
    Gpu msiGpu = msi.makeGpu();

    System.out.println("msi monitor: " + msiMonitor.name);
    System.out.println("msi monitor: " + msiMonitor.resolution);
    System.out.println("msi gpu: " + msiGpu.name);
    System.out.println("msi gpu: " + msiGpu.memory);
  }
}
