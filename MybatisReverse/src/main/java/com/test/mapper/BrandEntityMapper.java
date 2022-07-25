package com.test.mapper;

import com.test.model.BrandEntity;
import com.test.model.BrandEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandEntityMapper {
    int countByExample(BrandEntityExample example);

    int deleteByExample(BrandEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BrandEntity record);

    int insertSelective(BrandEntity record);

    List<BrandEntity> selectByExample(BrandEntityExample example);

    BrandEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BrandEntity record, @Param("example") BrandEntityExample example);

    int updateByExample(@Param("record") BrandEntity record, @Param("example") BrandEntityExample example);

    int updateByPrimaryKeySelective(BrandEntity record);

    int updateByPrimaryKey(BrandEntity record);
}