package com.djt.share.life.api.beans.common.po;

import com.djt.share.life.api.beans.base.BasePo;
import com.djt.share.life.api.beans.common.dto.UserDto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author duanhaoran
 * @date 2018/10/8
 */
@Data
@NoArgsConstructor
@ToString
public class UserPo extends BasePo {
    private static final long serialVersionUID = -1255433941231793424L;

    private Long userId;
    private String userName;
    private String phoneNo;
    private String email;
    private String password;
    private String createTime;
    private String updateTime;
    private Integer status;
    private Integer enabled;

    public UserPo(UserDto dto) {
        this.setUserName(dto.getUserName());
        this.setPassword(dto.getPassword());
    }
}
