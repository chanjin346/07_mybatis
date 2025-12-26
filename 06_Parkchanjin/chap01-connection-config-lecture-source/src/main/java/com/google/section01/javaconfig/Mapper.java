package com.google.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

  @Select("SELECT  NOW()")
  java.util.Date selectDate();
}
