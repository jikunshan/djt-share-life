package org.djt.share.life.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.djt.share.life.db.model.DjtShareLifeUser;
import org.djt.share.life.db.model.DjtShareLifeUserExample;

public interface DjtShareLifeUserMapper {
    long countByExample(DjtShareLifeUserExample example);

    int deleteByExample(DjtShareLifeUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(DjtShareLifeUser record);

    int insertSelective(DjtShareLifeUser record);

    List<DjtShareLifeUser> selectByExample(DjtShareLifeUserExample example);

    DjtShareLifeUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") DjtShareLifeUser record, @Param("example") DjtShareLifeUserExample example);

    int updateByExample(@Param("record") DjtShareLifeUser record, @Param("example") DjtShareLifeUserExample example);

    int updateByPrimaryKeySelective(DjtShareLifeUser record);

    int updateByPrimaryKey(DjtShareLifeUser record);
}