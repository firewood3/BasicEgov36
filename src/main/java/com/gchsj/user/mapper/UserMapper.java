package com.gchsj.user.mapper;

import com.gchsj.user.domain.User;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface UserMapper {
    User select(User user);
}
