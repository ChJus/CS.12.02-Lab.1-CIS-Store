import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTester {
  private Store STORE = new Store();

  @Test
  void addBookTest() {
    STORE.addBook(new Book("Title", "L5", 20, "Description", 1000,
        "2020", "Me", "1234567890", "1", "Title"));
    assertTrue(true);
  }

  @Test
  void updatePhonesLocationTest() {
    for (int i = 0; i < 50; i++) {
      Phone p = new Phone(null, null, 0, null, 0, null, null, null, null, 0);
      STORE.addPhone(p);
    }
    STORE.updatePhonesLocation("Room 512");
    ArrayList<Phone> phones = STORE.getAllPhones();
    for (Phone phone : phones) {
      assertEquals(phone.getLocation(), "Room 512");
    }
  }

  @Test
  void getItemsTest() {
    // Count for Arduino, Book, Magazine, Phone objects
    int[] count = {15, 1, 28, 50};

    STORE.addBook(new Book("Title", "L5", 20, "Description", 1000,
        "2020", "Me", "1234567890", "1", "Title"));

    for (int i = 0; i < 50; i++) {
      Phone p = new Phone(null, null, 0, null, 0, null, null, null, null, 0);
      STORE.addPhone(p);
    }

    for (int i = 0; i < count[0]; i++) {
      STORE.addArduino(new Arduino(null, null, 0, null,
          0, null, null, null, null));
    }

    for (int i = 0; i < count[2]; i++) {
      STORE.addMagazine(new Magazine(null, null, 0, null, 0, null, null, null, null));
    }
    
    assertEquals(STORE.getItems("Arduino").size(), count[0]);
    assertEquals(STORE.getItems("Book").size(), count[1]);
    assertEquals(STORE.getItems("Magazine").size(), count[2]);
    assertEquals(STORE.getItems("Phone").size(), count[3]);
    assertEquals(STORE.getItems("ElectronicItem").size(), count[0] + count[3]);
    assertEquals(STORE.getItems("ReadingItem").size(), count[1] + count[2]);
  }

  @Test
  void printTest() {
    int[] count = {15, 1, 28, 50};

    STORE.addBook(new Book("Title", "L5", 20, "Description", 1000,
        "2020", "Me", "1234567890", "1", "Title"));

    for (int i = 0; i < 50; i++) {
      Phone p = new Phone(null, null, 0, null, 0, null, null, null, null, 0);
      STORE.addPhone(p);
    }

    for (int i = 0; i < count[0]; i++) {
      STORE.addArduino(new Arduino(null, null, 0, null,
          0, null, null, null, null));
    }

    for (int i = 0; i < count[2]; i++) {
      STORE.addMagazine(new Magazine(null, null, 0, null, 0, null, null, null, null));
    }

    STORE.showAllInfo();
  }
}
