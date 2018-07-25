package uvs.bcs.com.timecheck.Ord;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class Tax_lines {
    private Double tax_total;
    private Integer rate_id;
    private List<Meta_data> meta_data;
    private Integer id;
    private String label;
    private String rate_code;
    private Boolean compound;
    private Double shipping_tax_total;

    public void setTax_total(Double tax_total) {
        this.tax_total = tax_total;
    }

    public Double getTax_total() {
        return tax_total;
    }

    public void setRate_id(Integer rate_id) {
        this.rate_id = rate_id;
    }

    public Integer getRate_id() {
        return rate_id;
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

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setRate_code(String rate_code) {
        this.rate_code = rate_code;
    }

    public String getRate_code() {
        return rate_code;
    }

    public void setCompound(Boolean compound) {
        this.compound = compound;
    }

    public Boolean getCompound() {
        return compound;
    }

    public void setShipping_tax_total(Double shipping_tax_total) {
        this.shipping_tax_total = shipping_tax_total;
    }

    public Double getShipping_tax_total() {
        return shipping_tax_total;
    }
}