package uvs.bcs.com.timecheck.Ord;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class Shipping_lines {
    private Double total;
    private String method_id;
    private List<Meta_data> meta_data;
    private List<Taxes> taxes;
    private Integer id;
    private Double total_tax;
    private String method_title;

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setMethod_id(String method_id) {
        this.method_id = method_id;
    }

    public String getMethod_id() {
        return method_id;
    }

    public void setMeta_data(List<Meta_data> meta_data) {
        this.meta_data = meta_data;
    }

    public List<Meta_data> getMeta_data() {
        return meta_data;
    }

    public void setTaxes(List<Taxes> taxes) {
        this.taxes = taxes;
    }

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTotal_tax(Double total_tax) {
        this.total_tax = total_tax;
    }

    public Double getTotal_tax() {
        return total_tax;
    }

    public void setMethod_title(String method_title) {
        this.method_title = method_title;
    }

    public String getMethod_title() {
        return method_title;
    }
}