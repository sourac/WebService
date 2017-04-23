package com.ws.error;

public class ErrorResponse {

	String msg;
	boolean flag;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public String toString() {
		return "Output [msg=" + msg + ", flag=" + flag + "]";
	}			
}
