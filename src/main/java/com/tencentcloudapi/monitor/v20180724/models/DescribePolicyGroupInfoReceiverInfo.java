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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoReceiverInfo extends AbstractModel {

    /**
    * List of alarm recipient group IDs.
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * List of alarm recipient IDs.
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

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
    * Recipient type. Valid values: group and user.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Alarm notification method. Valid values: "SMS", "SITE", "EMAIL", "CALL", and "WECHAT".
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * Uid of the alarm call recipient.
Note: This field may return null, indicating that no valid value was found.
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
    * Intervals of alarm call rounds in seconds.
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * Alarm call intervals for individuals in seconds.
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * Whether to send an alarm call delivery notice. The value 0 indicates that no notice needs to be sent. The value 1 indicates that a notice needs to be sent.
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * Alarm call notification time. Valid values: OCCUR (indicating that a notice is sent when the alarm is triggered) and RECOVER (indicating that a notice is sent when the alarm is recovered).
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * Notification method when an alarm is recovered. Valid value: SMS.
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * Alarm language.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReceiveLanguage")
    @Expose
    private String ReceiveLanguage;

    /**
     * Get List of alarm recipient group IDs. 
     * @return ReceiverGroupList List of alarm recipient group IDs.
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set List of alarm recipient group IDs.
     * @param ReceiverGroupList List of alarm recipient group IDs.
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get List of alarm recipient IDs. 
     * @return ReceiverUserList List of alarm recipient IDs.
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set List of alarm recipient IDs.
     * @param ReceiverUserList List of alarm recipient IDs.
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

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
     * Get Uid of the alarm call recipient.
Note: This field may return null, indicating that no valid value was found. 
     * @return UidList Uid of the alarm call recipient.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long [] getUidList() {
        return this.UidList;
    }

    /**
     * Set Uid of the alarm call recipient.
Note: This field may return null, indicating that no valid value was found.
     * @param UidList Uid of the alarm call recipient.
Note: This field may return null, indicating that no valid value was found.
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
     * Get Alarm language.
Note: This field may return null, indicating that no valid value was found. 
     * @return ReceiveLanguage Alarm language.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getReceiveLanguage() {
        return this.ReceiveLanguage;
    }

    /**
     * Set Alarm language.
Note: This field may return null, indicating that no valid value was found.
     * @param ReceiveLanguage Alarm language.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setReceiveLanguage(String ReceiveLanguage) {
        this.ReceiveLanguage = ReceiveLanguage;
    }

    public DescribePolicyGroupInfoReceiverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoReceiverInfo(DescribePolicyGroupInfoReceiverInfo source) {
        if (source.ReceiverGroupList != null) {
            this.ReceiverGroupList = new Long[source.ReceiverGroupList.length];
            for (int i = 0; i < source.ReceiverGroupList.length; i++) {
                this.ReceiverGroupList[i] = new Long(source.ReceiverGroupList[i]);
            }
        }
        if (source.ReceiverUserList != null) {
            this.ReceiverUserList = new Long[source.ReceiverUserList.length];
            for (int i = 0; i < source.ReceiverUserList.length; i++) {
                this.ReceiverUserList[i] = new Long(source.ReceiverUserList[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.UidList != null) {
            this.UidList = new Long[source.UidList.length];
            for (int i = 0; i < source.UidList.length; i++) {
                this.UidList[i] = new Long(source.UidList[i]);
            }
        }
        if (source.RoundNumber != null) {
            this.RoundNumber = new Long(source.RoundNumber);
        }
        if (source.RoundInterval != null) {
            this.RoundInterval = new Long(source.RoundInterval);
        }
        if (source.PersonInterval != null) {
            this.PersonInterval = new Long(source.PersonInterval);
        }
        if (source.NeedSendNotice != null) {
            this.NeedSendNotice = new Long(source.NeedSendNotice);
        }
        if (source.SendFor != null) {
            this.SendFor = new String[source.SendFor.length];
            for (int i = 0; i < source.SendFor.length; i++) {
                this.SendFor[i] = new String(source.SendFor[i]);
            }
        }
        if (source.RecoverNotify != null) {
            this.RecoverNotify = new String[source.RecoverNotify.length];
            for (int i = 0; i < source.RecoverNotify.length; i++) {
                this.RecoverNotify[i] = new String(source.RecoverNotify[i]);
            }
        }
        if (source.ReceiveLanguage != null) {
            this.ReceiveLanguage = new String(source.ReceiveLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArraySimple(map, prefix + "UidList.", this.UidList);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);
        this.setParamSimple(map, prefix + "ReceiveLanguage", this.ReceiveLanguage);

    }
}

