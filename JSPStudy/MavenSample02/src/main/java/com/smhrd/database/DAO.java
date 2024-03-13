package com.smhrd.database;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.model.MemberVo;

public class DAO {
	// Data Access Object
	// 데이터에 접근하는 객체
	
	// 자바코드와 sql 쿼리를 자동으로 연결해주는 프레임워크(맵핑가능)
	// 먼저 자바코드와 sql 쿼리를 자동으로 연결해주기 전에 2개를 분리한다
	   
	   // 1. 필드
	   // DBCP 꺼내오기
	//  factory  == connection 객체들을 가지고 있는 공간
	   private SqlSessionFactory factory = MySqlSessionManager.getSqlSessionFactory();
	   
	   public int join(MemberVo vo) {
	      
	      // 1. 연결객체 빌려오기
	      SqlSession session = factory.openSession(true);
	      // 2. 연결객체 사용하기
	      // *공통*
	      // 매개변수 한개 >> Mapper파일의 sql구문 id값
	      // 매개변수 두개 >> id값, 보내줘야하는 데이터 
	      // session.insert() : insert구문
	      // session.delete() : delete구문
	      // session.update() : update구문
	      // session.selectOne() : select구문인데, 가져와야하는 데이터가 한개일 때 사용
	      // session.selectList() : select구문인데, 가져와야하는 데이터가 여러 개 일 때 사용
	      int row = session.insert("join", vo);
	      // 3. 연결객체 반납하기
	      session.close();
	      
	      return row;
	   }

}
