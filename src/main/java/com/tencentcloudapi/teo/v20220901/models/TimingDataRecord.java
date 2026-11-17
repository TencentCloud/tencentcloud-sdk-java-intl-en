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

public class TimingDataRecord extends AbstractModel {

    /**
    * Query the dimension value.
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
    * Detailed time series data of the <code>Integer</code> type. If the value type of the query metric is <code>Integer</code>, the corresponding time series data will be returned in this field.<br> **Note**: If the value type of the query metric is unclear, data will be returned in this field by default.
    */
    @SerializedName("TypeValue")
    @Expose
    private TimingTypeValue [] TypeValue;

    /**
    * Detailed time series data of <code>Float</code> type. For metrics whose query metric value type is <code>Float</code>, the corresponding time series data is returned in this field.
    */
    @SerializedName("FloatTypeValue")
    @Expose
    private FloatTimingTypeValue [] FloatTypeValue;

    /**
     * Get Query the dimension value. 
     * @return TypeKey Query the dimension value.
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set Query the dimension value.
     * @param TypeKey Query the dimension value.
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    /**
     * Get Detailed time series data of the <code>Integer</code> type. If the value type of the query metric is <code>Integer</code>, the corresponding time series data will be returned in this field.<br> **Note**: If the value type of the query metric is unclear, data will be returned in this field by default. 
     * @return TypeValue Detailed time series data of the <code>Integer</code> type. If the value type of the query metric is <code>Integer</code>, the corresponding time series data will be returned in this field.<br> **Note**: If the value type of the query metric is unclear, data will be returned in this field by default.
     */
    public TimingTypeValue [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set Detailed time series data of the <code>Integer</code> type. If the value type of the query metric is <code>Integer</code>, the corresponding time series data will be returned in this field.<br> **Note**: If the value type of the query metric is unclear, data will be returned in this field by default.
     * @param TypeValue Detailed time series data of the <code>Integer</code> type. If the value type of the query metric is <code>Integer</code>, the corresponding time series data will be returned in this field.<br> **Note**: If the value type of the query metric is unclear, data will be returned in this field by default.
     */
    public void setTypeValue(TimingTypeValue [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    /**
     * Get Detailed time series data of <code>Float</code> type. For metrics whose query metric value type is <code>Float</code>, the corresponding time series data is returned in this field. 
     * @return FloatTypeValue Detailed time series data of <code>Float</code> type. For metrics whose query metric value type is <code>Float</code>, the corresponding time series data is returned in this field.
     */
    public FloatTimingTypeValue [] getFloatTypeValue() {
        return this.FloatTypeValue;
    }

    /**
     * Set Detailed time series data of <code>Float</code> type. For metrics whose query metric value type is <code>Float</code>, the corresponding time series data is returned in this field.
     * @param FloatTypeValue Detailed time series data of <code>Float</code> type. For metrics whose query metric value type is <code>Float</code>, the corresponding time series data is returned in this field.
     */
    public void setFloatTypeValue(FloatTimingTypeValue [] FloatTypeValue) {
        this.FloatTypeValue = FloatTypeValue;
    }

    public TimingDataRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataRecord(TimingDataRecord source) {
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
        if (source.TypeValue != null) {
            this.TypeValue = new TimingTypeValue[source.TypeValue.length];
            for (int i = 0; i < source.TypeValue.length; i++) {
                this.TypeValue[i] = new TimingTypeValue(source.TypeValue[i]);
            }
        }
        if (source.FloatTypeValue != null) {
            this.FloatTypeValue = new FloatTimingTypeValue[source.FloatTypeValue.length];
            for (int i = 0; i < source.FloatTypeValue.length; i++) {
                this.FloatTypeValue[i] = new FloatTimingTypeValue(source.FloatTypeValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);
        this.setParamArrayObj(map, prefix + "TypeValue.", this.TypeValue);
        this.setParamArrayObj(map, prefix + "FloatTypeValue.", this.FloatTypeValue);

    }
}

