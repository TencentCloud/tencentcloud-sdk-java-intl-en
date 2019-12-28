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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeOptions extends AbstractModel{

    /**
    * Number of CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance model category. Value range: "ALL", "GENERAL", "GENERAL_2", "GENERAL_3", "COMPUTE", "COMPUTE_2", and "COMPUTE_3". Default value: "ALL".
    */
    @SerializedName("InstanceCategories")
    @Expose
    private String [] InstanceCategories;

    /**
     * Get Number of CPU cores. 
     * @return CPU Number of CPU cores.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores.
     * @param CPU Number of CPU cores.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Memory size in GB. 
     * @return Memory Memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB.
     * @param Memory Memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance model category. Value range: "ALL", "GENERAL", "GENERAL_2", "GENERAL_3", "COMPUTE", "COMPUTE_2", and "COMPUTE_3". Default value: "ALL". 
     * @return InstanceCategories Instance model category. Value range: "ALL", "GENERAL", "GENERAL_2", "GENERAL_3", "COMPUTE", "COMPUTE_2", and "COMPUTE_3". Default value: "ALL".
     */
    public String [] getInstanceCategories() {
        return this.InstanceCategories;
    }

    /**
     * Set Instance model category. Value range: "ALL", "GENERAL", "GENERAL_2", "GENERAL_3", "COMPUTE", "COMPUTE_2", and "COMPUTE_3". Default value: "ALL".
     * @param InstanceCategories Instance model category. Value range: "ALL", "GENERAL", "GENERAL_2", "GENERAL_3", "COMPUTE", "COMPUTE_2", and "COMPUTE_3". Default value: "ALL".
     */
    public void setInstanceCategories(String [] InstanceCategories) {
        this.InstanceCategories = InstanceCategories;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamArraySimple(map, prefix + "InstanceCategories.", this.InstanceCategories);

    }
}

