package com.ruoyi.staff.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.StaffMapper;
import com.ruoyi.staff.domain.Staff;
import com.ruoyi.staff.service.IStaffService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工基础信息Service业务层处理
 * 
 * @author HT
 * @date 2021-09-12
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 查询员工基础信息
     * 
     * @param id 员工基础信息主键
     * @return 员工基础信息
     */
    @Override
    public Staff selectStaffById(Long id)
    {
        return staffMapper.selectStaffById(id);
    }

    /**
     * 查询员工基础信息列表
     * 
     * @param staff 员工基础信息
     * @return 员工基础信息
     */
    @Override
    public List<Staff> selectStaffList(Staff staff)
    {
        return staffMapper.selectStaffList(staff);
    }

    /**
     * 新增员工基础信息
     * 
     * @param staff 员工基础信息
     * @return 结果
     */
    @Override
    public int insertStaff(Staff staff)
    {
        return staffMapper.insertStaff(staff);
    }

    /**
     * 修改员工基础信息
     * 
     * @param staff 员工基础信息
     * @return 结果
     */
    @Override
    public int updateStaff(Staff staff)
    {
        return staffMapper.updateStaff(staff);
    }

    /**
     * 批量删除员工基础信息
     * 
     * @param ids 需要删除的员工基础信息主键
     * @return 结果
     */
    @Override
    public int deleteStaffByIds(String ids)
    {
        return staffMapper.deleteStaffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工基础信息信息
     * 
     * @param id 员工基础信息主键
     * @return 结果
     */
    @Override
    public int deleteStaffById(Long id)
    {
        return staffMapper.deleteStaffById(id);
    }
}
