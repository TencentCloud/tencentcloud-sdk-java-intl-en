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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthInfo extends AbstractModel {

    /**
    * Format of return value:
yyyy-mm-dd HH:MM:SS
The time accuracy matches with the query granularity.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Bandwidth.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
     * Get Format of return value:
yyyy-mm-dd HH:MM:SS
The time accuracy matches with the query granularity. 
     * @return Time Format of return value:
yyyy-mm-dd HH:MM:SS
The time accuracy matches with the query granularity.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Format of return value:
yyyy-mm-dd HH:MM:SS
The time accuracy matches with the query granularity.
     * @param Time Format of return value:
yyyy-mm-dd HH:MM:SS
The time accuracy matches with the query granularity.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Bandwidth. 
     * @return Bandwidth Bandwidth.
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth.
     * @param Bandwidth Bandwidth.
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public BandwidthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthInfo(BandwidthInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

