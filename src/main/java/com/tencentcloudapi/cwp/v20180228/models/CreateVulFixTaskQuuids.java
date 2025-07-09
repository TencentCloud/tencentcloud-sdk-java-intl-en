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

public class CreateVulFixTaskQuuids extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Hosts that need to fix vulnerabilities. All hosts need to have the vulnerability with the ID of VulId and be in a pending fix status.
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 
    */
    @SerializedName("FixMethod")
    @Expose
    private Long FixMethod;

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
     * Get Hosts that need to fix vulnerabilities. All hosts need to have the vulnerability with the ID of VulId and be in a pending fix status. 
     * @return Quuids Hosts that need to fix vulnerabilities. All hosts need to have the vulnerability with the ID of VulId and be in a pending fix status.
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Hosts that need to fix vulnerabilities. All hosts need to have the vulnerability with the ID of VulId and be in a pending fix status.
     * @param Quuids Hosts that need to fix vulnerabilities. All hosts need to have the vulnerability with the ID of VulId and be in a pending fix status.
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get  
     * @return FixMethod 
     */
    public Long getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 
     * @param FixMethod 
     */
    public void setFixMethod(Long FixMethod) {
        this.FixMethod = FixMethod;
    }

    public CreateVulFixTaskQuuids() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulFixTaskQuuids(CreateVulFixTaskQuuids source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.FixMethod != null) {
            this.FixMethod = new Long(source.FixMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);

    }
}

