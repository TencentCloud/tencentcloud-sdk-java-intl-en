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

public class AddAlarmPolicyRequest extends AbstractModel {

    /**
    * <p>Alarm policy name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Event type 1: Resource non-compliance event.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Event range. Valid values: 1 (current account) and 2 (multi-account).</p>
    */
    @SerializedName("EventScope")
    @Expose
    private Long [] EventScope;

    /**
    * <p>Risk level. 1: high-risk 2: medium-risk 3: low risk</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * <p>Notification period</p>
    */
    @SerializedName("NoticeTime")
    @Expose
    private String NoticeTime;

    /**
    * <p>Notification mechanism</p>
    */
    @SerializedName("NotificationMechanism")
    @Expose
    private String NotificationMechanism;

    /**
    * <p>Status. Valid values: 1 (enabled) and 2 (disabled).</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Notification cycle</p>
    */
    @SerializedName("NoticePeriod")
    @Expose
    private Long [] NoticePeriod;

    /**
    * <p>Policy description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Alarm policy name</p> 
     * @return Name <p>Alarm policy name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Alarm policy name</p>
     * @param Name <p>Alarm policy name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Event type 1: Resource non-compliance event.</p> 
     * @return Type <p>Event type 1: Resource non-compliance event.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Event type 1: Resource non-compliance event.</p>
     * @param Type <p>Event type 1: Resource non-compliance event.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Event range. Valid values: 1 (current account) and 2 (multi-account).</p> 
     * @return EventScope <p>Event range. Valid values: 1 (current account) and 2 (multi-account).</p>
     */
    public Long [] getEventScope() {
        return this.EventScope;
    }

    /**
     * Set <p>Event range. Valid values: 1 (current account) and 2 (multi-account).</p>
     * @param EventScope <p>Event range. Valid values: 1 (current account) and 2 (multi-account).</p>
     */
    public void setEventScope(Long [] EventScope) {
        this.EventScope = EventScope;
    }

    /**
     * Get <p>Risk level. 1: high-risk 2: medium-risk 3: low risk</p> 
     * @return RiskLevel <p>Risk level. 1: high-risk 2: medium-risk 3: low risk</p>
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. 1: high-risk 2: medium-risk 3: low risk</p>
     * @param RiskLevel <p>Risk level. 1: high-risk 2: medium-risk 3: low risk</p>
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Notification period</p> 
     * @return NoticeTime <p>Notification period</p>
     */
    public String getNoticeTime() {
        return this.NoticeTime;
    }

    /**
     * Set <p>Notification period</p>
     * @param NoticeTime <p>Notification period</p>
     */
    public void setNoticeTime(String NoticeTime) {
        this.NoticeTime = NoticeTime;
    }

    /**
     * Get <p>Notification mechanism</p> 
     * @return NotificationMechanism <p>Notification mechanism</p>
     */
    public String getNotificationMechanism() {
        return this.NotificationMechanism;
    }

    /**
     * Set <p>Notification mechanism</p>
     * @param NotificationMechanism <p>Notification mechanism</p>
     */
    public void setNotificationMechanism(String NotificationMechanism) {
        this.NotificationMechanism = NotificationMechanism;
    }

    /**
     * Get <p>Status. Valid values: 1 (enabled) and 2 (disabled).</p> 
     * @return Status <p>Status. Valid values: 1 (enabled) and 2 (disabled).</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status. Valid values: 1 (enabled) and 2 (disabled).</p>
     * @param Status <p>Status. Valid values: 1 (enabled) and 2 (disabled).</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Notification cycle</p> 
     * @return NoticePeriod <p>Notification cycle</p>
     */
    public Long [] getNoticePeriod() {
        return this.NoticePeriod;
    }

    /**
     * Set <p>Notification cycle</p>
     * @param NoticePeriod <p>Notification cycle</p>
     */
    public void setNoticePeriod(Long [] NoticePeriod) {
        this.NoticePeriod = NoticePeriod;
    }

    /**
     * Get <p>Policy description</p> 
     * @return Description <p>Policy description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description</p>
     * @param Description <p>Policy description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AddAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAlarmPolicyRequest(AddAlarmPolicyRequest source) {
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "EventScope.", this.EventScope);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "NoticeTime", this.NoticeTime);
        this.setParamSimple(map, prefix + "NotificationMechanism", this.NotificationMechanism);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "NoticePeriod.", this.NoticePeriod);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

