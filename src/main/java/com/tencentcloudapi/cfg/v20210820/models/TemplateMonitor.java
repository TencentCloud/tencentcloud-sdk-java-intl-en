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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateMonitor extends AbstractModel {

    /**
    * pk
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Object type ID of the monitoring metric
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricChineseName")
    @Expose
    private String MetricChineseName;

    /**
     * Get pk 
     * @return MonitorId pk
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set pk
     * @param MonitorId pk
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricId Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricId Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Object type ID of the monitoring metric 
     * @return ObjectTypeId Object type ID of the monitoring metric
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set Object type ID of the monitoring metric
     * @param ObjectTypeId Object type ID of the monitoring metric
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
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
     * Get Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricChineseName Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricChineseName() {
        return this.MetricChineseName;
    }

    /**
     * Set Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricChineseName Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricChineseName(String MetricChineseName) {
        this.MetricChineseName = MetricChineseName;
    }

    public TemplateMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateMonitor(TemplateMonitor source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricChineseName != null) {
            this.MetricChineseName = new String(source.MetricChineseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricChineseName", this.MetricChineseName);

    }
}

