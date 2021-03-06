package com.hundsun.hot.portfolio.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class VarRatio {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock_var_ratio.stock_code
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    private String stockCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_stock_var_ratio.var_ratio_250
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    private Double varRatio250;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock_var_ratio.stock_code
     *
     * @return the value of t_stock_var_ratio.stock_code
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock_var_ratio.stock_code
     *
     * @param stockCode the value for t_stock_var_ratio.stock_code
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_stock_var_ratio.var_ratio_250
     *
     * @return the value of t_stock_var_ratio.var_ratio_250
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    public Double getVarRatio250() {
        return varRatio250;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_stock_var_ratio.var_ratio_250
     *
     * @param varRatio250 the value for t_stock_var_ratio.var_ratio_250
     *
     * @mbg.generated Tue Oct 18 16:28:59 CST 2016
     */
    public void setVarRatio250(Double varRatio250) {
        this.varRatio250 = varRatio250;
    }
    
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
    @Override
    public String toString(){
    	return ToStringBuilder.reflectionToString(this);
    }
}