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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyRsp extends AbstractModel {

    /**
    * Unique alarm policy ID.
    */
    @SerializedName("AlarmPolicyId")
    @Expose
    private Long AlarmPolicyId;

    /**
    * Policy name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Valid values: 1 (current account) and 2 (multi-account).
    */
    @SerializedName("EventScope")
    @Expose
    private Long [] EventScope;

    /**
    * Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively.
    */
    @SerializedName("NoticePeriod")
    @Expose
    private Long [] NoticePeriod;

    /**
    * Notification period
    */
    @SerializedName("NoticeTime")
    @Expose
    private String NoticeTime;

    /**
    * Notification mechanism
    */
    @SerializedName("NotificationMechanism")
    @Expose
    private String NotificationMechanism;

    /**
    * Policy status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Unique alarm policy ID. 
     * @return AlarmPolicyId Unique alarm policy ID.
     */
    public Long getAlarmPolicyId() {
        return this.AlarmPolicyId;
    }

    /**
     * Set Unique alarm policy ID.
     * @param AlarmPolicyId Unique alarm policy ID.
     */
    public void setAlarmPolicyId(Long AlarmPolicyId) {
        this.AlarmPolicyId = AlarmPolicyId;
    }

    /**
     * Get Policy name. 
     * @return Name Policy name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name.
     * @param Name Policy name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event type 
     * @return Type Event type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event type
     * @param Type Event type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Valid values: 1 (current account) and 2 (multi-account). 
     * @return EventScope Valid values: 1 (current account) and 2 (multi-account).
     */
    public Long [] getEventScope() {
        return this.EventScope;
    }

    /**
     * Set Valid values: 1 (current account) and 2 (multi-account).
     * @param EventScope Valid values: 1 (current account) and 2 (multi-account).
     */
    public void setEventScope(Long [] EventScope) {
        this.EventScope = EventScope;
    }

    /**
     * Get Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk). 
     * @return RiskLevel Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     * @param RiskLevel Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively. 
     * @return NoticePeriod Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively.
     */
    public Long [] getNoticePeriod() {
        return this.NoticePeriod;
    }

    /**
     * Set Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively.
     * @param NoticePeriod Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively.
     */
    public void setNoticePeriod(Long [] NoticePeriod) {
        this.NoticePeriod = NoticePeriod;
    }

    /**
     * Get Notification period 
     * @return NoticeTime Notification period
     */
    public String getNoticeTime() {
        return this.NoticeTime;
    }

    /**
     * Set Notification period
     * @param NoticeTime Notification period
     */
    public void setNoticeTime(String NoticeTime) {
        this.NoticeTime = NoticeTime;
    }

    /**
     * Get Notification mechanism 
     * @return NotificationMechanism Notification mechanism
     */
    public String getNotificationMechanism() {
        return this.NotificationMechanism;
    }

    /**
     * Set Notification mechanism
     * @param NotificationMechanism Notification mechanism
     */
    public void setNotificationMechanism(String NotificationMechanism) {
        this.NotificationMechanism = NotificationMechanism;
    }

    /**
     * Get Policy status. Valid values: 1 (enabled) and 2 (disabled). 
     * @return Status Policy status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Policy status. Valid values: 1 (enabled) and 2 (disabled).
     * @param Status Policy status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Policy description 
     * @return Description Policy description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AlarmPolicyRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyRsp(AlarmPolicyRsp source) {
        if (source.AlarmPolicyId != null) {
            this.AlarmPolicyId = new Long(source.AlarmPolicyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EventScope != null) {
            this.EventScope = new Long[source.EventScope.length];
            for (int i = 0; i < source.EventScope.length; i++) {
                this.EventScope[i] = new Long(source.EventScope[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.NoticePeriod != null) {
            this.NoticePeriod = new Long[source.NoticePeriod.length];
            for (int i = 0; i < source.NoticePeriod.length; i++) {
                this.NoticePeriod[i] = new Long(source.NoticePeriod[i]);
            }
        }
        if (source.NoticeTime != null) {
            this.NoticeTime = new String(source.NoticeTime);
        }
        if (source.NotificationMechanism != null) {
            this.NotificationMechanism = new String(source.NotificationMechanism);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmPolicyId", this.AlarmPolicyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "EventScope.", this.EventScope);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "NoticePeriod.", this.NoticePeriod);
        this.setParamSimple(map, prefix + "NoticeTime", this.NoticeTime);
        this.setParamSimple(map, prefix + "NotificationMechanism", this.NotificationMechanism);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

