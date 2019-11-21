package com.cy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;

import com.cy.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
    private GoodsDao goodsDao;
	@Override
	public List<Goods> findAll() {
		List<Goods> list = goodsDao.findAll();
		return list;
	}

}
