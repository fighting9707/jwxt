package com.campus.mapper;

import com.campus.model.ClassroomUpdateKey;


public interface ClassroomUpdateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom_update
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(ClassroomUpdateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom_update
     *
     * @mbggenerated
     */
    int insert(ClassroomUpdateKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classroom_update
     *
     * @mbggenerated
     */
    int insertSelective(ClassroomUpdateKey record);
    ClassroomUpdateKey selectFirst();
}