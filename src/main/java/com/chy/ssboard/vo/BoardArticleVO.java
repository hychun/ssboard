package com.chy.ssboard.vo;

import java.util.Date;

public class BoardArticleVO {
	private int no;
	private String userId;
	private String userName;
	private String password;
	private String category;
	private String title;
	private String content;
	private Date writeDate;
	private int readCount;

	/**
	 * @return 게시물 번호
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param 게시물 번호 set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return 사용자 아이디
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param 사용자 아이디 set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return 사용자명
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param 사용자명 set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return 비밀번호(비로그인시)
	 */
	public String getPasswd() {
		return password;
	}
	/**
	 * @param 비밀번호(비로그인시) set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return 분류
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param 분류 set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return 제목
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param 제목 set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return 본문
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param 본문 set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return 작성일
	 */
	public Date getWriteDate() {
		return writeDate;
	}
	/**
	 * @param 작성일 set
	 */
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	/**
	 * @return 조회수
	 */
	public int getReadCount() {
		return readCount;
	}
	/**
	 * @param 조회수 set
	 */
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "BoardArticleVO [no=" + no + ", userId=" + userId + ", userName=" + userName + ", password=" + password
				+ ", category=" + category + ", title=" + title + ", content=" + content + ", writeDate=" + writeDate
				+ ", readCount=" + readCount + "]";
	}

}
