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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceSettings extends AbstractModel{

    /**
    * Memory capacity in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of CPU cores
    */
    @SerializedName("CPUCores")
    @Expose
    private Long CPUCores;

    /**
    * Machine resource ID (EMR resource identifier)
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Target machine specification
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get Memory capacity in GB 
     * @return Memory Memory capacity in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity in GB
     * @param Memory Memory capacity in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of CPU cores 
     * @return CPUCores Number of CPU cores
     */
    public Long getCPUCores() {
        return this.CPUCores;
    }

    /**
     * Set Number of CPU cores
     * @param CPUCores Number of CPU cores
     */
    public void setCPUCores(Long CPUCores) {
        this.CPUCores = CPUCores;
    }

    /**
     * Get Machine resource ID (EMR resource identifier) 
     * @return ResourceId Machine resource ID (EMR resource identifier)
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Machine resource ID (EMR resource identifier)
     * @param ResourceId Machine resource ID (EMR resource identifier)
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Target machine specification 
     * @return InstanceType Target machine specification
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Target machine specification
     * @param InstanceType Target machine specification
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPUCores", this.CPUCores);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

