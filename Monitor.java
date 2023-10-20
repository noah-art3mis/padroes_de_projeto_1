public abstract class Monitor extends Component {

  public int resolution;

  public void turnOn() {
    System.out.println(" ");
    System.out.println("brand: " + brand);
    System.out.println("resolution: " + resolution);
  }
}
