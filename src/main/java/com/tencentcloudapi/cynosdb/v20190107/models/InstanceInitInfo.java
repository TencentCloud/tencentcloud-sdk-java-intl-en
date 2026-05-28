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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInitInfo extends AbstractModel {

    /**
    * <p>Instance cpu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Instance memory</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Instance type rw/ro</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Number of instances, range [1,15]</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>Minimum count of Serverless instance, range [1,15]</p>
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * <p>Maximum count of Serverless instances, range [1,15]</p>
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * <p>Minimum specification of Serverless instance</p>
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * <p>Maximum specification of Serverless instance</p>
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get <p>Instance cpu</p> 
     * @return Cpu <p>Instance cpu</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Instance cpu</p>
     * @param Cpu <p>Instance cpu</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Instance memory</p> 
     * @return Memory <p>Instance memory</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Instance memory</p>
     * @param Memory <p>Instance memory</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Instance type rw/ro</p> 
     * @return InstanceType <p>Instance type rw/ro</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type rw/ro</p>
     * @param InstanceType <p>Instance type rw/ro</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Number of instances, range [1,15]</p> 
     * @return InstanceCount <p>Number of instances, range [1,15]</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Number of instances, range [1,15]</p>
     * @param InstanceCount <p>Number of instances, range [1,15]</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>Minimum count of Serverless instance, range [1,15]</p> 
     * @return MinRoCount <p>Minimum count of Serverless instance, range [1,15]</p>
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set <p>Minimum count of Serverless instance, range [1,15]</p>
     * @param MinRoCount <p>Minimum count of Serverless instance, range [1,15]</p>
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get <p>Maximum count of Serverless instances, range [1,15]</p> 
     * @return MaxRoCount <p>Maximum count of Serverless instances, range [1,15]</p>
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set <p>Maximum count of Serverless instances, range [1,15]</p>
     * @param MaxRoCount <p>Maximum count of Serverless instances, range [1,15]</p>
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get <p>Minimum specification of Serverless instance</p> 
     * @return MinRoCpu <p>Minimum specification of Serverless instance</p>
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set <p>Minimum specification of Serverless instance</p>
     * @param MinRoCpu <p>Minimum specification of Serverless instance</p>
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get <p>Maximum specification of Serverless instance</p> 
     * @return MaxRoCpu <p>Maximum specification of Serverless instance</p>
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set <p>Maximum specification of Serverless instance</p>
     * @param MaxRoCpu <p>Maximum specification of Serverless instance</p>
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol> 
     * @return DeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     * @param DeviceType <p>Instance Machine Type</p><ol><li>common, universal type.</li><li>exclusive, dedicated.</li></ol>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public InstanceInitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInitInfo(InstanceInitInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

