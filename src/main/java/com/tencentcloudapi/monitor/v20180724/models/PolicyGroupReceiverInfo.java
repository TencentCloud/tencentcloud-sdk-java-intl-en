/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class PolicyGroupReceiverInfo extends AbstractModel {

    /**
    * End time of a valid time period.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Whether it is required to send notifications.
    */
    @SerializedName("NeedSendNotice")
    @Expose
    private Long NeedSendNotice;

    /**
    * Alarm receiving channel.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * Alarm call intervals for individuals in seconds.
    */
    @SerializedName("PersonInterval")
    @Expose
    private Long PersonInterval;

    /**
    * Message recipient group list.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverGroupList")
    @Expose
    private Long [] ReceiverGroupList;

    /**
    * Recipient type.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Recipient list. The list of recipient IDs that is queried by a platform API.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverUserList")
    @Expose
    private Long [] ReceiverUserList;

    /**
    * Alarm resolution notification method.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RecoverNotify")
    @Expose
    private String [] RecoverNotify;

    /**
    * Alarm call interval per round in seconds.
    */
    @SerializedName("RoundInterval")
    @Expose
    private Long RoundInterval;

    /**
    * Number of alarm call rounds.
    */
    @SerializedName("RoundNumber")
    @Expose
    private Long RoundNumber;

    /**
    * Alarm call notification time. Valid values: `OCCUR` (indicating that a notification is sent when the alarm is triggered) and `RECOVER` (indicating that a notification is sent when the alarm is resolved).
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SendFor")
    @Expose
    private String [] SendFor;

    /**
    * Start time of a valid time period.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * UID of the alarm call recipient.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UIDList")
    @Expose
    private Long [] UIDList;

    /**
     * Get End time of a valid time period. 
     * @return EndTime End time of a valid time period.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of a valid time period.
     * @param EndTime End time of a valid time period.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether it is required to send notifications. 
     * @return NeedSendNotice Whether it is required to send notifications.
     */
    public Long getNeedSendNotice() {
        return this.NeedSendNotice;
    }

    /**
     * Set Whether it is required to send notifications.
     * @param NeedSendNotice Whether it is required to send notifications.
     */
    public void setNeedSendNotice(Long NeedSendNotice) {
        this.NeedSendNotice = NeedSendNotice;
    }

    /**
     * Get Alarm receiving channel.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return NotifyWay Alarm receiving channel.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set Alarm receiving channel.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param NotifyWay Alarm receiving channel.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
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
     * Get Message recipient group list.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ReceiverGroupList Message recipient group list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getReceiverGroupList() {
        return this.ReceiverGroupList;
    }

    /**
     * Set Message recipient group list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ReceiverGroupList Message recipient group list.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReceiverGroupList(Long [] ReceiverGroupList) {
        this.ReceiverGroupList = ReceiverGroupList;
    }

    /**
     * Get Recipient type. 
     * @return ReceiverType Recipient type.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Recipient type.
     * @param ReceiverType Recipient type.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Recipient list. The list of recipient IDs that is queried by a platform API.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ReceiverUserList Recipient list. The list of recipient IDs that is queried by a platform API.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getReceiverUserList() {
        return this.ReceiverUserList;
    }

    /**
     * Set Recipient list. The list of recipient IDs that is queried by a platform API.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ReceiverUserList Recipient list. The list of recipient IDs that is queried by a platform API.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReceiverUserList(Long [] ReceiverUserList) {
        this.ReceiverUserList = ReceiverUserList;
    }

    /**
     * Get Alarm resolution notification method.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RecoverNotify Alarm resolution notification method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getRecoverNotify() {
        return this.RecoverNotify;
    }

    /**
     * Set Alarm resolution notification method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RecoverNotify Alarm resolution notification method.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRecoverNotify(String [] RecoverNotify) {
        this.RecoverNotify = RecoverNotify;
    }

    /**
     * Get Alarm call interval per round in seconds. 
     * @return RoundInterval Alarm call interval per round in seconds.
     */
    public Long getRoundInterval() {
        return this.RoundInterval;
    }

    /**
     * Set Alarm call interval per round in seconds.
     * @param RoundInterval Alarm call interval per round in seconds.
     */
    public void setRoundInterval(Long RoundInterval) {
        this.RoundInterval = RoundInterval;
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
     * Get Alarm call notification time. Valid values: `OCCUR` (indicating that a notification is sent when the alarm is triggered) and `RECOVER` (indicating that a notification is sent when the alarm is resolved).
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SendFor Alarm call notification time. Valid values: `OCCUR` (indicating that a notification is sent when the alarm is triggered) and `RECOVER` (indicating that a notification is sent when the alarm is resolved).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSendFor() {
        return this.SendFor;
    }

    /**
     * Set Alarm call notification time. Valid values: `OCCUR` (indicating that a notification is sent when the alarm is triggered) and `RECOVER` (indicating that a notification is sent when the alarm is resolved).
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SendFor Alarm call notification time. Valid values: `OCCUR` (indicating that a notification is sent when the alarm is triggered) and `RECOVER` (indicating that a notification is sent when the alarm is resolved).
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSendFor(String [] SendFor) {
        this.SendFor = SendFor;
    }

    /**
     * Get Start time of a valid time period. 
     * @return StartTime Start time of a valid time period.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of a valid time period.
     * @param StartTime Start time of a valid time period.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get UID of the alarm call recipient.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UIDList UID of the alarm call recipient.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getUIDList() {
        return this.UIDList;
    }

    /**
     * Set UID of the alarm call recipient.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UIDList UID of the alarm call recipient.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUIDList(Long [] UIDList) {
        this.UIDList = UIDList;
    }

    public PolicyGroupReceiverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyGroupReceiverInfo(PolicyGroupReceiverInfo source) {
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NeedSendNotice != null) {
            this.NeedSendNotice = new Long(source.NeedSendNotice);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.PersonInterval != null) {
            this.PersonInterval = new Long(source.PersonInterval);
        }
        if (source.ReceiverGroupList != null) {
            this.ReceiverGroupList = new Long[source.ReceiverGroupList.length];
            for (int i = 0; i < source.ReceiverGroupList.length; i++) {
                this.ReceiverGroupList[i] = new Long(source.ReceiverGroupList[i]);
            }
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverUserList != null) {
            this.ReceiverUserList = new Long[source.ReceiverUserList.length];
            for (int i = 0; i < source.ReceiverUserList.length; i++) {
                this.ReceiverUserList[i] = new Long(source.ReceiverUserList[i]);
            }
        }
        if (source.RecoverNotify != null) {
            this.RecoverNotify = new String[source.RecoverNotify.length];
            for (int i = 0; i < source.RecoverNotify.length; i++) {
                this.RecoverNotify[i] = new String(source.RecoverNotify[i]);
            }
        }
        if (source.RoundInterval != null) {
            this.RoundInterval = new Long(source.RoundInterval);
        }
        if (source.RoundNumber != null) {
            this.RoundNumber = new Long(source.RoundNumber);
        }
        if (source.SendFor != null) {
            this.SendFor = new String[source.SendFor.length];
            for (int i = 0; i < source.SendFor.length; i++) {
                this.SendFor[i] = new String(source.SendFor[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.UIDList != null) {
            this.UIDList = new Long[source.UIDList.length];
            for (int i = 0; i < source.UIDList.length; i++) {
                this.UIDList[i] = new Long(source.UIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedSendNotice", this.NeedSendNotice);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamSimple(map, prefix + "PersonInterval", this.PersonInterval);
        this.setParamArraySimple(map, prefix + "ReceiverGroupList.", this.ReceiverGroupList);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverUserList.", this.ReceiverUserList);
        this.setParamArraySimple(map, prefix + "RecoverNotify.", this.RecoverNotify);
        this.setParamSimple(map, prefix + "RoundInterval", this.RoundInterval);
        this.setParamSimple(map, prefix + "RoundNumber", this.RoundNumber);
        this.setParamArraySimple(map, prefix + "SendFor.", this.SendFor);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "UIDList.", this.UIDList);

    }
}

