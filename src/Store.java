import java.util.ArrayList;

public class Store {
  private final ArrayList<CISItem> cisItems = new ArrayList<>();

  public ArrayList<CISItem> getCisItems() {
    return cisItems;
  }

  public void addBook(Book book) {
    cisItems.add(book);
  }

  public void addPhone(Phone phone) {
    cisItems.add(phone);
  }

  public void addMagazine(Magazine magazine) {
    cisItems.add(magazine);
  }

  public void addArduino(Arduino arduino) {
    cisItems.add(arduino);
  }

  public void updatePhonesLocation(String location) {
    ArrayList<Phone> phones = getAllPhones();
    for (Phone phone : phones) {
      phone.setLocation(location);
    }
  }

  public ArrayList<Phone> getAllPhones() {
    return (ArrayList<Phone>) getItems("Phone");
  }

  public ArrayList<?> getItems(String itemType) {
    ArrayList<CISItem> list = new ArrayList<>();

    for (CISItem item : cisItems) {
      switch (itemType) {
        case "CISItem":
          if (item instanceof CISItem cisItem) list.add(cisItem);
          break;
        case "ReadingItem":
          if (item instanceof ReadingItem readingItem) list.add(readingItem);
          break;
        case "ElectronicItem":
          if (item instanceof ElectronicItem electronicItem) list.add(electronicItem);
          break;
        case "Book":
          if (item instanceof Book book) list.add(book);
          break;
        case "Magazine":
          if (item instanceof Magazine magazine) list.add(magazine);
          break;
        case "Phone":
          if (item instanceof Phone phone) list.add(phone);
          break;
        case "Arduino":
          if (item instanceof Arduino arduino) list.add(arduino);
          break;
      }
    }
    return list;
  }

  public void updateItems(String itemType, String property, String value) {
    ArrayList<?> items = getItems(itemType);
    for (Object item : items) {
      ((CISItem) item).changePropertyValue(property, value);
    }
  }

  public void showAllInfo() {
    for (CISItem item : getCisItems()) {
      System.out.println(item);
    }
  }

  public void addItem(CISItem cisItem) {
    cisItems.add(cisItem);
  }
}
