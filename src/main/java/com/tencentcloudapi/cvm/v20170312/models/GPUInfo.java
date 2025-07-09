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
    * Number of GPUs. 
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("GPUCount")
    @Expose
    private Float GPUCount;

    /**
    * GPU address
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("GPUId")
    @Expose
    private String [] GPUId;

    /**
    * GPU type of the instance.
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
     * Get Number of GPUs. 
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return GPUCount Number of GPUs. 
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Float getGPUCount() {
        return this.GPUCount;
    }

    /**
     * Set Number of GPUs. 
Note: this field may return `null`, indicating that no valid value can be found.
     * @param GPUCount Number of GPUs. 
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setGPUCount(Float GPUCount) {
        this.GPUCount = GPUCount;
    }

    /**
     * Get GPU address
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return GPUId GPU address
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String [] getGPUId() {
        return this.GPUId;
    }

    /**
     * Set GPU address
Note: this field may return `null`, indicating that no valid value can be found.
     * @param GPUId GPU address
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setGPUId(String [] GPUId) {
        this.GPUId = GPUId;
    }

    /**
     * Get GPU type of the instance.
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return GPUType GPU type of the instance.
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU type of the instance.
Note: this field may return `null`, indicating that no valid value can be found.
     * @param GPUType GPU type of the instance.
Note: this field may return `null`, indicating that no valid value can be found.
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

