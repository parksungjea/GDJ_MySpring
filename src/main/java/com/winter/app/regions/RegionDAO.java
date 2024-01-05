package com.winter.app.regions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.Region;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	
	
	public int Delete(RegionDTO regionDTO) {
		return sqlSession.delete(namespace+"Delete", regionDTO);
	}
	//update
	public int update(RegionDTO regionDTO) throws Exception {
			return sqlSession.update(namespace+"update", regionDTO);
		
	}
	
	//Insert
	public int add(RegionDTO regionDTO)throws Exception{
			return sqlSession.insert(namespace+"add", regionDTO);
	}
	
	//detail
	public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", regionDTO);
		

	}
	
	public List<RegionDTO> getList() throws Exception {
		return sqlSession.selectList(namespace+"getList");
		
		
	}

}
