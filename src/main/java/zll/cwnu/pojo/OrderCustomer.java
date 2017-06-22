package zll.cwnu.pojo;

public class OrderCustomer extends Order {
	private String loginname;// 登录名
	private String loginpass;// 登录密码

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpass() {
		return loginpass;
	}

	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}

}
