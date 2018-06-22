package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER", schema = "INTERN", catalog = "")
public class CustomerEntity {
    private int customerId;
    private String customerCode;
    private String customerType;
    private String customerName;
    private Boolean gender;
    private String email;
    private String password;
    private Time dateOfBirth;
    private Time createdDate;
    private Time updatedDate;
    private String staffUpdate;
    private String hashString;
    private boolean lockStatus;
    private Integer numLoginFail;
    private String searchName;
    private String avatar;
    private Timestamp lastTimeAccess;

    @Basic
    @Column(name = "CUSTOMER_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "CUSTOMER_CODE")
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Basic
    @Column(name = "CUSTOMER_TYPE")
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "CUSTOMER_NAME")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "GENDER")
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
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
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH")
    public Time getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
    @Column(name = "HASH_STRING")
    public String getHashString() {
        return hashString;
    }

    public void setHashString(String hashString) {
        this.hashString = hashString;
    }

    @Basic
    @Column(name = "LOCK_STATUS")
    public boolean isLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Basic
    @Column(name = "NUM_LOGIN_FAIL")
    public Integer getNumLoginFail() {
        return numLoginFail;
    }

    public void setNumLoginFail(Integer numLoginFail) {
        this.numLoginFail = numLoginFail;
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
    @Column(name = "AVATAR")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "LAST_TIME_ACCESS")
    public Timestamp getLastTimeAccess() {
        return lastTimeAccess;
    }

    public void setLastTimeAccess(Timestamp lastTimeAccess) {
        this.lastTimeAccess = lastTimeAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId &&
                lockStatus == that.lockStatus &&
                Objects.equals(customerCode, that.customerCode) &&
                Objects.equals(customerType, that.customerType) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate) &&
                Objects.equals(staffUpdate, that.staffUpdate) &&
                Objects.equals(hashString, that.hashString) &&
                Objects.equals(numLoginFail, that.numLoginFail) &&
                Objects.equals(searchName, that.searchName) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(lastTimeAccess, that.lastTimeAccess);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, customerCode, customerType, customerName, gender, email, password, dateOfBirth, createdDate, updatedDate, staffUpdate, hashString, lockStatus, numLoginFail, searchName, avatar, lastTimeAccess);
    }
}
