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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>Instance ID list for filtering by instance ID</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Instance name, supports fuzzy matching.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Availability zone code for filtering instances in the specified availability zone</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String [] InstanceStatus;

    /**
    * <p>Public network ID.</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>Public IPv4 address list, used for filtering instances by public IP address</p>
    */
    @SerializedName("PublicIps")
    @Expose
    private String [] PublicIps;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results. Default 20. Maximum 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Instance ID list for filtering by instance ID</p> 
     * @return InstanceIds <p>Instance ID list for filtering by instance ID</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Instance ID list for filtering by instance ID</p>
     * @param InstanceIds <p>Instance ID list for filtering by instance ID</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Instance name, supports fuzzy matching.</p> 
     * @return InstanceName <p>Instance name, supports fuzzy matching.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name, supports fuzzy matching.</p>
     * @param InstanceName <p>Instance name, supports fuzzy matching.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Availability zone code for filtering instances in the specified availability zone</p> 
     * @return Zone <p>Availability zone code for filtering instances in the specified availability zone</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone code for filtering instances in the specified availability zone</p>
     * @param Zone <p>Availability zone code for filtering instances in the specified availability zone</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.</p> 
     * @return InstanceStatus <p>Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.</p>
     */
    public String [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.</p>
     * @param InstanceStatus <p>Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.</p>
     */
    public void setInstanceStatus(String [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Public network ID.</p> 
     * @return PublicNetworkId <p>Public network ID.</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>Public network ID.</p>
     * @param PublicNetworkId <p>Public network ID.</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return PrivateNetworkId <p>VPC ID.</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param PrivateNetworkId <p>VPC ID.</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>Public IPv4 address list, used for filtering instances by public IP address</p> 
     * @return PublicIps <p>Public IPv4 address list, used for filtering instances by public IP address</p>
     */
    public String [] getPublicIps() {
        return this.PublicIps;
    }

    /**
     * Set <p>Public IPv4 address list, used for filtering instances by public IP address</p>
     * @param PublicIps <p>Public IPv4 address list, used for filtering instances by public IP address</p>
     */
    public void setPublicIps(String [] PublicIps) {
        this.PublicIps = PublicIps;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results. Default 20. Maximum 100.</p> 
     * @return Limit <p>Number of returned results. Default 20. Maximum 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. Default 20. Maximum 100.</p>
     * @param Limit <p>Number of returned results. Default 20. Maximum 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new String(source.InstanceStatus[i]);
            }
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PublicIps != null) {
            this.PublicIps = new String[source.PublicIps.length];
            for (int i = 0; i < source.PublicIps.length; i++) {
                this.PublicIps[i] = new String(source.PublicIps[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamArraySimple(map, prefix + "PublicIps.", this.PublicIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

