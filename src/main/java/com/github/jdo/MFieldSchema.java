package com.github.jdo;

public class MFieldSchema {
    private String name;
    private String type;
    private String comment;
    public MFieldSchema() {}

    /**
     * @param comment
     * @param name
     * @param type
     */
    public MFieldSchema(String name, String type, String comment) {
        this.comment = comment;
        this.name = name;
        this.type = type;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }
    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param field the type to set
     */
    public void setType(String field) {
        this.type = field;
    }

}
