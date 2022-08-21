package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.HtStaff;

/**
 * 员工基础信息Mapper接口
 * 
 * @author ruoyi
 * @date 2022-06-22
 */
public interface HtStaffMapper 
{
    /**
     * 查询员工基础信息
     * 
     * @param id 员工基础信息主键
     * @return 员工基础信息
     */
    public HtStaff selectHtStaffById(Long id);

    /**
     * 查询员工基础信息列表
     * 
     * @param htStaff 员工基础信息
     * @return 员工基础信息集合
     */
    public List<HtStaff> selectHtStaffList(HtStaff htStaff);

    /**
     * 新增员工基础信息
     * 
     * @param htStaff 员工基础信息
     * @return 结果
     */
    public int insertHtStaff(HtStaff htStaff);

    /**
     * 修改员工基础信息
     * 
     * @param htStaff 员工基础信息
     * @return 结果
     */
    public int updateHtStaff(HtStaff htStaff);

    /**
     * 删除员工基础信息
     * 
     * @param id 员工基础信息主键
     * @return 结果
     */
    public int deleteHtStaffById(Long id);

    /**
     * 批量删除员工基础信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHtStaffByIds(String[] ids);
}
