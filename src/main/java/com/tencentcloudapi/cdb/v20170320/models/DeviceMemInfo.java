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

public class DeviceMemInfo extends AbstractModel {

    /**
    * Total memory size in KB, which is the value of `total` in the `Mem:` in the `free` command
    */
    @SerializedName("Total")
    @Expose
    private Long [] Total;

    /**
    * Used memory size in KB, which is the value of `used` in the `Mem:` row in the `free` command
    */
    @SerializedName("Used")
    @Expose
    private Long [] Used;

    /**
     * Get Total memory size in KB, which is the value of `total` in the `Mem:` in the `free` command 
     * @return Total Total memory size in KB, which is the value of `total` in the `Mem:` in the `free` command
     */
    public Long [] getTotal() {
        return this.Total;
    }

    /**
     * Set Total memory size in KB, which is the value of `total` in the `Mem:` in the `free` command
     * @param Total Total memory size in KB, which is the value of `total` in the `Mem:` in the `free` command
     */
    public void setTotal(Long [] Total) {
        this.Total = Total;
    }

    /**
     * Get Used memory size in KB, which is the value of `used` in the `Mem:` row in the `free` command 
     * @return Used Used memory size in KB, which is the value of `used` in the `Mem:` row in the `free` command
     */
    public Long [] getUsed() {
        return this.Used;
    }

    /**
     * Set Used memory size in KB, which is the value of `used` in the `Mem:` row in the `free` command
     * @param Used Used memory size in KB, which is the value of `used` in the `Mem:` row in the `free` command
     */
    public void setUsed(Long [] Used) {
        this.Used = Used;
    }

    public DeviceMemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceMemInfo(DeviceMemInfo source) {
        if (source.Total != null) {
            this.Total = new Long[source.Total.length];
            for (int i = 0; i < source.Total.length; i++) {
                this.Total[i] = new Long(source.Total[i]);
            }
        }
        if (source.Used != null) {
            this.Used = new Long[source.Used.length];
            for (int i = 0; i < source.Used.length; i++) {
                this.Used[i] = new Long(source.Used[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Total.", this.Total);
        this.setParamArraySimple(map, prefix + "Used.", this.Used);

    }
}

