package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HtStaffMapper;
import com.ruoyi.system.domain.HtStaff;
import com.ruoyi.system.service.IHtStaffService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工基础信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-06-22
 */
@Service
public class HtStaffServiceImpl implements IHtStaffService 
{
    @Autowired
    private HtStaffMapper htStaffMapper;

    /**
     * 查询员工基础信息
     * 
     * @param id 员工基础信息主键
     * @return 员工基础信息
     */
    @Override
    public HtStaff selectHtStaffById(Long id)
    {
        return htStaffMapper.selectHtStaffById(id);
    }

    /**
     * 查询员工基础信息列表
     * 
     * @param htStaff 员工基础信息
     * @return 员工基础信息
     */
    @Override
    public List<HtStaff> selectHtStaffList(HtStaff htStaff)
    {
        return htStaffMapper.selectHtStaffList(htStaff);
    }

    /**
     * 新增员工基础信息
     * 
     * @param htStaff 员工基础信息
     * @return 结果
     */
    @Override
    public int insertHtStaff(HtStaff htStaff)
    {
        return htStaffMapper.insertHtStaff(htStaff);
    }

    /**
     * 修改员工基础信息
     * 
     * @param htStaff 员工基础信息
     * @return 结果
     */
    @Override
    public int updateHtStaff(HtStaff htStaff)
    {
        return htStaffMapper.updateHtStaff(htStaff);
    }

    /**
     * 批量删除员工基础信息
     * 
     * @param ids 需要删除的员工基础信息主键
     * @return 结果
     */
    @Override
    public int deleteHtStaffByIds(String ids)
    {
        return htStaffMapper.deleteHtStaffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工基础信息信息
     * 
     * @param id 员工基础信息主键
     * @return 结果
     */
    @Override
    public int deleteHtStaffById(Long id)
    {
        return htStaffMapper.deleteHtStaffById(id);
    }
}
