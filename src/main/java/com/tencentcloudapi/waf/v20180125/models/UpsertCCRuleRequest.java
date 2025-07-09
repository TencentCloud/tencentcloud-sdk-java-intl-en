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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpsertCCRuleRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
    * Advanced mode (whether to use session detection). 0: disabled; 1: enabled
    */
    @SerializedName("Advance")
    @Expose
    private String Advance;

    /**
    * CC detection threshold
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * CC detection cycle
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Detection URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Matching method. 0: equal to; 1: prefix matching; 2: included
    */
    @SerializedName("MatchFunc")
    @Expose
    private Long MatchFunc;

    /**
    * Action. 20: observation; 21: CAPTCHA; 22: interception; 23: precise interception
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Valid time for action
    */
    @SerializedName("ValidTime")
    @Expose
    private Long ValidTime;

    /**
    * Additional Parameters
    */
    @SerializedName("OptionsArr")
    @Expose
    private String OptionsArr;

    /**
    * WAF version. The value can be sparta-waf or clb-waf.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Operation type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Source event ID for adding rules
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Session ID that needs to be enabled for the rule
    */
    @SerializedName("SessionApplied")
    @Expose
    private Long [] SessionApplied;

    /**
    * Rule ID: fill in 0 when adding
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * URL length
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get Advanced mode (whether to use session detection). 0: disabled; 1: enabled 
     * @return Advance Advanced mode (whether to use session detection). 0: disabled; 1: enabled
     */
    public String getAdvance() {
        return this.Advance;
    }

    /**
     * Set Advanced mode (whether to use session detection). 0: disabled; 1: enabled
     * @param Advance Advanced mode (whether to use session detection). 0: disabled; 1: enabled
     */
    public void setAdvance(String Advance) {
        this.Advance = Advance;
    }

    /**
     * Get CC detection threshold 
     * @return Limit CC detection threshold
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set CC detection threshold
     * @param Limit CC detection threshold
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get CC detection cycle 
     * @return Interval CC detection cycle
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set CC detection cycle
     * @param Interval CC detection cycle
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Detection URL 
     * @return Url Detection URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Detection URL
     * @param Url Detection URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Matching method. 0: equal to; 1: prefix matching; 2: included 
     * @return MatchFunc Matching method. 0: equal to; 1: prefix matching; 2: included
     */
    public Long getMatchFunc() {
        return this.MatchFunc;
    }

    /**
     * Set Matching method. 0: equal to; 1: prefix matching; 2: included
     * @param MatchFunc Matching method. 0: equal to; 1: prefix matching; 2: included
     */
    public void setMatchFunc(Long MatchFunc) {
        this.MatchFunc = MatchFunc;
    }

    /**
     * Get Action. 20: observation; 21: CAPTCHA; 22: interception; 23: precise interception 
     * @return ActionType Action. 20: observation; 21: CAPTCHA; 22: interception; 23: precise interception
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action. 20: observation; 21: CAPTCHA; 22: interception; 23: precise interception
     * @param ActionType Action. 20: observation; 21: CAPTCHA; 22: interception; 23: precise interception
     */
    public void setActionType(String ActionType) {
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
     * Get Valid time for action 
     * @return ValidTime Valid time for action
     */
    public Long getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set Valid time for action
     * @param ValidTime Valid time for action
     */
    public void setValidTime(Long ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get Additional Parameters 
     * @return OptionsArr Additional Parameters
     */
    public String getOptionsArr() {
        return this.OptionsArr;
    }

    /**
     * Set Additional Parameters
     * @param OptionsArr Additional Parameters
     */
    public void setOptionsArr(String OptionsArr) {
        this.OptionsArr = OptionsArr;
    }

    /**
     * Get WAF version. The value can be sparta-waf or clb-waf. 
     * @return Edition WAF version. The value can be sparta-waf or clb-waf.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF version. The value can be sparta-waf or clb-waf.
     * @param Edition WAF version. The value can be sparta-waf or clb-waf.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Operation type 
     * @return Type Operation type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Operation type
     * @param Type Operation type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Source event ID for adding rules 
     * @return EventId Source event ID for adding rules
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Source event ID for adding rules
     * @param EventId Source event ID for adding rules
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Session ID that needs to be enabled for the rule 
     * @return SessionApplied Session ID that needs to be enabled for the rule
     */
    public Long [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set Session ID that needs to be enabled for the rule
     * @param SessionApplied Session ID that needs to be enabled for the rule
     */
    public void setSessionApplied(Long [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get Rule ID: fill in 0 when adding 
     * @return RuleId Rule ID: fill in 0 when adding
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID: fill in 0 when adding
     * @param RuleId Rule ID: fill in 0 when adding
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule creation time 
     * @return CreateTime Rule creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Rule creation time
     * @param CreateTime Rule creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get URL length 
     * @return Length URL length
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set URL length
     * @param Length URL length
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    public UpsertCCRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertCCRuleRequest(UpsertCCRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Advance != null) {
            this.Advance = new String(source.Advance);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.MatchFunc != null) {
            this.MatchFunc = new Long(source.MatchFunc);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new Long(source.ValidTime);
        }
        if (source.OptionsArr != null) {
            this.OptionsArr = new String(source.OptionsArr);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
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
        this.setParamSimple(map, prefix + "OptionsArr", this.OptionsArr);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

