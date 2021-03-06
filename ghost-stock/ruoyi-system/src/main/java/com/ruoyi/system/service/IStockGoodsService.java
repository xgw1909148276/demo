package com.ruoyi.system.service;

import com.ruoyi.system.domain.StockGoods;
import java.util.List;

/**
 * 库存货品 服务层
 * 
 * @author ruoyi
 * @date 2019-07-15
 */
public interface IStockGoodsService 
{
	/**
     * 查询库存货品信息
     * 
     * @param goodsId 库存货品ID
     * @return 库存货品信息
     */
	public StockGoods selectStockGoodsById(Long goodsId);
	
	/**
     * 查询库存货品列表
     * 
     * @param stockGoods 库存货品信息
     * @return 库存货品集合
     */
	public List<StockGoods> selectStockGoodsList(StockGoods stockGoods);
	
	/**
     * 新增库存货品
     * 
     * @param stockGoods 库存货品信息
     * @return 结果
     */
	public int insertStockGoods(StockGoods stockGoods);
	
	/**
     * 修改库存货品
     * 
     * @param stockGoods 库存货品信息
     * @return 结果
     */
	public int updateStockGoods(StockGoods stockGoods);
		
	/**
     * 删除库存货品信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStockGoodsByIds(String ids);
	
}
