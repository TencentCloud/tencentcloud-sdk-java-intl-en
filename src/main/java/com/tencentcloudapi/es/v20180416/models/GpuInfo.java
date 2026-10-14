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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GpuInfo extends AbstractModel {

    /**
    * Number of Gpu blocks
    */
    @SerializedName("GpuCount")
    @Expose
    private Long GpuCount;

    /**
    * GPU type.
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
     * Get Number of Gpu blocks 
     * @return GpuCount Number of Gpu blocks
     */
    public Long getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set Number of Gpu blocks
     * @param GpuCount Number of Gpu blocks
     */
    public void setGpuCount(Long GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get GPU type. 
     * @return GpuType GPU type.
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU type.
     * @param GpuType GPU type.
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    public GpuInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GpuInfo(GpuInfo source) {
        if (source.GpuCount != null) {
            this.GpuCount = new Long(source.GpuCount);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);

    }
}

