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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRuleInfo extends AbstractModel {

    /**
    * Detection item name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Detection item description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Fixing suggestion
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * Severity level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Detection Item ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Last detection Time
    */
    @SerializedName("LastScanAt")
    @Expose
    private String LastScanAt;

    /**
    * Specific reason explanation
    */
    @SerializedName("RuleRemark")
    @Expose
    private String RuleRemark;

    /**
    * Unique UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Unique event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get Detection item name 
     * @return RuleName Detection item name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Detection item name
     * @param RuleName Detection item name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Detection item description 
     * @return Description Detection item description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Detection item description
     * @param Description Detection item description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Fixing suggestion 
     * @return FixMessage Fixing suggestion
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set Fixing suggestion
     * @param FixMessage Fixing suggestion
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get Severity level 
     * @return Level Severity level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Severity level
     * @param Level Severity level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Detection Item ID 
     * @return RuleId Detection Item ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Detection Item ID
     * @param RuleId Detection Item ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Last detection Time 
     * @return LastScanAt Last detection Time
     */
    public String getLastScanAt() {
        return this.LastScanAt;
    }

    /**
     * Set Last detection Time
     * @param LastScanAt Last detection Time
     */
    public void setLastScanAt(String LastScanAt) {
        this.LastScanAt = LastScanAt;
    }

    /**
     * Get Specific reason explanation 
     * @return RuleRemark Specific reason explanation
     */
    public String getRuleRemark() {
        return this.RuleRemark;
    }

    /**
     * Set Specific reason explanation
     * @param RuleRemark Specific reason explanation
     */
    public void setRuleRemark(String RuleRemark) {
        this.RuleRemark = RuleRemark;
    }

    /**
     * Get Unique UUID 
     * @return Uuid Unique UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Unique UUID
     * @param Uuid Unique UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Unique event ID 
     * @return EventId Unique event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Unique event ID
     * @param EventId Unique event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public BaselineRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleInfo(BaselineRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LastScanAt != null) {
            this.LastScanAt = new String(source.LastScanAt);
        }
        if (source.RuleRemark != null) {
            this.RuleRemark = new String(source.RuleRemark);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LastScanAt", this.LastScanAt);
        this.setParamSimple(map, prefix + "RuleRemark", this.RuleRemark);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

