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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRuleItems extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Mode
    */
    @SerializedName("Advance")
    @Expose
    private Long Advance;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Detection interval
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Type to match
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * Action
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Expiration time
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * Version
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * Rule details
    */
    @SerializedName("Options")
    @Expose
    private String Options;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Event ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Associated session rules

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionApplied")
    @Expose
    private Long [] SessionApplied;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Mode 
     * @return Advance Mode
     */
    public Long getAdvance() {
        return this.Advance;
    }

    /**
     * Set Mode
     * @param Advance Mode
     */
    public void setAdvance(Long Advance) {
        this.Advance = Advance;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Detection interval 
     * @return Interval Detection interval
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Detection interval
     * @param Interval Detection interval
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get URL 
     * @return Url URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL
     * @param Url URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Type to match 
     * @return MatchFunc Type to match
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set Type to match
     * @param MatchFunc Type to match
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
    }

    /**
     * Get Action 
     * @return ActionType Action
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action
     * @param ActionType Action
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Expiration time 
     * @return ValidTime Expiration time
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Expiration time
     * @param ValidTime Expiration time
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Version 
     * @return TsVersion Version
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set Version
     * @param TsVersion Version
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get Rule details 
     * @return Options Rule details
     */
    public String getOptions() {
        return this.Options;
    }

    /**
     * Set Rule details
     * @param Options Rule details
     */
    public void setOptions(String Options) {
        this.Options = Options;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Event ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId Event ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Associated session rules

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionApplied Associated session rules

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set Associated session rules

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionApplied Associated session rules

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionApplied(Long [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CCRuleItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleItems(CCRuleItems source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Advance != null) {
            this.Advance = new Long(source.Advance);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.Options != null) {
            this.Options = new String(source.Options);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.SessionApplied != null) {
            this.SessionApplied = new Long[source.SessionApplied.length];
            for (int i = 0; i < source.SessionApplied.length; i++) {
                this.SessionApplied[i] = new Long(source.SessionApplied[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "MatchFunc", this.MatchFunc);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "Options", this.Options);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

