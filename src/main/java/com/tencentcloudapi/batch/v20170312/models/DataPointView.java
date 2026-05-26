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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPointView extends AbstractModel {

    /**
    * The time when monitoring data is collected

    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * Monitoring metric data; if involved in the gap time of monitoring data of multiple instances, the value will be null

    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get The time when monitoring data is collected
 
     * @return Timestamps The time when monitoring data is collected

     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set The time when monitoring data is collected

     * @param Timestamps The time when monitoring data is collected

     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get Monitoring metric data; if involved in the gap time of monitoring data of multiple instances, the value will be null
 
     * @return Values Monitoring metric data; if involved in the gap time of monitoring data of multiple instances, the value will be null

     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set Monitoring metric data; if involved in the gap time of monitoring data of multiple instances, the value will be null

     * @param Values Monitoring metric data; if involved in the gap time of monitoring data of multiple instances, the value will be null

     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public DataPointView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataPointView(DataPointView source) {
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

