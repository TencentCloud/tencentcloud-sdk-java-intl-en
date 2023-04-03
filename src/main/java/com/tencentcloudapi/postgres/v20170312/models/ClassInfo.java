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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassInfo extends AbstractModel{

    /**
    * Specification ID
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Number of CPU cores
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Maximum storage capacity in GB supported by this specification
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Minimum storage capacity in GB supported by this specification
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * Estimated QPS for this specification
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
     * Get Specification ID 
     * @return SpecCode Specification ID
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Specification ID
     * @param SpecCode Specification ID
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Number of CPU cores 
     * @return CPU Number of CPU cores
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores
     * @param CPU Number of CPU cores
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Memory size in MB 
     * @return Memory Memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in MB
     * @param Memory Memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Maximum storage capacity in GB supported by this specification 
     * @return MaxStorage Maximum storage capacity in GB supported by this specification
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Maximum storage capacity in GB supported by this specification
     * @param MaxStorage Maximum storage capacity in GB supported by this specification
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Minimum storage capacity in GB supported by this specification 
     * @return MinStorage Minimum storage capacity in GB supported by this specification
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set Minimum storage capacity in GB supported by this specification
     * @param MinStorage Minimum storage capacity in GB supported by this specification
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get Estimated QPS for this specification 
     * @return QPS Estimated QPS for this specification
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set Estimated QPS for this specification
     * @param QPS Estimated QPS for this specification
     */
    public void setQPS(Long QPS) {
        this.QPS = QPS;
    }

    public ClassInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassInfo(ClassInfo source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
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
        if (source.QPS != null) {
            this.QPS = new Long(source.QPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "QPS", this.QPS);

    }
}

