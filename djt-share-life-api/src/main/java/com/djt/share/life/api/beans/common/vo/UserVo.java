package com.djt.share.life.api.beans.common.vo;

import com.djt.share.life.api.beans.base.BasePo;
import com.djt.share.life.api.beans.common.po.UserPo;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018/10/8.
 */
@Data
@NoArgsConstructor
public class UserVo extends UserPo {

    public UserVo(String userName) {
        super.setUserName(userName);
    }
}
