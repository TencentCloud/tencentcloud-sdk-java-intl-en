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
    * <p>ID of the precise rate limiting rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the RateLimitingRules parameter will be deleted.</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Name of the precise rate limit.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The specific content of precise rate limiting must comply with expression syntax. For detailed specifications, see <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>Bandwidth limit mode. Within the statistical time window CountingPeriod, for requests that meet the CountBy feature, the following bandwidth limit modes can be configured: <li>Block: Block the access source. When the count exceeds the MaxRequestThreshold, execute the Action on all subsequent requests that meet the feature within the ActionDuration;</li><li>Throttle: Only handle excess requests. When the count exceeds the MaxRequestThreshold, execute the Action only on requests that exceed the threshold, and stop when the window ends. At this point, the ActionDuration parameter will be ignored.</li><br>Default value: Block.</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Match mode of the rate threshold request feature. Required when Enabled is on.<br><br>When there are multiple conditions, they will be combined for statistics and calculation. A maximum of 5 conditions is allowed. Valid values:<br><li><b>http.request.ip</b>: client IP;</li><li><b>http.request.xff_header_ip</b>: client IP (priority match XFF header);</li><li><b>http.request.uri.path</b>: access path of the request;</li><li><b>http.request.cookies[&#39;session&#39;]</b>: Cookie named session, where session can be replaced with your own parameter;</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>: HTTP header named user-agent, where user-agent can be replaced with your own parameter;</li><li><b>http.request.ja3</b>: JA3 fingerprint of the request;</li><li><b>http.request.ja4</b>: JA4 fingerprint of the request;</li><li><b>http.request.uri.query[&#39;test&#39;]</b>: URL query parameter named test, where test can be replaced with your own parameter.</li></p>
    */
    @SerializedName("CountBy")
    @Expose
    private String [] CountBy;

    /**
    * <p>Cumulative number of interceptions by precise rate limiting within the time range, with a value range of 1 to 100000.</p>
    */
    @SerializedName("MaxRequestThreshold")
    @Expose
    private Long MaxRequestThreshold;

    /**
    * <p>Time window for statistics. Valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li></p>
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * <p>Duration of the Action. Supported units: <li>s: seconds, value range: 1-120;</li><li>m: minutes, value range: 1-120;</li><li>h: hours, value range: 1-48;</li><li>d: days, value range: 1-30.</li><br>When Mode is Throttle, this parameter will be ignored and will not take effect.</p>
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
    * <p>Handling method for precise rate limiting. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports ReturnCustomPage and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * <p>Priority of precise rate limiting, ranging from 0 to 100, with a default value of 0.</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>Whether the precise rate limiting rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get <p>ID of the precise rate limiting rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the RateLimitingRules parameter will be deleted.</li></p> 
     * @return Id <p>ID of the precise rate limiting rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the RateLimitingRules parameter will be deleted.</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID of the precise rate limiting rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the RateLimitingRules parameter will be deleted.</li></p>
     * @param Id <p>ID of the precise rate limiting rule.<br>Different rule configuration operations can be performed by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or unspecified;</li><li><b>Modify</b> an existing rule: specify the rule ID that needs to be updated/modified;</li><li><b>Delete</b> an existing rule: existing rules not included in the Rules list in the RateLimitingRules parameter will be deleted.</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Name of the precise rate limit.</p> 
     * @return Name <p>Name of the precise rate limit.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name of the precise rate limit.</p>
     * @param Name <p>Name of the precise rate limit.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The specific content of precise rate limiting must comply with expression syntax. For detailed specifications, see <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p> 
     * @return Condition <p>The specific content of precise rate limiting must comply with expression syntax. For detailed specifications, see <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>The specific content of precise rate limiting must comply with expression syntax. For detailed specifications, see <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     * @param Condition <p>The specific content of precise rate limiting must comply with expression syntax. For detailed specifications, see <a href="https://www.tencentcloud.com/document/product/1552/125343?from_cn_redirect=1">product document</a>.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>Bandwidth limit mode. Within the statistical time window CountingPeriod, for requests that meet the CountBy feature, the following bandwidth limit modes can be configured: <li>Block: Block the access source. When the count exceeds the MaxRequestThreshold, execute the Action on all subsequent requests that meet the feature within the ActionDuration;</li><li>Throttle: Only handle excess requests. When the count exceeds the MaxRequestThreshold, execute the Action only on requests that exceed the threshold, and stop when the window ends. At this point, the ActionDuration parameter will be ignored.</li><br>Default value: Block.</p> 
     * @return Mode <p>Bandwidth limit mode. Within the statistical time window CountingPeriod, for requests that meet the CountBy feature, the following bandwidth limit modes can be configured: <li>Block: Block the access source. When the count exceeds the MaxRequestThreshold, execute the Action on all subsequent requests that meet the feature within the ActionDuration;</li><li>Throttle: Only handle excess requests. When the count exceeds the MaxRequestThreshold, execute the Action only on requests that exceed the threshold, and stop when the window ends. At this point, the ActionDuration parameter will be ignored.</li><br>Default value: Block.</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Bandwidth limit mode. Within the statistical time window CountingPeriod, for requests that meet the CountBy feature, the following bandwidth limit modes can be configured: <li>Block: Block the access source. When the count exceeds the MaxRequestThreshold, execute the Action on all subsequent requests that meet the feature within the ActionDuration;</li><li>Throttle: Only handle excess requests. When the count exceeds the MaxRequestThreshold, execute the Action only on requests that exceed the threshold, and stop when the window ends. At this point, the ActionDuration parameter will be ignored.</li><br>Default value: Block.</p>
     * @param Mode <p>Bandwidth limit mode. Within the statistical time window CountingPeriod, for requests that meet the CountBy feature, the following bandwidth limit modes can be configured: <li>Block: Block the access source. When the count exceeds the MaxRequestThreshold, execute the Action on all subsequent requests that meet the feature within the ActionDuration;</li><li>Throttle: Only handle excess requests. When the count exceeds the MaxRequestThreshold, execute the Action only on requests that exceed the threshold, and stop when the window ends. At this point, the ActionDuration parameter will be ignored.</li><br>Default value: Block.</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Match mode of the rate threshold request feature. Required when Enabled is on.<br><br>When there are multiple conditions, they will be combined for statistics and calculation. A maximum of 5 conditions is allowed. Valid values:<br><li><b>http.request.ip</b>: client IP;</li><li><b>http.request.xff_header_ip</b>: client IP (priority match XFF header);</li><li><b>http.request.uri.path</b>: access path of the request;</li><li><b>http.request.cookies[&#39;session&#39;]</b>: Cookie named session, where session can be replaced with your own parameter;</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>: HTTP header named user-agent, where user-agent can be replaced with your own parameter;</li><li><b>http.request.ja3</b>: JA3 fingerprint of the request;</li><li><b>http.request.ja4</b>: JA4 fingerprint of the request;</li><li><b>http.request.uri.query[&#39;test&#39;]</b>: URL query parameter named test, where test can be replaced with your own parameter.</li></p> 
     * @return CountBy <p>Match mode of the rate threshold request feature. Required when Enabled is on.<br><br>When there are multiple conditions, they will be combined for statistics and calculation. A maximum of 5 conditions is allowed. Valid values:<br><li><b>http.request.ip</b>: client IP;</li><li><b>http.request.xff_header_ip</b>: client IP (priority match XFF header);</li><li><b>http.request.uri.path</b>: access path of the request;</li><li><b>http.request.cookies[&#39;session&#39;]</b>: Cookie named session, where session can be replaced with your own parameter;</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>: HTTP header named user-agent, where user-agent can be replaced with your own parameter;</li><li><b>http.request.ja3</b>: JA3 fingerprint of the request;</li><li><b>http.request.ja4</b>: JA4 fingerprint of the request;</li><li><b>http.request.uri.query[&#39;test&#39;]</b>: URL query parameter named test, where test can be replaced with your own parameter.</li></p>
     */
    public String [] getCountBy() {
        return this.CountBy;
    }

    /**
     * Set <p>Match mode of the rate threshold request feature. Required when Enabled is on.<br><br>When there are multiple conditions, they will be combined for statistics and calculation. A maximum of 5 conditions is allowed. Valid values:<br><li><b>http.request.ip</b>: client IP;</li><li><b>http.request.xff_header_ip</b>: client IP (priority match XFF header);</li><li><b>http.request.uri.path</b>: access path of the request;</li><li><b>http.request.cookies[&#39;session&#39;]</b>: Cookie named session, where session can be replaced with your own parameter;</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>: HTTP header named user-agent, where user-agent can be replaced with your own parameter;</li><li><b>http.request.ja3</b>: JA3 fingerprint of the request;</li><li><b>http.request.ja4</b>: JA4 fingerprint of the request;</li><li><b>http.request.uri.query[&#39;test&#39;]</b>: URL query parameter named test, where test can be replaced with your own parameter.</li></p>
     * @param CountBy <p>Match mode of the rate threshold request feature. Required when Enabled is on.<br><br>When there are multiple conditions, they will be combined for statistics and calculation. A maximum of 5 conditions is allowed. Valid values:<br><li><b>http.request.ip</b>: client IP;</li><li><b>http.request.xff_header_ip</b>: client IP (priority match XFF header);</li><li><b>http.request.uri.path</b>: access path of the request;</li><li><b>http.request.cookies[&#39;session&#39;]</b>: Cookie named session, where session can be replaced with your own parameter;</li><li><b>http.request.headers[&#39;user-agent&#39;]</b>: HTTP header named user-agent, where user-agent can be replaced with your own parameter;</li><li><b>http.request.ja3</b>: JA3 fingerprint of the request;</li><li><b>http.request.ja4</b>: JA4 fingerprint of the request;</li><li><b>http.request.uri.query[&#39;test&#39;]</b>: URL query parameter named test, where test can be replaced with your own parameter.</li></p>
     */
    public void setCountBy(String [] CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get <p>Cumulative number of interceptions by precise rate limiting within the time range, with a value range of 1 to 100000.</p> 
     * @return MaxRequestThreshold <p>Cumulative number of interceptions by precise rate limiting within the time range, with a value range of 1 to 100000.</p>
     */
    public Long getMaxRequestThreshold() {
        return this.MaxRequestThreshold;
    }

    /**
     * Set <p>Cumulative number of interceptions by precise rate limiting within the time range, with a value range of 1 to 100000.</p>
     * @param MaxRequestThreshold <p>Cumulative number of interceptions by precise rate limiting within the time range, with a value range of 1 to 100000.</p>
     */
    public void setMaxRequestThreshold(Long MaxRequestThreshold) {
        this.MaxRequestThreshold = MaxRequestThreshold;
    }

    /**
     * Get <p>Time window for statistics. Valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li></p> 
     * @return CountingPeriod <p>Time window for statistics. Valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li></p>
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set <p>Time window for statistics. Valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li></p>
     * @param CountingPeriod <p>Time window for statistics. Valid values: <li>1s: 1 second;</li><li>5s: 5 seconds;</li><li>10s: 10 seconds;</li><li>20s: 20 seconds;</li><li>30s: 30 seconds;</li><li>40s: 40 seconds;</li><li>50s: 50 seconds;</li><li>1m: 1 minute;</li><li>2m: 2 minutes;</li><li>5m: 5 minutes;</li><li>10m: 10 minutes;</li><li>1h: 1 hour.</li></p>
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get <p>Duration of the Action. Supported units: <li>s: seconds, value range: 1-120;</li><li>m: minutes, value range: 1-120;</li><li>h: hours, value range: 1-48;</li><li>d: days, value range: 1-30.</li><br>When Mode is Throttle, this parameter will be ignored and will not take effect.</p> 
     * @return ActionDuration <p>Duration of the Action. Supported units: <li>s: seconds, value range: 1-120;</li><li>m: minutes, value range: 1-120;</li><li>h: hours, value range: 1-48;</li><li>d: days, value range: 1-30.</li><br>When Mode is Throttle, this parameter will be ignored and will not take effect.</p>
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set <p>Duration of the Action. Supported units: <li>s: seconds, value range: 1-120;</li><li>m: minutes, value range: 1-120;</li><li>h: hours, value range: 1-48;</li><li>d: days, value range: 1-30.</li><br>When Mode is Throttle, this parameter will be ignored and will not take effect.</p>
     * @param ActionDuration <p>Duration of the Action. Supported units: <li>s: seconds, value range: 1-120;</li><li>m: minutes, value range: 1-120;</li><li>h: hours, value range: 1-48;</li><li>d: days, value range: 1-30.</li><br>When Mode is Throttle, this parameter will be ignored and will not take effect.</p>
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    /**
     * Get <p>Handling method for precise rate limiting. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports ReturnCustomPage and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul> 
     * @return Action <p>Handling method for precise rate limiting. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports ReturnCustomPage and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set <p>Handling method for precise rate limiting. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports ReturnCustomPage and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     * @param Action <p>Handling method for precise rate limiting. SecurityAction.Name value range is as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports ReturnCustomPage and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Priority of precise rate limiting, ranging from 0 to 100, with a default value of 0.</p> 
     * @return Priority <p>Priority of precise rate limiting, ranging from 0 to 100, with a default value of 0.</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Priority of precise rate limiting, ranging from 0 to 100, with a default value of 0.</p>
     * @param Priority <p>Priority of precise rate limiting, ranging from 0 to 100, with a default value of 0.</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>Whether the precise rate limiting rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p> 
     * @return Enabled <p>Whether the precise rate limiting rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether the precise rate limiting rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
     * @param Enabled <p>Whether the precise rate limiting rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
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
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "CountBy.", this.CountBy);
        this.setParamSimple(map, prefix + "MaxRequestThreshold", this.MaxRequestThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

