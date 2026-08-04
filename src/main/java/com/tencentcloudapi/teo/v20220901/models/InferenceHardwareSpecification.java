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
    * Specification flag.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Specification name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of CPU cores.
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * Memory size. Unit: MB.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of GPU cards.
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * GPU VRAM size. Unit: MB.
    */
    @SerializedName("GPUMemSize")
    @Expose
    private Long GPUMemSize;

    /**
     * Get Specification flag. 
     * @return Spec Specification flag.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Specification flag.
     * @param Spec Specification flag.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Specification name. 
     * @return Name Specification name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specification name.
     * @param Name Specification name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of CPU cores. 
     * @return CPUNum Number of CPU cores.
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set Number of CPU cores.
     * @param CPUNum Number of CPU cores.
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get Memory size. Unit: MB. 
     * @return MemSize Memory size. Unit: MB.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory size. Unit: MB.
     * @param MemSize Memory size. Unit: MB.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of GPU cards. 
     * @return GPUNum Number of GPU cards.
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set Number of GPU cards.
     * @param GPUNum Number of GPU cards.
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get GPU VRAM size. Unit: MB. 
     * @return GPUMemSize GPU VRAM size. Unit: MB.
     */
    public Long getGPUMemSize() {
        return this.GPUMemSize;
    }

    /**
     * Set GPU VRAM size. Unit: MB.
     * @param GPUMemSize GPU VRAM size. Unit: MB.
     */
    public void setGPUMemSize(Long GPUMemSize) {
        this.GPUMemSize = GPUMemSize;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.GPUMemSize != null) {
            this.GPUMemSize = new Long(source.GPUMemSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "GPUMemSize", this.GPUMemSize);

    }
}

