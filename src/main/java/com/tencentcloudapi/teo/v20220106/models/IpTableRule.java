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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpTableRule extends AbstractModel {

    /**
    * Action: `drop` (block), `trans` (allow), `monitor` (observe)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Matches by IP or region. Values: `ip` and `area`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * Matching content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Action: `drop` (block), `trans` (allow), `monitor` (observe)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Action: `drop` (block), `trans` (allow), `monitor` (observe)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action: `drop` (block), `trans` (allow), `monitor` (observe)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Action: `drop` (block), `trans` (allow), `monitor` (observe)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Matches by IP or region. Values: `ip` and `area`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MatchFrom Matches by IP or region. Values: `ip` and `area`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set Matches by IP or region. Values: `ip` and `area`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MatchFrom Matches by IP or region. Values: `ip` and `area`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get Matching content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MatchContent Matching content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Matching content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MatchContent Matching content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleID Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleID Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public IpTableRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTableRule(IpTableRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

