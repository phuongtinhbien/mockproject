package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "NEWS", schema = "INTERN", catalog = "")
public class NewsEntity {
    private long newsId;
    private String newsCode;
    private String categoryNewsCode;
    private String title;
    private String contentNews;
    private String imgCode;
    private boolean status;
    private Time createdDate;
    private String staffCreate;
    private Time updatedDate;
    private String staffUpdate;
    private Time fromDate;
    private Time toDate;

    @Basic
    @Column(name = "NEWS_ID")
    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    @Id
    @Column(name = "NEWS_CODE")
    public String getNewsCode() {
        return newsCode;
    }

    public void setNewsCode(String newsCode) {
        this.newsCode = newsCode;
    }

    @Basic
    @Column(name = "CATEGORY_NEWS_CODE")
    public String getCategoryNewsCode() {
        return categoryNewsCode;
    }

    public void setCategoryNewsCode(String categoryNewsCode) {
        this.categoryNewsCode = categoryNewsCode;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "CONTENT_NEWS")
    public String getContentNews() {
        return contentNews;
    }

    public void setContentNews(String contentNews) {
        this.contentNews = contentNews;
    }

    @Basic
    @Column(name = "IMG_CODE")
    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
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
    @Column(name = "CREATED_DATE")
    public Time getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Time createdDate) {
        this.createdDate = createdDate;
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
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
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
        NewsEntity that = (NewsEntity) o;
        return newsId == that.newsId &&
                status == that.status &&
                Objects.equals(newsCode, that.newsCode) &&
                Objects.equals(categoryNewsCode, that.categoryNewsCode) &&
                Objects.equals(title, that.title) &&
                Objects.equals(contentNews, that.contentNews) &&
                Objects.equals(imgCode, that.imgCode) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(fromDate, that.fromDate) &&
                Objects.equals(toDate, that.toDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(newsId, newsCode, categoryNewsCode, title, contentNews, imgCode, status, createdDate, staffCreate, updatedDate, staffUpdate, fromDate, toDate);
    }
}
