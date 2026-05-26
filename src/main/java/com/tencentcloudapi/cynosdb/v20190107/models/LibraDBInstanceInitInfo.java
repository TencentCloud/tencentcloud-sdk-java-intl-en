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

public class LibraDBInstanceInitInfo extends AbstractModel {

    /**
    * cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * memory
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * hard disk
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * Storage type
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance version
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * Instance count
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnet id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Number of instance replicas to purchase
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
     * Get cpu 
     * @return Cpu cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu
     * @param Cpu cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get memory 
     * @return Memory memory
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set memory
     * @param Memory memory
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get hard disk 
     * @return StorageSize hard disk
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set hard disk
     * @param StorageSize hard disk
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get Storage type 
     * @return StorageType Storage type
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type
     * @param StorageType Storage type
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance version 
     * @return LibraDBVersion Instance version
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set Instance version
     * @param LibraDBVersion Instance version
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get Instance count 
     * @return InstanceCount Instance count
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Instance count
     * @param InstanceCount Instance count
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnet id 
     * @return SubnetId subnet id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnet id
     * @param SubnetId subnet id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Number of instance replicas to purchase 
     * @return ReplicasNum Number of instance replicas to purchase
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set Number of instance replicas to purchase
     * @param ReplicasNum Number of instance replicas to purchase
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    public LibraDBInstanceInitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBInstanceInitInfo(LibraDBInstanceInitInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);

    }
}

