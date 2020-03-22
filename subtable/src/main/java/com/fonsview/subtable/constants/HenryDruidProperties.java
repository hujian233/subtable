package com.fonsview.subtable.constants;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: hujian
 * @Date: 2020/3/22 17:45
 * @Description: 数据源映射
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class HenryDruidProperties {

    private String druid00username;

    private String druid00passwrod;

    private String druid00jdbcUrl;

    private String druid00driverClass;

    private String druid01username;

    private String druid01passwrod;

    private String druid01jdbcUrl;

    private String druid01driverClass;

    private String druid02username;

    private String druid02passwrod;

    private String druid02jdbcUrl;

    private String druid02driverClass;
}
