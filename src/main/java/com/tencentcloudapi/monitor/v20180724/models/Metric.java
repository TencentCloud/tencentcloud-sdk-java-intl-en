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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Metric extends AbstractModel{

    /**
    * Alarm policy type
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric display name
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Minimum value
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Maximum value
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * Dimension list
    */
    @SerializedName("Dimensions")
    @Expose
    private String [] Dimensions;

    /**
    * Unit
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Metric configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricConfig")
    @Expose
    private MetricConfig MetricConfig;

    /**
    * Whether it is an advanced metric. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAdvanced")
    @Expose
    private Long IsAdvanced;

    /**
    * Whether the advanced metric feature is enabled. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
    * Integration center product ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * Matching operator
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operators")
    @Expose
    private Operator [] Operators;

    /**
    * Metric monitoring granularity
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Periods")
    @Expose
    private Long [] Periods;

    /**
     * Get Alarm policy type 
     * @return Namespace Alarm policy type
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Alarm policy type
     * @param Namespace Alarm policy type
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric name 
     * @return MetricName Metric name
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name
     * @param MetricName Metric name
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Metric display name 
     * @return Description Metric display name
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Metric display name
     * @param Description Metric display name
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Minimum value 
     * @return Min Minimum value
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value
     * @param Min Minimum value
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum value 
     * @return Max Maximum value
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value
     * @param Max Maximum value
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get Dimension list 
     * @return Dimensions Dimension list
     */
    public String [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension list
     * @param Dimensions Dimension list
     */
    public void setDimensions(String [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Unit 
     * @return Unit Unit
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit
     * @param Unit Unit
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Metric configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetricConfig Metric configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MetricConfig getMetricConfig() {
        return this.MetricConfig;
    }

    /**
     * Set Metric configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetricConfig Metric configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricConfig(MetricConfig MetricConfig) {
        this.MetricConfig = MetricConfig;
    }

    /**
     * Get Whether it is an advanced metric. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsAdvanced Whether it is an advanced metric. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIsAdvanced() {
        return this.IsAdvanced;
    }

    /**
     * Set Whether it is an advanced metric. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsAdvanced Whether it is an advanced metric. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsAdvanced(Long IsAdvanced) {
        this.IsAdvanced = IsAdvanced;
    }

    /**
     * Get Whether the advanced metric feature is enabled. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsOpen Whether the advanced metric feature is enabled. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set Whether the advanced metric feature is enabled. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsOpen Whether the advanced metric feature is enabled. 1: Yes; 0: No.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    /**
     * Get Integration center product ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ProductId Integration center product ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set Integration center product ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ProductId Integration center product ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Matching operator
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Operators Matching operator
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Operator [] getOperators() {
        return this.Operators;
    }

    /**
     * Set Matching operator
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Operators Matching operator
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setOperators(Operator [] Operators) {
        this.Operators = Operators;
    }

    /**
     * Get Metric monitoring granularity
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Periods Metric monitoring granularity
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set Metric monitoring granularity
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Periods Metric monitoring granularity
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriods(Long [] Periods) {
        this.Periods = Periods;
    }

    public Metric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metric(Metric source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new String(source.Dimensions[i]);
            }
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.MetricConfig != null) {
            this.MetricConfig = new MetricConfig(source.MetricConfig);
        }
        if (source.IsAdvanced != null) {
            this.IsAdvanced = new Long(source.IsAdvanced);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Operators != null) {
            this.Operators = new Operator[source.Operators.length];
            for (int i = 0; i < source.Operators.length; i++) {
                this.Operators[i] = new Operator(source.Operators[i]);
            }
        }
        if (source.Periods != null) {
            this.Periods = new Long[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new Long(source.Periods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamArraySimple(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamObj(map, prefix + "MetricConfig.", this.MetricConfig);
        this.setParamSimple(map, prefix + "IsAdvanced", this.IsAdvanced);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArrayObj(map, prefix + "Operators.", this.Operators);
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);

    }
}

