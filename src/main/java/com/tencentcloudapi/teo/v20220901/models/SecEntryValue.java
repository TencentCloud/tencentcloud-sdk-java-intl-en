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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecEntryValue extends AbstractModel {

    /**
    * The metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * The time-series data details.
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
    * The maximum value.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * The average value.
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * Sum
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
     * Get The metric name. 
     * @return Metric The metric name.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set The metric name.
     * @param Metric The metric name.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get The time-series data details. 
     * @return Detail The time-series data details.
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set The time-series data details.
     * @param Detail The time-series data details.
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get The maximum value. 
     * @return Max The maximum value.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set The maximum value.
     * @param Max The maximum value.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get The average value. 
     * @return Avg The average value.
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set The average value.
     * @param Avg The average value.
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get Sum 
     * @return Sum Sum
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set Sum
     * @param Sum Sum
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

