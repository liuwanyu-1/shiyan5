package lwy.study.spring.mapper;

import lwy.study.spring.vo.Admin;

public interface AdminMapper {
    Admin selectByEmail(String email);
}
