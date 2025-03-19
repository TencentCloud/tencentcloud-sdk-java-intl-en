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

public class MachineSetScaling extends AbstractModel {

    /**
    * Node pool minimum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * Node pool maximum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * Node pool scaling policy. ZoneEquality: Scatter across multiple availability zones; ZonePriority: Prioritize preferred availability zones;
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("CreatePolicy")
    @Expose
    private String CreatePolicy;

    /**
     * Get Node pool minimum replica count
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MinReplicas Node pool minimum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set Node pool minimum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MinReplicas Node pool minimum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get Node pool maximum replica count
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MaxReplicas Node pool maximum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set Node pool maximum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MaxReplicas Node pool maximum replica count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get Node pool scaling policy. ZoneEquality: Scatter across multiple availability zones; ZonePriority: Prioritize preferred availability zones;
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return CreatePolicy Node pool scaling policy. ZoneEquality: Scatter across multiple availability zones; ZonePriority: Prioritize preferred availability zones;
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getCreatePolicy() {
        return this.CreatePolicy;
    }

    /**
     * Set Node pool scaling policy. ZoneEquality: Scatter across multiple availability zones; ZonePriority: Prioritize preferred availability zones;
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param CreatePolicy Node pool scaling policy. ZoneEquality: Scatter across multiple availability zones; ZonePriority: Prioritize preferred availability zones;
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setCreatePolicy(String CreatePolicy) {
        this.CreatePolicy = CreatePolicy;
    }

    public MachineSetScaling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineSetScaling(MachineSetScaling source) {
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.CreatePolicy != null) {
            this.CreatePolicy = new String(source.CreatePolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "CreatePolicy", this.CreatePolicy);

    }
}

