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

public class TimingTypeValue extends AbstractModel {

    /**
    * Sum
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sum")
    @Expose
    private Long Sum;

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
    private Long Avg;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * This field will be disused soon. Use the `Detail` field instead.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailData")
    @Expose
    private Long [] DetailData;

    /**
    * Detailed data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private TimingDataItem [] Detail;

    /**
     * Get Sum
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sum Sum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSum() {
        return this.Sum;
    }

    /**
     * Set Sum
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sum Sum
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSum(Long Sum) {
        this.Sum = Sum;
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
    public Long getAvg() {
        return this.Avg;
    }

    /**
     * Set Average
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Avg Average
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvg(Long Avg) {
        this.Avg = Avg;
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
     * Get This field will be disused soon. Use the `Detail` field instead.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailData This field will be disused soon. Use the `Detail` field instead.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set This field will be disused soon. Use the `Detail` field instead.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailData This field will be disused soon. Use the `Detail` field instead.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailData(Long [] DetailData) {
        this.DetailData = DetailData;
    }

    /**
     * Get Detailed data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Detailed data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimingDataItem [] getDetail() {
        return this.Detail;
    }

    /**
     * Set Detailed data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Detailed data
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
        if (source.DetailData != null) {
            this.DetailData = new Long[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new Long(source.DetailData[i]);
            }
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
        this.setParamArraySimple(map, prefix + "DetailData.", this.DetailData);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

