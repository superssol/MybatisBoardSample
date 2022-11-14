package com.exerciese.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.exerciese.spring.dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {

	public List<SimpleBbsDto> listDao();
	public SimpleBbsDto viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int deleteDao(@Param("_id") String id);
	
}
