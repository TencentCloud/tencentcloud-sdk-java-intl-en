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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUInfo extends AbstractModel {

    /**
    * Specifies the GPU count of the instance. a value less than 1 indicates VGPU type, and a value larger than 1 indicates GPU passthrough type.
    */
    @SerializedName("GPUCount")
    @Expose
    private Float GPUCount;

    /**
    * Specifies the GPU address of the instance.
    */
    @SerializedName("GPUId")
    @Expose
    private String [] GPUId;

    /**
    * Specifies the GPU type of the instance.
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
     * Get Specifies the GPU count of the instance. a value less than 1 indicates VGPU type, and a value larger than 1 indicates GPU passthrough type. 
     * @return GPUCount Specifies the GPU count of the instance. a value less than 1 indicates VGPU type, and a value larger than 1 indicates GPU passthrough type.
     */
    public Float getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set Specifies the GPU count of the instance. a value less than 1 indicates VGPU type, and a value larger than 1 indicates GPU passthrough type.
     * @param GPUCount Specifies the GPU count of the instance. a value less than 1 indicates VGPU type, and a value larger than 1 indicates GPU passthrough type.
     */
    public void setGPUCount(Float GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get Specifies the GPU address of the instance. 
     * @return GPUId Specifies the GPU address of the instance.
     */
    public String [] getGPUId() {
        return this.GPUId;
    }

    /**
     * Set Specifies the GPU address of the instance.
     * @param GPUId Specifies the GPU address of the instance.
     */
    public void setGPUId(String [] GPUId) {
        this.GPUId = GPUId;
    }

    /**
     * Get Specifies the GPU type of the instance. 
     * @return GPUType Specifies the GPU type of the instance.
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set Specifies the GPU type of the instance.
     * @param GPUType Specifies the GPU type of the instance.
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public GPUInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUInfo(GPUInfo source) {
        if (source.GPUCount != null) {
            this.GPUCount = new Float(source.GPUCount);
        }
        if (source.GPUId != null) {
            this.GPUId = new String[source.GPUId.length];
            for (int i = 0; i < source.GPUId.length; i++) {
                this.GPUId[i] = new String(source.GPUId[i]);
            }
        }
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUCount", this.GPUCount);
        this.setParamArraySimple(map, prefix + "GPUId.", this.GPUId);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);

    }
}

