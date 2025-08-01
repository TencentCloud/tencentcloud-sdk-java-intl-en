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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceCpuRateInfo extends AbstractModel {

    /**
    * CPU core number
    */
    @SerializedName("CpuCore")
    @Expose
    private Long CpuCore;

    /**
    * CPU utilization
    */
    @SerializedName("Rate")
    @Expose
    private Long [] Rate;

    /**
     * Get CPU core number 
     * @return CpuCore CPU core number
     */
    public Long getCpuCore() {
        return this.CpuCore;
    }

    /**
     * Set CPU core number
     * @param CpuCore CPU core number
     */
    public void setCpuCore(Long CpuCore) {
        this.CpuCore = CpuCore;
    }

    /**
     * Get CPU utilization 
     * @return Rate CPU utilization
     */
    public Long [] getRate() {
        return this.Rate;
    }

    /**
     * Set CPU utilization
     * @param Rate CPU utilization
     */
    public void setRate(Long [] Rate) {
        this.Rate = Rate;
    }

    public DeviceCpuRateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCpuRateInfo(DeviceCpuRateInfo source) {
        if (source.CpuCore != null) {
            this.CpuCore = new Long(source.CpuCore);
        }
        if (source.Rate != null) {
            this.Rate = new Long[source.Rate.length];
            for (int i = 0; i < source.Rate.length; i++) {
                this.Rate[i] = new Long(source.Rate[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuCore", this.CpuCore);
        this.setParamArraySimple(map, prefix + "Rate.", this.Rate);

    }
}

