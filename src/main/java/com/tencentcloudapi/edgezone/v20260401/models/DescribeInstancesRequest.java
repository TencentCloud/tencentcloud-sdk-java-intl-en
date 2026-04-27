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
    * Instance ID list for filtering by instance ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance name, supports fuzzy matching
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Availability zone code for filtering instances in the specified availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String [] InstanceStatus;

    /**
    * Public IPv4 address list, used for filtering instances by public IP address
    */
    @SerializedName("PublicIps")
    @Expose
    private String [] PublicIps;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default 20. Maximum 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID list for filtering by instance ID 
     * @return InstanceIds Instance ID list for filtering by instance ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list for filtering by instance ID
     * @param InstanceIds Instance ID list for filtering by instance ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Instance name, supports fuzzy matching 
     * @return InstanceName Instance name, supports fuzzy matching
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, supports fuzzy matching
     * @param InstanceName Instance name, supports fuzzy matching
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Availability zone code for filtering instances in the specified availability zone 
     * @return Zone Availability zone code for filtering instances in the specified availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code for filtering instances in the specified availability zone
     * @param Zone Availability zone code for filtering instances in the specified availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error. 
     * @return InstanceStatus Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.
     */
    public String [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.
     * @param InstanceStatus Instance status list for status filtering. Available values: allocating, running, isolating, isolated, terminating, error.
     */
    public void setInstanceStatus(String [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Public IPv4 address list, used for filtering instances by public IP address 
     * @return PublicIps Public IPv4 address list, used for filtering instances by public IP address
     */
    public String [] getPublicIps() {
        return this.PublicIps;
    }

    /**
     * Set Public IPv4 address list, used for filtering instances by public IP address
     * @param PublicIps Public IPv4 address list, used for filtering instances by public IP address
     */
    public void setPublicIps(String [] PublicIps) {
        this.PublicIps = PublicIps;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default 20. Maximum 100. 
     * @return Limit Number of returned results. Default 20. Maximum 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default 20. Maximum 100.
     * @param Limit Number of returned results. Default 20. Maximum 100.
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
        this.setParamArraySimple(map, prefix + "PublicIps.", this.PublicIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

