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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckEdgeClusterCIDRRequest extends AbstractModel {

    /**
    * Cluster VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Cluster Pod CIDR block
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * Cluster service CIDR block
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
     * Get Cluster VPC ID 
     * @return VpcId Cluster VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Cluster VPC ID
     * @param VpcId Cluster VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Cluster Pod CIDR block 
     * @return PodCIDR Cluster Pod CIDR block
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set Cluster Pod CIDR block
     * @param PodCIDR Cluster Pod CIDR block
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get Cluster service CIDR block 
     * @return ServiceCIDR Cluster service CIDR block
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set Cluster service CIDR block
     * @param ServiceCIDR Cluster service CIDR block
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    public CheckEdgeClusterCIDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckEdgeClusterCIDRRequest(CheckEdgeClusterCIDRRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);

    }
}

