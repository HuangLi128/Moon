package com.moon.core.common;

import java.util.List;


/**
 * @Author  liangquandeng
 * @Date    2016年01月03日
 * @Version 1.0V
 * @Description 所有Dao操作的父接口
 */
public class Pagination<T> {
    //当前页码
    private Integer pageNo;
    //每页记录数
    private Integer pageSize;
    //总记录
    private Integer totalRecords;
    //每页结果集
    private List<T> list;
    //是否还有下一页
    private Boolean isNextPage;
    //是否还有上一页
    private Boolean isPreviousPage;
    //当前页记录总数
    private Integer currentPageSize;


    public Pagination(){

    }

    public Pagination(List<T> list,Integer pageNo,Integer pageSize){
        this.pageNo   = pageNo;
        this.pageSize = pageSize;
        this.list     = list;
        setCurrentPageSize(list.size());
    }

    /**
     * 获取第一页
     * @return 第一页页码
     */
    public Integer getFirstPageNo(){
        return 1;
    }

    /**
     * 获取最后一页
     * @return 最后一页页码
     */
    public Integer getLastPageNo(){
        Integer lastPageNo = 0;
        if(totalRecords%pageSize==0){
            lastPageNo = totalRecords/pageSize;
        }else{
            lastPageNo = totalRecords/pageSize+1;
        }
        return lastPageNo;
    }


    /**
     * 设置当前页记录数
     * @param currentPageSize 页记录数（Integer）
     */
    public void setCurrentPageSize(Integer currentPageSize) {
        this.currentPageSize = currentPageSize;
    }

    /**
     * 获取当前页记录
     * @return 记录行数
     */
    public Integer getCurrentPageSize() {
        return currentPageSize;
    }




    /**
     * 获取当前页码每页记录数
     * @return 当前页码
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * 设置当前页码
     * @param pageNo 当前页码(Integer)
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * 获取设置记录数
     * @return 记录数
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 修改设置记录数
     * @param pageSize 记录数(Integer)
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取总记录数
     * @return 总行数
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * 设置总记录数
     * @param totalRecords 总行数(Integer)
     */
    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * 获取页记录数据
     * @return  数据列表 List<T>
     */
    public List<T> getList() {
        return list;
    }

    /**
     * 设置页记录数据
     * @param list 数据列表List<T>
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    public void setIsNextPage(Boolean isNextPage) {
        this.isNextPage = isNextPage;
    }

    public void setIsPreviousPage(Boolean isPreviousPage) {
        this.isPreviousPage = isPreviousPage;
    }

    /**
     * 是否还有下一页
     * @return true 有  false 无
     */
    public Boolean getIsNextPage() {
        return isNextPage;
    }

    /**
     * 是否还有上一页
     * @return true 有 false 无
     */
    public Boolean getIsPreviousPage() {
        return isPreviousPage;
    }

    public static void main(String [] args){

    }
}
