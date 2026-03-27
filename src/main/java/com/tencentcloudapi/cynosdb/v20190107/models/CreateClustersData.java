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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersData extends AbstractModel {

    /**
    * Instance CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance Memory
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Cluster storage limit
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
     * Get Instance CPU 
     * @return Cpu Instance CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Instance CPU
     * @param Cpu Instance CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance Memory 
     * @return Memory Instance Memory
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance Memory
     * @param Memory Instance Memory
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Cluster storage limit 
     * @return StorageLimit Cluster storage limit
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Cluster storage limit
     * @param StorageLimit Cluster storage limit
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    public CreateClustersData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClustersData(CreateClustersData source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);

    }
}

