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

public class VulTopInfo extends AbstractModel {

    /**
    * Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
     * Get Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulName Vulnerability name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulLevel Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulLevel Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulCount Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulCount Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulId Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulId Vulnerability ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    public VulTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTopInfo(VulTopInfo source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "VulId", this.VulId);

    }
}

