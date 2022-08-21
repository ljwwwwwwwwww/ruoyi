package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.HtStaff;
import com.ruoyi.system.service.IHtStaffService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工基础信息Controller
 * 
 * @author ruoyi
 * @date 2022-06-22
 */
@Controller
@RequestMapping("/system/staff")
public class HtStaffController extends BaseController
{
    private String prefix = "system/staff";

    @Autowired
    private IHtStaffService htStaffService;

    @RequiresPermissions("system:staff:view")
    @GetMapping()
    public String staff()
    {
        return prefix + "/staff";
    }

    /**
     * 查询员工基础信息列表
     */
    @RequiresPermissions("system:staff:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(HtStaff htStaff)
    {
        startPage();
        List<HtStaff> list = htStaffService.selectHtStaffList(htStaff);
        return getDataTable(list);
    }

    /**
     * 导出员工基础信息列表
     */
    @RequiresPermissions("system:staff:export")
    @Log(title = "员工基础信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HtStaff htStaff)
    {
        List<HtStaff> list = htStaffService.selectHtStaffList(htStaff);
        ExcelUtil<HtStaff> util = new ExcelUtil<HtStaff>(HtStaff.class);
        return util.exportExcel(list, "员工基础信息数据");
    }

    /**
     * 新增员工基础信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工基础信息
     */
    @RequiresPermissions("system:staff:add")
    @Log(title = "员工基础信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(HtStaff htStaff)
    {
        return toAjax(htStaffService.insertHtStaff(htStaff));
    }

    /**
     * 修改员工基础信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        HtStaff htStaff = htStaffService.selectHtStaffById(id);
        mmap.put("htStaff", htStaff);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工基础信息
     */
    @RequiresPermissions("system:staff:edit")
    @Log(title = "员工基础信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(HtStaff htStaff)
    {
        return toAjax(htStaffService.updateHtStaff(htStaff));
    }

    /**
     * 删除员工基础信息
     */
    @RequiresPermissions("system:staff:remove")
    @Log(title = "员工基础信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(htStaffService.deleteHtStaffByIds(ids));
    }
}
