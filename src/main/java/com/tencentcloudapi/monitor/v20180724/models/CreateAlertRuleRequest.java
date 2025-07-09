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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertRuleRequest extends AbstractModel {

    /**
    * TMP instance ID, such as “prom-abcd1234”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Alerting rule expression. For more information, see <a href="https://www.tencentcloud.com/document/product/1116/43192?lang=en&pg=">Alerting Rule Description</a>
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * List of alert notification template IDs
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Rule status code. Valid values:
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * Rule alert duration
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * List of tags
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * List of annotations.

Alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively.
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * Alerting rule template category
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get TMP instance ID, such as “prom-abcd1234”. 
     * @return InstanceId TMP instance ID, such as “prom-abcd1234”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TMP instance ID, such as “prom-abcd1234”.
     * @param InstanceId TMP instance ID, such as “prom-abcd1234”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Alerting rule expression. For more information, see <a href="https://www.tencentcloud.com/document/product/1116/43192?lang=en&pg=">Alerting Rule Description</a> 
     * @return Expr Alerting rule expression. For more information, see <a href="https://www.tencentcloud.com/document/product/1116/43192?lang=en&pg=">Alerting Rule Description</a>
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set Alerting rule expression. For more information, see <a href="https://www.tencentcloud.com/document/product/1116/43192?lang=en&pg=">Alerting Rule Description</a>
     * @param Expr Alerting rule expression. For more information, see <a href="https://www.tencentcloud.com/document/product/1116/43192?lang=en&pg=">Alerting Rule Description</a>
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get List of alert notification template IDs 
     * @return Receivers List of alert notification template IDs
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set List of alert notification template IDs
     * @param Receivers List of alert notification template IDs
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Rule status code. Valid values:
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li> 
     * @return RuleState Rule status code. Valid values:
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set Rule status code. Valid values:
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     * @param RuleState Rule status code. Valid values:
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get Rule alert duration 
     * @return Duration Rule alert duration
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Rule alert duration
     * @param Duration Rule alert duration
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get List of tags 
     * @return Labels List of tags
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set List of tags
     * @param Labels List of tags
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get List of annotations.

Alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively. 
     * @return Annotations List of annotations.

Alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively.
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set List of annotations.

Alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively.
     * @param Annotations List of annotations.

Alert object and alert message are special fields of Prometheus Rule Annotations, which need to be passed in through `annotations` and correspond to `summary` and `description` keys respectively.
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Alerting rule template category 
     * @return Type Alerting rule template category
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alerting rule template category
     * @param Type Alerting rule template category
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateAlertRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertRuleRequest(CreateAlertRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Expr != null) {
            this.Expr = new String(source.Expr);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Labels != null) {
            this.Labels = new PrometheusRuleKV[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new PrometheusRuleKV(source.Labels[i]);
            }
        }
        if (source.Annotations != null) {
            this.Annotations = new PrometheusRuleKV[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new PrometheusRuleKV(source.Annotations[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

