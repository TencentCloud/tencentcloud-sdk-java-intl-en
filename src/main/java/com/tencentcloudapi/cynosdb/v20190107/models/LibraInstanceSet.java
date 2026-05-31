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

public class LibraInstanceSet extends AbstractModel {

    /**
    * Database schema
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * Number of CPU cores
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * Instance type
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * Group ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * memory
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Payment mode
    */
    @SerializedName("InstancePayMode")
    @Expose
    private Long InstancePayMode;

    /**
    * Payment end time
    */
    @SerializedName("InstancePeriodEndTime")
    @Expose
    private String InstancePeriodEndTime;

    /**
    * Instance role
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Instance status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Instance status description
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * Network type.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Subnet ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vpcid
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Virtual IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Virtual port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Public network region
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP address
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Public network port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Public network status
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * hard disk
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * Hard disk type.
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
     * Get Database schema 
     * @return DbMode Database schema
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database schema
     * @param DbMode Database schema
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get Number of CPU cores 
     * @return InstanceCpu Number of CPU cores
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set Number of CPU cores
     * @param InstanceCpu Number of CPU cores
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get Instance type 
     * @return InstanceDeviceType Instance type
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set Instance type
     * @param InstanceDeviceType Instance type
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get Group ID 
     * @return InstanceGroupId Group ID
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Group ID
     * @param InstanceGroupId Group ID
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get memory 
     * @return InstanceMemory memory
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set memory
     * @param InstanceMemory memory
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Payment mode 
     * @return InstancePayMode Payment mode
     */
    public Long getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set Payment mode
     * @param InstancePayMode Payment mode
     */
    public void setInstancePayMode(Long InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get Payment end time 
     * @return InstancePeriodEndTime Payment end time
     */
    public String getInstancePeriodEndTime() {
        return this.InstancePeriodEndTime;
    }

    /**
     * Set Payment end time
     * @param InstancePeriodEndTime Payment end time
     */
    public void setInstancePeriodEndTime(String InstancePeriodEndTime) {
        this.InstancePeriodEndTime = InstancePeriodEndTime;
    }

    /**
     * Get Instance role 
     * @return InstanceRole Instance role
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance role
     * @param InstanceRole Instance role
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Instance status 
     * @return InstanceStatus Instance status
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
     * @param InstanceStatus Instance status
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Instance status description 
     * @return InstanceStatusDesc Instance status description
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set Instance status description
     * @param InstanceStatusDesc Instance status description
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get Network type. 
     * @return NetType Network type.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type.
     * @param NetType Network type.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Subnet ID 
     * @return UniqSubnetId Subnet ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID
     * @param UniqSubnetId Subnet ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vpcid 
     * @return UniqVpcId vpcid
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpcid
     * @param UniqVpcId vpcid
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Virtual IP 
     * @return Vip Virtual IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Virtual IP
     * @param Vip Virtual IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Virtual port 
     * @return Vport Virtual port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Virtual port
     * @param Vport Virtual port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Public network region 
     * @return WanDomain Public network region
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public network region
     * @param WanDomain Public network region
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP address 
     * @return WanIP Public IP address
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set Public IP address
     * @param WanIP Public IP address
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get Public network port 
     * @return WanPort Public network port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port
     * @param WanPort Public network port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Public network status 
     * @return WanStatus Public network status
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network status
     * @param WanStatus Public network status
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get hard disk 
     * @return InstanceStorage hard disk
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set hard disk
     * @param InstanceStorage hard disk
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get Hard disk type. 
     * @return InstanceStorageType Hard disk type.
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set Hard disk type.
     * @param InstanceStorageType Hard disk type.
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    public LibraInstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraInstanceSet(LibraInstanceSet source) {
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new Long(source.InstancePayMode);
        }
        if (source.InstancePeriodEndTime != null) {
            this.InstancePeriodEndTime = new String(source.InstancePeriodEndTime);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "InstancePeriodEndTime", this.InstancePeriodEndTime);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);

    }
}

