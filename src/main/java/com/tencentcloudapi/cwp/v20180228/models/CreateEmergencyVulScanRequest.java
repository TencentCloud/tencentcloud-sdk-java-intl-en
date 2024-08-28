/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class CreateEmergencyVulScanRequest extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Array of host UUID strings. This parameter is valid for specified servers.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Scan timeout duration, in seconds.
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Array of host UUID strings. This parameter is valid for specified servers. 
     * @return Uuids Array of host UUID strings. This parameter is valid for specified servers.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Array of host UUID strings. This parameter is valid for specified servers.
     * @param Uuids Array of host UUID strings. This parameter is valid for specified servers.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Scan timeout duration, in seconds. 
     * @return TimeoutPeriod Scan timeout duration, in seconds.
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set Scan timeout duration, in seconds.
     * @param TimeoutPeriod Scan timeout duration, in seconds.
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    public CreateEmergencyVulScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmergencyVulScanRequest(CreateEmergencyVulScanRequest source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);

    }
}

