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

public class DeviceCpuInfo extends AbstractModel {

    /**
    * Average instance CPU utilization
    */
    @SerializedName("Rate")
    @Expose
    private DeviceCpuRateInfo [] Rate;

    /**
    * CPU monitoring data of the instance
    */
    @SerializedName("Load")
    @Expose
    private Long [] Load;

    /**
     * Get Average instance CPU utilization 
     * @return Rate Average instance CPU utilization
     */
    public DeviceCpuRateInfo [] getRate() {
        return this.Rate;
    }

    /**
     * Set Average instance CPU utilization
     * @param Rate Average instance CPU utilization
     */
    public void setRate(DeviceCpuRateInfo [] Rate) {
        this.Rate = Rate;
    }

    /**
     * Get CPU monitoring data of the instance 
     * @return Load CPU monitoring data of the instance
     */
    public Long [] getLoad() {
        return this.Load;
    }

    /**
     * Set CPU monitoring data of the instance
     * @param Load CPU monitoring data of the instance
     */
    public void setLoad(Long [] Load) {
        this.Load = Load;
    }

    public DeviceCpuInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCpuInfo(DeviceCpuInfo source) {
        if (source.Rate != null) {
            this.Rate = new DeviceCpuRateInfo[source.Rate.length];
            for (int i = 0; i < source.Rate.length; i++) {
                this.Rate[i] = new DeviceCpuRateInfo(source.Rate[i]);
            }
        }
        if (source.Load != null) {
            this.Load = new Long[source.Load.length];
            for (int i = 0; i < source.Load.length; i++) {
                this.Load[i] = new Long(source.Load[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rate.", this.Rate);
        this.setParamArraySimple(map, prefix + "Load.", this.Load);

    }
}

