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

public class SecHitRuleInfo extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The rule type.
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * The hit time recorded in seconds using UNIX timestamp.
    */
    @SerializedName("HitTime")
    @Expose
    private Long HitTime;

    /**
    * The number of requests.
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
    * The rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The subdomain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The bot tag. Values:
<li>`evil_bot`: Malicious bot</li>
<li>`suspect_bot`: Suspected bot</li>
<li>`good_bot`: Good bot</li>
<li>`normal`: Normal request</li>
<li>`none`: Uncategorized</li>
    */
    @SerializedName("BotLabel")
    @Expose
    private String BotLabel;

    /**
    * Whether to enable the rule
    */
    @SerializedName("RuleEnabled")
    @Expose
    private Boolean RuleEnabled;

    /**
    * Whether to enable alerting for this rule
    */
    @SerializedName("AlarmEnabled")
    @Expose
    private Boolean AlarmEnabled;

    /**
    * Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
    */
    @SerializedName("RuleDeleted")
    @Expose
    private Boolean RuleDeleted;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get The rule type. 
     * @return RuleTypeName The rule type.
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set The rule type.
     * @param RuleTypeName The rule type.
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get The hit time recorded in seconds using UNIX timestamp. 
     * @return HitTime The hit time recorded in seconds using UNIX timestamp.
     */
    public Long getHitTime() {
        return this.HitTime;
    }

    /**
     * Set The hit time recorded in seconds using UNIX timestamp.
     * @param HitTime The hit time recorded in seconds using UNIX timestamp.
     */
    public void setHitTime(Long HitTime) {
        this.HitTime = HitTime;
    }

    /**
     * Get The number of requests. 
     * @return RequestNum The number of requests.
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set The number of requests.
     * @param RequestNum The number of requests.
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    /**
     * Get The rule description. 
     * @return Description The rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The rule description.
     * @param Description The rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The subdomain name. 
     * @return Domain The subdomain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The subdomain name.
     * @param Domain The subdomain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li> 
     * @return Action Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     * @param Action Action. Values:
<li>`trans`: Allow;</li>
<li>`alg`: Algorithm challenge;</li>
<li>`drop`: Discard;</li>
<li>`ban`: Block the source IP;</li>
<li>`redirect`: Redirect;</li>
<li>`page`: Return to the specified page;</li>
<li>`monitor`: Observe.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The bot tag. Values:
<li>`evil_bot`: Malicious bot</li>
<li>`suspect_bot`: Suspected bot</li>
<li>`good_bot`: Good bot</li>
<li>`normal`: Normal request</li>
<li>`none`: Uncategorized</li> 
     * @return BotLabel The bot tag. Values:
<li>`evil_bot`: Malicious bot</li>
<li>`suspect_bot`: Suspected bot</li>
<li>`good_bot`: Good bot</li>
<li>`normal`: Normal request</li>
<li>`none`: Uncategorized</li>
     */
    public String getBotLabel() {
        return this.BotLabel;
    }

    /**
     * Set The bot tag. Values:
<li>`evil_bot`: Malicious bot</li>
<li>`suspect_bot`: Suspected bot</li>
<li>`good_bot`: Good bot</li>
<li>`normal`: Normal request</li>
<li>`none`: Uncategorized</li>
     * @param BotLabel The bot tag. Values:
<li>`evil_bot`: Malicious bot</li>
<li>`suspect_bot`: Suspected bot</li>
<li>`good_bot`: Good bot</li>
<li>`normal`: Normal request</li>
<li>`none`: Uncategorized</li>
     */
    public void setBotLabel(String BotLabel) {
        this.BotLabel = BotLabel;
    }

    /**
     * Get Whether to enable the rule 
     * @return RuleEnabled Whether to enable the rule
     */
    public Boolean getRuleEnabled() {
        return this.RuleEnabled;
    }

    /**
     * Set Whether to enable the rule
     * @param RuleEnabled Whether to enable the rule
     */
    public void setRuleEnabled(Boolean RuleEnabled) {
        this.RuleEnabled = RuleEnabled;
    }

    /**
     * Get Whether to enable alerting for this rule 
     * @return AlarmEnabled Whether to enable alerting for this rule
     */
    public Boolean getAlarmEnabled() {
        return this.AlarmEnabled;
    }

    /**
     * Set Whether to enable alerting for this rule
     * @param AlarmEnabled Whether to enable alerting for this rule
     */
    public void setAlarmEnabled(Boolean AlarmEnabled) {
        this.AlarmEnabled = AlarmEnabled;
    }

    /**
     * Get Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li> 
     * @return RuleDeleted Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     */
    public Boolean getRuleDeleted() {
        return this.RuleDeleted;
    }

    /**
     * Set Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     * @param RuleDeleted Whether the rule is deleted. Values: 
<li>`true`: The rule has been deleted (does not exist).</li>
<li>`false`: The rule is not deleted (exists).</li>
     */
    public void setRuleDeleted(Boolean RuleDeleted) {
        this.RuleDeleted = RuleDeleted;
    }

    public SecHitRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecHitRuleInfo(SecHitRuleInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.HitTime != null) {
            this.HitTime = new Long(source.HitTime);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.BotLabel != null) {
            this.BotLabel = new String(source.BotLabel);
        }
        if (source.RuleEnabled != null) {
            this.RuleEnabled = new Boolean(source.RuleEnabled);
        }
        if (source.AlarmEnabled != null) {
            this.AlarmEnabled = new Boolean(source.AlarmEnabled);
        }
        if (source.RuleDeleted != null) {
            this.RuleDeleted = new Boolean(source.RuleDeleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "HitTime", this.HitTime);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "BotLabel", this.BotLabel);
        this.setParamSimple(map, prefix + "RuleEnabled", this.RuleEnabled);
        this.setParamSimple(map, prefix + "AlarmEnabled", this.AlarmEnabled);
        this.setParamSimple(map, prefix + "RuleDeleted", this.RuleDeleted);

    }
}

