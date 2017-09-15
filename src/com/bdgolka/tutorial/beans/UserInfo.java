package com.bdgolka.tutorial.beans;

public class UserInfo {

	public String userName;
	private int post;
	private String contry;

	public UserInfo(String userName, int post, String contry) {
		this.userName = userName;
		this.post = post;
		this.contry = contry;
	}
	
	public UserInfo(String userName) {
		this.userName = userName;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}
	
	
}
