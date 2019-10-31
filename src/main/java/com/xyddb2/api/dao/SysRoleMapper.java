package com.xyddb2.api.dao;

import com.xyddb2.api.entity.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String ROLEID);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String ROLEID);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}