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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackInstanceInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * VPC information
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet information.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vip information.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Specifies the vport information.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CPU Size
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory Size
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Storage size
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

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
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get VPC information 
     * @return UniqVpcId VPC information
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC information
     * @param UniqVpcId VPC information
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet information. 
     * @return UniqSubnetId Subnet information.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet information.
     * @param UniqSubnetId Subnet information.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vip information. 
     * @return Vip vip information.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip information.
     * @param Vip vip information.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Specifies the vport information. 
     * @return Vport Specifies the vport information.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Specifies the vport information.
     * @param Vport Specifies the vport information.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CPU Size 
     * @return Cpu CPU Size
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU Size
     * @param Cpu CPU Size
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory Size 
     * @return Mem Memory Size
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory Size
     * @param Mem Memory Size
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Storage size 
     * @return StorageLimit Storage size
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage size
     * @param StorageLimit Storage size
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    public RollbackInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackInstanceInfo(RollbackInstanceInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);

    }
}

