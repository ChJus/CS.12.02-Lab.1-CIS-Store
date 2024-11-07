public class Phone extends ElectronicItem {
  private String networkType;
  private int screenSize;

  public Phone(String name, String location, int price,
               String description, int storageCapacity, String model,
               String maker, String operatingSystem,
               String networkType, int screenSize) {
    super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
    this.networkType = networkType;
    this.screenSize = screenSize;
  }

  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public int getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(int screenSize) {
    this.screenSize = screenSize;
  }

  @Override
  public void changePropertyValue(String property, String value) {
    switch (property) {
      case "networkType":
        setNetworkType(value);
        return;
      case "screenSize":
        setScreenSize(Integer.parseInt(value));
        return;
    }
    super.changePropertyValue(property, value);
  }

  @Override
  public String toString() {
    return super.toString() + "\t\tPhone\n" +
        "\t\t\tnetworkType='" + networkType + '\'' +
        ", screenSize=" + screenSize +
        "\n";
  }
}
