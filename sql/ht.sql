CREATE TABLE `ht_staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `age` varchar(10) DEFAULT NULL COMMENT '年龄',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `job_num` varchar(10) DEFAULT NULL COMMENT '工号',
  `phone` varchar(25) DEFAULT NULL COMMENT '手机号',
  `entry_time` datetime DEFAULT NULL COMMENT '入职时间',
  `work_year` int(11) DEFAULT NULL COMMENT '工龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工基础信息表';