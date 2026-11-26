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

public class InferenceHardwareConfigForModify extends AbstractModel {

    /**
    * <p>CPU cores per instance allocation for the inference service. Currently only support integer values.</p><p>If left blank, no modification will be made.</p>
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Temporary disk space allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get <p>CPU cores per instance allocation for the inference service. Currently only support integer values.</p><p>If left blank, no modification will be made.</p> 
     * @return CPUNum <p>CPU cores per instance allocation for the inference service. Currently only support integer values.</p><p>If left blank, no modification will be made.</p>
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set <p>CPU cores per instance allocation for the inference service. Currently only support integer values.</p><p>If left blank, no modification will be made.</p>
     * @param CPUNum <p>CPU cores per instance allocation for the inference service. Currently only support integer values.</p><p>If left blank, no modification will be made.</p>
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p> 
     * @return MemSize <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     * @param MemSize <p>Memory size allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Temporary disk space allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p> 
     * @return DiskSize <p>Temporary disk space allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Temporary disk space allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     * @param DiskSize <p>Temporary disk space allocated to a single instance of the inference service.</p><p>Unit: MB</p><p>If left blank, no modification is made; if filled, it must be an integral multiple of <code>1024</code>.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public InferenceHardwareConfigForModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareConfigForModify(InferenceHardwareConfigForModify source) {
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
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

