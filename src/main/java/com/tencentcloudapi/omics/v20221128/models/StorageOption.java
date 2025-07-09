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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOption extends AbstractModel {

    /**
    * CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * CFS availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CFS capacity in GiB, required for the Turbo series
- Standard Turbo has a minimum capacity of 40 TiB, or 40,960 GiB; the capacity expansion step is 20 TiB, or 20,480 GiB.
- High-performance Turbo has a minimum capacity of 20 TiB, or 20,480 GiB; the capacity expansion step is 10 TiB, or 10,240 GiB.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
     * Get CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo 
     * @return StorageType CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     * @param StorageType CFS type. Valid values:
- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get CFS availability zone 
     * @return Zone CFS availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set CFS availability zone
     * @param Zone CFS availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CFS capacity in GiB, required for the Turbo series
- Standard Turbo has a minimum capacity of 40 TiB, or 40,960 GiB; the capacity expansion step is 20 TiB, or 20,480 GiB.
- High-performance Turbo has a minimum capacity of 20 TiB, or 20,480 GiB; the capacity expansion step is 10 TiB, or 10,240 GiB. 
     * @return Capacity CFS capacity in GiB, required for the Turbo series
- Standard Turbo has a minimum capacity of 40 TiB, or 40,960 GiB; the capacity expansion step is 20 TiB, or 20,480 GiB.
- High-performance Turbo has a minimum capacity of 20 TiB, or 20,480 GiB; the capacity expansion step is 10 TiB, or 10,240 GiB.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set CFS capacity in GiB, required for the Turbo series
- Standard Turbo has a minimum capacity of 40 TiB, or 40,960 GiB; the capacity expansion step is 20 TiB, or 20,480 GiB.
- High-performance Turbo has a minimum capacity of 20 TiB, or 20,480 GiB; the capacity expansion step is 10 TiB, or 10,240 GiB.
     * @param Capacity CFS capacity in GiB, required for the Turbo series
- Standard Turbo has a minimum capacity of 40 TiB, or 40,960 GiB; the capacity expansion step is 20 TiB, or 20,480 GiB.
- High-performance Turbo has a minimum capacity of 20 TiB, or 20,480 GiB; the capacity expansion step is 10 TiB, or 10,240 GiB.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    public StorageOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOption(StorageOption source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);

    }
}

