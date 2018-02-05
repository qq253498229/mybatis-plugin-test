package cn.codeforfun.util;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Package com.pactera.knowledge.util
 * Project code
 * Email 253498229@qq.com
 *
 * @author WangBin
 * @version 1.0.0
 * @date Created on 2018/1/8 18:10
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
  //TODO
  //FIXME 特别注意，该接口不能被扫描到，否则会出错
}