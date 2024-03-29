package sample;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Contains a generic Product class that is used abstractly as a template for specific products. See
 * AudioPlayer and MoviePlayer for examples of specific products.
 *
 * @see AudioPlayer
 * @see MoviePlayer
 */
public abstract class Product implements Item {

  /**
   * The id number of the product.
   */
  private int id;

  /**
   * The name of the product.
   */
  private String name;

  /**
   * The manufacturer of the product.
   */
  private String manufacturer;

  /**
   * The "type" of product - see ItemType enum.
   *
   * @see ItemType
   */
  private String type;

  /**
   * Default constructor.
   *
   * @param name The name of the product.
   */
  Product(String name) {
    this.name = name;
  }

  /**
   * Getter for the id of the product.
   *
   * @return int The id of the product.
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * Setter for the id of the product.
   *
   * @param id The id of the product.
   */
  @Override
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Getter for the name of the product.
   *
   * @return String The name of the product.
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Setter for the name of the product.
   *
   * @param name The name of the product.
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for the manufacturer of the product.
   *
   * @return String The manufacturer of the product.
   */
  @Override
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Setter for the manufacturer of the product.
   *
   * @param manufacturer The manufacturer of the product.
   */
  @Override
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Getter for the media type of the product.
   *
   * @return String The media type of the product.
   */
  public String getType() {
    return type;
  }

  /**
   * Setter for the media type of the product.
   *
   * @param type The media type of the product.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Prints out products by item type.
   * @param productLine An ArrayList of products.
   * @param type The ItemType to filter by.
   */
  public static void printType(ArrayList<Product> productLine, ItemType type) {
    for (Product p : productLine) {
      if (p.getType().equals(type.type)) {
        System.out.println(p);
      }
    }
  }

  /**
   * Overrides the toString() method to display the details of an object that inherits the Product
   * class. Display is in this form
   * <br>Name:
   * <br>Manufacturer:
   * <br>Media Type:
   *
   * @return String The complete formatted string description.
   */
  @Override
  public String toString() {
    return String.format(
        "Name: %s%n"
            + "Manufacturer: %s%n"
            + "Type: %s%n",
        name, manufacturer, type);
  }

  /**
   * Compares the names of two productions for purposes of sorting. Used with Collections.sort
   * to sort alphabetically.
   * Source: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
   */
  static Comparator<Product> ProductNameComparator = (Product p1, Product p2) -> {
    String name1 = p1.getName();
    String name2 = p2.getName();

    return name1.compareTo(name2);
  };
}
