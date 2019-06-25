package com.wulang.mybatis.h2.test.dao;

import com.wulang.mybatis.h2.test.entity.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CountryMapper {
    Country selectOne(Long id);

    List<Country> selectAll();

    Integer insert(Country country);

    Integer update(Country country);

    Integer insertList(@Param("countryList") List<Country> countryList);

    Integer insertListLow(@Param("countryList") List<Country> countryList);

    int delete(@Param("name") String countryName, @Param("code") String countryCode);

    Country selectRowNumber();
}
