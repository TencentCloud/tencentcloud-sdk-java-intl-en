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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimestampData extends AbstractModel {

    /**
    * Statistical time point in forward rounding mode
Taking the 5-minute granularity as an example, 13:35:00 indicates that the statistical interval is between 13:35:00 and 13:39:59
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Data value
    */
    @SerializedName("Value")
    @Expose
    private Float [] Value;

    /**
     * Get Statistical time point in forward rounding mode
Taking the 5-minute granularity as an example, 13:35:00 indicates that the statistical interval is between 13:35:00 and 13:39:59 
     * @return Time Statistical time point in forward rounding mode
Taking the 5-minute granularity as an example, 13:35:00 indicates that the statistical interval is between 13:35:00 and 13:39:59
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Statistical time point in forward rounding mode
Taking the 5-minute granularity as an example, 13:35:00 indicates that the statistical interval is between 13:35:00 and 13:39:59
     * @param Time Statistical time point in forward rounding mode
Taking the 5-minute granularity as an example, 13:35:00 indicates that the statistical interval is between 13:35:00 and 13:39:59
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Data value 
     * @return Value Data value
     */
    public Float [] getValue() {
        return this.Value;
    }

    /**
     * Set Data value
     * @param Value Data value
     */
    public void setValue(Float [] Value) {
        this.Value = Value;
    }

    public TimestampData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimestampData(TimestampData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Float[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new Float(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

