package dk.lagersystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int p_number;
    private String p_name;
    private double p_purchase_price;
    private double p_sales_price;
    private String p_barcode;
    private String p_description;
    private int p_in_stock;
    private int p_location_id;
    private Blob p_image;

    public Product() {
    }

    public Product(int p_number, String p_name, double p_purchase_price, double p_sales_price, String p_barcode, String p_description, int p_in_stock, int p_location_id, Blob p_image) {
        this.p_number = p_number;
        this.p_name = p_name;
        this.p_purchase_price = p_purchase_price;
        this.p_sales_price = p_sales_price;
        this.p_barcode = p_barcode;
        this.p_description = p_description;
        this.p_in_stock = p_in_stock;
        this.p_location_id = p_location_id;
        this.p_image = p_image;
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

    public double getP_purchase_price() {
        return p_purchase_price;
    }

    public void setP_purchase_price(double p_purchase_price) {
        this.p_purchase_price = p_purchase_price;
    }

    public double getP_sales_price() {
        return p_sales_price;
    }

    public void setP_sales_price(double p_sales_price) {
        this.p_sales_price = p_sales_price;
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

    public int getP_in_stock() {
        return p_in_stock;
    }

    public void setP_in_stock(int p_in_stock) {
        this.p_in_stock = p_in_stock;
    }

    public int getP_location_id() {
        return p_location_id;
    }

    public void setP_location_id(int p_location_id) {
        this.p_location_id = p_location_id;
    }

    public Blob getP_image() {
        return p_image;
    }

    public void setP_image(Blob p_image) {
        this.p_image = p_image;
    }
}