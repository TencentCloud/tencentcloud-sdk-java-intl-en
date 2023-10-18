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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaradData extends AbstractModel {

    /**
    * Metric name (connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;)
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Value array
    */
    @SerializedName("Data")
    @Expose
    private Float [] Data;

    /**
    * Value array size
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Metric name (connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;) 
     * @return MetricName Metric name (connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;)
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name (connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;)
     * @param MetricName Metric name (connum: number of active TCP connections;
new_conn: number of new TCP connections;
inactive_conn: number of inactive connections;
intraffic: inbound traffic;
outtraffic: outbound traffic;
alltraffic: sum of inbound and outbound traffic;
inpkg: inbound packet rate;
outpkg: outbound packet rate;)
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Value array 
     * @return Data Value array
     */
    public Float [] getData() {
        return this.Data;
    }

    /**
     * Set Value array
     * @param Data Value array
     */
    public void setData(Float [] Data) {
        this.Data = Data;
    }

    /**
     * Get Value array size 
     * @return Count Value array size
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Value array size
     * @param Count Value array size
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public BaradData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaradData(BaradData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Data != null) {
            this.Data = new Float[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Float(source.Data[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

