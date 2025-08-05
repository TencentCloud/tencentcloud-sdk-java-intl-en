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

public class SlowRateConfig extends AbstractModel {

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The statistics interval in seconds. after the first packet transfer, the data transmission axis is split by this parameter for separate computing of slow attacks on each shard.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Specifies the rate threshold applied during statistics in bps. if the transmission rate in this shard does not reach the parameter value, it is identified as a slow attack and the slow attack handling method is applied.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The statistics interval in seconds. after the first packet transfer, the data transmission axis is split by this parameter for separate computing of slow attacks on each shard. 
     * @return Interval The statistics interval in seconds. after the first packet transfer, the data transmission axis is split by this parameter for separate computing of slow attacks on each shard.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set The statistics interval in seconds. after the first packet transfer, the data transmission axis is split by this parameter for separate computing of slow attacks on each shard.
     * @param Interval The statistics interval in seconds. after the first packet transfer, the data transmission axis is split by this parameter for separate computing of slow attacks on each shard.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Specifies the rate threshold applied during statistics in bps. if the transmission rate in this shard does not reach the parameter value, it is identified as a slow attack and the slow attack handling method is applied. 
     * @return Threshold Specifies the rate threshold applied during statistics in bps. if the transmission rate in this shard does not reach the parameter value, it is identified as a slow attack and the slow attack handling method is applied.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Specifies the rate threshold applied during statistics in bps. if the transmission rate in this shard does not reach the parameter value, it is identified as a slow attack and the slow attack handling method is applied.
     * @param Threshold Specifies the rate threshold applied during statistics in bps. if the transmission rate in this shard does not reach the parameter value, it is identified as a slow attack and the slow attack handling method is applied.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    public SlowRateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowRateConfig(SlowRateConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

