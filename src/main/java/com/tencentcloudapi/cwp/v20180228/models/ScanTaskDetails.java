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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskDetails extends AbstractModel {

    /**
    * Server IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Operating system
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Number of risks
    */
    @SerializedName("RiskNum")
    @Expose
    private Long RiskNum;

    /**
    * Scan start time
    */
    @SerializedName("ScanBeginTime")
    @Expose
    private String ScanBeginTime;

    /**
    * Scan end time
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Status code
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Failure details
    */
    @SerializedName("FailType")
    @Expose
    private Long FailType;

    /**
    * Public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Server IP 
     * @return HostIp Server IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP
     * @param HostIp Server IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Operating system 
     * @return OsName Operating system
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Operating system
     * @param OsName Operating system
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Number of risks 
     * @return RiskNum Number of risks
     */
    public Long getRiskNum() {
        return this.RiskNum;
    }

    /**
     * Set Number of risks
     * @param RiskNum Number of risks
     */
    public void setRiskNum(Long RiskNum) {
        this.RiskNum = RiskNum;
    }

    /**
     * Get Scan start time 
     * @return ScanBeginTime Scan start time
     */
    public String getScanBeginTime() {
        return this.ScanBeginTime;
    }

    /**
     * Set Scan start time
     * @param ScanBeginTime Scan start time
     */
    public void setScanBeginTime(String ScanBeginTime) {
        this.ScanBeginTime = ScanBeginTime;
    }

    /**
     * Get Scan end time 
     * @return ScanEndTime Scan end time
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set Scan end time
     * @param ScanEndTime Scan end time
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get UUID 
     * @return Uuid UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set UUID
     * @param Uuid UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get QUUID 
     * @return Quuid QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set QUUID
     * @param Quuid QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Status code 
     * @return Status Status code
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status code
     * @param Status Status code
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Failure details 
     * @return FailType Failure details
     */
    public Long getFailType() {
        return this.FailType;
    }

    /**
     * Set Failure details
     * @param FailType Failure details
     */
    public void setFailType(Long FailType) {
        this.FailType = FailType;
    }

    /**
     * Get Public IP address 
     * @return MachineWanIp Public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address
     * @param MachineWanIp Public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public ScanTaskDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskDetails(ScanTaskDetails source) {
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.RiskNum != null) {
            this.RiskNum = new Long(source.RiskNum);
        }
        if (source.ScanBeginTime != null) {
            this.ScanBeginTime = new String(source.ScanBeginTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FailType != null) {
            this.FailType = new Long(source.FailType);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "RiskNum", this.RiskNum);
        this.setParamSimple(map, prefix + "ScanBeginTime", this.ScanBeginTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FailType", this.FailType);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

