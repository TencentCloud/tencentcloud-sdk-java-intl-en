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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingTypeValue extends AbstractModel{

    /**
    * Sum.
    */
    @SerializedName("Sum")
    @Expose
    private Long Sum;

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
    private Long Avg;

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
     * Get Sum. 
     * @return Sum Sum.
     */
    public Long getSum() {
        return this.Sum;
    }

    /**
     * Set Sum.
     * @param Sum Sum.
     */
    public void setSum(Long Sum) {
        this.Sum = Sum;
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
    public Long getAvg() {
        return this.Avg;
    }

    /**
     * Set The average value.
     * @param Avg The average value.
     */
    public void setAvg(Long Avg) {
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(TimingDataItem [] Detail) {
        this.Detail = Detail;
    }

    public TimingTypeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingTypeValue(TimingTypeValue source) {
        if (source.Sum != null) {
            this.Sum = new Long(source.Sum);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.Avg != null) {
            this.Avg = new Long(source.Avg);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Detail != null) {
            this.Detail = new TimingDataItem[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new TimingDataItem(source.Detail[i]);
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

