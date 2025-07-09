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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulLevelInfo extends AbstractModel {

    /**
    * // Severity level: 1 - low-risk; 2 - medium-risk; 3 - high-risk; 4 - critical
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * Quantity
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get // Severity level: 1 - low-risk; 2 - medium-risk; 3 - high-risk; 4 - critical 
     * @return VulLevel // Severity level: 1 - low-risk; 2 - medium-risk; 3 - high-risk; 4 - critical
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set // Severity level: 1 - low-risk; 2 - medium-risk; 3 - high-risk; 4 - critical
     * @param VulLevel // Severity level: 1 - low-risk; 2 - medium-risk; 3 - high-risk; 4 - critical
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get Quantity 
     * @return Count Quantity
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity
     * @param Count Quantity
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public VulLevelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulLevelInfo(VulLevelInfo source) {
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

