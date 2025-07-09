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

public class ResourceSpec extends AbstractModel {

    /**
    * Specification name, such as SCH1
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size, in GB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Classification markers, STANDARD/BIGDATA/HIGHIO respectively represent standard type/big data type/high IO.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * System disk description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskSpec SystemDisk;

    /**
    * Data disk description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private DiskSpec DataDisk;

    /**
    * Limit of the maximum number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxNodeSize")
    @Expose
    private Long MaxNodeSize;

    /**
    * Whether it is available. False indicates sell-out.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * Specification description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComputeSpecDesc")
    @Expose
    private String ComputeSpecDesc;

    /**
    * CVM inventory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceQuota")
    @Expose
    private Long InstanceQuota;

    /**
     * Get Specification name, such as SCH1 
     * @return Name Specification name, such as SCH1
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specification name, such as SCH1
     * @param Name Specification name, such as SCH1
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Memory size, in GB 
     * @return Mem Memory size, in GB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory size, in GB
     * @param Mem Memory size, in GB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Classification markers, STANDARD/BIGDATA/HIGHIO respectively represent standard type/big data type/high IO. 
     * @return Type Classification markers, STANDARD/BIGDATA/HIGHIO respectively represent standard type/big data type/high IO.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Classification markers, STANDARD/BIGDATA/HIGHIO respectively represent standard type/big data type/high IO.
     * @param Type Classification markers, STANDARD/BIGDATA/HIGHIO respectively represent standard type/big data type/high IO.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get System disk description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemDisk System disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpec getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemDisk System disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDisk(DiskSpec SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk Data disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DiskSpec getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Data disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk Data disk description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(DiskSpec DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Limit of the maximum number of nodes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxNodeSize Limit of the maximum number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxNodeSize() {
        return this.MaxNodeSize;
    }

    /**
     * Set Limit of the maximum number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxNodeSize Limit of the maximum number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxNodeSize(Long MaxNodeSize) {
        this.MaxNodeSize = MaxNodeSize;
    }

    /**
     * Get Whether it is available. False indicates sell-out.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Available Whether it is available. False indicates sell-out.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set Whether it is available. False indicates sell-out.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Available Whether it is available. False indicates sell-out.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get Specification description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComputeSpecDesc Specification description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComputeSpecDesc() {
        return this.ComputeSpecDesc;
    }

    /**
     * Set Specification description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComputeSpecDesc Specification description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComputeSpecDesc(String ComputeSpecDesc) {
        this.ComputeSpecDesc = ComputeSpecDesc;
    }

    /**
     * Get CVM inventory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceQuota CVM inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceQuota() {
        return this.InstanceQuota;
    }

    /**
     * Set CVM inventory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceQuota CVM inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceQuota(Long InstanceQuota) {
        this.InstanceQuota = InstanceQuota;
    }

    public ResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSpec(ResourceSpec source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskSpec(source.SystemDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new DiskSpec(source.DataDisk);
        }
        if (source.MaxNodeSize != null) {
            this.MaxNodeSize = new Long(source.MaxNodeSize);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.ComputeSpecDesc != null) {
            this.ComputeSpecDesc = new String(source.ComputeSpecDesc);
        }
        if (source.InstanceQuota != null) {
            this.InstanceQuota = new Long(source.InstanceQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamSimple(map, prefix + "MaxNodeSize", this.MaxNodeSize);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "ComputeSpecDesc", this.ComputeSpecDesc);
        this.setParamSimple(map, prefix + "InstanceQuota", this.InstanceQuota);

    }
}

