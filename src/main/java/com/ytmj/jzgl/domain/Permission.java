package com.ytmj.jzgl.domain;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.name
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.url
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.name
     *
     * @return the value of permission.name
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.name
     *
     * @param name the value for permission.name
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.url
     *
     * @return the value of permission.url
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.url
     *
     * @param url the value for permission.url
     *
     * @mbg.generated Mon Apr 06 20:53:17 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}