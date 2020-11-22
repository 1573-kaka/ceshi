package cn.imust.domain.feedback;

import java.io.Serializable;

public class Message implements Serializable {

    private Integer id;
    private String sendPer;
    private String receivePer;
    private Integer state;
    private String sendMail;
    private String content;
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.send_per
     *
     * @return the value of message.send_per
     *
     * @mbg.generated
     */
    public String getSendPer() {
        return sendPer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.send_per
     *
     * @param sendPer the value for message.send_per
     *
     * @mbg.generated
     */
    public void setSendPer(String sendPer) {
        this.sendPer = sendPer == null ? null : sendPer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.receive_per
     *
     * @return the value of message.receive_per
     *
     * @mbg.generated
     */
    public String getReceivePer() {
        return receivePer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.receive_per
     *
     * @param receivePer the value for message.receive_per
     *
     * @mbg.generated
     */
    public void setReceivePer(String receivePer) {
        this.receivePer = receivePer == null ? null : receivePer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.state
     *
     * @return the value of message.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.state
     *
     * @param state the value for message.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.send_mail
     *
     * @return the value of message.send_mail
     *
     * @mbg.generated
     */
    public String getSendMail() {
        return sendMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.send_mail
     *
     * @param sendMail the value for message.send_mail
     *
     * @mbg.generated
     */
    public void setSendMail(String sendMail) {
        this.sendMail = sendMail == null ? null : sendMail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.content
     *
     * @return the value of message.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.content
     *
     * @param content the value for message.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}