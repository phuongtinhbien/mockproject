package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PROMOTIONDETAIL", schema = "INTERN", catalog = "")
public class PromotiondetailEntity {
    private long promotionDetailId;
    private String promotionCode;
    private String productCode;
    private Long quantity;

    @Id
    @Column(name = "PROMOTION_DETAIL_ID")
    public long getPromotionDetailId() {
        return promotionDetailId;
    }

    public void setPromotionDetailId(long promotionDetailId) {
        this.promotionDetailId = promotionDetailId;
    }

    @Basic
    @Column(name = "PROMOTION_CODE")
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
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
    @Column(name = "QUANTITY")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotiondetailEntity that = (PromotiondetailEntity) o;
        return promotionDetailId == that.promotionDetailId &&
                Objects.equals(promotionCode, that.promotionCode) &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(promotionDetailId, promotionCode, productCode, quantity);
    }
}
