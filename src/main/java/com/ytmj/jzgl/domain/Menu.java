package com.ytmj.jzgl.domain;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.decription
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    private String decription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.decription
     *
     * @return the value of menu.decription
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public String getDecription() {
        return decription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.decription
     *
     * @param decription the value for menu.decription
     *
     * @mbg.generated Fri Apr 10 17:29:54 CST 2020
     */
    public void setDecription(String decription) {
        this.decription = decription == null ? null : decription.trim();
    }
}