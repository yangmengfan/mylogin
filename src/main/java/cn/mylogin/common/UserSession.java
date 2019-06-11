package cn.mylogin.common;

import lombok.Data;
import org.apache.shiro.authc.UsernamePasswordToken;

import java.io.Serializable;

/**
 * @Auther: ymfa
 * @Date: 2019/6/11 15:46
 * @Description:
 */
@Data
public class UserSession implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sessionId;
    private String userName;
    private String role;
    private UsernamePasswordToken token;
}
