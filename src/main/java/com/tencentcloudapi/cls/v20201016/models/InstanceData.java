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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceData extends AbstractModel {

    /**
    * Cloud Monitor metric name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * CLS metric name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CLSMetricName")
    @Expose
    private String CLSMetricName;

    /**
    * Cloud product namespace.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Instance information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * Period (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Statistical value of a metric.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * Error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get Cloud Monitor metric name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricName Cloud Monitor metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Cloud Monitor metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricName Cloud Monitor metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get CLS metric name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CLSMetricName CLS metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCLSMetricName() {
        return this.CLSMetricName;
    }

    /**
     * Set CLS metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CLSMetricName CLS metric name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCLSMetricName(String CLSMetricName) {
        this.CLSMetricName = CLSMetricName;
    }

    /**
     * Get Cloud product namespace.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Cloud product namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Cloud product namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Cloud product namespace.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Instance information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Dimensions Instance information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Instance information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Dimensions Instance information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Period (seconds).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Period Period (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Period (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Period Period (seconds).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Statistical value of a metric.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Statistical value of a metric.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Statistical value of a metric.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Statistical value of a metric.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get Error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrMsg Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrMsg Error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public InstanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceData(InstanceData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.CLSMetricName != null) {
            this.CLSMetricName = new String(source.CLSMetricName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "CLSMetricName", this.CLSMetricName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

