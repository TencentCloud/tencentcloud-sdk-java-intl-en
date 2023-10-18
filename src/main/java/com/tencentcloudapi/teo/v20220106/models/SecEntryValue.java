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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecEntryValue extends AbstractModel {

    /**
    * Metric name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Metric data details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
    * Maximum
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Average
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * Sum
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
     * Get Metric name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metric Metric name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metric Metric name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Metric data details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Metric data details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Metric data details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Metric data details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Maximum
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Max Maximum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Max Maximum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Average
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Avg Average
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set Average
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Avg Average
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get Sum
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sum Sum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set Sum
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sum Sum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSum(Float Sum) {
        this.Sum = Sum;
    }

    public SecEntryValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecEntryValue(SecEntryValue source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Detail != null) {
            this.Detail = new TimingDataItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new TimingDataItem(source.Detail[i]);
            }
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
        }
        if (source.Sum != null) {
            this.Sum = new Float(source.Sum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "Sum", this.Sum);

    }
}

