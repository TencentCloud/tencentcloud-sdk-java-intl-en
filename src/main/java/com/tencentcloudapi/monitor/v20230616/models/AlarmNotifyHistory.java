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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmNotifyHistory extends AbstractModel {

    /**
    * Unique notification ID.
    */
    @SerializedName("NotifyId")
    @Expose
    private String NotifyId;

    /**
    * Alert policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Alarm cycle iD
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Notification time in Unix timestamp (in seconds).
    */
    @SerializedName("NotifyTime")
    @Expose
    private Long NotifyTime;

    /**
    * Trigger time in Unix timestamp (in seconds).
    */
    @SerializedName("TriggerTime")
    @Expose
    private Long TriggerTime;

    /**
    * Alarm severity level. Valid values: None, Note, Warn, and Serious.
    */
    @SerializedName("TriggerLevel")
    @Expose
    private String TriggerLevel;

    /**
    * alert content
    */
    @SerializedName("AlarmContent")
    @Expose
    private String AlarmContent;

    /**
    * Alarm object
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * Alarm notification channel collection involved this time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChannelSet")
    @Expose
    private String [] ChannelSet;

    /**
    * Recipient information of the channel
    */
    @SerializedName("ChannelsReceivers")
    @Expose
    private ChannelsReceivers [] ChannelsReceivers;

    /**
    * Alarm policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Prometheus Instance ID, valid only when MT_PROME
    */
    @SerializedName("PromeInstanceID")
    @Expose
    private String PromeInstanceID;

    /**
    * Region of the Prometheus Instance. Valid at that time only for MT_PROME.
    */
    @SerializedName("PromeInstanceRegion")
    @Expose
    private String PromeInstanceRegion;

    /**
    * Notification template related configuration information
    */
    @SerializedName("Notices")
    @Expose
    private NotifyRelatedNotice [] Notices;

    /**
    * Alarm trigger status. Valid values: Trigger and Recovery.
    */
    @SerializedName("TriggerStatus")
    @Expose
    private String TriggerStatus;

    /**
    * Console page address related to the present Prometheus notification history, valid only when MR_PROME
    */
    @SerializedName("PromeConsoleURL")
    @Expose
    private String PromeConsoleURL;

    /**
    * Alarm label
    */
    @SerializedName("Labels")
    @Expose
    private AlarmLable [] Labels;

    /**
     * Get Unique notification ID. 
     * @return NotifyId Unique notification ID.
     */
    public String getNotifyId() {
        return this.NotifyId;
    }

    /**
     * Set Unique notification ID.
     * @param NotifyId Unique notification ID.
     */
    public void setNotifyId(String NotifyId) {
        this.NotifyId = NotifyId;
    }

    /**
     * Get Alert policy ID 
     * @return PolicyId Alert policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alert policy ID
     * @param PolicyId Alert policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Alarm cycle iD 
     * @return SessionId Alarm cycle iD
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Alarm cycle iD
     * @param SessionId Alarm cycle iD
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Notification time in Unix timestamp (in seconds). 
     * @return NotifyTime Notification time in Unix timestamp (in seconds).
     */
    public Long getNotifyTime() {
        return this.NotifyTime;
    }

    /**
     * Set Notification time in Unix timestamp (in seconds).
     * @param NotifyTime Notification time in Unix timestamp (in seconds).
     */
    public void setNotifyTime(Long NotifyTime) {
        this.NotifyTime = NotifyTime;
    }

    /**
     * Get Trigger time in Unix timestamp (in seconds). 
     * @return TriggerTime Trigger time in Unix timestamp (in seconds).
     */
    public Long getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set Trigger time in Unix timestamp (in seconds).
     * @param TriggerTime Trigger time in Unix timestamp (in seconds).
     */
    public void setTriggerTime(Long TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get Alarm severity level. Valid values: None, Note, Warn, and Serious. 
     * @return TriggerLevel Alarm severity level. Valid values: None, Note, Warn, and Serious.
     */
    public String getTriggerLevel() {
        return this.TriggerLevel;
    }

    /**
     * Set Alarm severity level. Valid values: None, Note, Warn, and Serious.
     * @param TriggerLevel Alarm severity level. Valid values: None, Note, Warn, and Serious.
     */
    public void setTriggerLevel(String TriggerLevel) {
        this.TriggerLevel = TriggerLevel;
    }

    /**
     * Get alert content 
     * @return AlarmContent alert content
     */
    public String getAlarmContent() {
        return this.AlarmContent;
    }

    /**
     * Set alert content
     * @param AlarmContent alert content
     */
    public void setAlarmContent(String AlarmContent) {
        this.AlarmContent = AlarmContent;
    }

    /**
     * Get Alarm object 
     * @return AlarmObject Alarm object
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set Alarm object
     * @param AlarmObject Alarm object
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get Alarm notification channel collection involved this time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChannelSet Alarm notification channel collection involved this time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getChannelSet() {
        return this.ChannelSet;
    }

    /**
     * Set Alarm notification channel collection involved this time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChannelSet Alarm notification channel collection involved this time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChannelSet(String [] ChannelSet) {
        this.ChannelSet = ChannelSet;
    }

    /**
     * Get Recipient information of the channel 
     * @return ChannelsReceivers Recipient information of the channel
     */
    public ChannelsReceivers [] getChannelsReceivers() {
        return this.ChannelsReceivers;
    }

    /**
     * Set Recipient information of the channel
     * @param ChannelsReceivers Recipient information of the channel
     */
    public void setChannelsReceivers(ChannelsReceivers [] ChannelsReceivers) {
        this.ChannelsReceivers = ChannelsReceivers;
    }

    /**
     * Get Alarm policy name 
     * @return PolicyName Alarm policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Alarm policy name
     * @param PolicyName Alarm policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Prometheus Instance ID, valid only when MT_PROME 
     * @return PromeInstanceID Prometheus Instance ID, valid only when MT_PROME
     */
    public String getPromeInstanceID() {
        return this.PromeInstanceID;
    }

    /**
     * Set Prometheus Instance ID, valid only when MT_PROME
     * @param PromeInstanceID Prometheus Instance ID, valid only when MT_PROME
     */
    public void setPromeInstanceID(String PromeInstanceID) {
        this.PromeInstanceID = PromeInstanceID;
    }

    /**
     * Get Region of the Prometheus Instance. Valid at that time only for MT_PROME. 
     * @return PromeInstanceRegion Region of the Prometheus Instance. Valid at that time only for MT_PROME.
     */
    public String getPromeInstanceRegion() {
        return this.PromeInstanceRegion;
    }

    /**
     * Set Region of the Prometheus Instance. Valid at that time only for MT_PROME.
     * @param PromeInstanceRegion Region of the Prometheus Instance. Valid at that time only for MT_PROME.
     */
    public void setPromeInstanceRegion(String PromeInstanceRegion) {
        this.PromeInstanceRegion = PromeInstanceRegion;
    }

    /**
     * Get Notification template related configuration information 
     * @return Notices Notification template related configuration information
     */
    public NotifyRelatedNotice [] getNotices() {
        return this.Notices;
    }

    /**
     * Set Notification template related configuration information
     * @param Notices Notification template related configuration information
     */
    public void setNotices(NotifyRelatedNotice [] Notices) {
        this.Notices = Notices;
    }

    /**
     * Get Alarm trigger status. Valid values: Trigger and Recovery. 
     * @return TriggerStatus Alarm trigger status. Valid values: Trigger and Recovery.
     */
    public String getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set Alarm trigger status. Valid values: Trigger and Recovery.
     * @param TriggerStatus Alarm trigger status. Valid values: Trigger and Recovery.
     */
    public void setTriggerStatus(String TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get Console page address related to the present Prometheus notification history, valid only when MR_PROME 
     * @return PromeConsoleURL Console page address related to the present Prometheus notification history, valid only when MR_PROME
     */
    public String getPromeConsoleURL() {
        return this.PromeConsoleURL;
    }

    /**
     * Set Console page address related to the present Prometheus notification history, valid only when MR_PROME
     * @param PromeConsoleURL Console page address related to the present Prometheus notification history, valid only when MR_PROME
     */
    public void setPromeConsoleURL(String PromeConsoleURL) {
        this.PromeConsoleURL = PromeConsoleURL;
    }

    /**
     * Get Alarm label 
     * @return Labels Alarm label
     */
    public AlarmLable [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Alarm label
     * @param Labels Alarm label
     */
    public void setLabels(AlarmLable [] Labels) {
        this.Labels = Labels;
    }

    public AlarmNotifyHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmNotifyHistory(AlarmNotifyHistory source) {
        if (source.NotifyId != null) {
            this.NotifyId = new String(source.NotifyId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.NotifyTime != null) {
            this.NotifyTime = new Long(source.NotifyTime);
        }
        if (source.TriggerTime != null) {
            this.TriggerTime = new Long(source.TriggerTime);
        }
        if (source.TriggerLevel != null) {
            this.TriggerLevel = new String(source.TriggerLevel);
        }
        if (source.AlarmContent != null) {
            this.AlarmContent = new String(source.AlarmContent);
        }
        if (source.AlarmObject != null) {
            this.AlarmObject = new String(source.AlarmObject);
        }
        if (source.ChannelSet != null) {
            this.ChannelSet = new String[source.ChannelSet.length];
            for (int i = 0; i < source.ChannelSet.length; i++) {
                this.ChannelSet[i] = new String(source.ChannelSet[i]);
            }
        }
        if (source.ChannelsReceivers != null) {
            this.ChannelsReceivers = new ChannelsReceivers[source.ChannelsReceivers.length];
            for (int i = 0; i < source.ChannelsReceivers.length; i++) {
                this.ChannelsReceivers[i] = new ChannelsReceivers(source.ChannelsReceivers[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PromeInstanceID != null) {
            this.PromeInstanceID = new String(source.PromeInstanceID);
        }
        if (source.PromeInstanceRegion != null) {
            this.PromeInstanceRegion = new String(source.PromeInstanceRegion);
        }
        if (source.Notices != null) {
            this.Notices = new NotifyRelatedNotice[source.Notices.length];
            for (int i = 0; i < source.Notices.length; i++) {
                this.Notices[i] = new NotifyRelatedNotice(source.Notices[i]);
            }
        }
        if (source.TriggerStatus != null) {
            this.TriggerStatus = new String(source.TriggerStatus);
        }
        if (source.PromeConsoleURL != null) {
            this.PromeConsoleURL = new String(source.PromeConsoleURL);
        }
        if (source.Labels != null) {
            this.Labels = new AlarmLable[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AlarmLable(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyId", this.NotifyId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "NotifyTime", this.NotifyTime);
        this.setParamSimple(map, prefix + "TriggerTime", this.TriggerTime);
        this.setParamSimple(map, prefix + "TriggerLevel", this.TriggerLevel);
        this.setParamSimple(map, prefix + "AlarmContent", this.AlarmContent);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamArraySimple(map, prefix + "ChannelSet.", this.ChannelSet);
        this.setParamArrayObj(map, prefix + "ChannelsReceivers.", this.ChannelsReceivers);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PromeInstanceID", this.PromeInstanceID);
        this.setParamSimple(map, prefix + "PromeInstanceRegion", this.PromeInstanceRegion);
        this.setParamArrayObj(map, prefix + "Notices.", this.Notices);
        this.setParamSimple(map, prefix + "TriggerStatus", this.TriggerStatus);
        this.setParamSimple(map, prefix + "PromeConsoleURL", this.PromeConsoleURL);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

