package uvs.bcs.com.timecheck.Ord;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class Line_items {
    private Integer quantity;
    private String tax_class;
    private List<Taxes> taxes;
    private Double total_tax;
    private Double total;
    private Integer variation_id;
    private Double subtotal;
    private Integer price;
    private Integer product_id;
    private String name;
    private List<Meta_data> meta_data;
    private Integer id;
    private Double subtotal_tax;
    private String sku;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setTax_class(String tax_class) {
        this.tax_class = tax_class;
    }

    public String getTax_class() {
        return tax_class;
    }

    public void setTaxes(List<Taxes> taxes) {
        this.taxes = taxes;
    }

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public void setTotal_tax(Double total_tax) {
        this.total_tax = total_tax;
    }

    public Double getTotal_tax() {
        return total_tax;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setVariation_id(Integer variation_id) {
        this.variation_id = variation_id;
    }

    public Integer getVariation_id() {
        return variation_id;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMeta_data(List<Meta_data> meta_data) {
        this.meta_data = meta_data;
    }

    public List<Meta_data> getMeta_data() {
        return meta_data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setSubtotal_tax(Double subtotal_tax) {
        this.subtotal_tax = subtotal_tax;
    }

    public Double getSubtotal_tax() {
        return subtotal_tax;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }
}