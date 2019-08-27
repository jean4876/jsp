package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileuploadUtilTest {

	/**
	 *
	 * Method : getFilenameTest
	 * 작성자 : PC-23
	 * 변경이력 :
	 * Method 설명 : Content-dispostion 헤더 문자열로 부터 파일이름 추출 테스트
	 *
	 */
	@Test
	public void getFilenameTest() {
		/***Given***/
		String contentDsipostion = "form-data; name=\file\"; filename=\"brown.png\"";
		String contentDsipostion2 = "form-data; name=\file\"; filename=\"sally.png\"";

		/***When***/
		String filename = FileuploadUtil.getFilename(contentDsipostion);
		String filename2 = FileuploadUtil.getFilename(contentDsipostion2);

		/***Then***/
		assertEquals("brown.png", filename);
		assertEquals("sally.png", filename2);



	}


	/**
	 *
	 * Method : getFileExtentionTest
	 * 작성자 : PC-23
	 * 변경이력 :
	 * Method 설명 : Content-dispostion 헤더 문자열로 부터 파일확장자 추출 테스트
	 */
	@Test
	public void getFileExtensionTest() {
		/***Given***/
		String contentDsipostion = "form-data; name=\file\"; filename=\"brown.png\"";
		String contentDsipostion2 = "form-data; name=\file\"; filename=\"sally.png\"";
		//String contentDsipostion3 = "form-data; name=\file\"; filename=\"sally\"";

		/***When***/
		String fileExtensionName = FileuploadUtil.getFileExtension(contentDsipostion);
		String fileExtensionName2 = FileuploadUtil.getFileExtension(contentDsipostion2);
		//String fileExtensionName3 = FileuploadUtil.getFileExtension(contentDsipostion3);

		/***Then***/
		assertEquals("png", fileExtensionName);
		assertEquals("png", fileExtensionName2);
		//assertEquals("", fileExtensionName3);



	}

	@Test
	public void getPathTest() {
		/***Given***/

		/***When***/
		String path = FileuploadUtil.getPath();

		/***Then***/
		assertEquals("e:\\upload\\2019\\08\\", path);

	}

}

