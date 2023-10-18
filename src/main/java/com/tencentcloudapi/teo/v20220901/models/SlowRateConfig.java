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
    * The sampling interval in seconds. In this way, the first 8 KB of the request is ignored. The rest of data is separated in to multiple parts according to this interval for slow attack measurement.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * The transfer rate threshold in bps. When the transfer rate of a sample is lower than the threshold, it’s considered a slow attack and handled according to the specified `Action`.
Note: This field may return `null`, indicating that no valid value can be obtained.
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
     * Get The sampling interval in seconds. In this way, the first 8 KB of the request is ignored. The rest of data is separated in to multiple parts according to this interval for slow attack measurement.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Interval The sampling interval in seconds. In this way, the first 8 KB of the request is ignored. The rest of data is separated in to multiple parts according to this interval for slow attack measurement.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set The sampling interval in seconds. In this way, the first 8 KB of the request is ignored. The rest of data is separated in to multiple parts according to this interval for slow attack measurement.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Interval The sampling interval in seconds. In this way, the first 8 KB of the request is ignored. The rest of data is separated in to multiple parts according to this interval for slow attack measurement.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The transfer rate threshold in bps. When the transfer rate of a sample is lower than the threshold, it’s considered a slow attack and handled according to the specified `Action`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Threshold The transfer rate threshold in bps. When the transfer rate of a sample is lower than the threshold, it’s considered a slow attack and handled according to the specified `Action`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The transfer rate threshold in bps. When the transfer rate of a sample is lower than the threshold, it’s considered a slow attack and handled according to the specified `Action`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Threshold The transfer rate threshold in bps. When the transfer rate of a sample is lower than the threshold, it’s considered a slow attack and handled according to the specified `Action`.
Note: This field may return `null`, indicating that no valid value can be obtained.
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

