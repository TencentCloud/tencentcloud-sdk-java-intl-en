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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceHardwareSpecification extends AbstractModel {

    /**
    * <p>Specification flag. Abandoned. For reference, use the field <code>HardwareSpecId</code>.</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>Unique identification ID of the specification.</p>
    */
    @SerializedName("HardwareSpecId")
    @Expose
    private String HardwareSpecId;

    /**
    * <p>Specification name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Number of GPU cards assigned by default for the specification.</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * <p>Default number of CPU cores allocated to the specification.</p>
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * <p>Default allocated memory size for the specification.</p><p>In MB.</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>GPU VRAM size assigned by default in the specification.</p><p>Unit: MB</p>
    */
    @SerializedName("GPUMemSize")
    @Expose
    private Long GPUMemSize;

    /**
    * <p>Default disk space allocated for the specification.</p><p>Unit: MB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>List of GPU card counts currently supported by the specification.</p><p>If not filled or filled with an empty array, only the GPU card count assigned by default for the specification is supported.</p>
    */
    @SerializedName("AllowedGPUNums")
    @Expose
    private Float [] AllowedGPUNums;

    /**
     * Get <p>Specification flag. Abandoned. For reference, use the field <code>HardwareSpecId</code>.</p> 
     * @return Spec <p>Specification flag. Abandoned. For reference, use the field <code>HardwareSpecId</code>.</p>
     * @deprecated
     */
    @Deprecated
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>Specification flag. Abandoned. For reference, use the field <code>HardwareSpecId</code>.</p>
     * @param Spec <p>Specification flag. Abandoned. For reference, use the field <code>HardwareSpecId</code>.</p>
     * @deprecated
     */
    @Deprecated
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>Unique identification ID of the specification.</p> 
     * @return HardwareSpecId <p>Unique identification ID of the specification.</p>
     */
    public String getHardwareSpecId() {
        return this.HardwareSpecId;
    }

    /**
     * Set <p>Unique identification ID of the specification.</p>
     * @param HardwareSpecId <p>Unique identification ID of the specification.</p>
     */
    public void setHardwareSpecId(String HardwareSpecId) {
        this.HardwareSpecId = HardwareSpecId;
    }

    /**
     * Get <p>Specification name.</p> 
     * @return Name <p>Specification name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Specification name.</p>
     * @param Name <p>Specification name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Number of GPU cards assigned by default for the specification.</p> 
     * @return GPUNum <p>Number of GPU cards assigned by default for the specification.</p>
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>Number of GPU cards assigned by default for the specification.</p>
     * @param GPUNum <p>Number of GPU cards assigned by default for the specification.</p>
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>Default number of CPU cores allocated to the specification.</p> 
     * @return CPUNum <p>Default number of CPU cores allocated to the specification.</p>
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set <p>Default number of CPU cores allocated to the specification.</p>
     * @param CPUNum <p>Default number of CPU cores allocated to the specification.</p>
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get <p>Default allocated memory size for the specification.</p><p>In MB.</p> 
     * @return MemSize <p>Default allocated memory size for the specification.</p><p>In MB.</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Default allocated memory size for the specification.</p><p>In MB.</p>
     * @param MemSize <p>Default allocated memory size for the specification.</p><p>In MB.</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>GPU VRAM size assigned by default in the specification.</p><p>Unit: MB</p> 
     * @return GPUMemSize <p>GPU VRAM size assigned by default in the specification.</p><p>Unit: MB</p>
     */
    public Long getGPUMemSize() {
        return this.GPUMemSize;
    }

    /**
     * Set <p>GPU VRAM size assigned by default in the specification.</p><p>Unit: MB</p>
     * @param GPUMemSize <p>GPU VRAM size assigned by default in the specification.</p><p>Unit: MB</p>
     */
    public void setGPUMemSize(Long GPUMemSize) {
        this.GPUMemSize = GPUMemSize;
    }

    /**
     * Get <p>Default disk space allocated for the specification.</p><p>Unit: MB</p> 
     * @return DiskSize <p>Default disk space allocated for the specification.</p><p>Unit: MB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Default disk space allocated for the specification.</p><p>Unit: MB</p>
     * @param DiskSize <p>Default disk space allocated for the specification.</p><p>Unit: MB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>List of GPU card counts currently supported by the specification.</p><p>If not filled or filled with an empty array, only the GPU card count assigned by default for the specification is supported.</p> 
     * @return AllowedGPUNums <p>List of GPU card counts currently supported by the specification.</p><p>If not filled or filled with an empty array, only the GPU card count assigned by default for the specification is supported.</p>
     */
    public Float [] getAllowedGPUNums() {
        return this.AllowedGPUNums;
    }

    /**
     * Set <p>List of GPU card counts currently supported by the specification.</p><p>If not filled or filled with an empty array, only the GPU card count assigned by default for the specification is supported.</p>
     * @param AllowedGPUNums <p>List of GPU card counts currently supported by the specification.</p><p>If not filled or filled with an empty array, only the GPU card count assigned by default for the specification is supported.</p>
     */
    public void setAllowedGPUNums(Float [] AllowedGPUNums) {
        this.AllowedGPUNums = AllowedGPUNums;
    }

    public InferenceHardwareSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareSpecification(InferenceHardwareSpecification source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.HardwareSpecId != null) {
            this.HardwareSpecId = new String(source.HardwareSpecId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GPUMemSize != null) {
            this.GPUMemSize = new Long(source.GPUMemSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AllowedGPUNums != null) {
            this.AllowedGPUNums = new Float[source.AllowedGPUNums.length];
            for (int i = 0; i < source.AllowedGPUNums.length; i++) {
                this.AllowedGPUNums[i] = new Float(source.AllowedGPUNums[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "HardwareSpecId", this.HardwareSpecId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GPUMemSize", this.GPUMemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamArraySimple(map, prefix + "AllowedGPUNums.", this.AllowedGPUNums);

    }
}

