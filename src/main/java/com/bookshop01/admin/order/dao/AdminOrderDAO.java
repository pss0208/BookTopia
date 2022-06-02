package com.bookshop01.admin.order.dao;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

public interface AdminOrderDAO {
	public ArrayList<OrderVO> selectNewOrderList(Map condMap) throws DataAccessException;
	public void  updateDeliveryState(Map deliveryMap) throws DataAccessException;
	public ArrayList<OrderVO> selectOrderDetail(int order_id) throws DataAccessException;
	public MemberVO selectOrderer(String member_id) throws DataAccessException;
//
//	
//	
	public ArrayList selectOrderIdbyName(String orderer_name) throws DataAccessException;
	public ArrayList selectOrderIdbyId(String orderer_id) throws DataAccessException;
	public ArrayList selectOrderIdbyGoods(String orderer_goods) throws DataAccessException;
	public ArrayList selectOrderIdbyHp(String orderer_hp) throws DataAccessException;
}
