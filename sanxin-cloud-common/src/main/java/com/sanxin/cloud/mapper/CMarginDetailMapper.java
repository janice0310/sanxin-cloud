package com.sanxin.cloud.mapper;

import com.sanxin.cloud.entity.CMarginDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 押金明细 Mapper 接口
 * </p>
 *
 * @author Arno
 * @since 2019-09-19
 */
public interface CMarginDetailMapper extends BaseMapper<CMarginDetail> {

    /**
     * 用户点击提现申请返回判断支付方式(押金)查询最后一条充值记录
     * @param cid
     * @return
     */
    CMarginDetail selectLimt(Integer cid);
}
