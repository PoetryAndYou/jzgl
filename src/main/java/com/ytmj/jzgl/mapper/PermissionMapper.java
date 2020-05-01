package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Permission;

import java.util.List;

import org.apache.ibatis.annotations.*;

public interface PermissionMapper {
    @Select("        select p.id as id," +
            "        p.name as name," +
            "        p.url as  url" +
            "        from  role_permission rp" +
            "        left join permission p on p.id=rp.permission_id" +
            "        where rp.role_id=#{roleId}")
    List<Permission> findPermissionByRoleId(@Param("roleId")Integer roleId);

    //更新权限

    @Update("update permission set name=#{name },url=#{url} where id=#{id} ")
    public void updatePermission(Permission permission);
    //插入权限
    @Insert( "insert into permission(name, url) values (#{name} ,#{url} )")
    public void insertPermission(Permission permission);
    //删除权限
    @Delete("delete from permission where id=#{id} ")
    public void deletePermission(@Param("id")Integer id);

    @Delete("delete from role_permission where permission_id=#{id}")
    public void deleteROlePermission(@Param("id")Integer id);

    @Select("select * from permission")
    public List<Permission> findAllPermission();
}