package com.wrd.service;

import java.util.List;

import com.wrd.domain.Brand;
import com.wrd.domain.Condition;
import com.wrd.domain.Goods;

public interface GoodsService {

	List<Goods> list(Condition con);

	List<Brand> toAdd();

	void add(Goods goods);

}
