package com.djt.share.life.api.beans.common.dto;

import com.djt.share.life.api.beans.base.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018/10/8.
 */
@Data
@NoArgsConstructor
public class UserDto extends BaseDto {

    private Long usId;
    private String userName;
}
