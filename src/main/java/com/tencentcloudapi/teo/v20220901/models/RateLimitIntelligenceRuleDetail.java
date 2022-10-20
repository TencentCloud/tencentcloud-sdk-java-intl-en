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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitIntelligenceRuleDetail extends AbstractModel{

    /**
    * The client IP detected.
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
    * The action taken.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Update time
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * The expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The action status. `allowed` indicates that the request is allowed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get The client IP detected. 
     * @return MatchContent The client IP detected.
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set The client IP detected.
     * @param MatchContent The client IP detected.
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    /**
     * Get The action taken. 
     * @return Action The action taken.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action taken.
     * @param Action The action taken.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Update time 
     * @return EffectiveTime Update time
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set Update time
     * @param EffectiveTime Update time
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get The expiration time. 
     * @return ExpireTime The expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time.
     * @param ExpireTime The expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The action status. `allowed` indicates that the request is allowed. 
     * @return Status The action status. `allowed` indicates that the request is allowed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The action status. `allowed` indicates that the request is allowed.
     * @param Status The action status. `allowed` indicates that the request is allowed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RateLimitIntelligenceRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitIntelligenceRuleDetail(RateLimitIntelligenceRuleDetail source) {
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

