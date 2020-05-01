package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Menu;
import com.ytmj.jzgl.domain.User;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Service;

public interface UserMapper {
    //通过id查询
    @Select("select * from user where id=#{id}")
    User findUserById(@Param("id")Integer id);
    @Select("select * from user where username=#{username}")
    User findByUsername(@Param("username")String username);
    @Select("select * from user where username=#{username} and password=#{password}")
    User findByUsernameAndPwd(@Param("username")String username,@Param("password")String password);
    //查询用户拥有菜单、
    @Select("select name,decription from menu where id in ( select menu_id from role_menu rm where  role_id in  (select  id from role where id in (select role_id from role_user where user_id in (select id from user where user.username=#{username} ))))")
    List<Menu> findAllByUsername(@Param("username") String username);

    //查询所有用户，及拥有的角色


    @Select("select * from user")
    @Results(
            value = {
                    @Result(property = "id",column = "id"),
                @Result(property = "roleList" ,column = "id",many =@Many(select="com.ytmj.jzgl.mapper.RoleMapper.findRolesByUserId",fetchType = FetchType.DEFAULT))
            }
    )
    List<User> findAllUsers();

    //添加用户
    @Insert("insert into user(username, password, name,sex,create_time) values(#{username},#{password} ,#{name} ,#{sex} ,#{createTime} )")
    public void addUser(User user);
    //重置密码或修改密码

    @Update("update user set password=#{password} where id=#{userId} ")
    public void resetPassword(@Param("password")String password,@Param("userId")Integer  userId);

    //更新用户信息
    @Update("update user set name=#{name} ,sex=#{sex},age=#{age} ,number=#{number} ,mail=#{mail}  where username=#{username} ")
    public void updateUser(User user);

    //删除用户
    @Delete("delete from user where id=#{userId} ")
    public void deleteUserByUserId(@Param("userId")Integer userId)throws Exception;


}