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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Model, such as S1
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Number of CPU cores
    */
    @SerializedName("Core")
    @Expose
    private Long Core;

    /**
    * Memory size
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * The name of the clickhouse cluster to which it belongs.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * rip
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rip")
    @Expose
    private String Rip;

    /**
    * FE node role
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FeRole")
    @Expose
    private String FeRole;

    /**
    * UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Model, such as S1 
     * @return Spec Model, such as S1
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Model, such as S1
     * @param Spec Model, such as S1
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Number of CPU cores 
     * @return Core Number of CPU cores
     */
    public Long getCore() {
        return this.Core;
    }

    /**
     * Set Number of CPU cores
     * @param Core Number of CPU cores
     */
    public void setCore(Long Core) {
        this.Core = Core;
    }

    /**
     * Get Memory size 
     * @return Memory Memory size
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size
     * @param Memory Memory size
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk type 
     * @return DiskType Disk type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type
     * @param DiskType Disk type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk size 
     * @return DiskSize Disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size
     * @param DiskSize Disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get The name of the clickhouse cluster to which it belongs. 
     * @return Role The name of the clickhouse cluster to which it belongs.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set The name of the clickhouse cluster to which it belongs.
     * @param Role The name of the clickhouse cluster to which it belongs.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get rip
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rip rip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRip() {
        return this.Rip;
    }

    /**
     * Set rip
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rip rip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRip(String Rip) {
        this.Rip = Rip;
    }

    /**
     * Get FE node role
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FeRole FE node role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFeRole() {
        return this.FeRole;
    }

    /**
     * Set FE node role
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FeRole FE node role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFeRole(String FeRole) {
        this.FeRole = FeRole;
    }

    /**
     * Get UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UUID UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UUID UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Core != null) {
            this.Core = new Long(source.Core);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Rip != null) {
            this.Rip = new String(source.Rip);
        }
        if (source.FeRole != null) {
            this.FeRole = new String(source.FeRole);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Core", this.Core);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Rip", this.Rip);
        this.setParamSimple(map, prefix + "FeRole", this.FeRole);
        this.setParamSimple(map, prefix + "UUID", this.UUID);

    }
}

