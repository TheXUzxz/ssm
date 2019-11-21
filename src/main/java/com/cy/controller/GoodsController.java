package com.cy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pojo.Goods;
import com.cy.service.GoodsService;


@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("goods")
	@ResponseBody
	public List<Goods> findAll(){
		List<Goods> list = goodsService.findAll();
		return list;
	}

}
