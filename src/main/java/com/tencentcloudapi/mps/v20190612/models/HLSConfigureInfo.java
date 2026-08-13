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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HLSConfigureInfo extends AbstractModel {

    /**
    * Duration of TS file, unit: second, value ranges from 5 to 30 seconds.

Leave it blank and it defaults to 30 seconds.
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * Recording period, unit: second, value ranges from 10 minutes to 12 hr.

Leave it blank defaults to 10 minutes (3600 seconds).
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Continuation waiting time, unit: second. Value range: 60 seconds to 1800 seconds.
Leave blank defaults to 0 (recording continuation disabled).
    */
    @SerializedName("ContinueTimeout")
    @Expose
    private Long ContinueTimeout;

    /**
     * Get Duration of TS file, unit: second, value ranges from 5 to 30 seconds.

Leave it blank and it defaults to 30 seconds. 
     * @return ItemDuration Duration of TS file, unit: second, value ranges from 5 to 30 seconds.

Leave it blank and it defaults to 30 seconds.
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set Duration of TS file, unit: second, value ranges from 5 to 30 seconds.

Leave it blank and it defaults to 30 seconds.
     * @param ItemDuration Duration of TS file, unit: second, value ranges from 5 to 30 seconds.

Leave it blank and it defaults to 30 seconds.
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get Recording period, unit: second, value ranges from 10 minutes to 12 hr.

Leave it blank defaults to 10 minutes (3600 seconds). 
     * @return Interval Recording period, unit: second, value ranges from 10 minutes to 12 hr.

Leave it blank defaults to 10 minutes (3600 seconds).
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Recording period, unit: second, value ranges from 10 minutes to 12 hr.

Leave it blank defaults to 10 minutes (3600 seconds).
     * @param Interval Recording period, unit: second, value ranges from 10 minutes to 12 hr.

Leave it blank defaults to 10 minutes (3600 seconds).
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Continuation waiting time, unit: second. Value range: 60 seconds to 1800 seconds.
Leave blank defaults to 0 (recording continuation disabled). 
     * @return ContinueTimeout Continuation waiting time, unit: second. Value range: 60 seconds to 1800 seconds.
Leave blank defaults to 0 (recording continuation disabled).
     */
    public Long getContinueTimeout() {
        return this.ContinueTimeout;
    }

    /**
     * Set Continuation waiting time, unit: second. Value range: 60 seconds to 1800 seconds.
Leave blank defaults to 0 (recording continuation disabled).
     * @param ContinueTimeout Continuation waiting time, unit: second. Value range: 60 seconds to 1800 seconds.
Leave blank defaults to 0 (recording continuation disabled).
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

