/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverInfo extends AbstractModel{

    /**
    * Start time of the alarm period. Value range: [0,86400). Convert the Unix timestamp to Beijing time and then remove the date. For example, 7200 indicates “10:0:0”.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of the alarm period. The meaning is the same as that of StartTime.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT".
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * Recipient type. Valid values: group and user.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * ReceiverId
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered).
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * Uid of the alarm call recipient.
    */
    @SerializedName("UidList")
    @Expose
    private Long [] UidList;

    /**
    * Number of alarm call rounds.
    */
    @SerializedName("RoundNumber")
    @Expose
    private Long RoundNumber;

    /**
    * Alarm call intervals for individuals in seconds.
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * Intervals of alarm call rounds in seconds.
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * Notification method when an alarm is recovered. Valid value: SMS.
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent.
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * Recipient group list. The list of recipient group IDs that is queried by a platform API.
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * Recipient list. The list of recipient IDs that is queried by a platform API.
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

    /**
    * Language of received alarms. Enumerated values: zh-CN and en-US.
    */
    @SerializedName("ReceiveLanguage")
    @Expose
    private String ReceiveLanguage;

    /**
     * Get Start time of the alarm period. Value range: [0,86400). Convert the Unix timestamp to Beijing time and then remove the date. For example, 7200 indicates “10:0:0”. 
     * @return StartTime Start time of the alarm period. Value range: [0,86400). Convert the Unix timestamp to Beijing time and then remove the date. For example, 7200 indicates “10:0:0”.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the alarm period. Value range: [0,86400). Convert the Unix timestamp to Beijing time and then remove the date. For example, 7200 indicates “10:0:0”.
     * @param StartTime Start time of the alarm period. Value range: [0,86400). Convert the Unix timestamp to Beijing time and then remove the date. For example, 7200 indicates “10:0:0”.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the alarm period. The meaning is the same as that of StartTime. 
     * @return EndTime End time of the alarm period. The meaning is the same as that of StartTime.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the alarm period. The meaning is the same as that of StartTime.
     * @param EndTime End time of the alarm period. The meaning is the same as that of StartTime.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT". 
     * @return NotifyWay Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT".
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT".
     * @param NotifyWay Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT".
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get Recipient type. Valid values: group and user. 
     * @return ReceiverType Recipient type. Valid values: group and user.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Recipient type. Valid values: group and user.
     * @param ReceiverType Recipient type. Valid values: group and user.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get ReceiverId 
     * @return Id ReceiverId
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ReceiverId
     * @param Id ReceiverId
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered). 
     * @return SendFor Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered).
     */
    public String [] getSendFor() {
        return this.SendFor;
    }

    /**
     * Set Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered).
     * @param SendFor Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered).
     */
    public void setSendFor(String [] SendFor) {
        this.SendFor = SendFor;
    }

    /**
     * Get Uid of the alarm call recipient. 
     * @return UidList Uid of the alarm call recipient.
     */
    public Long [] getUidList() {
        return this.UidList;
    }

    /**
     * Set Uid of the alarm call recipient.
     * @param UidList Uid of the alarm call recipient.
     */
    public void setUidList(Long [] UidList) {
        this.UidList = UidList;
    }

    /**
     * Get Number of alarm call rounds. 
     * @return RoundNumber Number of alarm call rounds.
     */
    public Long getRoundNumber() {
        return this.RoundNumber;
    }

    /**
     * Set Number of alarm call rounds.
     * @param RoundNumber Number of alarm call rounds.
     */
    public void setRoundNumber(Long RoundNumber) {
        this.RoundNumber = RoundNumber;
    }

    /**
     * Get Alarm call intervals for individuals in seconds. 
     * @return PersonInterval Alarm call intervals for individuals in seconds.
     */
    public Long getPersonInterval() {
        return this.PersonInterval;
    }

    /**
     * Set Alarm call intervals for individuals in seconds.
     * @param PersonInterval Alarm call intervals for individuals in seconds.
     */
    public void setPersonInterval(Long PersonInterval) {
        this.PersonInterval = PersonInterval;
    }

    /**
     * Get Intervals of alarm call rounds in seconds. 
     * @return RoundInterval Intervals of alarm call rounds in seconds.
     */
    public Long getRoundInterval() {
        return this.RoundInterval;
    }

    /**
     * Set Intervals of alarm call rounds in seconds.
     * @param RoundInterval Intervals of alarm call rounds in seconds.
     */
    public void setRoundInterval(Long RoundInterval) {
        this.RoundInterval = RoundInterval;
    }

    /**
     * Get Notification method when an alarm is recovered. Valid value: SMS. 
     * @return RecoverNotify Notification method when an alarm is recovered. Valid value: SMS.
     */
    public String [] getRecoverNotify() {
        return this.RecoverNotify;
    }

    /**
     * Set Notification method when an alarm is recovered. Valid value: SMS.
     * @param RecoverNotify Notification method when an alarm is recovered. Valid value: SMS.
     */
    public void setRecoverNotify(String [] RecoverNotify) {
        this.RecoverNotify = RecoverNotify;
    }

    /**
     * Get Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent. 
     * @return NeedSendNotice Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent.
     */
    public Long getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent.
     * @param NeedSendNotice Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent.
     */
    public void setNeedSendNotice(Long NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
    }

    /**
     * Get Recipient group list. The list of recipient group IDs that is queried by a platform API. 
     * @return ReceiverGroupList Recipient group list. The list of recipient group IDs that is queried by a platform API.
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set Recipient group list. The list of recipient group IDs that is queried by a platform API.
     * @param ReceiverGroupList Recipient group list. The list of recipient group IDs that is queried by a platform API.
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get Recipient list. The list of recipient IDs that is queried by a platform API. 
     * @return ReceiverUserList Recipient list. The list of recipient IDs that is queried by a platform API.
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set Recipient list. The list of recipient IDs that is queried by a platform API.
     * @param ReceiverUserList Recipient list. The list of recipient IDs that is queried by a platform API.
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get Language of received alarms. Enumerated values: zh-CN and en-US. 
     * @return ReceiveLanguage Language of received alarms. Enumerated values: zh-CN and en-US.
     */
    public String getReceiveLanguage() {
        return this.ReceiveLanguage;
    }

    /**
     * Set Language of received alarms. Enumerated values: zh-CN and en-US.
     * @param ReceiveLanguage Language of received alarms. Enumerated values: zh-CN and en-US.
     */
    public void setReceiveLanguage(String ReceiveLanguage) {
        this.ReceiveLanguage = ReceiveLanguage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamArraySimple(map, prefix + "UidList.", this.UidList);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "ReceiveLanguage", this.ReceiveLanguage);

    }
}

