package com.djt.share.life.orm;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/8.
 */
@Repository
public interface IUserMapper {
    /**
     * 查询指定用户信息
     *
     * @param userDto
     * @return
     */
    UserVo selectUserInfo(@Param("dto") UserDto userDto);
}
