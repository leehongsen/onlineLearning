package com.example.onlinelearning.controller;

import java.util.HashMap;
import java.util.Map;


public class BaseController {

	/**
	 * 数据起始位置
	 * @param page
	 * @param row
	 * @return
	 */
	public int getStartRow(Integer page, Integer row) {
		int res = 0;
		if (page != null) {
			if (page > 1) {
				res = (page - 1) * row;
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
	 * @param rows	当前一页几行数据
	 * @param entity	实体
	 * @return
	 */
	public Map<String, Object> getSearchMap(Integer page, Integer rows,
			Object entity) {
		Map<String, Object> map = new HashMap<String, Object>();
		Integer startRow = getStartRow(page, rows);
		map.put("start", startRow);
		map.put("rows", rows == null ? 10 : rows);
		map.put("search", entity);
		return map;
	}


}
