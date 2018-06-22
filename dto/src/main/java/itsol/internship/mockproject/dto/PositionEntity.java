package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "POSITION", schema = "INTERN", catalog = "")
public class PositionEntity {
    private long positionId;
    private String positionCode;
    private String roleCode;
    private String permissionCode;

    @Basic
    @Column(name = "POSITION_ID")
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    @Id
    @Column(name = "POSITION_CODE")
    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
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
    @Column(name = "PERMISSION_CODE")
    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionEntity that = (PositionEntity) o;
        return positionId == that.positionId &&
                Objects.equals(positionCode, that.positionCode) &&
                Objects.equals(roleCode, that.roleCode) &&
                Objects.equals(permissionCode, that.permissionCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(positionId, positionCode, roleCode, permissionCode);
    }
}
