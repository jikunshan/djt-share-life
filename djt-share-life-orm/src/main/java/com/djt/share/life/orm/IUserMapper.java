package com.djt.share.life.orm;

import com.djt.share.life.api.beans.common.dto.UserDto;
import com.djt.share.life.api.beans.common.po.UserPo;
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
    UserVo restGet(@Param("dto") UserDto userDto);

    /**
     * 保存用户信息
     *
     * @param po
     * @return
     */
    Integer restInsert(@Param("po") UserPo po);
}
