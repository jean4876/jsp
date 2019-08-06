package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.user.model.UserVO;

public class UserDaoTest {

   /**
    * 
    * Method : getUserListTest
    * 작성자 : PC-11
    * 변경이력 :
    * Method 설명 : getUserList 테스트
    */
   @Test
   public void getUserListTest() {
      /***Given***/
      IUserDao userDao = new UserDao();
      
      /***When***/
      List<UserVO> userList = userDao.getUserList();
      
      /***Then***/
      assertEquals(5, userList.size());

   }
   
   /**
    * 
    * Method : getUserTest
    * 작성자 : PC-23
    * 변경이력 :
    * Method 설명 :
    */
   @Test
   public void getUserTest() {
	/***Given***/
	String userId = "brown";
	IUserDao userDao = new UserDao();
	
	/***When***/
	UserVO userVo =  userDao.getUser(userId);

	/***Then***/
	assertEquals("브라운", userVo.getUserNM());
	assertEquals("brown1234", userVo.getPass());

	

   }
   

}