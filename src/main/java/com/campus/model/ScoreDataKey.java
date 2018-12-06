package com.campus.model;

public class ScoreDataKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score_data.account
     *
     * @mbggenerated
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score_data.term_range
     *
     * @mbggenerated
     */
    private String termRange;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score_data.course_name
     *
     * @mbggenerated
     */
    private String courseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score_data.course_type
     *
     * @mbggenerated
     */
    private String courseType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score_data.account
     *
     * @return the value of score_data.account
     *
     * @mbggenerated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score_data.account
     *
     * @param account the value for score_data.account
     *
     * @mbggenerated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score_data.term_range
     *
     * @return the value of score_data.term_range
     *
     * @mbggenerated
     */
    public String getTermRange() {
        return termRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score_data.term_range
     *
     * @param termRange the value for score_data.term_range
     *
     * @mbggenerated
     */
    public void setTermRange(String termRange) {
        this.termRange = termRange == null ? null : termRange.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score_data.course_name
     *
     * @return the value of score_data.course_name
     *
     * @mbggenerated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score_data.course_name
     *
     * @param courseName the value for score_data.course_name
     *
     * @mbggenerated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score_data.course_type
     *
     * @return the value of score_data.course_type
     *
     * @mbggenerated
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score_data.course_type
     *
     * @param courseType the value for score_data.course_type
     *
     * @mbggenerated
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }
}