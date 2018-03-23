package com.cl.privilege.api;

import com.cl.privilege.model.User;

public interface IPrivilegeBaseApiService {
    /**
     * query user info
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    String getModuleTree(Integer userId, String visitedModule, String visitedResource);

    /**
     * update user info
     *
     * @param user
     * @return
     */
    Integer updateUserById(User user);
}
