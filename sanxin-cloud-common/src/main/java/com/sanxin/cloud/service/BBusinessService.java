package com.sanxin.cloud.service;

import com.sanxin.cloud.entity.BBusiness;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Arno
 * @since 2019-08-27
 */
public interface BBusinessService extends IService<BBusiness> {

    BBusiness selectById(Integer id);

    /**
     * 通过用户id查询数据
     * @param cid
     * @return
     */
    BBusiness getByCid(Integer cid);

    /**
     * 查询店铺信息并且校验店铺是否通过
     * @param bid
     * @return
     */
    BBusiness validById(Integer bid);

}
