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

public class UpdateAlarmPolicyRequest extends AbstractModel {

    /**
    * Alarm Policy ID
    */
    @SerializedName("AlarmPolicyId")
    @Expose
    private Long AlarmPolicyId;

    /**
    * Alarm policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event scope. Valid values: 1 (current account) and 2 (multiple accounts).
    */
    @SerializedName("EventScope")
    @Expose
    private Long [] EventScope;

    /**
    * Risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

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
    * Status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Notification cycle. Value range: 1 to 7, representing Monday to Sunday respectively.
    */
    @SerializedName("NoticePeriod")
    @Expose
    private Long [] NoticePeriod;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Alarm Policy ID 
     * @return AlarmPolicyId Alarm Policy ID
     */
    public Long getAlarmPolicyId() {
        return this.AlarmPolicyId;
    }

    /**
     * Set Alarm Policy ID
     * @param AlarmPolicyId Alarm Policy ID
     */
    public void setAlarmPolicyId(Long AlarmPolicyId) {
        this.AlarmPolicyId = AlarmPolicyId;
    }

    /**
     * Get Alarm policy name 
     * @return Name Alarm policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm policy name
     * @param Name Alarm policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event scope. Valid values: 1 (current account) and 2 (multiple accounts). 
     * @return EventScope Event scope. Valid values: 1 (current account) and 2 (multiple accounts).
     */
    public Long [] getEventScope() {
        return this.EventScope;
    }

    /**
     * Set Event scope. Valid values: 1 (current account) and 2 (multiple accounts).
     * @param EventScope Event scope. Valid values: 1 (current account) and 2 (multiple accounts).
     */
    public void setEventScope(Long [] EventScope) {
        this.EventScope = EventScope;
    }

    /**
     * Get Risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk). 
     * @return RiskLevel Risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     * @param RiskLevel Risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Status. Valid values: 1 (enabled) and 2 (disabled). 
     * @return Status Status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: 1 (enabled) and 2 (disabled).
     * @param Status Status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public UpdateAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAlarmPolicyRequest(UpdateAlarmPolicyRequest source) {
        if (source.AlarmPolicyId != null) {
            this.AlarmPolicyId = new Long(source.AlarmPolicyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.NoticeTime != null) {
            this.NoticeTime = new String(source.NoticeTime);
        }
        if (source.NotificationMechanism != null) {
            this.NotificationMechanism = new String(source.NotificationMechanism);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NoticePeriod != null) {
            this.NoticePeriod = new Long[source.NoticePeriod.length];
            for (int i = 0; i < source.NoticePeriod.length; i++) {
                this.NoticePeriod[i] = new Long(source.NoticePeriod[i]);
            }
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
        this.setParamArraySimple(map, prefix + "EventScope.", this.EventScope);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "NoticeTime", this.NoticeTime);
        this.setParamSimple(map, prefix + "NotificationMechanism", this.NotificationMechanism);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "NoticePeriod.", this.NoticePeriod);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

