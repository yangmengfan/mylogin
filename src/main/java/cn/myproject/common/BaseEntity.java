package cn.myproject.common;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Auther: ymfa
 * @Date: 2019/5/29 15:13
 * @Description:
 */
public class BaseEntity implements Serializable {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
