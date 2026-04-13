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

public class FloatTimingTypeValue extends AbstractModel {

    /**
    * Data and.
    */
    @SerializedName("Sum")
    @Expose
    private Float Sum;

    /**
    * Maximum value.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * Average.
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Details.
    */
    @SerializedName("Detail")
    @Expose
    private FloatTimingDataItem [] Detail;

    /**
     * Get Data and. 
     * @return Sum Data and.
     */
    public Float getSum() {
        return this.Sum;
    }

    /**
     * Set Data and.
     * @param Sum Data and.
     */
    public void setSum(Float Sum) {
        this.Sum = Sum;
    }

    /**
     * Get Maximum value. 
     * @return Max Maximum value.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value.
     * @param Max Maximum value.
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get Average. 
     * @return Avg Average.
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set Average.
     * @param Avg Average.
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get Metric name. 
     * @return MetricName Metric name.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name.
     * @param MetricName Metric name.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Details. 
     * @return Detail Details.
     */
    public FloatTimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Details.
     * @param Detail Details.
     */
    public void setDetail(FloatTimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    public FloatTimingTypeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FloatTimingTypeValue(FloatTimingTypeValue source) {
        if (source.Sum != null) {
            this.Sum = new Float(source.Sum);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Detail != null) {
            this.Detail = new FloatTimingDataItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new FloatTimingDataItem(source.Detail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sum", this.Sum);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

