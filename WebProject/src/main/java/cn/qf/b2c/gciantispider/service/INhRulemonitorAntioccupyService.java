package cn.qf.b2c.gciantispider.service;

import java.util.List;

import cn.qf.b2c.gciantispider.model.NhRulemonitorAntioccupy;

public interface INhRulemonitorAntioccupyService {
    
    public List<NhRulemonitorAntioccupy> getNhRulemonitorAntioccupyByTimeAndType(String timeType, String ruleType);
}
