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

public class CCRuleItem extends AbstractModel {

    /**
    * Action
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Advanced mode
    */
    @SerializedName("Advance")
    @Expose
    private Long Advance;

    /**
    * Time period
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Limit Attempts
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Matching Method
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Update Timestamp
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * Matching URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Policy Action Validity Period
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * Advanced Parameters

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OptionsArr")
    @Expose
    private String OptionsArr;

    /**
    * URL length
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Advanced mode 
     * @return Advance Advanced mode
     */
    public Long getAdvance() {
        return this.Advance;
    }

    /**
     * Set Advanced mode
     * @param Advance Advanced mode
     */
    public void setAdvance(Long Advance) {
        this.Advance = Advance;
    }

    /**
     * Get Time period 
     * @return Interval Time period
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Time period
     * @param Interval Time period
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Limit Attempts 
     * @return Limit Limit Attempts
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit Attempts
     * @param Limit Limit Attempts
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Matching Method 
     * @return MatchFunc Matching Method
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set Matching Method
     * @param MatchFunc Matching Method
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
    }

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
     * Get Update Timestamp 
     * @return TsVersion Update Timestamp
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set Update Timestamp
     * @param TsVersion Update Timestamp
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get Matching URL 
     * @return Url Matching URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Matching URL
     * @param Url Matching URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Policy Action Validity Period 
     * @return ValidTime Policy Action Validity Period
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Policy Action Validity Period
     * @param ValidTime Policy Action Validity Period
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Advanced Parameters

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OptionsArr Advanced Parameters

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOptionsArr() {
        return this.OptionsArr;
    }

    /**
     * Set Advanced Parameters

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OptionsArr Advanced Parameters

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOptionsArr(String OptionsArr) {
        this.OptionsArr = OptionsArr;
    }

    /**
     * Get URL length
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Length URL length
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set URL length
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Length URL length
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get Rule ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
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

    public CCRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleItem(CCRuleItem source) {
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Advance != null) {
            this.Advance = new Long(source.Advance);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.OptionsArr != null) {
            this.OptionsArr = new String(source.OptionsArr);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
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
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Advance", this.Advance);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MatchFunc", this.MatchFunc);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "OptionsArr", this.OptionsArr);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

