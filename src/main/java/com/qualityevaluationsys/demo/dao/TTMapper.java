package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.TT;
import com.qualityevaluationsys.demo.domain.TTExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TTMapper {
    long countByExample(TTExample example);

    int deleteByExample(TTExample example);

    int insert(TT record);

    int insertSelective(TT record);

    TT selectByTno(Integer tid);

    int updateByTid(TT record);

    int deleteByTid(String tid);

    List<TT> selectByExample(TTExample example);

    int updateByExampleSelective(@Param("record") TT record, @Param("example") TTExample example);

    int updateByExample(@Param("record") TT record, @Param("example") TTExample example);
}