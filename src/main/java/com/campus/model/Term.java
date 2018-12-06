package com.campus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
@JsonIgnoreProperties({"creationTime"})
public class Term extends TermKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column term.creation_time
     *
     * @mbggenerated
     */
    private Date creationTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column term.creation_time
     *
     * @return the value of term.creation_time
     *
     * @mbggenerated
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column term.creation_time
     *
     * @param creationTime the value for term.creation_time
     *
     * @mbggenerated
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}