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

public class SpecItemInfo extends AbstractModel {

    /**
    * <p>Specification ID.</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>PostgreSQL version number.</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Full version name of the kernel number.</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>CPU cores.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory size, in MB.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Maximum storage capacity supported by this specification, in GB.</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>Minimum storage capacity supported by this specification, in GB.</p>
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * <p>Estimated QPS of the specification.</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>[Deprecated field].</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>Machine type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>PostgreSQL major version number.</p>
    */
    @SerializedName("MajorVersion")
    @Expose
    private String MajorVersion;

    /**
    * <p>PostgreSQL kernel version number.</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>Indicates whether the TDE data encryption feature is supported. 0 - not supported. 1 - supported.</p>
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
     * Get <p>Specification ID.</p> 
     * @return SpecCode <p>Specification ID.</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Specification ID.</p>
     * @param SpecCode <p>Specification ID.</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>PostgreSQL version number.</p> 
     * @return Version <p>PostgreSQL version number.</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>PostgreSQL version number.</p>
     * @param Version <p>PostgreSQL version number.</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Full version name of the kernel number.</p> 
     * @return VersionName <p>Full version name of the kernel number.</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>Full version name of the kernel number.</p>
     * @param VersionName <p>Full version name of the kernel number.</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>CPU cores.</p> 
     * @return Cpu <p>CPU cores.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU cores.</p>
     * @param Cpu <p>CPU cores.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory size, in MB.</p> 
     * @return Memory <p>Memory size, in MB.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size, in MB.</p>
     * @param Memory <p>Memory size, in MB.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Maximum storage capacity supported by this specification, in GB.</p> 
     * @return MaxStorage <p>Maximum storage capacity supported by this specification, in GB.</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>Maximum storage capacity supported by this specification, in GB.</p>
     * @param MaxStorage <p>Maximum storage capacity supported by this specification, in GB.</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>Minimum storage capacity supported by this specification, in GB.</p> 
     * @return MinStorage <p>Minimum storage capacity supported by this specification, in GB.</p>
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set <p>Minimum storage capacity supported by this specification, in GB.</p>
     * @param MinStorage <p>Minimum storage capacity supported by this specification, in GB.</p>
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get <p>Estimated QPS of the specification.</p> 
     * @return Qps <p>Estimated QPS of the specification.</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>Estimated QPS of the specification.</p>
     * @param Qps <p>Estimated QPS of the specification.</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>[Deprecated field].</p> 
     * @return Pid <p>[Deprecated field].</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>[Deprecated field].</p>
     * @param Pid <p>[Deprecated field].</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>Machine type.</p> 
     * @return Type <p>Machine type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Machine type.</p>
     * @param Type <p>Machine type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>PostgreSQL major version number.</p> 
     * @return MajorVersion <p>PostgreSQL major version number.</p>
     */
    public String getMajorVersion() {
        return this.MajorVersion;
    }

    /**
     * Set <p>PostgreSQL major version number.</p>
     * @param MajorVersion <p>PostgreSQL major version number.</p>
     */
    public void setMajorVersion(String MajorVersion) {
        this.MajorVersion = MajorVersion;
    }

    /**
     * Get <p>PostgreSQL kernel version number.</p> 
     * @return KernelVersion <p>PostgreSQL kernel version number.</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>PostgreSQL kernel version number.</p>
     * @param KernelVersion <p>PostgreSQL kernel version number.</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>Indicates whether the TDE data encryption feature is supported. 0 - not supported. 1 - supported.</p> 
     * @return IsSupportTDE <p>Indicates whether the TDE data encryption feature is supported. 0 - not supported. 1 - supported.</p>
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set <p>Indicates whether the TDE data encryption feature is supported. 0 - not supported. 1 - supported.</p>
     * @param IsSupportTDE <p>Indicates whether the TDE data encryption feature is supported. 0 - not supported. 1 - supported.</p>
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

