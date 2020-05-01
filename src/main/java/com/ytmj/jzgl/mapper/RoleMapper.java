package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface RoleMapper {


    @Select("select r.id as id ,\n" +
            "       r.role_name as roleName,\n" +
            "       r.description as description\n" +
            "      from  role_user ru  left join role r on ru.role_id=r.id\n" +
            "        where ru.user_id=#{userId}")
    @Results(
            value = {
                    @Result(id=true,property = "id" ,column = "id"),
                    @Result(property = "role_name" ,column = "role_name"),
                    @Result(property = "description" ,column = "description"),
                    @Result(property="permissionList", column="id",
                    many = @Many(select = "com.ytmj.jzgl.mapper.PermissionMapper.findPermissionByRoleId",fetchType = FetchType.DEFAULT)),

            }
    )
    List<Role> findByUserId(@Param("userId")Integer userId);
    //通过用户id查询拥有权限
    @Select("select r.id as id ,\n" +
            "       r.role_name as roleName,\n" +
            "       r.description as description\n" +
            "      from  role_user ru  left join role r on ru.role_id=r.id\n" +
            "        where ru.user_id=#{userId}")
    List<Role> findRolesByUserId(@Param("userId")Integer userId);


    //查找所有权限
    @Select("select * from role")
    @Results(
            value = {
                    @Result(id=true,property = "id" ,column = "id"),
                    @Result(property = "roleName" ,column = "role_name"),
                    @Result(property = "description" ,column = "description")
            }
    )
    public List<Role> findAll();

    //插入权限

    @Insert("insert into role_user (role_id, user_id) values (#{roleId} ,#{userId} );")
    public void makeRole(@Param("userId")Integer userId,@Param("roleId")Integer roleId) throws Exception;


    //删除权限
    @Delete("delete from role_user where user_id=#{userId} and role_id=#{roleId} ")
    public void deleteRoleByUR(@Param("userId")Integer userId,@Param("roleId")Integer roleId) throws Exception;
    //删除用户的所有角色
    @Delete("delete from role_user where user_id=#{userId}")
    public void deleteRoleByUuserId(@Param("userId")Integer userId)throws Exception;

    //添加角色


    @Insert("insert into role (role_name, description) values (#{roleName} ,#{description} );")
    public void addRole(Role role);
    //删除角色
    @Delete("delete from role where id=#{id}")
    public void deleteRole(@Param("id")Integer id);
}