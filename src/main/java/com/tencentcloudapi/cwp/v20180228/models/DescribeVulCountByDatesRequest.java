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

public class DescribeVulCountByDatesRequest extends AbstractModel {

    /**
    * Number of past days for data query. Subtract 1 from the actual number of days and fill in the value.
    */
    @SerializedName("LastDays")
    @Expose
    private Long [] LastDays;

    /**
    * Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Whether the vulnerabilities are emergency vulnerabilities. yes: yes.
    */
    @SerializedName("IfEmergency")
    @Expose
    private String IfEmergency;

    /**
     * Get Number of past days for data query. Subtract 1 from the actual number of days and fill in the value. 
     * @return LastDays Number of past days for data query. Subtract 1 from the actual number of days and fill in the value.
     */
    public Long [] getLastDays() {
        return this.LastDays;
    }

    /**
     * Set Number of past days for data query. Subtract 1 from the actual number of days and fill in the value.
     * @param LastDays Number of past days for data query. Subtract 1 from the actual number of days and fill in the value.
     */
    public void setLastDays(Long [] LastDays) {
        this.LastDays = LastDays;
    }

    /**
     * Get Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability. 
     * @return VulCategory Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.
     * @param VulCategory Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Whether the vulnerabilities are emergency vulnerabilities. yes: yes. 
     * @return IfEmergency Whether the vulnerabilities are emergency vulnerabilities. yes: yes.
     */
    public String getIfEmergency() {
        return this.IfEmergency;
    }

    /**
     * Set Whether the vulnerabilities are emergency vulnerabilities. yes: yes.
     * @param IfEmergency Whether the vulnerabilities are emergency vulnerabilities. yes: yes.
     */
    public void setIfEmergency(String IfEmergency) {
        this.IfEmergency = IfEmergency;
    }

    public DescribeVulCountByDatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulCountByDatesRequest(DescribeVulCountByDatesRequest source) {
        if (source.LastDays != null) {
            this.LastDays = new Long[source.LastDays.length];
            for (int i = 0; i < source.LastDays.length; i++) {
                this.LastDays[i] = new Long(source.LastDays[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "LastDays.", this.LastDays);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "IfEmergency", this.IfEmergency);

    }
}

