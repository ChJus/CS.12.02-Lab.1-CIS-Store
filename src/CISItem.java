public class CISItem {
  private String name;
  private String location;
  private int price;
  private String description;

  public CISItem(String name, String location, int price, String description) {
    this.name = name;
    this.location = location;
    this.price = price;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void changePropertyValue(String property, String value) {
    switch (property) {
      case "name":
        setName(value);
        return;
      case "location":
        setLocation(value);
        return;
      case "price":
        setPrice(Integer.parseInt(value));
        return;
      case "description":
        setDescription(value);
        return;
    }
  }

  @Override
  public String toString() {
    return "CISItem \n" +
        "\tname='" + name + '\'' +
        ", location='" + location + '\'' +
        ", price=" + price +
        ", description='" + description + '\'' +
        "\n";
  }
}
