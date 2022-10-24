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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecItemInfo extends AbstractModel{

    /**
    * Specification ID
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * PostgerSQL version number
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Full version name corresponding to kernel number
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Maximum storage capacity in GB supported by this specification
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Minimum storage capacity in GB supported by this specification
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * Estimated QPS for this specification
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * (Disused)
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Machine type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * PostgreSQL major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MajorVersion")
    @Expose
    private String MajorVersion;

    /**
    * PostgreSQL kernel version number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * Whether TDE data encryption is supported. Valid values: 0 (no), 1 (yes)
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
     * Get Specification ID 
     * @return SpecCode Specification ID
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Specification ID
     * @param SpecCode Specification ID
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get PostgerSQL version number 
     * @return Version PostgerSQL version number
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set PostgerSQL version number
     * @param Version PostgerSQL version number
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Full version name corresponding to kernel number 
     * @return VersionName Full version name corresponding to kernel number
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Full version name corresponding to kernel number
     * @param VersionName Full version name corresponding to kernel number
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size in MB 
     * @return Memory Memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in MB
     * @param Memory Memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Maximum storage capacity in GB supported by this specification 
     * @return MaxStorage Maximum storage capacity in GB supported by this specification
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Maximum storage capacity in GB supported by this specification
     * @param MaxStorage Maximum storage capacity in GB supported by this specification
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Minimum storage capacity in GB supported by this specification 
     * @return MinStorage Minimum storage capacity in GB supported by this specification
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set Minimum storage capacity in GB supported by this specification
     * @param MinStorage Minimum storage capacity in GB supported by this specification
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get Estimated QPS for this specification 
     * @return Qps Estimated QPS for this specification
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Estimated QPS for this specification
     * @param Qps Estimated QPS for this specification
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get (Disused) 
     * @return Pid (Disused)
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set (Disused)
     * @param Pid (Disused)
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Machine type 
     * @return Type Machine type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Machine type
     * @param Type Machine type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get PostgreSQL major version number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MajorVersion PostgreSQL major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMajorVersion() {
        return this.MajorVersion;
    }

    /**
     * Set PostgreSQL major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MajorVersion PostgreSQL major version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMajorVersion(String MajorVersion) {
        this.MajorVersion = MajorVersion;
    }

    /**
     * Get PostgreSQL kernel version number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return KernelVersion PostgreSQL kernel version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set PostgreSQL kernel version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param KernelVersion PostgreSQL kernel version number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get Whether TDE data encryption is supported. Valid values: 0 (no), 1 (yes)
Note: This field may return `null`, indicating that no valid value was found. 
     * @return IsSupportTDE Whether TDE data encryption is supported. Valid values: 0 (no), 1 (yes)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set Whether TDE data encryption is supported. Valid values: 0 (no), 1 (yes)
Note: This field may return `null`, indicating that no valid value was found.
     * @param IsSupportTDE Whether TDE data encryption is supported. Valid values: 0 (no), 1 (yes)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    public SpecItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecItemInfo(SpecItemInfo source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MajorVersion != null) {
            this.MajorVersion = new String(source.MajorVersion);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.IsSupportTDE != null) {
            this.IsSupportTDE = new Long(source.IsSupportTDE);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MajorVersion", this.MajorVersion);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "IsSupportTDE", this.IsSupportTDE);

    }
}

