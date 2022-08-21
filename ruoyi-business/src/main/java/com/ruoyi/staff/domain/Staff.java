package com.ruoyi.staff.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工基础信息对象 ht_staff
 * 
 * @author HT
 * @date 2021-09-12
 */
@Data
public class Staff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 工号 */
    @Excel(name = "工号")
    private String jobNum;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date entryTime;

    /** 工龄 */
    @Excel(name = "工龄")
    private Long workYear;


}
