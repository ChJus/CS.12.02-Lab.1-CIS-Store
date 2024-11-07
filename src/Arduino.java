public class Arduino extends ElectronicItem {
  private String version;

  public Arduino(String name, String location, int price, String description,
                 int storageCapacity, String model, String maker,
                 String operatingSystem, String version) {
    super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
    this.version = version;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public void changePropertyValue(String property, String value) {
    if (property.equals("version")) {
      setVersion(value);
      return;
    }
    super.changePropertyValue(property, value);
  }

  @Override
  public String toString() {
    return super.toString() + "\t\tArduino\n" +
        "\t\t\tversion='" + version + '\'' +
        "\n";
  }
}
