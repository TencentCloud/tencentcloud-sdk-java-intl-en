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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HLSConfigureInfo extends AbstractModel {

    /**
    * Duration of a single TS file in seconds. Value range: 5-30 seconds.

If this parameter is left empty, 30 seconds will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * Recording cycle in seconds. Value range: 10 minutes to 12 hours.

If this parameter is left empty, 10 minutes (3600 seconds) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Resume recording waiting time, unit: seconds. Value range: 60-1800 seconds.
If this parameter is left empty, 0 (resume recording not enabled) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ContinueTimeout")
    @Expose
    private Long ContinueTimeout;

    /**
     * Get Duration of a single TS file in seconds. Value range: 5-30 seconds.

If this parameter is left empty, 30 seconds will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ItemDuration Duration of a single TS file in seconds. Value range: 5-30 seconds.

If this parameter is left empty, 30 seconds will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set Duration of a single TS file in seconds. Value range: 5-30 seconds.

If this parameter is left empty, 30 seconds will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ItemDuration Duration of a single TS file in seconds. Value range: 5-30 seconds.

If this parameter is left empty, 30 seconds will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get Recording cycle in seconds. Value range: 10 minutes to 12 hours.

If this parameter is left empty, 10 minutes (3600 seconds) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Interval Recording cycle in seconds. Value range: 10 minutes to 12 hours.

If this parameter is left empty, 10 minutes (3600 seconds) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Recording cycle in seconds. Value range: 10 minutes to 12 hours.

If this parameter is left empty, 10 minutes (3600 seconds) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Interval Recording cycle in seconds. Value range: 10 minutes to 12 hours.

If this parameter is left empty, 10 minutes (3600 seconds) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Resume recording waiting time, unit: seconds. Value range: 60-1800 seconds.
If this parameter is left empty, 0 (resume recording not enabled) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ContinueTimeout Resume recording waiting time, unit: seconds. Value range: 60-1800 seconds.
If this parameter is left empty, 0 (resume recording not enabled) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getContinueTimeout() {
        return this.ContinueTimeout;
    }

    /**
     * Set Resume recording waiting time, unit: seconds. Value range: 60-1800 seconds.
If this parameter is left empty, 0 (resume recording not enabled) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ContinueTimeout Resume recording waiting time, unit: seconds. Value range: 60-1800 seconds.
If this parameter is left empty, 0 (resume recording not enabled) will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setContinueTimeout(Long ContinueTimeout) {
        this.ContinueTimeout = ContinueTimeout;
    }

    public HLSConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HLSConfigureInfo(HLSConfigureInfo source) {
        if (source.ItemDuration != null) {
            this.ItemDuration = new Long(source.ItemDuration);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.ContinueTimeout != null) {
            this.ContinueTimeout = new Long(source.ContinueTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemDuration", this.ItemDuration);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "ContinueTimeout", this.ContinueTimeout);

    }
}

