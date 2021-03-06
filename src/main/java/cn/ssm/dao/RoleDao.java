package cn.ssm.dao;

import cn.ssm.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色Dao层接口
 * @author zhoujl
 */
public interface RoleDao {
    /**
     * 获取角色列表
     * @return 符合条件的角色列表
     */
    List<Role> queryAllRole();

    /**
     * 根据角色ID查询角色信息
     * @param roleId 查询的角色ID
     * @return 角色信息
     */
    Role queryRoleById(@Param("roleId") Long roleId);

    /**
     * 添加一个角色
     * @param role 需要添加的角色
     * @return 添加结果
     */
    int addRole(Role role);

    /**
     * 更新角色信息
     * @param role 更新的角色信息
     * @return 更新结果
     */
    int updateByRoleId(Role role);

    /**
     * 删除一个角色
     * @param roleId 角色ID
     * @return 删除结果
     */
    int deleteRoleById(@Param("roleId") Long roleId);

}
