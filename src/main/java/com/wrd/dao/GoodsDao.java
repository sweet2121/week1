package com.wrd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wrd.domain.Brand;
import com.wrd.domain.Condition;
import com.wrd.domain.Goods;

public interface GoodsDao {

	List<Goods> list(Condition con);

	List<Brand> toAdd();

	void addGoods(Goods goods);

	void addgb(@Param("gid") Integer gid,@Param("bids") Integer[] bids);

}
