package org.djt.share.life.db.model;

import java.util.Date;

public class DjtShareLifeUser {
    private Long userId;

    private String userName;

    private Long phoneNo;

    private String email;

    private String password;

    private Date createTime;

    private Date updateTime;

    private Boolean status;

    private Boolean enabled;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

	@Override
	public String toString() {
		return "DjtShareLifeUser [userId=" + userId + ", userName=" + userName + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", status=" + status + ", enabled=" + enabled + "]";
	}
    
    
}