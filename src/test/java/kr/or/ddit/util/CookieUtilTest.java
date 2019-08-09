package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieUtilTest {
   /**
    * 
    * Method : getCookieTest
    * 작성자 : PC-12
    * 변경이력 :
    * Method 설명 :
    */
   @Test
   public void getCookieTest() {
      /***Given***/
      String cookieString = "rememberMe=Y; userId=brown; test=testValue";

      /***When***/
      String userIdValue = CookieUtil.getCookie(cookieString, "userId");
      String rememberMeCookieValue = CookieUtil.getCookie(cookieString, "rememberMe");
      String testCookieValue = CookieUtil.getCookie(cookieString, "test");
      String noExistsCookieValue = CookieUtil.getCookie(cookieString, "notExists");
      
      
      /***Then***/
      assertEquals("brown", userIdValue);
      assertEquals("Y", rememberMeCookieValue);
      assertEquals("testValue", testCookieValue);
      assertNull(noExistsCookieValue);
      
   }

}