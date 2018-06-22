package itsol.internship.mockproject.dto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "PROMOTION", schema = "INTERN", catalog = "")
public class PromotionEntity {
    private long promotionId;
    private String promotionCode;
    private String promotionContent;
    private Timestamp timeStart;
    private Timestamp timeEnd;
    private String staffCreate;
    private Time createdDate;
    private boolean status;
    private String staffUpdate;
    private Time updatedDate;
    private boolean detailType;
    private String promotionName;
    private String staffApprove;

    @Basic
    @Column(name = "PROMOTION_ID")
    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
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
    @Column(name = "PROMOTION_CONTENT")
    public String getPromotionContent() {
        return promotionContent;
    }

    public void setPromotionContent(String promotionContent) {
        this.promotionContent = promotionContent;
    }

    @Basic
    @Column(name = "TIME_START")
    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    @Basic
    @Column(name = "TIME_END")
    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Basic
    @Column(name = "STAFF_CREATE")
    public String getStaffCreate() {
        return staffCreate;
    }

    public void setStaffCreate(String staffCreate) {
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
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STAFF_UPDATE")
    public String getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(String staffUpdate) {
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
    @Column(name = "DETAIL_TYPE")
    public boolean isDetailType() {
        return detailType;
    }

    public void setDetailType(boolean detailType) {
        this.detailType = detailType;
    }

    @Basic
    @Column(name = "PROMOTION_NAME")
    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Basic
    @Column(name = "STAFF_APPROVE")
    public String getStaffApprove() {
        return staffApprove;
    }

    public void setStaffApprove(String staffApprove) {
        this.staffApprove = staffApprove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEntity that = (PromotionEntity) o;
        return promotionId == that.promotionId &&
                status == that.status &&
                detailType == that.detailType &&
                Objects.equals(promotionCode, that.promotionCode) &&
                Objects.equals(promotionContent, that.promotionContent) &&
                Objects.equals(timeStart, that.timeStart) &&
                Objects.equals(timeEnd, that.timeEnd) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(promotionName, that.promotionName) &&
                Objects.equals(staffApprove, that.staffApprove);
    }

    @Override
    public int hashCode() {

        return Objects.hash(promotionId, promotionCode, promotionContent, timeStart, timeEnd, staffCreate, createdDate, status, staffUpdate, updatedDate, detailType, promotionName, staffApprove);
    }
}
