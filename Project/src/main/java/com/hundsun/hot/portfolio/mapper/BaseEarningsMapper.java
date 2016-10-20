package com.hundsun.hot.portfolio.mapper;

import com.hundsun.hot.portfolio.model.BaseEarnings;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEarningsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_base_earnings
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    int deleteByPrimaryKey(@Param("stockCode") String stockCode, @Param("tradeDay") Integer tradeDay);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_base_earnings
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    int insert(BaseEarnings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_base_earnings
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    BaseEarnings selectByPrimaryKey(@Param("stockCode") String stockCode, @Param("tradeDay") Integer tradeDay);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_base_earnings
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    List<BaseEarnings> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_stock_base_earnings
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    int updateByPrimaryKey(BaseEarnings record);
    
    /**
     * @Description 获取所有的股票列表
     * @return List<String>
     */
    List<String> getStockCodeList();
    
    /**
     * @Description 获取股票在一段时间内的收益数据,时间片段为开区间
     * @param stockCode
     * @param startDate
     * @param endDate
     * @return List<BaseEarnings>
     */
    List<BaseEarnings> getStockBaseEarnings(@Param("stockCode")String stockCode , @Param("startDate")Integer startDate, @Param("endDate")Integer endDate);
}