package uvs.bcs.com.timecheck.Ord;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class CreateOrder {
    private Double discount_total;
    private String order_key;
    private Boolean prices_include_tax;
    private _links _links;
    private String customer_note;
    private List<Line_items> line_items;
    private List<Coupon_lines> coupon_lines;
    private Billing billing;
    private List<Refunds> refunds;
    private Integer number;
    private Double total;
    private Shipping shipping;
    private String date_paid_gmt;
    private List<Tax_lines> tax_lines;
    private String date_paid;
    private String customer_user_agent;
    private String payment_method_title;
    private List<Meta_data> meta_data;
    private Object date_completed;
    private String currency;
    private Integer id;
    private Object date_completed_gmt;
    private String payment_method;
    private Double shipping_tax;
    private String transaction_id;
    private String date_modified_gmt;
    private String cart_hash;
    private Double shipping_total;
    private Double cart_tax;
    private String created_via;
    private String date_created;
    private String date_created_gmt;
    private Double discount_tax;
    private Double total_tax;
    private String version;
    private String customer_ip_address;
    private List<Shipping_lines> shipping_lines;
    private String date_modified;
    private Integer parent_id;
    private List<Fee_lines> fee_lines;
    private Integer customer_id;
    private String status;

    public void setDiscount_total(Double discount_total) {
        this.discount_total = discount_total;
    }

    public Double getDiscount_total() {
        return discount_total;
    }

    public void setOrder_key(String order_key) {
        this.order_key = order_key;
    }

    public String getOrder_key() {
        return order_key;
    }

    public void setPrices_include_tax(Boolean prices_include_tax) {
        this.prices_include_tax = prices_include_tax;
    }

    public Boolean getPrices_include_tax() {
        return prices_include_tax;
    }

    public void set_links(_links _links) {
        this._links = _links;
    }

    public _links get_links() {
        return _links;
    }

    public void setCustomer_note(String customer_note) {
        this.customer_note = customer_note;
    }

    public String getCustomer_note() {
        return customer_note;
    }

    public void setLine_items(List<Line_items> line_items) {
        this.line_items = line_items;
    }

    public List<Line_items> getLine_items() {
        return line_items;
    }

    public void setCoupon_lines(List<Coupon_lines> coupon_lines) {
        this.coupon_lines = coupon_lines;
    }

    public List<Coupon_lines> getCoupon_lines() {
        return coupon_lines;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setRefunds(List<Refunds> refunds) {
        this.refunds = refunds;
    }

    public List<Refunds> getRefunds() {
        return refunds;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setDate_paid_gmt(String date_paid_gmt) {
        this.date_paid_gmt = date_paid_gmt;
    }

    public String getDate_paid_gmt() {
        return date_paid_gmt;
    }

    public void setTax_lines(List<Tax_lines> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public List<Tax_lines> getTax_lines() {
        return tax_lines;
    }

    public void setDate_paid(String date_paid) {
        this.date_paid = date_paid;
    }

    public String getDate_paid() {
        return date_paid;
    }

    public void setCustomer_user_agent(String customer_user_agent) {
        this.customer_user_agent = customer_user_agent;
    }

    public String getCustomer_user_agent() {
        return customer_user_agent;
    }

    public void setPayment_method_title(String payment_method_title) {
        this.payment_method_title = payment_method_title;
    }

    public String getPayment_method_title() {
        return payment_method_title;
    }

    public void setMeta_data(List<Meta_data> meta_data) {
        this.meta_data = meta_data;
    }

    public List<Meta_data> getMeta_data() {
        return meta_data;
    }

    public void setDate_completed(Object date_completed) {
        this.date_completed = date_completed;
    }

    public Object getDate_completed() {
        return date_completed;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setDate_completed_gmt(Object date_completed_gmt) {
        this.date_completed_gmt = date_completed_gmt;
    }

    public Object getDate_completed_gmt() {
        return date_completed_gmt;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setShipping_tax(Double shipping_tax) {
        this.shipping_tax = shipping_tax;
    }

    public Double getShipping_tax() {
        return shipping_tax;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setDate_modified_gmt(String date_modified_gmt) {
        this.date_modified_gmt = date_modified_gmt;
    }

    public String getDate_modified_gmt() {
        return date_modified_gmt;
    }

    public void setCart_hash(String cart_hash) {
        this.cart_hash = cart_hash;
    }

    public String getCart_hash() {
        return cart_hash;
    }

    public void setShipping_total(Double shipping_total) {
        this.shipping_total = shipping_total;
    }

    public Double getShipping_total() {
        return shipping_total;
    }

    public void setCart_tax(Double cart_tax) {
        this.cart_tax = cart_tax;
    }

    public Double getCart_tax() {
        return cart_tax;
    }

    public void setCreated_via(String created_via) {
        this.created_via = created_via;
    }

    public String getCreated_via() {
        return created_via;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created_gmt(String date_created_gmt) {
        this.date_created_gmt = date_created_gmt;
    }

    public String getDate_created_gmt() {
        return date_created_gmt;
    }

    public void setDiscount_tax(Double discount_tax) {
        this.discount_tax = discount_tax;
    }

    public Double getDiscount_tax() {
        return discount_tax;
    }

    public void setTotal_tax(Double total_tax) {
        this.total_tax = total_tax;
    }

    public Double getTotal_tax() {
        return total_tax;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setCustomer_ip_address(String customer_ip_address) {
        this.customer_ip_address = customer_ip_address;
    }

    public String getCustomer_ip_address() {
        return customer_ip_address;
    }

    public void setShipping_lines(List<Shipping_lines> shipping_lines) {
        this.shipping_lines = shipping_lines;
    }

    public List<Shipping_lines> getShipping_lines() {
        return shipping_lines;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setFee_lines(List<Fee_lines> fee_lines) {
        this.fee_lines = fee_lines;
    }

    public List<Fee_lines> getFee_lines() {
        return fee_lines;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}