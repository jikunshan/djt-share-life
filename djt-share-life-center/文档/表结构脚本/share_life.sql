CREATE TABLE `djt_share_life_user` (
  `USER_ID` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '用户ID，主键',
  `USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
  `PHONE_NO` bigint(13) DEFAULT NULL COMMENT '手机号码',
  `EMAIL` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '密码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '最后更新时间',
  `STATUS` tinyint(1) NOT NULL DEFAULT '1' COMMENT '用户状态（1=正常、2=冻结、3=注销）',
  `ENABLED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用,1启用 0停用',
  PRIMARY KEY (`US_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';


CREATE TABLE `djt_share_life_user_role` (
  `ROLE_ID` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ROLE_NAME` varchar(128) DEFAULT NULL COMMENT '角色名称',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';


CREATE TABLE `djt_share_life_user_role_relation` (
  `USER_ROLE_ID` bigint(15) NOT NULL,
  `USER_ID` bigint(15) NOT NULL,
  `ROLE_ID` bigint(15) NOT NULL,
  PRIMARY KEY (`USER_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户-角色关联表';

CREATE TABLE `djt_share_life_user_login_check` (
  `USER_LOGIN_CHECK_ID` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `USER_ID` varchar(32) NOT NULL COMMENT '用户标识',
  `LOGIN_ERROR_COUNT` tinyint(4) DEFAULT NULL COMMENT '登录异常次数',
  `CREATE_TIME` datetime NOT NULL COMMENT '首次登录访问时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '最后登录访问时间',
  `STATUS` tinyint(1) NOT NULL DEFAULT '1' COMMENT '用户状态（1=登录正常、2=登录失败、3=登录失败次数过多）',
  `ENABLED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否,1启用 0停用 是否锁定该账号(默认锁定30分钟)',
  `ACCOUNT_LOCK_TIME` datetime NOT NULL COMMENT '账号锁定截止时间',
  PRIMARY KEY (`US_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录校验表';


CREATE TABLE `djt_share_life_user_addr` (
  `USER_ADDR_ID` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '收货地址ID，主键',
  `USER_ID` bigint(15) NOT NULL COMMENT '用户ID',
  `add_info` varchar(128) DEFAULT NULL COMMENT '收件地址',
  `phone_no` varchar(32) DEFAULT NULL COMMENT '收件联系电话',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime NOT NULL COMMENT '最后更新时间',
  `STATUS` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态（1=正常、2=冻结、3=注销）',
  `ENABLED` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否启用,1启用 0停用',
  PRIMARY KEY (`US_ADDR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户地址管理表';