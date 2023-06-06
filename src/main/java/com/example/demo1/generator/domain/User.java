package com.example.demo1.generator.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

/**
 *
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User extends BaseEntity implements Serializable{
    /**
     *
     */
    @TableField(value = "uid")
    private Integer uid;

    /**
     *
     */
    @TableField(value = "username")
    private String username;

    /**
     *
     */
    @TableField(value = "password")
    private String password;

    /**
     *
     */
    @TableField(value = "salt")
    private String salt;

    /**
     *
     */
    @TableField(value = "phone")
    private String phone;

    /**
     *
     */
    @TableField(value = "email")
    private String email;

    /**
     *
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     *
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     *
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     *
     */
    @TableField(value = "created_user")
    private String createdUser;

    /**
     *
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     *
     */
    @TableField(value = "modified_user")
    private String modifiedUser;

    /**
     *
     */
    @TableField(value = "modified_time")
    private Date modifiedTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Integer getGender() {
        return gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uid, user.uid) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(salt, user.salt) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(gender, user.gender) && Objects.equals(avatar, user.avatar) && Objects.equals(isDelete, user.isDelete) && Objects.equals(createdUser, user.createdUser) && Objects.equals(createdTime, user.createdTime) && Objects.equals(modifiedUser, user.modifiedUser) && Objects.equals(modifiedTime, user.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, salt, phone, email, gender, avatar, isDelete, createdUser, createdTime, modifiedUser, modifiedTime);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                ", isDelete=" + isDelete +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}