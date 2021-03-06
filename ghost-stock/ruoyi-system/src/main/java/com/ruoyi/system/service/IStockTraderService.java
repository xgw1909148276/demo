package com.ruoyi.system.service;

import com.ruoyi.system.domain.StockTrader;
import java.util.List;

/**
 * 库存交易方 服务层
 * 
 * @author ruoyi
 * @date 2019-07-15
 */
public interface IStockTraderService 
{
	/**
     * 查询库存交易方信息
     * 
     * @param traderId 库存交易方ID
     * @return 库存交易方信息
     */
	public StockTrader selectStockTraderById(Long traderId);
	
	/**
     * 查询库存交易方列表
     * 
     * @param stockTrader 库存交易方信息
     * @return 库存交易方集合
     */
	public List<StockTrader> selectStockTraderList(StockTrader stockTrader);
	
	/**
     * 新增库存交易方
     * 
     * @param stockTrader 库存交易方信息
     * @return 结果
     */
	public int insertStockTrader(StockTrader stockTrader);
	
	/**
     * 修改库存交易方
     * 
     * @param stockTrader 库存交易方信息
     * @return 结果
     */
	public int updateStockTrader(StockTrader stockTrader);
		
	/**
     * 删除库存交易方信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStockTraderByIds(String ids);
	
}
