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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalNodeInfo extends AbstractModel {

    /**
    * Third-party node name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of CPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Node memory capacity (unit: `GB`)
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * kubelet version information of third-party nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
     * Get Third-party node name 
     * @return Name Third-party node name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Third-party node name
     * @param Name Third-party node name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of CPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return CPU Number of CPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param CPU Number of CPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Node memory capacity (unit: `GB`)
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Memory Node memory capacity (unit: `GB`)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Node memory capacity (unit: `GB`)
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Memory Node memory capacity (unit: `GB`)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get kubelet version information of third-party nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return K8SVersion kubelet version information of third-party nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set kubelet version information of third-party nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param K8SVersion kubelet version information of third-party nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    public ExternalNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNodeInfo(ExternalNodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);

    }
}

