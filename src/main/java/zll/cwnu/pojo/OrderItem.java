package zll.cwnu.pojo;

/**
 * @author zll
 *
 */
public class OrderItem {
	private String orderItemId;// 订单详细的id
	private String bname;// 书的名称

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", bname=" + bname
				+ "]";
	}
	
	

}
