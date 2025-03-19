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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostInfo extends AbstractModel {

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Cloud service type
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Host running status
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * Host type
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * Number of available CPUs
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * Total CPUs
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * Available memories
    */
    @SerializedName("MemAvailable")
    @Expose
    private Long MemAvailable;

    /**
    * Total memories
    */
    @SerializedName("MemTotal")
    @Expose
    private Long MemTotal;

    /**
    * Running time
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Host id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
     * Get Host IP 
     * @return HostIp Host IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
     * @param HostIp Host IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Cloud service type 
     * @return ServiceType Cloud service type
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Cloud service type
     * @param ServiceType Cloud service type
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Host running status 
     * @return HostStatus Host running status
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set Host running status
     * @param HostStatus Host running status
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get Host type 
     * @return HostType Host type
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set Host type
     * @param HostType Host type
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get Number of available CPUs 
     * @return CpuAvailable Number of available CPUs
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set Number of available CPUs
     * @param CpuAvailable Number of available CPUs
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get Total CPUs 
     * @return CpuTotal Total CPUs
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set Total CPUs
     * @param CpuTotal Total CPUs
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get Available memories 
     * @return MemAvailable Available memories
     */
    public Long getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available memories
     * @param MemAvailable Available memories
     */
    public void setMemAvailable(Long MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get Total memories 
     * @return MemTotal Total memories
     */
    public Long getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set Total memories
     * @param MemTotal Total memories
     */
    public void setMemTotal(Long MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get Running time 
     * @return RunTime Running time
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set Running time
     * @param RunTime Running time
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Host id 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return HostId Host id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param HostId Host id 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    public HostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostInfo(HostInfo source) {
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Long(source.MemAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Long(source.MemTotal);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "HostId", this.HostId);

    }
}

