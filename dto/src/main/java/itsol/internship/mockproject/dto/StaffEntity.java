package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "STAFF", schema = "INTERN", catalog = "")
public class StaffEntity {
    private int staffId;
    private String avatar;
    private Timestamp createdDate;
    private String email;
    private String hashString;
    private Timestamp lastTimeAccess;
    private int lockStatus;
    private String name;
    private int numLoginFail;
    private String password;
    private String roleCode;
    private String searchName;
    private String staffCode;
    private String staffCreate;
    private String staffUpdate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "STAFF_ID")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "AVATAR")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "HASH_STRING")
    public String getHashString() {
        return hashString;
    }

    public void setHashString(String hashString) {
        this.hashString = hashString;
    }

    @Basic
    @Column(name = "LAST_TIME_ACCESS")
    public Timestamp getLastTimeAccess() {
        return lastTimeAccess;
    }

    public void setLastTimeAccess(Timestamp lastTimeAccess) {
        this.lastTimeAccess = lastTimeAccess;
    }

    @Basic
    @Column(name = "LOCK_STATUS")
    public int getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NUM_LOGIN_FAIL")
    public int getNumLoginFail() {
        return numLoginFail;
    }

    public void setNumLoginFail(int numLoginFail) {
        this.numLoginFail = numLoginFail;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
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
    @Column(name = "STAFF_CODE")
    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
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
    @Column(name = "STAFF_UPDATE")
    public String getStaffUpdate() {
        return staffUpdate;
    }

    public void setStaffUpdate(String staffUpdate) {
        this.staffUpdate = staffUpdate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffEntity that = (StaffEntity) o;
        return staffId == that.staffId &&
                lockStatus == that.lockStatus &&
                numLoginFail == that.numLoginFail &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(email, that.email) &&
                Objects.equals(hashString, that.hashString) &&
                Objects.equals(lastTimeAccess, that.lastTimeAccess) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(roleCode, that.roleCode) &&
                Objects.equals(searchName, that.searchName) &&
                Objects.equals(staffCode, that.staffCode) &&
                Objects.equals(staffCreate, that.staffCreate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(staffId, avatar, createdDate, email, hashString, lastTimeAccess, lockStatus, name, numLoginFail, password, roleCode, searchName, staffCode, staffCreate, staffUpdate, updatedDate);
    }
}
