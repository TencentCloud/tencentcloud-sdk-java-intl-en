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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo extends AbstractModel{

    /**
    * Instance specification ID. The `SpecId` returned by `DescribeZones` together with the purchasable specification information returned by `DescribeProductConfig` can be used to find out what specifications can be purchased in a specified AZ
    */
    @SerializedName("SpecId")
    @Expose
    private Long SpecId;

    /**
    * Model ID
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Model name
    */
    @SerializedName("MachineTypeName")
    @Expose
    private String MachineTypeName;

    /**
    * Database version information. Valid values: 2008R2 (SQL Server 2008 Enterprise), 2012SP3 (SQL Server 2012 Enterprise), 2016SP1 (SQL Server 2016 Enterprise), 201602 (SQL Server 2016 Standard), 2017 (SQL Server 2017 Enterprise)
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version name corresponding to the `Version` field
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of CPU cores
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Minimum disk size under this specification in GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * Maximum disk size under this specification in GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * QPS of this specification
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
    * Description of this specification
    */
    @SerializedName("SuitInfo")
    @Expose
    private String SuitInfo;

    /**
    * Pid of this specification
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Pay-as-you-go Pid list corresponding to this specification
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostPid")
    @Expose
    private Long [] PostPid;

    /**
    * Billing mode under this specification. POST: pay-as-you-go
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
     * Get Instance specification ID. The `SpecId` returned by `DescribeZones` together with the purchasable specification information returned by `DescribeProductConfig` can be used to find out what specifications can be purchased in a specified AZ 
     * @return SpecId Instance specification ID. The `SpecId` returned by `DescribeZones` together with the purchasable specification information returned by `DescribeProductConfig` can be used to find out what specifications can be purchased in a specified AZ
     */
    public Long getSpecId() {
        return this.SpecId;
    }

    /**
     * Set Instance specification ID. The `SpecId` returned by `DescribeZones` together with the purchasable specification information returned by `DescribeProductConfig` can be used to find out what specifications can be purchased in a specified AZ
     * @param SpecId Instance specification ID. The `SpecId` returned by `DescribeZones` together with the purchasable specification information returned by `DescribeProductConfig` can be used to find out what specifications can be purchased in a specified AZ
     */
    public void setSpecId(Long SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get Model ID 
     * @return MachineType Model ID
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Model ID
     * @param MachineType Model ID
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Model name 
     * @return MachineTypeName Model name
     */
    public String getMachineTypeName() {
        return this.MachineTypeName;
    }

    /**
     * Set Model name
     * @param MachineTypeName Model name
     */
    public void setMachineTypeName(String MachineTypeName) {
        this.MachineTypeName = MachineTypeName;
    }

    /**
     * Get Database version information. Valid values: 2008R2 (SQL Server 2008 Enterprise), 2012SP3 (SQL Server 2012 Enterprise), 2016SP1 (SQL Server 2016 Enterprise), 201602 (SQL Server 2016 Standard), 2017 (SQL Server 2017 Enterprise) 
     * @return Version Database version information. Valid values: 2008R2 (SQL Server 2008 Enterprise), 2012SP3 (SQL Server 2012 Enterprise), 2016SP1 (SQL Server 2016 Enterprise), 201602 (SQL Server 2016 Standard), 2017 (SQL Server 2017 Enterprise)
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Database version information. Valid values: 2008R2 (SQL Server 2008 Enterprise), 2012SP3 (SQL Server 2012 Enterprise), 2016SP1 (SQL Server 2016 Enterprise), 201602 (SQL Server 2016 Standard), 2017 (SQL Server 2017 Enterprise)
     * @param Version Database version information. Valid values: 2008R2 (SQL Server 2008 Enterprise), 2012SP3 (SQL Server 2012 Enterprise), 2016SP1 (SQL Server 2016 Enterprise), 201602 (SQL Server 2016 Standard), 2017 (SQL Server 2017 Enterprise)
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version name corresponding to the `Version` field 
     * @return VersionName Version name corresponding to the `Version` field
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name corresponding to the `Version` field
     * @param VersionName Version name corresponding to the `Version` field
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Memory size in GB 
     * @return Memory Memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB
     * @param Memory Memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of CPU cores 
     * @return CPU Number of CPU cores
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores
     * @param CPU Number of CPU cores
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Minimum disk size under this specification in GB 
     * @return MinStorage Minimum disk size under this specification in GB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set Minimum disk size under this specification in GB
     * @param MinStorage Minimum disk size under this specification in GB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get Maximum disk size under this specification in GB 
     * @return MaxStorage Maximum disk size under this specification in GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Maximum disk size under this specification in GB
     * @param MaxStorage Maximum disk size under this specification in GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get QPS of this specification 
     * @return QPS QPS of this specification
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set QPS of this specification
     * @param QPS QPS of this specification
     */
    public void setQPS(Long QPS) {
        this.QPS = QPS;
    }

    /**
     * Get Description of this specification 
     * @return SuitInfo Description of this specification
     */
    public String getSuitInfo() {
        return this.SuitInfo;
    }

    /**
     * Set Description of this specification
     * @param SuitInfo Description of this specification
     */
    public void setSuitInfo(String SuitInfo) {
        this.SuitInfo = SuitInfo;
    }

    /**
     * Get Pid of this specification 
     * @return Pid Pid of this specification
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Pid of this specification
     * @param Pid Pid of this specification
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Pay-as-you-go Pid list corresponding to this specification
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PostPid Pay-as-you-go Pid list corresponding to this specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPostPid() {
        return this.PostPid;
    }

    /**
     * Set Pay-as-you-go Pid list corresponding to this specification
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PostPid Pay-as-you-go Pid list corresponding to this specification
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPostPid(Long [] PostPid) {
        this.PostPid = PostPid;
    }

    /**
     * Get Billing mode under this specification. POST: pay-as-you-go 
     * @return PayModeStatus Billing mode under this specification. POST: pay-as-you-go
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * Set Billing mode under this specification. POST: pay-as-you-go
     * @param PayModeStatus Billing mode under this specification. POST: pay-as-you-go
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineTypeName", this.MachineTypeName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "QPS", this.QPS);
        this.setParamSimple(map, prefix + "SuitInfo", this.SuitInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamArraySimple(map, prefix + "PostPid.", this.PostPid);
        this.setParamSimple(map, prefix + "PayModeStatus", this.PayModeStatus);

    }
}

