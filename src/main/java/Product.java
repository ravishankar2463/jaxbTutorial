import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private long eancode;
    private String name;
    private int price;
    private int weight;
    private String description;
    private int quantity;
    private String categoryName;

    public long getEancode() {
        return eancode;
    }

    public void setEancode(long eancode) {
        this.eancode = eancode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "eancode=" + eancode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
