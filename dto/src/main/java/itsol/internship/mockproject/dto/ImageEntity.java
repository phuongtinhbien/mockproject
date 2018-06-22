package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "IMAGE", schema = "INTERN", catalog = "")
public class ImageEntity {
    private long imgId;
    private String imgCode;
    private String urlImage;

    @Basic
    @Column(name = "IMG_ID")
    public long getImgId() {
        return imgId;
    }

    public void setImgId(long imgId) {
        this.imgId = imgId;
    }

    @Id
    @Column(name = "IMG_CODE")
    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    @Basic
    @Column(name = "URL_IMAGE")
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageEntity that = (ImageEntity) o;
        return imgId == that.imgId &&
                Objects.equals(imgCode, that.imgCode) &&
                Objects.equals(urlImage, that.urlImage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imgId, imgCode, urlImage);
    }
}
