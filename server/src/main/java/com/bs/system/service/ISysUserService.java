package com.bs.system.service;

import com.bs.common.exception.GlobalException;
import com.bs.system.vo.RegisterVo;
import com.bs.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author tcx
 * @since 2020-02-03
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 登陆
     * @param phone 手机号
     * @param password 密码
     * @return token
     * @throws GlobalException 异常信息
     */
    String login(String phone, String password) throws Exception;

    /**
     * 注册
     * @param registerVo 注册数据
     * @throws GlobalException 异常信息
     */
    void register(RegisterVo registerVo) throws Exception;

    /**
     * 根据手机号查询用户
     * @param phone 手机号
     * @return 用户
     * @throws Exception 异常信息
     */
    SysUser getUserByPhone(String phone) throws Exception;

}
