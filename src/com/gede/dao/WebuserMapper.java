package com.gede.dao;

import com.gede.model.Webuser;
import com.gede.model.WebuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebuserMapper {
    long countByExample(WebuserExample example);

    int deleteByExample(WebuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Webuser record);

    int insertSelective(Webuser record);

    List<Webuser> selectByExample(WebuserExample example);

    Webuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Webuser record, @Param("example") WebuserExample example);

    int updateByExample(@Param("record") Webuser record, @Param("example") WebuserExample example);

    int updateByPrimaryKeySelective(Webuser record);

    int updateByPrimaryKey(Webuser record);
}