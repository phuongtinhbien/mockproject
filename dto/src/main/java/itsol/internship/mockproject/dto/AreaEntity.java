package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "AREA", schema = "INTERN", catalog = "")
public class AreaEntity {
    private long areaId;
    private String areaCode;
    private Long province;
    private String provinceName;
    private Long district;
    private String districtName;
    private Time createdDate;
    private String staffCreate;
    private Time updateDate;
    private String staffUpdate;
    private Long precinct;
    private String precinctName;

    @Basic
    @Column(name = "AREA_ID")
    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    @Id
    @Column(name = "AREA_CODE")
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "PROVINCE")
    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    @Basic
    @Column(name = "PROVINCE_NAME")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "DISTRICT")
    public Long getDistrict() {
        return district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    @Basic
    @Column(name = "DISTRICT_NAME")
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
    @Column(name = "UPDATE_DATE")
    public Time getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Time updateDate) {
        this.updateDate = updateDate;
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
    @Column(name = "PRECINCT")
    public Long getPrecinct() {
        return precinct;
    }

    public void setPrecinct(Long precinct) {
        this.precinct = precinct;
    }

    @Basic
    @Column(name = "PRECINCT_NAME")
    public String getPrecinctName() {
        return precinctName;
    }

    public void setPrecinctName(String precinctName) {
        this.precinctName = precinctName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaEntity that = (AreaEntity) o;
        return areaId == that.areaId &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(province, that.province) &&
                Objects.equals(provinceName, that.provinceName) &&
                Objects.equals(district, that.district) &&
                Objects.equals(districtName, that.districtName) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(precinct, that.precinct) &&
                Objects.equals(precinctName, that.precinctName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(areaId, areaCode, province, provinceName, district, districtName, createdDate, staffCreate, updateDate, staffUpdate, precinct, precinctName);
    }
}
