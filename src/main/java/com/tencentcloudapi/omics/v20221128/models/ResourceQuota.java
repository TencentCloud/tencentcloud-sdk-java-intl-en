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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceQuota extends AbstractModel {

    /**
    * CPU limit setting
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPULimit")
    @Expose
    private String CPULimit;

    /**
    * Memory limit setting (Unit: Mi, Gi, Ti, M, G, and T)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemoryLimit")
    @Expose
    private String MemoryLimit;

    /**
    * Pod quantity setting
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pods")
    @Expose
    private String Pods;

    /**
     * Get CPU limit setting
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CPULimit CPU limit setting
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCPULimit() {
        return this.CPULimit;
    }

    /**
     * Set CPU limit setting
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CPULimit CPU limit setting
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCPULimit(String CPULimit) {
        this.CPULimit = CPULimit;
    }

    /**
     * Get Memory limit setting (Unit: Mi, Gi, Ti, M, G, and T)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemoryLimit Memory limit setting (Unit: Mi, Gi, Ti, M, G, and T)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set Memory limit setting (Unit: Mi, Gi, Ti, M, G, and T)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemoryLimit Memory limit setting (Unit: Mi, Gi, Ti, M, G, and T)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemoryLimit(String MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get Pod quantity setting
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pods Pod quantity setting
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPods() {
        return this.Pods;
    }

    /**
     * Set Pod quantity setting
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pods Pod quantity setting
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPods(String Pods) {
        this.Pods = Pods;
    }

    public ResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceQuota(ResourceQuota source) {
        if (source.CPULimit != null) {
            this.CPULimit = new String(source.CPULimit);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new String(source.MemoryLimit);
        }
        if (source.Pods != null) {
            this.Pods = new String(source.Pods);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CPULimit", this.CPULimit);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "Pods", this.Pods);

    }
}

