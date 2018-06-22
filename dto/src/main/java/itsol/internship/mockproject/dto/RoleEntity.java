package itsol.internship.mockproject.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ROLE", schema = "INTERN", catalog = "")
public class RoleEntity {
    private long roleId;
    private String roleCode;
    private String name;

    @Basic
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return roleId == that.roleId &&
                Objects.equals(roleCode, that.roleCode) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roleId, roleCode, name);
    }
}
