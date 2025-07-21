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

public class RateLimitingRule extends AbstractModel {

    /**
    * The ID of precise rate limiting. rule ID supports different rule configuration operations: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the RateLimitingRules parameter will be deleted.</li>.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the name of the precise rate limit.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The specific content of precise speed limit shall comply with the expression syntax. for detailed specifications, see the product documentation.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Rate threshold request feature match mode. this field is required when Enabled is on.  when there are multiple conditions, composite multiple conditions will perform statistics count. the maximum number of conditions must not exceed 5. valid values: <li><b>http.request.ip</b>: client ip;</li> <li><b>http.request.xff_header_ip</b>: client ip (priority match xff header);</li> <li><b>http.request.uri.path</b>: request access path;</li> <li><b>http.request.cookies['session']</b>: Cookie named session, where session can be replaced with your own specified parameter;</li> <li><b>http.request.headers['user-agent']</b>: http header named user-agent, where user-agent can be replaced with your own specified parameter;</li> <li><b>http.request.ja3</b>: request ja3 fingerprint;</li> <li><b>http.request.uri.query['test']</b>: URL query parameter named test, where test can be replaced with your own specified parameter.</li>.
    */
    @SerializedName("CountBy")
    @Expose
    private String [] CountBy;

    /**
    * Precision rate limiting specifies the cumulative number of interceptions within the time range. value ranges from 1 to 100000.
    */
    @SerializedName("MaxRequestThreshold")
    @Expose
    private Long MaxRequestThreshold;

    /**
    * Specifies the time window for statistics. valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li>.
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * The duration of an Action is only supported in the following units: <li>s: seconds, value range 1–120;</li> <li>m: minutes, value range 1–120;</li> <li>h: hours, value range 1–48;</li> <li>d: days, value range 1–30.</li>.
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
    * Precision rate limiting handling methods. valid values: <li>Monitor: Monitor;</li> <li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL;</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * Precision rate limiting specifies the priority. value range is 0 to 100. default is 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Whether the precise rate limiting rule is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get The ID of precise rate limiting. rule ID supports different rule configuration operations: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the RateLimitingRules parameter will be deleted.</li>. 
     * @return Id The ID of precise rate limiting. rule ID supports different rule configuration operations: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the RateLimitingRules parameter will be deleted.</li>.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The ID of precise rate limiting. rule ID supports different rule configuration operations: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the RateLimitingRules parameter will be deleted.</li>.
     * @param Id The ID of precise rate limiting. rule ID supports different rule configuration operations: <li><b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li><b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li><b>delete</b> an existing rule: existing Rules not included in the Rules list under the RateLimitingRules parameter will be deleted.</li>.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the name of the precise rate limit. 
     * @return Name Specifies the name of the precise rate limit.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the name of the precise rate limit.
     * @param Name Specifies the name of the precise rate limit.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The specific content of precise speed limit shall comply with the expression syntax. for detailed specifications, see the product documentation. 
     * @return Condition The specific content of precise speed limit shall comply with the expression syntax. for detailed specifications, see the product documentation.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set The specific content of precise speed limit shall comply with the expression syntax. for detailed specifications, see the product documentation.
     * @param Condition The specific content of precise speed limit shall comply with the expression syntax. for detailed specifications, see the product documentation.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Rate threshold request feature match mode. this field is required when Enabled is on.  when there are multiple conditions, composite multiple conditions will perform statistics count. the maximum number of conditions must not exceed 5. valid values: <li><b>http.request.ip</b>: client ip;</li> <li><b>http.request.xff_header_ip</b>: client ip (priority match xff header);</li> <li><b>http.request.uri.path</b>: request access path;</li> <li><b>http.request.cookies['session']</b>: Cookie named session, where session can be replaced with your own specified parameter;</li> <li><b>http.request.headers['user-agent']</b>: http header named user-agent, where user-agent can be replaced with your own specified parameter;</li> <li><b>http.request.ja3</b>: request ja3 fingerprint;</li> <li><b>http.request.uri.query['test']</b>: URL query parameter named test, where test can be replaced with your own specified parameter.</li>. 
     * @return CountBy Rate threshold request feature match mode. this field is required when Enabled is on.  when there are multiple conditions, composite multiple conditions will perform statistics count. the maximum number of conditions must not exceed 5. valid values: <li><b>http.request.ip</b>: client ip;</li> <li><b>http.request.xff_header_ip</b>: client ip (priority match xff header);</li> <li><b>http.request.uri.path</b>: request access path;</li> <li><b>http.request.cookies['session']</b>: Cookie named session, where session can be replaced with your own specified parameter;</li> <li><b>http.request.headers['user-agent']</b>: http header named user-agent, where user-agent can be replaced with your own specified parameter;</li> <li><b>http.request.ja3</b>: request ja3 fingerprint;</li> <li><b>http.request.uri.query['test']</b>: URL query parameter named test, where test can be replaced with your own specified parameter.</li>.
     */
    public String [] getCountBy() {
        return this.CountBy;
    }

    /**
     * Set Rate threshold request feature match mode. this field is required when Enabled is on.  when there are multiple conditions, composite multiple conditions will perform statistics count. the maximum number of conditions must not exceed 5. valid values: <li><b>http.request.ip</b>: client ip;</li> <li><b>http.request.xff_header_ip</b>: client ip (priority match xff header);</li> <li><b>http.request.uri.path</b>: request access path;</li> <li><b>http.request.cookies['session']</b>: Cookie named session, where session can be replaced with your own specified parameter;</li> <li><b>http.request.headers['user-agent']</b>: http header named user-agent, where user-agent can be replaced with your own specified parameter;</li> <li><b>http.request.ja3</b>: request ja3 fingerprint;</li> <li><b>http.request.uri.query['test']</b>: URL query parameter named test, where test can be replaced with your own specified parameter.</li>.
     * @param CountBy Rate threshold request feature match mode. this field is required when Enabled is on.  when there are multiple conditions, composite multiple conditions will perform statistics count. the maximum number of conditions must not exceed 5. valid values: <li><b>http.request.ip</b>: client ip;</li> <li><b>http.request.xff_header_ip</b>: client ip (priority match xff header);</li> <li><b>http.request.uri.path</b>: request access path;</li> <li><b>http.request.cookies['session']</b>: Cookie named session, where session can be replaced with your own specified parameter;</li> <li><b>http.request.headers['user-agent']</b>: http header named user-agent, where user-agent can be replaced with your own specified parameter;</li> <li><b>http.request.ja3</b>: request ja3 fingerprint;</li> <li><b>http.request.uri.query['test']</b>: URL query parameter named test, where test can be replaced with your own specified parameter.</li>.
     */
    public void setCountBy(String [] CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get Precision rate limiting specifies the cumulative number of interceptions within the time range. value ranges from 1 to 100000. 
     * @return MaxRequestThreshold Precision rate limiting specifies the cumulative number of interceptions within the time range. value ranges from 1 to 100000.
     */
    public Long getMaxRequestThreshold() {
        return this.MaxRequestThreshold;
    }

    /**
     * Set Precision rate limiting specifies the cumulative number of interceptions within the time range. value ranges from 1 to 100000.
     * @param MaxRequestThreshold Precision rate limiting specifies the cumulative number of interceptions within the time range. value ranges from 1 to 100000.
     */
    public void setMaxRequestThreshold(Long MaxRequestThreshold) {
        this.MaxRequestThreshold = MaxRequestThreshold;
    }

    /**
     * Get Specifies the time window for statistics. valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li>. 
     * @return CountingPeriod Specifies the time window for statistics. valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li>.
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set Specifies the time window for statistics. valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li>.
     * @param CountingPeriod Specifies the time window for statistics. valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li>.
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get The duration of an Action is only supported in the following units: <li>s: seconds, value range 1–120;</li> <li>m: minutes, value range 1–120;</li> <li>h: hours, value range 1–48;</li> <li>d: days, value range 1–30.</li>. 
     * @return ActionDuration The duration of an Action is only supported in the following units: <li>s: seconds, value range 1–120;</li> <li>m: minutes, value range 1–120;</li> <li>h: hours, value range 1–48;</li> <li>d: days, value range 1–30.</li>.
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set The duration of an Action is only supported in the following units: <li>s: seconds, value range 1–120;</li> <li>m: minutes, value range 1–120;</li> <li>h: hours, value range 1–48;</li> <li>d: days, value range 1–30.</li>.
     * @param ActionDuration The duration of an Action is only supported in the following units: <li>s: seconds, value range 1–120;</li> <li>m: minutes, value range 1–120;</li> <li>h: hours, value range 1–48;</li> <li>d: days, value range 1–30.</li>.
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    /**
     * Get Precision rate limiting handling methods. valid values: <li>Monitor: Monitor;</li> <li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL;</li>. 
     * @return Action Precision rate limiting handling methods. valid values: <li>Monitor: Monitor;</li> <li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL;</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Precision rate limiting handling methods. valid values: <li>Monitor: Monitor;</li> <li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL;</li>.
     * @param Action Precision rate limiting handling methods. valid values: <li>Monitor: Monitor;</li> <li>Deny: block, where DenyActionParameters.Name supports Deny and ReturnCustomPage;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL;</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get Precision rate limiting specifies the priority. value range is 0 to 100. default is 0. 
     * @return Priority Precision rate limiting specifies the priority. value range is 0 to 100. default is 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Precision rate limiting specifies the priority. value range is 0 to 100. default is 0.
     * @param Priority Precision rate limiting specifies the priority. value range is 0 to 100. default is 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Whether the precise rate limiting rule is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>. 
     * @return Enabled Whether the precise rate limiting rule is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the precise rate limiting rule is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     * @param Enabled Whether the precise rate limiting rule is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public RateLimitingRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitingRule(RateLimitingRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.CountBy != null) {
            this.CountBy = new String[source.CountBy.length];
            for (int i = 0; i < source.CountBy.length; i++) {
                this.CountBy[i] = new String(source.CountBy[i]);
            }
        }
        if (source.MaxRequestThreshold != null) {
            this.MaxRequestThreshold = new Long(source.MaxRequestThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.ActionDuration != null) {
            this.ActionDuration = new String(source.ActionDuration);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArraySimple(map, prefix + "CountBy.", this.CountBy);
        this.setParamSimple(map, prefix + "MaxRequestThreshold", this.MaxRequestThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

