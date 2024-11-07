public class Magazine extends ReadingItem {
  private String coverStoryTitle;
  private String printDate;

  public Magazine(String name, String location, int price, String description, int wordCount,
                  String datePublished, String author, String coverStoryTitle, String printDate) {
    super(name, location, price, description, wordCount, datePublished, author);
    this.coverStoryTitle = coverStoryTitle;
    this.printDate = printDate;
  }

  public String getCoverStoryTitle() {
    return coverStoryTitle;
  }

  public void setCoverStoryTitle(String coverStoryTitle) {
    this.coverStoryTitle = coverStoryTitle;
  }

  public String getPrintDate() {
    return printDate;
  }

  public void setPrintDate(String printDate) {
    this.printDate = printDate;
  }

  @Override
  public void changePropertyValue(String property, String value) {
    switch (property) {
      case "coverStoryTitle":
        setCoverStoryTitle(value);
        return;
      case "printDate":
        setPrintDate(value);
        return;
    }
    super.changePropertyValue(property, value);
  }

  @Override
  public String toString() {
    return super.toString() + "\t\tMagazine\n" +
        "\t\t\tcoverStoryTitle='" + coverStoryTitle + '\'' +
        ", printDate='" + printDate + '\'' +
        "\n";
  }
}
