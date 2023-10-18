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

public class PrometheusAlertRule extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Prometheus statement
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Additional tags
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Alert sending template
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
    * Duration
    */
    @SerializedName("For")
    @Expose
    private String For;

    /**
    * Rule description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * See `annotations` in the Prometheus rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Annotations")
    @Expose
    private Label [] Annotations;

    /**
    * Alerting rule status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Prometheus statement 
     * @return Rule Prometheus statement
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Prometheus statement
     * @param Rule Prometheus statement
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Additional tags 
     * @return Labels Additional tags
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Additional tags
     * @param Labels Additional tags
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Alert sending template 
     * @return Template Alert sending template
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set Alert sending template
     * @param Template Alert sending template
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    /**
     * Get Duration 
     * @return For Duration
     */
    public String getFor() {
        return this.For;
    }

    /**
     * Set Duration
     * @param For Duration
     */
    public void setFor(String For) {
        this.For = For;
    }

    /**
     * Get Rule description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Describe Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Describe Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get See `annotations` in the Prometheus rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Annotations See `annotations` in the Prometheus rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Label [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set See `annotations` in the Prometheus rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Annotations See `annotations` in the Prometheus rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnnotations(Label [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Alerting rule status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleState Alerting rule status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set Alerting rule status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleState Alerting rule status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    public PrometheusAlertRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertRule(PrometheusAlertRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
        if (source.For != null) {
            this.For = new String(source.For);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Annotations != null) {
            this.Annotations = new Label[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Label(source.Annotations[i]);
            }
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "For", this.For);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);

    }
}

