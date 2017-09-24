package com.example.onlinelearning.controller;

import com.example.onlinelearning.pojo.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseController {

	/**
	 * 数据起始位置
	 * @param page
	 * @param limit
	 * @return
	 */
	public int getStartRow(Integer page, Integer limit) {
		int res = 0;
		if (page != null) {
			if (page > 1) {
				res = (page - 1) * limit;
			} else {
				res = 0;
			}
		} else {
			res = 0;
		}
		return res;
	}

	/**
	 *设置查询标准
	 * @param page 当前页数
	 * @param limit	当前一页几行数据
	 * @param entity	实体
	 * @return
	 */
	public Map<String, Object> getSearchMap(Integer page, Integer limit,
			Object entity) {
		Map<String, Object> map = new HashMap<String, Object>();
		Integer startRow = getStartRow(page, limit);
		map.put("start", startRow);
		map.put("limit", limit == null ? 10 : limit);
		map.put("search", entity);
		return map;
	}

	/**
	 * 根据文本获取指定顺序二级菜单
	 * @param listMenu
	 * @return
	 */
	public List<Model> getMenu(List<Model> listMenu){
		List<com.example.onlinelearning.pojo.Model> modellist=new
				ArrayList<Model>();
		for (com.example.onlinelearning.pojo.Model r:listMenu){
			if(r.getParMod()==0){
				modellist.add(r);
				for (com.example.onlinelearning.pojo.Model flag:listMenu){
					if(flag.getParMod()==r.getModid()){
						modellist.add(flag);
					}
				}
			}
		}
		return modellist;
	}
}
