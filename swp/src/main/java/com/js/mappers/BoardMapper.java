package com.js.mappers;

import com.js.domian.Board;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

   @Insert("insert into board values ()")
   public Board regist(@Param("bno") int bno);
   
   @Delete("delete from user where bno=#{bno}")
   public void remove(int bno);

   @Select("select * from board where bno=#{bno}")
   public Board search(@Param("bno") int bno);



      
   
}