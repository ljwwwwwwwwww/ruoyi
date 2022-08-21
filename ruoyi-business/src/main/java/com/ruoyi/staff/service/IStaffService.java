package com.ruoyi.staff.service;

import java.util.List;
import com.ruoyi.staff.domain.Staff;

/**
 * 员工基础信息Service接口
 * 
 * @author HT
 * @date 2021-09-12
 */
public interface IStaffService 
{
    /**
     * 查询员工基础信息
     * 
     * @param id 员工基础信息主键
     * @return 员工基础信息
     */
    public Staff selectStaffById(Long id);

    /**
     * 查询员工基础信息列表
     * 
     * @param staff 员工基础信息
     * @return 员工基础信息集合
     */
    public List<Staff> selectStaffList(Staff staff);

    /**
     * 新增员工基础信息
     * 
     * @param staff 员工基础信息
     * @return 结果
     */
    public int insertStaff(Staff staff);

    /**
     * 修改员工基础信息
     * 
     * @param staff 员工基础信息
     * @return 结果
     */
    public int updateStaff(Staff staff);

    /**
     * 批量删除员工基础信息
     * 
     * @param ids 需要删除的员工基础信息主键集合
     * @return 结果
     */
    public int deleteStaffByIds(String ids);

    /**
     * 删除员工基础信息信息
     * 
     * @param id 员工基础信息主键
     * @return 结果
     */
    public int deleteStaffById(Long id);
}
