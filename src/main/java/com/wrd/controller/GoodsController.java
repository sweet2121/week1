package com.wrd.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wrd.domain.Brand;
import com.wrd.domain.Condition;
import com.wrd.domain.Goods;
import com.wrd.service.GoodsService;
//说明
@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	@RequestMapping("list.do")
	public String list(Model m,Condition con){
		
		if(con.getPageNum()==null){
			con.setPageNum(1);
		}
		
		PageHelper.startPage(con.getPageNum(), 3);
		
		List<Goods> list=service.list(con);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("con", con);
		
		return "list";
	}
	
	@RequestMapping("toAdd.do")
	public String toAdd(Model m,Goods goods){
		
		List<Brand> list=service.toAdd();
		m.addAttribute("list", list);
		m.addAttribute("goods", goods);
		
		return "add";
	}
	
	@RequestMapping("add.do")
	public String add(Model m,@Validated @ModelAttribute Goods goods,BindingResult br,MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException{
		if(br.hasErrors()){
			List<Brand> list=service.toAdd();
			m.addAttribute("list", list);
			m.addAttribute("goods", goods);
			
			return "add";
		}
		//获取项目地址
		String realPath = request.getSession().getServletContext().getRealPath("/file/");
		//获取上传文件的名字
		String originalFilename = myFile.getOriginalFilename();
		//使用切割手段获取上传文件的格式
		String end = originalFilename.substring(originalFilename.lastIndexOf("."));
		//重新生成文件名
		String start = UUID.randomUUID().toString();
		//创建新文件
		File file = new File(realPath+start+end);
		//文件复制
		myFile.transferTo(file);
		//将新文件名保存
		goods.setPic(start+end);
		
		//添加
		service.add(goods);
		
		return "redirect:list.do";
	}
}
