package com.github.mikesam.tools.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mikesam on 2017/9/6.
 */
@Mapper
public interface BsMapper {

    @Insert("insert into pre_common_user_details values(null,#{uuid},#{username},#{recommenderuuid},#{phone},#{keyString},(select sysdate() from dual))")
    void insertUser(@Param("uuid") String uuid, @Param("username") String username, @Param("recommenderuuid") String recommenderuuid, @Param("phone") String phone, @Param("keyString") String keyString);

}
