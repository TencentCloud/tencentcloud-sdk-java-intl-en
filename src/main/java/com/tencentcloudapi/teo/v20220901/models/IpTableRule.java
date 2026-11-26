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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpTableRule extends AbstractModel {

    /**
    * Action. Valid values:
<li> drop: block;</li>
<li> trans: release;</li>
<li>monitor: observation.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * According to type matching. Valid values:
<li>ip: Match by client IP;</li>
<li>area: match by client IP region;</li>
<li>asn: Match the autonomous system to which the client belongs;</li>
<li>referer: match the Referer request header;</li>
<li>ua: match the User-Agent request header;</li>
<li>url: Request URL for matching.</li>
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * Match method of the rule. Valid values:
<li> match: match, suitable for MatchFrom as ip;</li>
<li> not_match: Not match, suitable for when MatchFrom is ip;</li>
<li> include_area: region inclusion, suitable for MatchFrom as area;</li>
<li> not_include_area: Regions excluded, applicable to MatchFrom as area;</li>
<li> asn_match: ASN contains, suitable for MatchFrom as asn;</li>
<li> asn_not_match: ASN not contained, applicable to MatchFrom as asn;</li>
<li> equal: equal, suitable for MatchFrom being ua, referer;</li>
<li> not_equal: Not equal to, applicable to MatchFrom being ua, referer;</li>
<li> include: wildcard match, suitable for MatchFrom being ua, referer, url;</li>
<li> not_include: wildcard mismatch, suitable for MatchFrom being ua, referer;</li>
<li> is_emty: The configuration content is empty, suitable for MatchFrom being ua or referer;</li>
<li> not_exists: The configuration content does not exist. This is applicable when MatchFrom is ua or referer.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Rule id. Output only.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Update time. For output usage only.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Rule enablement status. Valid values:
<li>`on`: Enable;</li>
<li> off: Disabled.</li>
If the input parameter is not specified, the value defaults to `on`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Matching content. Multi-value input is supported.
<li>When entering multiple matching values, please separate them with English commas;</li>
<li>When MatchFrom is ua, multi-value input is not supported;</li>
<li>When Operator is is_empty or not_exists, the input value of this field is invalid.</li>
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get Action. Valid values:
<li> drop: block;</li>
<li> trans: release;</li>
<li>monitor: observation.</li> 
     * @return Action Action. Valid values:
<li> drop: block;</li>
<li> trans: release;</li>
<li>monitor: observation.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values:
<li> drop: block;</li>
<li> trans: release;</li>
<li>monitor: observation.</li>
     * @param Action Action. Valid values:
<li> drop: block;</li>
<li> trans: release;</li>
<li>monitor: observation.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get According to type matching. Valid values:
<li>ip: Match by client IP;</li>
<li>area: match by client IP region;</li>
<li>asn: Match the autonomous system to which the client belongs;</li>
<li>referer: match the Referer request header;</li>
<li>ua: match the User-Agent request header;</li>
<li>url: Request URL for matching.</li> 
     * @return MatchFrom According to type matching. Valid values:
<li>ip: Match by client IP;</li>
<li>area: match by client IP region;</li>
<li>asn: Match the autonomous system to which the client belongs;</li>
<li>referer: match the Referer request header;</li>
<li>ua: match the User-Agent request header;</li>
<li>url: Request URL for matching.</li>
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set According to type matching. Valid values:
<li>ip: Match by client IP;</li>
<li>area: match by client IP region;</li>
<li>asn: Match the autonomous system to which the client belongs;</li>
<li>referer: match the Referer request header;</li>
<li>ua: match the User-Agent request header;</li>
<li>url: Request URL for matching.</li>
     * @param MatchFrom According to type matching. Valid values:
<li>ip: Match by client IP;</li>
<li>area: match by client IP region;</li>
<li>asn: Match the autonomous system to which the client belongs;</li>
<li>referer: match the Referer request header;</li>
<li>ua: match the User-Agent request header;</li>
<li>url: Request URL for matching.</li>
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get Match method of the rule. Valid values:
<li> match: match, suitable for MatchFrom as ip;</li>
<li> not_match: Not match, suitable for when MatchFrom is ip;</li>
<li> include_area: region inclusion, suitable for MatchFrom as area;</li>
<li> not_include_area: Regions excluded, applicable to MatchFrom as area;</li>
<li> asn_match: ASN contains, suitable for MatchFrom as asn;</li>
<li> asn_not_match: ASN not contained, applicable to MatchFrom as asn;</li>
<li> equal: equal, suitable for MatchFrom being ua, referer;</li>
<li> not_equal: Not equal to, applicable to MatchFrom being ua, referer;</li>
<li> include: wildcard match, suitable for MatchFrom being ua, referer, url;</li>
<li> not_include: wildcard mismatch, suitable for MatchFrom being ua, referer;</li>
<li> is_emty: The configuration content is empty, suitable for MatchFrom being ua or referer;</li>
<li> not_exists: The configuration content does not exist. This is applicable when MatchFrom is ua or referer.</li> 
     * @return Operator Match method of the rule. Valid values:
<li> match: match, suitable for MatchFrom as ip;</li>
<li> not_match: Not match, suitable for when MatchFrom is ip;</li>
<li> include_area: region inclusion, suitable for MatchFrom as area;</li>
<li> not_include_area: Regions excluded, applicable to MatchFrom as area;</li>
<li> asn_match: ASN contains, suitable for MatchFrom as asn;</li>
<li> asn_not_match: ASN not contained, applicable to MatchFrom as asn;</li>
<li> equal: equal, suitable for MatchFrom being ua, referer;</li>
<li> not_equal: Not equal to, applicable to MatchFrom being ua, referer;</li>
<li> include: wildcard match, suitable for MatchFrom being ua, referer, url;</li>
<li> not_include: wildcard mismatch, suitable for MatchFrom being ua, referer;</li>
<li> is_emty: The configuration content is empty, suitable for MatchFrom being ua or referer;</li>
<li> not_exists: The configuration content does not exist. This is applicable when MatchFrom is ua or referer.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Match method of the rule. Valid values:
<li> match: match, suitable for MatchFrom as ip;</li>
<li> not_match: Not match, suitable for when MatchFrom is ip;</li>
<li> include_area: region inclusion, suitable for MatchFrom as area;</li>
<li> not_include_area: Regions excluded, applicable to MatchFrom as area;</li>
<li> asn_match: ASN contains, suitable for MatchFrom as asn;</li>
<li> asn_not_match: ASN not contained, applicable to MatchFrom as asn;</li>
<li> equal: equal, suitable for MatchFrom being ua, referer;</li>
<li> not_equal: Not equal to, applicable to MatchFrom being ua, referer;</li>
<li> include: wildcard match, suitable for MatchFrom being ua, referer, url;</li>
<li> not_include: wildcard mismatch, suitable for MatchFrom being ua, referer;</li>
<li> is_emty: The configuration content is empty, suitable for MatchFrom being ua or referer;</li>
<li> not_exists: The configuration content does not exist. This is applicable when MatchFrom is ua or referer.</li>
     * @param Operator Match method of the rule. Valid values:
<li> match: match, suitable for MatchFrom as ip;</li>
<li> not_match: Not match, suitable for when MatchFrom is ip;</li>
<li> include_area: region inclusion, suitable for MatchFrom as area;</li>
<li> not_include_area: Regions excluded, applicable to MatchFrom as area;</li>
<li> asn_match: ASN contains, suitable for MatchFrom as asn;</li>
<li> asn_not_match: ASN not contained, applicable to MatchFrom as asn;</li>
<li> equal: equal, suitable for MatchFrom being ua, referer;</li>
<li> not_equal: Not equal to, applicable to MatchFrom being ua, referer;</li>
<li> include: wildcard match, suitable for MatchFrom being ua, referer, url;</li>
<li> not_include: wildcard mismatch, suitable for MatchFrom being ua, referer;</li>
<li> is_emty: The configuration content is empty, suitable for MatchFrom being ua or referer;</li>
<li> not_exists: The configuration content does not exist. This is applicable when MatchFrom is ua or referer.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Rule id. Output only. 
     * @return RuleID Rule id. Output only.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule id. Output only.
     * @param RuleID Rule id. Output only.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Update time. For output usage only. 
     * @return UpdateTime Update time. For output usage only.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. For output usage only.
     * @param UpdateTime Update time. For output usage only.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Rule enablement status. Valid values:
<li>`on`: Enable;</li>
<li> off: Disabled.</li>
If the input parameter is not specified, the value defaults to `on`. 
     * @return Status Rule enablement status. Valid values:
<li>`on`: Enable;</li>
<li> off: Disabled.</li>
If the input parameter is not specified, the value defaults to `on`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule enablement status. Valid values:
<li>`on`: Enable;</li>
<li> off: Disabled.</li>
If the input parameter is not specified, the value defaults to `on`.
     * @param Status Rule enablement status. Valid values:
<li>`on`: Enable;</li>
<li> off: Disabled.</li>
If the input parameter is not specified, the value defaults to `on`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule name. 
     * @return RuleName Rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name.
     * @param RuleName Rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Matching content. Multi-value input is supported.
<li>When entering multiple matching values, please separate them with English commas;</li>
<li>When MatchFrom is ua, multi-value input is not supported;</li>
<li>When Operator is is_empty or not_exists, the input value of this field is invalid.</li> 
     * @return MatchContent Matching content. Multi-value input is supported.
<li>When entering multiple matching values, please separate them with English commas;</li>
<li>When MatchFrom is ua, multi-value input is not supported;</li>
<li>When Operator is is_empty or not_exists, the input value of this field is invalid.</li>
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Matching content. Multi-value input is supported.
<li>When entering multiple matching values, please separate them with English commas;</li>
<li>When MatchFrom is ua, multi-value input is not supported;</li>
<li>When Operator is is_empty or not_exists, the input value of this field is invalid.</li>
     * @param MatchContent Matching content. Multi-value input is supported.
<li>When entering multiple matching values, please separate them with English commas;</li>
<li>When MatchFrom is ua, multi-value input is not supported;</li>
<li>When Operator is is_empty or not_exists, the input value of this field is invalid.</li>
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

