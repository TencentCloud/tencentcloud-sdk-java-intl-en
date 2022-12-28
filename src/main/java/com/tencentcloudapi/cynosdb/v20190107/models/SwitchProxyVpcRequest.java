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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchProxyVpcRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * VPC ID in string
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet ID in string
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Valid hours of old IP
    */
    @SerializedName("OldIpReserveHours")
    @Expose
    private Long OldIpReserveHours;

    /**
    * Database proxy group ID (required), which can be obtained through the `DescribeProxies` API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get VPC ID in string 
     * @return UniqVpcId VPC ID in string
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID in string
     * @param UniqVpcId VPC ID in string
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet ID in string 
     * @return UniqSubnetId Subnet ID in string
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID in string
     * @param UniqSubnetId Subnet ID in string
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Valid hours of old IP 
     * @return OldIpReserveHours Valid hours of old IP
     */
    public Long getOldIpReserveHours() {
        return this.OldIpReserveHours;
    }

    /**
     * Set Valid hours of old IP
     * @param OldIpReserveHours Valid hours of old IP
     */
    public void setOldIpReserveHours(Long OldIpReserveHours) {
        this.OldIpReserveHours = OldIpReserveHours;
    }

    /**
     * Get Database proxy group ID (required), which can be obtained through the `DescribeProxies` API. 
     * @return ProxyGroupId Database proxy group ID (required), which can be obtained through the `DescribeProxies` API.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy group ID (required), which can be obtained through the `DescribeProxies` API.
     * @param ProxyGroupId Database proxy group ID (required), which can be obtained through the `DescribeProxies` API.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    public SwitchProxyVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchProxyVpcRequest(SwitchProxyVpcRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.OldIpReserveHours != null) {
            this.OldIpReserveHours = new Long(source.OldIpReserveHours);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "OldIpReserveHours", this.OldIpReserveHours);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);

    }
}

