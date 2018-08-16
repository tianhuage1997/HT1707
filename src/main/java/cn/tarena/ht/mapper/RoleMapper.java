package cn.tarena.ht.mapper;

import cn.tarena.ht.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {

    /* 查询所有的用户角色信息 */
    @Select(value = "select * from role_p")
   public List<Role> findAllRole();


    /* 保存用户信息 */
    public  Integer saveRole(Role role);

    /* 保存角色用户关联表 */
    @Insert(value = "insert into ROLE_USER_P (role_id,user_id) values(#{roleId},#{userId})")
    public  void saveRoleUser(String userId,String  roleId);
}
