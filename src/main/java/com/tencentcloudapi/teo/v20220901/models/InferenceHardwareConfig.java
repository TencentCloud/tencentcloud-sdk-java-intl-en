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

public class InferenceHardwareConfig extends AbstractModel {

    /**
    * <p>Number of GPU cards assigned to each inference service instance. Currently, supports integers only, and must be an available value in <code>AllowedGPUNums</code> of the specification corresponding to <code>HardwareSpecId</code>.</p><p>If not filled, the default <code>GPUNum</code> value of the selected <code>HardwareSpecId</code> specification is used.</p>
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * <p>Number of CPU cores allocated to each inference service instance. Currently only supports integer values.</p><p>If left blank, use the default <code>CPUNum</code> value of the selected <code>HardwareSpecId</code> specification.</p>
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, use the default <code>MemSize</code> value of the selected <code>HardwareSpecId</code>; if filled, it must be a multiple of <code>1024</code>.</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Temporary disk capacity allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If not filled, the default <code>DiskSize</code> value of the specification corresponding to the selected <code>HardwareSpecId</code> is used; if filled, it must be an integral multiple of <code>1024</code>.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get <p>Number of GPU cards assigned to each inference service instance. Currently, supports integers only, and must be an available value in <code>AllowedGPUNums</code> of the specification corresponding to <code>HardwareSpecId</code>.</p><p>If not filled, the default <code>GPUNum</code> value of the selected <code>HardwareSpecId</code> specification is used.</p> 
     * @return GPUNum <p>Number of GPU cards assigned to each inference service instance. Currently, supports integers only, and must be an available value in <code>AllowedGPUNums</code> of the specification corresponding to <code>HardwareSpecId</code>.</p><p>If not filled, the default <code>GPUNum</code> value of the selected <code>HardwareSpecId</code> specification is used.</p>
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set <p>Number of GPU cards assigned to each inference service instance. Currently, supports integers only, and must be an available value in <code>AllowedGPUNums</code> of the specification corresponding to <code>HardwareSpecId</code>.</p><p>If not filled, the default <code>GPUNum</code> value of the selected <code>HardwareSpecId</code> specification is used.</p>
     * @param GPUNum <p>Number of GPU cards assigned to each inference service instance. Currently, supports integers only, and must be an available value in <code>AllowedGPUNums</code> of the specification corresponding to <code>HardwareSpecId</code>.</p><p>If not filled, the default <code>GPUNum</code> value of the selected <code>HardwareSpecId</code> specification is used.</p>
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get <p>Number of CPU cores allocated to each inference service instance. Currently only supports integer values.</p><p>If left blank, use the default <code>CPUNum</code> value of the selected <code>HardwareSpecId</code> specification.</p> 
     * @return CPUNum <p>Number of CPU cores allocated to each inference service instance. Currently only supports integer values.</p><p>If left blank, use the default <code>CPUNum</code> value of the selected <code>HardwareSpecId</code> specification.</p>
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set <p>Number of CPU cores allocated to each inference service instance. Currently only supports integer values.</p><p>If left blank, use the default <code>CPUNum</code> value of the selected <code>HardwareSpecId</code> specification.</p>
     * @param CPUNum <p>Number of CPU cores allocated to each inference service instance. Currently only supports integer values.</p><p>If left blank, use the default <code>CPUNum</code> value of the selected <code>HardwareSpecId</code> specification.</p>
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, use the default <code>MemSize</code> value of the selected <code>HardwareSpecId</code>; if filled, it must be a multiple of <code>1024</code>.</p> 
     * @return MemSize <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, use the default <code>MemSize</code> value of the selected <code>HardwareSpecId</code>; if filled, it must be a multiple of <code>1024</code>.</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, use the default <code>MemSize</code> value of the selected <code>HardwareSpecId</code>; if filled, it must be a multiple of <code>1024</code>.</p>
     * @param MemSize <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, use the default <code>MemSize</code> value of the selected <code>HardwareSpecId</code>; if filled, it must be a multiple of <code>1024</code>.</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Temporary disk capacity allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If not filled, the default <code>DiskSize</code> value of the specification corresponding to the selected <code>HardwareSpecId</code> is used; if filled, it must be an integral multiple of <code>1024</code>.</p> 
     * @return DiskSize <p>Temporary disk capacity allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If not filled, the default <code>DiskSize</code> value of the specification corresponding to the selected <code>HardwareSpecId</code> is used; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Temporary disk capacity allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If not filled, the default <code>DiskSize</code> value of the specification corresponding to the selected <code>HardwareSpecId</code> is used; if filled, it must be an integral multiple of <code>1024</code>.</p>
     * @param DiskSize <p>Temporary disk capacity allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If not filled, the default <code>DiskSize</code> value of the specification corresponding to the selected <code>HardwareSpecId</code> is used; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public InferenceHardwareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareConfig(InferenceHardwareConfig source) {
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

