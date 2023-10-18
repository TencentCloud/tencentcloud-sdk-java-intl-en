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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusRuleSet extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule status code
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * Rule category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * List of rule tags
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * List of rule annotations
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * Rule expression
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * Rule alert duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * List of alert recipient groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Receivers")
    @Expose
    private String [] Receivers;

    /**
    * Rule status. Valid values:
<li>unknown: Unknown</li>
<li>pending: Loading</li>
<li>ok: Running</li>
<li>err: Error</li>
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * Rule creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Rule update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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
     * Get Rule status code 
     * @return RuleState Rule status code
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set Rule status code
     * @param RuleState Rule status code
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get Rule category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Rule category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Rule category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Rule category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get List of rule tags
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels List of rule tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set List of rule tags
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels List of rule tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get List of rule annotations
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Annotations List of rule annotations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set List of rule annotations
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Annotations List of rule annotations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Rule expression
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Expr Rule expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set Rule expression
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Expr Rule expression
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get Rule alert duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration Rule alert duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Rule alert duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration Rule alert duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get List of alert recipient groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Receivers List of alert recipient groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set List of alert recipient groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Receivers List of alert recipient groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceivers(String [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Rule status. Valid values:
<li>unknown: Unknown</li>
<li>pending: Loading</li>
<li>ok: Running</li>
<li>err: Error</li> 
     * @return Health Rule status. Valid values:
<li>unknown: Unknown</li>
<li>pending: Loading</li>
<li>ok: Running</li>
<li>err: Error</li>
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set Rule status. Valid values:
<li>unknown: Unknown</li>
<li>pending: Loading</li>
<li>ok: Running</li>
<li>err: Error</li>
     * @param Health Rule status. Valid values:
<li>unknown: Unknown</li>
<li>pending: Loading</li>
<li>ok: Running</li>
<li>err: Error</li>
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get Rule creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Rule creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Rule creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Rule creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Rule update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Rule update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Rule update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Rule update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrometheusRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusRuleSet(PrometheusRuleSet source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.Expr != null) {
            this.Expr = new String(source.Expr);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Receivers != null) {
            this.Receivers = new String[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new String(source.Receivers[i]);
            }
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

