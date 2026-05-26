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

public class CreateReadOnlyGroupRequest extends AbstractModel {

    /**
    * Primary instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project ID. default value is 0, means it belongs to the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Delay time size switch: 0 for off, 1 for on. this parameter is required.
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

    /**
    * Delay space size switch: 0 for off, 1 for on. this parameter must match ReplayLagEliminate.
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * The size threshold of the delay time, a positive integer with unit: s. this parameter is required when ReplayLagEliminate is 1 and must be set to 0 when ReplayLagEliminate is 0.
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Long MaxReplayLag;

    /**
    * Delay threshold for space size, a positive integer in MB. this parameter is required when ReplayLatencyEliminate is 1 and must be set to 0 when ReplayLatencyEliminate is 0.
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * Specifies the minimum number of instances to retain with delay removal. value range [0,100]. this parameter is required when ReplayLatencyEliminate is 1 and invalid when ReplayLagEliminate is 0.
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Primary instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return MasterDBInstanceId Primary instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set Primary instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param MasterDBInstanceId Primary instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60. 
     * @return Name Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     * @param Name Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project ID. default value is 0, means it belongs to the default project. 
     * @return ProjectId Project ID. default value is 0, means it belongs to the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. default value is 0, means it belongs to the default project.
     * @param ProjectId Project ID. default value is 0, means it belongs to the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required. 
     * @return VpcId VPC ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     * @param VpcId VPC ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required. 
     * @return SubnetId Subnet ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     * @param SubnetId Subnet ID. note: uses classic networks by default. currently, basic networks are not supported, so this parameter is required.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Delay time size switch: 0 for off, 1 for on. this parameter is required. 
     * @return ReplayLagEliminate Delay time size switch: 0 for off, 1 for on. this parameter is required.
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set Delay time size switch: 0 for off, 1 for on. this parameter is required.
     * @param ReplayLagEliminate Delay time size switch: 0 for off, 1 for on. this parameter is required.
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
    }

    /**
     * Get Delay space size switch: 0 for off, 1 for on. this parameter must match ReplayLagEliminate. 
     * @return ReplayLatencyEliminate Delay space size switch: 0 for off, 1 for on. this parameter must match ReplayLagEliminate.
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set Delay space size switch: 0 for off, 1 for on. this parameter must match ReplayLagEliminate.
     * @param ReplayLatencyEliminate Delay space size switch: 0 for off, 1 for on. this parameter must match ReplayLagEliminate.
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get The size threshold of the delay time, a positive integer with unit: s. this parameter is required when ReplayLagEliminate is 1 and must be set to 0 when ReplayLagEliminate is 0. 
     * @return MaxReplayLag The size threshold of the delay time, a positive integer with unit: s. this parameter is required when ReplayLagEliminate is 1 and must be set to 0 when ReplayLagEliminate is 0.
     */
    public Long getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set The size threshold of the delay time, a positive integer with unit: s. this parameter is required when ReplayLagEliminate is 1 and must be set to 0 when ReplayLagEliminate is 0.
     * @param MaxReplayLag The size threshold of the delay time, a positive integer with unit: s. this parameter is required when ReplayLagEliminate is 1 and must be set to 0 when ReplayLagEliminate is 0.
     */
    public void setMaxReplayLag(Long MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get Delay threshold for space size, a positive integer in MB. this parameter is required when ReplayLatencyEliminate is 1 and must be set to 0 when ReplayLatencyEliminate is 0. 
     * @return MaxReplayLatency Delay threshold for space size, a positive integer in MB. this parameter is required when ReplayLatencyEliminate is 1 and must be set to 0 when ReplayLatencyEliminate is 0.
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set Delay threshold for space size, a positive integer in MB. this parameter is required when ReplayLatencyEliminate is 1 and must be set to 0 when ReplayLatencyEliminate is 0.
     * @param MaxReplayLatency Delay threshold for space size, a positive integer in MB. this parameter is required when ReplayLatencyEliminate is 1 and must be set to 0 when ReplayLatencyEliminate is 0.
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get Specifies the minimum number of instances to retain with delay removal. value range [0,100]. this parameter is required when ReplayLatencyEliminate is 1 and invalid when ReplayLagEliminate is 0. 
     * @return MinDelayEliminateReserve Specifies the minimum number of instances to retain with delay removal. value range [0,100]. this parameter is required when ReplayLatencyEliminate is 1 and invalid when ReplayLagEliminate is 0.
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set Specifies the minimum number of instances to retain with delay removal. value range [0,100]. this parameter is required when ReplayLatencyEliminate is 1 and invalid when ReplayLagEliminate is 0.
     * @param MinDelayEliminateReserve Specifies the minimum number of instances to retain with delay removal. value range [0,100]. this parameter is required when ReplayLatencyEliminate is 1 and invalid when ReplayLagEliminate is 0.
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupIds Security group ID
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupIds Security group ID
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateReadOnlyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyGroupRequest(CreateReadOnlyGroupRequest source) {
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Long(source.MaxReplayLag);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

