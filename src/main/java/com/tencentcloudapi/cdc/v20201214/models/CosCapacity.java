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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCapacity extends AbstractModel {

    /**
    * Total capacity, in GB
    */
    @SerializedName("TotalCapacity")
    @Expose
    private Float TotalCapacity;

    /**
    * Available capacity, in GB
    */
    @SerializedName("TotalFreeCapacity")
    @Expose
    private Float TotalFreeCapacity;

    /**
    * Used capacity, in GB
    */
    @SerializedName("TotalUsedCapacity")
    @Expose
    private Float TotalUsedCapacity;

    /**
     * Get Total capacity, in GB 
     * @return TotalCapacity Total capacity, in GB
     */
    public Float getTotalCapacity() {
        return this.TotalCapacity;
    }

    /**
     * Set Total capacity, in GB
     * @param TotalCapacity Total capacity, in GB
     */
    public void setTotalCapacity(Float TotalCapacity) {
        this.TotalCapacity = TotalCapacity;
    }

    /**
     * Get Available capacity, in GB 
     * @return TotalFreeCapacity Available capacity, in GB
     */
    public Float getTotalFreeCapacity() {
        return this.TotalFreeCapacity;
    }

    /**
     * Set Available capacity, in GB
     * @param TotalFreeCapacity Available capacity, in GB
     */
    public void setTotalFreeCapacity(Float TotalFreeCapacity) {
        this.TotalFreeCapacity = TotalFreeCapacity;
    }

    /**
     * Get Used capacity, in GB 
     * @return TotalUsedCapacity Used capacity, in GB
     */
    public Float getTotalUsedCapacity() {
        return this.TotalUsedCapacity;
    }

    /**
     * Set Used capacity, in GB
     * @param TotalUsedCapacity Used capacity, in GB
     */
    public void setTotalUsedCapacity(Float TotalUsedCapacity) {
        this.TotalUsedCapacity = TotalUsedCapacity;
    }

    public CosCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCapacity(CosCapacity source) {
        if (source.TotalCapacity != null) {
            this.TotalCapacity = new Float(source.TotalCapacity);
        }
        if (source.TotalFreeCapacity != null) {
            this.TotalFreeCapacity = new Float(source.TotalFreeCapacity);
        }
        if (source.TotalUsedCapacity != null) {
            this.TotalUsedCapacity = new Float(source.TotalUsedCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCapacity", this.TotalCapacity);
        this.setParamSimple(map, prefix + "TotalFreeCapacity", this.TotalFreeCapacity);
        this.setParamSimple(map, prefix + "TotalUsedCapacity", this.TotalUsedCapacity);

    }
}

