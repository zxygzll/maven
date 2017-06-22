package zll.cwnu.mapper;



import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import zll.cwnu.pojo.Order;
import zll.cwnu.pojo.OrderCustomer;


public class OrderTest {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindOrderUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		@SuppressWarnings("unchecked")
		List<OrderCustomer>  user=  orderMapper.findOrderUser();
		System.out.println(user);
	}
	
	@Test
	public void testfindOrderUserMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		@SuppressWarnings("unchecked")
		List<Order>  user=  orderMapper.findOrderUserMap();
		System.out.println(user);
	}
	@Test
	public void testfindOrderUserOrderItemMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		@SuppressWarnings("unchecked")
		List<Order>  user=  orderMapper.findOrderUserOrderItemMap();
		System.out.println(user);
	}
	@Test
	public void testFindUserItem() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		@SuppressWarnings("unchecked")
		List<Order>  user=  orderMapper.findUserItem();
		System.out.println(user);
	}
	
	@Test
	public void testFindOrderLazyLoaderUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		@SuppressWarnings("unchecked")
		List<Order>  orders=  orderMapper.findOrderLazyLoaderUser();
		for(Order order:orders) {
			System.out.println(order.getUser());
		}
	}

}
