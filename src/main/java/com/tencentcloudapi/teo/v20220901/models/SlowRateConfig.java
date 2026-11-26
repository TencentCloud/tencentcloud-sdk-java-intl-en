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
    * Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Statistics interval in seconds. After the first packet transfer is complete, the data transmission axis is split by this parameter, and slow attacks are calculated separately for each shard.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Rate threshold applied for statistics, in bps. If the transmission rate in this shard does not reach this parameter value, it is determined as a slow attack and the handling method for slow attacks is applied.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
     * Get Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Statistics interval in seconds. After the first packet transfer is complete, the data transmission axis is split by this parameter, and slow attacks are calculated separately for each shard. 
     * @return Interval Statistics interval in seconds. After the first packet transfer is complete, the data transmission axis is split by this parameter, and slow attacks are calculated separately for each shard.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Statistics interval in seconds. After the first packet transfer is complete, the data transmission axis is split by this parameter, and slow attacks are calculated separately for each shard.
     * @param Interval Statistics interval in seconds. After the first packet transfer is complete, the data transmission axis is split by this parameter, and slow attacks are calculated separately for each shard.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Rate threshold applied for statistics, in bps. If the transmission rate in this shard does not reach this parameter value, it is determined as a slow attack and the handling method for slow attacks is applied. 
     * @return Threshold Rate threshold applied for statistics, in bps. If the transmission rate in this shard does not reach this parameter value, it is determined as a slow attack and the handling method for slow attacks is applied.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Rate threshold applied for statistics, in bps. If the transmission rate in this shard does not reach this parameter value, it is determined as a slow attack and the handling method for slow attacks is applied.
     * @param Threshold Rate threshold applied for statistics, in bps. If the transmission rate in this shard does not reach this parameter value, it is determined as a slow attack and the handling method for slow attacks is applied.
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

