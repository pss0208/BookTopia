package com.bookshop01.admin.order.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

@Repository("adminOrderDAO")
public class AdminOrderDAOImpl  implements AdminOrderDAO{
	@Autowired
	private SqlSession sqlSession;
	
	public ArrayList<OrderVO>selectNewOrderList(Map condMap) throws DataAccessException{
		ArrayList<OrderVO>  orderList=(ArrayList)sqlSession.selectList("mapper.admin.order.selectNewOrderList",condMap);
		return orderList;
	}
	public void  updateDeliveryState(Map deliveryMap) throws DataAccessException{
		sqlSession.update("mapper.admin.order.updateDeliveryState",deliveryMap);
	}
	
	public ArrayList<OrderVO> selectOrderDetail(int order_id) throws DataAccessException{
		ArrayList<OrderVO> orderList=(ArrayList)sqlSession.selectList("mapper.admin.order.selectOrderDetail",order_id);
		return orderList;
	}


	public MemberVO selectOrderer(String member_id) throws DataAccessException{
		MemberVO orderer=(MemberVO)sqlSession.selectOne("mapper.admin.order.selectOrderer",member_id);
		return orderer;
		
	}
//
//	
//	상세조회 기능 구현 중
	@Override
	public ArrayList selectOrderIdbyName(String orderer_name) throws DataAccessException {
		ArrayList order_id_List=sqlSession.selectOne("mapper.admin.order.selectOrderer_id_byname",orderer_name);
		return order_id_List;
	}
	
	@Override
	public ArrayList selectOrderIdbyId(String orderer_id) throws DataAccessException {
		ArrayList order_id_List=sqlSession.selectOne("mapper.admin.order.selectOrderer_id_byid",orderer_id);
		return order_id_List;
	}
	
	@Override
	public ArrayList selectOrderIdbyGoods(String orderer_goods) throws DataAccessException {
		ArrayList order_id_List=sqlSession.selectOne("mapper.admin.order.selectOrderer_id_bygoods",orderer_goods);
		return order_id_List;
	}
	
	@Override
	public ArrayList selectOrderIdbyHp(String orderer_hp) throws DataAccessException {
		ArrayList order_id_List=sqlSession.selectOne("mapper.admin.order.selectOrderer_id_byhp",orderer_hp);
		return order_id_List;
	}

	
	
}
