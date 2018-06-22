package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PRODUCT", schema = "INTERN", catalog = "")
public class ProductEntity {
    private long productId;
    private String productCode;
    private String productName;
    private String productTypeCode;
    private boolean status;
    private long staffCreate;
    private Time createdDate;
    private Long staffUpdate;
    private Time updatedDate;
    private String searchName;
    private String shortDescription;
    private String detailDescription;

    @Basic
    @Column(name = "PRODUCT_ID")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "PRODUCT_CODE")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @Column(name = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "PRODUCT_TYPE_CODE")
    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    @Basic
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
    @Column(name = "CREATED_DATE")
    public Time getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Time createdDate) {
        this.createdDate = createdDate;
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
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "SEARCH_NAME")
    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    @Basic
    @Column(name = "SHORT_DESCRIPTION")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "DETAIL_DESCRIPTION")
    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return productId == that.productId &&
                status == that.status &&
                staffCreate == that.staffCreate &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productTypeCode, that.productTypeCode) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(searchName, that.searchName) &&
                Objects.equals(shortDescription, that.shortDescription) &&
                Objects.equals(detailDescription, that.detailDescription);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productCode, productName, productTypeCode, status, staffCreate, createdDate, staffUpdate, updatedDate, searchName, shortDescription, detailDescription);
    }
}
