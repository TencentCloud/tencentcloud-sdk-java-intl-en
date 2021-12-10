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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAccess extends AbstractModel{

    /**
    * Network resource ID, instance ID or RO group ID (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type. Valid values: `1` (instance), `2` (RO group) (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * IPv4 address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * Access port
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Network status. Valid values: `1` (applying), `2` (in use), `3` (deleting), `4` (deleted)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcStatus")
    @Expose
    private Long VpcStatus;

    /**
     * Get Network resource ID, instance ID or RO group ID (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceId Network resource ID, instance ID or RO group ID (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Network resource ID, instance ID or RO group ID (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceId Network resource ID, instance ID or RO group ID (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. Valid values: `1` (instance), `2` (RO group) (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type. Valid values: `1` (instance), `2` (RO group) (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type. Valid values: `1` (instance), `2` (RO group) (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceType Resource type. Valid values: `1` (instance), `2` (RO group) (this field has been deprecated)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get IPv4 address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vip IPv4 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPv4 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vip IPv4 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vip6 IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vip6 IPv6 address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get Access port
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vport Access port
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Access port
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vport Access port
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Network status. Valid values: `1` (applying), `2` (in use), `3` (deleting), `4` (deleted)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcStatus Network status. Valid values: `1` (applying), `2` (in use), `3` (deleting), `4` (deleted)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVpcStatus() {
        return this.VpcStatus;
    }

    /**
     * Set Network status. Valid values: `1` (applying), `2` (in use), `3` (deleting), `4` (deleted)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VpcStatus Network status. Valid values: `1` (applying), `2` (in use), `3` (deleting), `4` (deleted)
Note: this field may return `null`, indicating that no valid values can be obtained.
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

