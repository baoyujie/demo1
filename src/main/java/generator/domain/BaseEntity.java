package generator.domain;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

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
}
