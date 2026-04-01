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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAccess extends AbstractModel {

    /**
    * Network resource id, instance id, or RO group id.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type. valid values: 1 (instance), 2 (RO group).
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * VPC ID. specifies the ID of the virtual private cloud.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * IPv4 Address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPv6 Address
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * Specifies the access port.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Network status. valid values: 1-applying, 2-active, 3-deleting, 4-deleted.
    */
    @SerializedName("VpcStatus")
    @Expose
    private Long VpcStatus;

    /**
     * Get Network resource id, instance id, or RO group id. 
     * @return ResourceId Network resource id, instance id, or RO group id.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Network resource id, instance id, or RO group id.
     * @param ResourceId Network resource id, instance id, or RO group id.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. valid values: 1 (instance), 2 (RO group). 
     * @return ResourceType Resource type. valid values: 1 (instance), 2 (RO group).
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type. valid values: 1 (instance), 2 (RO group).
     * @param ResourceType Resource type. valid values: 1 (instance), 2 (RO group).
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get VPC ID. specifies the ID of the virtual private cloud. 
     * @return VpcId VPC ID. specifies the ID of the virtual private cloud.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. specifies the ID of the virtual private cloud.
     * @param VpcId VPC ID. specifies the ID of the virtual private cloud.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get IPv4 Address 
     * @return Vip IPv4 Address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPv4 Address
     * @param Vip IPv4 Address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPv6 Address 
     * @return Vip6 IPv6 Address
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set IPv6 Address
     * @param Vip6 IPv6 Address
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get Specifies the access port. 
     * @return Vport Specifies the access port.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Specifies the access port.
     * @param Vport Specifies the access port.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Network status. valid values: 1-applying, 2-active, 3-deleting, 4-deleted. 
     * @return VpcStatus Network status. valid values: 1-applying, 2-active, 3-deleting, 4-deleted.
     */
    public Long getVpcStatus() {
        return this.VpcStatus;
    }

    /**
     * Set Network status. valid values: 1-applying, 2-active, 3-deleting, 4-deleted.
     * @param VpcStatus Network status. valid values: 1-applying, 2-active, 3-deleting, 4-deleted.
     */
    public void setVpcStatus(Long VpcStatus) {
        this.VpcStatus = VpcStatus;
    }

    public NetworkAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAccess(NetworkAccess source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcStatus != null) {
            this.VpcStatus = new Long(source.VpcStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcStatus", this.VpcStatus);

    }
}

