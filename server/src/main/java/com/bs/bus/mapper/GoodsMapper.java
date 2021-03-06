package com.bs.bus.mapper;

import com.bs.bus.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author tcx
 * @since 2020-02-08
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * 查询商品列表
     * @param params 查询条件
     * @return 商品列表
     * @throws Exception 异常信息
     */
    List<Goods> selectGoodsList(Map<String, Object> params) throws Exception;

    /**
     * 查询商品列表总条数
     * @param params 查询条件
     * @return 商品列表总条数
     * @throws Exception 异常信息
     */
    Integer selectGoodsListCount(Map<String, Object> params) throws Exception;

    /**
     * 查询商品发布列表
     * @param userId
     * @return
     * @throws Exception
     */
    List<Goods> selectSellGoodsList(String userId) throws Exception;

    /**
     * 查询用户收藏列表
     * @param userId 用户id
     * @return 商品列表
     * @throws Exception 异常信息
     */
    List<Goods> selectCollectGoods(String userId) throws Exception;

    public static void main(String[] args) {
        String s = "ha 哈哈哈哈   嗯呐    和 ";
        String [] arr = s.split("\\s+");
        System.out.println(arr.length);
    }
}
