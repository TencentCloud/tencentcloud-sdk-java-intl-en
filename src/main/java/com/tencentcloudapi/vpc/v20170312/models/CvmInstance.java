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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CvmInstance extends AbstractModel {

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CVM instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CVM Name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * CVM status.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Number of CPU cores in an instance (in core).
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Instance’s memory capacity. Unit: GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * The creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Instance type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance ENI quota (including primary ENIs).
    */
    @SerializedName("EniLimit")
    @Expose
    private Long EniLimit;

    /**
    * Private IP quoata for instance ENIs (including primary ENIs).
    */
    @SerializedName("EniIpLimit")
    @Expose
    private Long EniIpLimit;

    /**
    * The number of ENIs (including primary ENIs) bound to a instance.
    */
    @SerializedName("InstanceEniCount")
    @Expose
    private Long InstanceEniCount;

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance ID. 
     * @return SubnetId Subnet instance ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID.
     * @param SubnetId Subnet instance ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CVM instance ID. 
     * @return InstanceId CVM instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID.
     * @param InstanceId CVM instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CVM Name 
     * @return InstanceName CVM Name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CVM Name
     * @param InstanceName CVM Name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get CVM status. 
     * @return InstanceState CVM status.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set CVM status.
     * @param InstanceState CVM status.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Number of CPU cores in an instance (in core). 
     * @return CPU Number of CPU cores in an instance (in core).
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores in an instance (in core).
     * @param CPU Number of CPU cores in an instance (in core).
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Instance’s memory capacity. Unit: GB. 
     * @return Memory Instance’s memory capacity. Unit: GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance’s memory capacity. Unit: GB.
     * @param Memory Instance’s memory capacity. Unit: GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get The creation time. 
     * @return CreatedTime The creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time.
     * @param CreatedTime The creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Instance type. 
     * @return InstanceType Instance type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.
     * @param InstanceType Instance type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance ENI quota (including primary ENIs). 
     * @return EniLimit Instance ENI quota (including primary ENIs).
     */
    public Long getEniLimit() {
        return this.EniLimit;
    }

    /**
     * Set Instance ENI quota (including primary ENIs).
     * @param EniLimit Instance ENI quota (including primary ENIs).
     */
    public void setEniLimit(Long EniLimit) {
        this.EniLimit = EniLimit;
    }

    /**
     * Get Private IP quoata for instance ENIs (including primary ENIs). 
     * @return EniIpLimit Private IP quoata for instance ENIs (including primary ENIs).
     */
    public Long getEniIpLimit() {
        return this.EniIpLimit;
    }

    /**
     * Set Private IP quoata for instance ENIs (including primary ENIs).
     * @param EniIpLimit Private IP quoata for instance ENIs (including primary ENIs).
     */
    public void setEniIpLimit(Long EniIpLimit) {
        this.EniIpLimit = EniIpLimit;
    }

    /**
     * Get The number of ENIs (including primary ENIs) bound to a instance. 
     * @return InstanceEniCount The number of ENIs (including primary ENIs) bound to a instance.
     */
    public Long getInstanceEniCount() {
        return this.InstanceEniCount;
    }

    /**
     * Set The number of ENIs (including primary ENIs) bound to a instance.
     * @param InstanceEniCount The number of ENIs (including primary ENIs) bound to a instance.
     */
    public void setInstanceEniCount(Long InstanceEniCount) {
        this.InstanceEniCount = InstanceEniCount;
    }

    public CvmInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CvmInstance(CvmInstance source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.EniLimit != null) {
            this.EniLimit = new Long(source.EniLimit);
        }
        if (source.EniIpLimit != null) {
            this.EniIpLimit = new Long(source.EniIpLimit);
        }
        if (source.InstanceEniCount != null) {
            this.InstanceEniCount = new Long(source.InstanceEniCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "EniLimit", this.EniLimit);
        this.setParamSimple(map, prefix + "EniIpLimit", this.EniIpLimit);
        this.setParamSimple(map, prefix + "InstanceEniCount", this.InstanceEniCount);

    }
}

