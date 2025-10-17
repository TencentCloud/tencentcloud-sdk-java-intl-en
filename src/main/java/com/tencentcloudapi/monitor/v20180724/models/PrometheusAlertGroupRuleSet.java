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

public class PrometheusAlertGroupRuleSet extends AbstractModel {

    /**
    * Alert rule name. same name is not allowed in the same Alert group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Prometheus alert label list.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private PrometheusRuleKV [] Labels;

    /**
    * Prometheus alert annotation list.

Alarm object and Alarm message are special fields of Prometheus Rule Annotations. they need to pass through Annotations for transmission. the corresponding keys are summary and description respectively.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Annotations")
    @Expose
    private PrometheusRuleKV [] Annotations;

    /**
    * Alert will be triggered after 'Expr' satisfied for 'Duration'.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * Alert expression. see <a href="https://www.tencentcloud.comom/document/product/1416/56008?from_cn_redirect=1">alert rule description</a>.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Expr")
    @Expose
    private String Expr;

    /**
    * Alert rule status.
2 - enable.
3 - disabled.
Enabled by default if left empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get Alert rule name. same name is not allowed in the same Alert group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Alert rule name. same name is not allowed in the same Alert group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Alert rule name. same name is not allowed in the same Alert group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Alert rule name. same name is not allowed in the same Alert group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Prometheus alert label list.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Prometheus alert label list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusRuleKV [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Prometheus alert label list.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Prometheus alert label list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(PrometheusRuleKV [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Prometheus alert annotation list.

Alarm object and Alarm message are special fields of Prometheus Rule Annotations. they need to pass through Annotations for transmission. the corresponding keys are summary and description respectively.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Annotations Prometheus alert annotation list.

Alarm object and Alarm message are special fields of Prometheus Rule Annotations. they need to pass through Annotations for transmission. the corresponding keys are summary and description respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusRuleKV [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Prometheus alert annotation list.

Alarm object and Alarm message are special fields of Prometheus Rule Annotations. they need to pass through Annotations for transmission. the corresponding keys are summary and description respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Annotations Prometheus alert annotation list.

Alarm object and Alarm message are special fields of Prometheus Rule Annotations. they need to pass through Annotations for transmission. the corresponding keys are summary and description respectively.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnnotations(PrometheusRuleKV [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Alert will be triggered after 'Expr' satisfied for 'Duration'.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration Alert will be triggered after 'Expr' satisfied for 'Duration'.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Alert will be triggered after 'Expr' satisfied for 'Duration'.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration Alert will be triggered after 'Expr' satisfied for 'Duration'.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Alert expression. see <a href="https://www.tencentcloud.comom/document/product/1416/56008?from_cn_redirect=1">alert rule description</a>.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Expr Alert expression. see <a href="https://www.tencentcloud.comom/document/product/1416/56008?from_cn_redirect=1">alert rule description</a>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpr() {
        return this.Expr;
    }

    /**
     * Set Alert expression. see <a href="https://www.tencentcloud.comom/document/product/1416/56008?from_cn_redirect=1">alert rule description</a>.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Expr Alert expression. see <a href="https://www.tencentcloud.comom/document/product/1416/56008?from_cn_redirect=1">alert rule description</a>.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpr(String Expr) {
        this.Expr = Expr;
    }

    /**
     * Get Alert rule status.
2 - enable.
3 - disabled.
Enabled by default if left empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State Alert rule status.
2 - enable.
3 - disabled.
Enabled by default if left empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Alert rule status.
2 - enable.
3 - disabled.
Enabled by default if left empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State Alert rule status.
2 - enable.
3 - disabled.
Enabled by default if left empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(Long State) {
        this.State = State;
    }

    public PrometheusAlertGroupRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertGroupRuleSet(PrometheusAlertGroupRuleSet source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
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
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Expr != null) {
            this.Expr = new String(source.Expr);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Expr", this.Expr);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

