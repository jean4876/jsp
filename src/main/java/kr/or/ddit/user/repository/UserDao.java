package kr.or.ddit.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

   /**
    * Method : getUserList
    * 작성자 : PC-11
    * 변경이력 :
    * @return
    * Method 설명 :
    */
   @Override
   public List<User> getUserList(SqlSession sqlSession) {

      // db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//      List<UserVO> userList = new ArrayList<UserVO>();
//      userList.add(new UserVO("brown"));
//      userList.add(new UserVO("cony"));
//      userList.add(new UserVO("sally"));

      return sqlSession.selectList("user.getUserList");
   }

   /**
    *
    * Method : getUser
    * 작성자 : PC-11
    * 변경이력 :
    * @param userId
    * @return
    * Method 설명 : userId를 갖는  사용자 정보 조회
    */
   @Override
   public User getUser(SqlSession sqlSession, String userId) {

      return sqlSession.selectOne("user.getUser", userId);
   }

   /**
    *
    * Method : getUserListOnlyHalf
    * 작성자 : PC-11
    * 변경이력 :
    * @return
    * Method 설명 : 사용자 정보 조회(50명만)
    */
   @Override
   public List<User> getUserListOnlyHalf(SqlSession sqlSession) {

      return sqlSession.selectList("user.getUserListOnlyHalf");
   }


}