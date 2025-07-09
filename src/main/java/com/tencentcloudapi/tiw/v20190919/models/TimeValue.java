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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeValue extends AbstractModel {

    /**
    * Unix timestamp in seconds.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Current value of the queried metric.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Unix timestamp in seconds. 
     * @return Time Unix timestamp in seconds.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Unix timestamp in seconds.
     * @param Time Unix timestamp in seconds.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Current value of the queried metric. 
     * @return Value Current value of the queried metric.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Current value of the queried metric.
     * @param Value Current value of the queried metric.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public TimeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeValue(TimeValue source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

