package cn.qf.b2c.gciantispider.service;

import java.util.List;

import cn.qf.b2c.gciantispider.model.NhRulemonitorAntispider;

public interface INhRulemonitorAntispiderService {

    public List<NhRulemonitorAntispider> getNhRulemonitorAntispiderByTimeAndType(String timeType, String ruleType);
}
