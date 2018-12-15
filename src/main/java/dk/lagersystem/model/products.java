package dk.lagersystem.model;


import javax.persistence.*;

@Entity
@Table(name = "test")
public class products {
    @Id
    private int p_number;
    private String p_name;
    private double p_purchase;
    private double p_sales;
    private String p_barcode;
    private String p_description;
    private String p_location;
    private int p_stock;

    public products() {
    }

    public products(int p_number, String p_name, double p_purchase, double p_sales, String p_barcode, String p_description, String p_location, int p_stock) {
        this.p_number = p_number;
        this.p_name = p_name;
        this.p_purchase = p_purchase;
        this.p_sales = p_sales;
        this.p_barcode = p_barcode;
        this.p_description = p_description;
        this.p_location = p_location;
        this.p_stock = p_stock;
    }

    public int getP_number() {
        return p_number;
    }

    public void setP_number(int p_number) {
        this.p_number = p_number;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public double getP_purchase() {
        return p_purchase;
    }

    public void setP_purchase(double p_purchase) {
        this.p_purchase = p_purchase;
    }

    public double getP_sales() {
        return p_sales;
    }

    public void setP_sales(double p_sales) {
        this.p_sales = p_sales;
    }

    public String getP_barcode() {
        return p_barcode;
    }

    public void setP_barcode(String p_barcode) {
        this.p_barcode = p_barcode;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public String getP_location() {
        return p_location;
    }

    public void setP_location(String p_location) {
        this.p_location = p_location;
    }

    public int getP_stock() {
        return p_stock;
    }

    public void setP_stock(int p_stock) {
        this.p_stock = p_stock;
    }
}
