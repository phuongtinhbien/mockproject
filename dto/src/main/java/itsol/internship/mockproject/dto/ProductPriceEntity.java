package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT_PRICE", schema = "INTERN", catalog = "")
public class ProductPriceEntity {
    private long productPriceId;
    private String productCode;
    private long price;
    private Long vat;
    private long staffCreate;
    private Time updatedDate;
    private Long staffUpdate;
    private Time fromDate;
    private Time toDate;

    @Id
    @Column(name = "PRODUCT_PRICE_ID")
    public long getProductPriceId() {
        return productPriceId;
    }

    public void setProductPriceId(long productPriceId) {
        this.productPriceId = productPriceId;
    }

    @Basic
    @Column(name = "PRODUCT_CODE")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "PRICE")
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Basic
    @Column(name = "VAT")
    public Long getVat() {
        return vat;
    }

    public void setVat(Long vat) {
        this.vat = vat;
    }

    @Basic
    @Column(name = "STAFF_CREATE")
    public long getStaffCreate() {
        return staffCreate;
    }

    public void setStaffCreate(long staffCreate) {
        this.staffCreate = staffCreate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "STAFF_UPDATE")
    public Long getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(Long staffUpdate) {
        this.staffUpdate = staffUpdate;
    }

    @Basic
    @Column(name = "FROM_DATE")
    public Time getFromDate() {
        return fromDate;
    }

    public void setFromDate(Time fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "TO_DATE")
    public Time getToDate() {
        return toDate;
    }

    public void setToDate(Time toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPriceEntity that = (ProductPriceEntity) o;
        return productPriceId == that.productPriceId &&
                price == that.price &&
                staffCreate == that.staffCreate &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(vat, that.vat) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(toDate, that.toDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productPriceId, productCode, price, vat, staffCreate, updatedDate, staffUpdate, fromDate, toDate);
    }
}
