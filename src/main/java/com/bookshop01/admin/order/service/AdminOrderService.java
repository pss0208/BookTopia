package com.bookshop01.admin.order.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.order.vo.OrderVO;

public interface AdminOrderService {
	public List<OrderVO>listNewOrder(Map condMap) throws Exception;
	public void  modifyDeliveryState(Map deliveryMap) throws Exception;
	public Map orderDetail(int order_id) throws Exception;
//
//	
//	
	public ArrayList byName(String orderer_name) throws Exception;
	public ArrayList byId(String orderer_id) throws Exception;
	public ArrayList byGoods(String orderer_goods) throws Exception;
	public ArrayList byHp(String orderer_hp) throws Exception;
	
}
