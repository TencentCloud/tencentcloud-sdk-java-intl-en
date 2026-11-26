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
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Details of time series data.
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
    * Maximum value.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * Mean.
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * Total data.
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
     * Get Metric name. 
     * @return Metric Metric name.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name.
     * @param Metric Metric name.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Details of time series data. 
     * @return Detail Details of time series data.
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Details of time series data.
     * @param Detail Details of time series data.
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Maximum value. 
     * @return Max Maximum value.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value.
     * @param Max Maximum value.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get Mean. 
     * @return Avg Mean.
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set Mean.
     * @param Avg Mean.
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get Total data. 
     * @return Sum Total data.
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set Total data.
     * @param Sum Total data.
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

