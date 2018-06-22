package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "COLOR", schema = "INTERN", catalog = "")
public class ColorEntity {
    private long colorId;
    private String colorCode;
    private String colorName;

    @Basic
    @Column(name = "COLOR_ID")
    public long getColorId() {
        return colorId;
    }

    public void setColorId(long colorId) {
        this.colorId = colorId;
    }

    @Id
    @Column(name = "COLOR_CODE")
    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Basic
    @Column(name = "COLOR_NAME")
    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorEntity that = (ColorEntity) o;
        return colorId == that.colorId &&
                Objects.equals(colorCode, that.colorCode) &&
                Objects.equals(colorName, that.colorName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(colorId, colorCode, colorName);
    }
}
