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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricData extends AbstractModel{

    /**
    * Resource description
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Table name
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Table data
    */
    @SerializedName("DataSet")
    @Expose
    private DatePoint [] DataSet;

    /**
    * The total number of requests within the query scope.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MetricCount")
    @Expose
    private Long MetricCount;

    /**
     * Get Resource description 
     * @return Resource Resource description
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource description
     * @param Resource Resource description
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Table name 
     * @return Metric Table name
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Table name
     * @param Metric Table name
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Table data 
     * @return DataSet Table data
     */
    public DatePoint [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set Table data
     * @param DataSet Table data
     */
    public void setDataSet(DatePoint [] DataSet) {
        this.DataSet = DataSet;
    }

    /**
     * Get The total number of requests within the query scope.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MetricCount The total number of requests within the query scope.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMetricCount() {
        return this.MetricCount;
    }

    /**
     * Set The total number of requests within the query scope.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MetricCount The total number of requests within the query scope.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMetricCount(Long MetricCount) {
        this.MetricCount = MetricCount;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.DataSet != null) {
            this.DataSet = new DatePoint[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new DatePoint(source.DataSet[i]);
            }
        }
        if (source.MetricCount != null) {
            this.MetricCount = new Long(source.MetricCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);
        this.setParamSimple(map, prefix + "MetricCount", this.MetricCount);

    }
}

