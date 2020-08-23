package cn.qf.b2c.gciantispider.service;

import java.util.List;

import cn.qf.b2c.gciantispider.model.SystemFunctionInfo;
public interface ISystemFunctionInfoService {
    /**
     * 获取所有系统功能运行状态
     * @return
     */
    List<SystemFunctionInfo> getAllSystemFunctionInfo();
}
