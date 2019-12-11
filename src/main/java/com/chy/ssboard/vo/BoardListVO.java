package com.chy.ssboard.vo;

import java.util.Date;

public class BoardListVO {
	private int no;
	private String category;
	private String title;
	private Date writeDate;
	private int readCount;
	
	/**
	 * @return 글번호
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param 글번호 세팅
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return 구분
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param 구분 세팅
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
	 * @param 제목 세팅
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return 작성일
	 */
	public Date getWriteDate() {
		return writeDate;
	}
	/**
	 * @param 작성일 세팅
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
	 * @param 조회수 세팅
	 */
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	@Override
	public String toString() {
		return "BoardListVO [no=" + no + ", category=" + category + ", title=" + title + ", writeDate=" + writeDate
				+ ", readCount=" + readCount + "]";
	}
	
}
