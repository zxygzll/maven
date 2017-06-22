package zll.cwnu.mapper;

import java.util.List;

import zll.cwnu.pojo.Order;
import zll.cwnu.pojo.OrderCustomer;

public interface OrderMapper {
	public List<OrderCustomer> findOrderUser() throws Exception;
	public List<Order> findOrderUserMap() throws Exception;
	public List<Order> findOrderUserOrderItemMap() throws Exception;
	
	public List<Order> findUserItem() throws Exception;
	
	public List<Order> findOrderLazyLoaderUser() throws Exception;

}
