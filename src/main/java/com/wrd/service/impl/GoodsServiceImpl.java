package com.wrd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrd.dao.GoodsDao;
import com.wrd.domain.Brand;
import com.wrd.domain.Condition;
import com.wrd.domain.Goods;
import com.wrd.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDao dao;

	@Override
	public List<Goods> list(Condition con) {
		// TODO Auto-generated method stub
		return dao.list(con);
	}

	@Override
	public List<Brand> toAdd() {
		// TODO Auto-generated method stub
		return dao.toAdd();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		dao.addGoods(goods);
		
		dao.addgb(goods.getGid(),goods.getBids());
	}
	
}
