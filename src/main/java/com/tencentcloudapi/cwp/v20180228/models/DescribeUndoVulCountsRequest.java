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

public class DescribeUndoVulCountsRequest extends AbstractModel {

    /**
    * Vulnerability category. 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Whether to apply emergency vulnerability detection: YES - yes
    */
    @SerializedName("IfEmergency")
    @Expose
    private String IfEmergency;

    /**
     * Get Vulnerability category. 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities 
     * @return VulCategory Vulnerability category. 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability category. 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities
     * @param VulCategory Vulnerability category. 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Whether to apply emergency vulnerability detection: YES - yes 
     * @return IfEmergency Whether to apply emergency vulnerability detection: YES - yes
     */
    public String getIfEmergency() {
        return this.IfEmergency;
    }

    /**
     * Set Whether to apply emergency vulnerability detection: YES - yes
     * @param IfEmergency Whether to apply emergency vulnerability detection: YES - yes
     */
    public void setIfEmergency(String IfEmergency) {
        this.IfEmergency = IfEmergency;
    }

    public DescribeUndoVulCountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUndoVulCountsRequest(DescribeUndoVulCountsRequest source) {
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.IfEmergency != null) {
            this.IfEmergency = new String(source.IfEmergency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "IfEmergency", this.IfEmergency);

    }
}

