package com.itcast.service;import com.itcast.pojo.Menu;import com.itcast.pojo.Roles;import org.apache.ibatis.annotations.Mapper;import java.util.List;/** * Created by zhangfajie on 2020/5/28. */@Mapperpublic interface RoleMapper {    Roles finId(Integer roleid);    List<Roles> finAll();    List<Menu> finMenuandRoleAll();    List<Roles> finMenuandRoleAll_1();}