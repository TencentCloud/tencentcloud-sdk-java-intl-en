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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLARule extends AbstractModel {

    /**
    * Metric.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Metric aggregation method.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Condition, such as '==' '!=' '<' '<=' '>' '>='.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Threshold value.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * Label.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LabelFilter")
    @Expose
    private SLALabel [] LabelFilter;

    /**
    * Whether to stop performance test job.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AbortFlag")
    @Expose
    private Boolean AbortFlag;

    /**
    * Duration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("For")
    @Expose
    private String For;

    /**
     * Get Metric.

Note: This field may return null, indicating that no valid value is found. 
     * @return Metric Metric.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric.

Note: This field may return null, indicating that no valid value is found.
     * @param Metric Metric.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Metric aggregation method.

Note: This field may return null, indicating that no valid value is found. 
     * @return Aggregation Metric aggregation method.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Metric aggregation method.

Note: This field may return null, indicating that no valid value is found.
     * @param Aggregation Metric aggregation method.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Condition, such as '==' '!=' '<' '<=' '>' '>='.

Note: This field may return null, indicating that no valid value is found. 
     * @return Condition Condition, such as '==' '!=' '<' '<=' '>' '>='.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Condition, such as '==' '!=' '<' '<=' '>' '>='.

Note: This field may return null, indicating that no valid value is found.
     * @param Condition Condition, such as '==' '!=' '<' '<=' '>' '>='.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Threshold value.

Note: This field may return null, indicating that no valid value is found. 
     * @return Value Threshold value.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Threshold value.

Note: This field may return null, indicating that no valid value is found.
     * @param Value Threshold value.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get Label.

Note: This field may return null, indicating that no valid value is found. 
     * @return LabelFilter Label.

Note: This field may return null, indicating that no valid value is found.
     */
    public SLALabel [] getLabelFilter() {
        return this.LabelFilter;
    }

    /**
     * Set Label.

Note: This field may return null, indicating that no valid value is found.
     * @param LabelFilter Label.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabelFilter(SLALabel [] LabelFilter) {
        this.LabelFilter = LabelFilter;
    }

    /**
     * Get Whether to stop performance test job.

Note: This field may return null, indicating that no valid value is found. 
     * @return AbortFlag Whether to stop performance test job.

Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getAbortFlag() {
        return this.AbortFlag;
    }

    /**
     * Set Whether to stop performance test job.

Note: This field may return null, indicating that no valid value is found.
     * @param AbortFlag Whether to stop performance test job.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAbortFlag(Boolean AbortFlag) {
        this.AbortFlag = AbortFlag;
    }

    /**
     * Get Duration.

Note: This field may return null, indicating that no valid value is found. 
     * @return For Duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getFor() {
        return this.For;
    }

    /**
     * Set Duration.

Note: This field may return null, indicating that no valid value is found.
     * @param For Duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setFor(String For) {
        this.For = For;
    }

    public SLARule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLARule(SLARule source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.LabelFilter != null) {
            this.LabelFilter = new SLALabel[source.LabelFilter.length];
            for (int i = 0; i < source.LabelFilter.length; i++) {
                this.LabelFilter[i] = new SLALabel(source.LabelFilter[i]);
            }
        }
        if (source.AbortFlag != null) {
            this.AbortFlag = new Boolean(source.AbortFlag);
        }
        if (source.For != null) {
            this.For = new String(source.For);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "LabelFilter.", this.LabelFilter);
        this.setParamSimple(map, prefix + "AbortFlag", this.AbortFlag);
        this.setParamSimple(map, prefix + "For", this.For);

    }
}

