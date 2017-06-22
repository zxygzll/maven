package zll.cwnu.pojo;

import java.util.List;

public class Order {
	private String oid;// 订单的id
	private String ordertime;// 订单时间
	private double total;// 订单总数
	private int status;// 订单的状态
	private String address;// 地址
	private User user;//关联的用户
	
//	订单详细
	private List<OrderItem> orderItem;

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", ordertime=" + ordertime + ", total="
				+ total + ", status=" + status + ", address=" + address
				+ ", user=" + user + ", orderItem=" + orderItem + "]";
	}
	
	

}
