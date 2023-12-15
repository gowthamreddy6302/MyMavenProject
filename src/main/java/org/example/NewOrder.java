package org.example;

public class NewOrder {
    private String productId;
    private String productName;
    private NewCustomer customer;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public NewCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(NewCustomer customer) {
        this.customer = customer;
    }
}
