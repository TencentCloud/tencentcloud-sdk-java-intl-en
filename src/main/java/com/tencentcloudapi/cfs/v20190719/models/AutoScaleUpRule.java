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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleUpRule extends AbstractModel {

    /**
    * Enable auto scale-out policy, disable.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster usage percentage. start expansion when reaching this value. value range: [10-90].
    */
    @SerializedName("ScaleThreshold")
    @Expose
    private Long ScaleThreshold;

    /**
    * Used capacity to total clusters ratio after expansion. value range: [10-90].
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
     * Get Enable auto scale-out policy, disable. 
     * @return Status Enable auto scale-out policy, disable.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Enable auto scale-out policy, disable.
     * @param Status Enable auto scale-out policy, disable.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster usage percentage. start expansion when reaching this value. value range: [10-90]. 
     * @return ScaleThreshold Cluster usage percentage. start expansion when reaching this value. value range: [10-90].
     */
    public Long getScaleThreshold() {
        return this.ScaleThreshold;
    }

    /**
     * Set Cluster usage percentage. start expansion when reaching this value. value range: [10-90].
     * @param ScaleThreshold Cluster usage percentage. start expansion when reaching this value. value range: [10-90].
     */
    public void setScaleThreshold(Long ScaleThreshold) {
        this.ScaleThreshold = ScaleThreshold;
    }

    /**
     * Get Used capacity to total clusters ratio after expansion. value range: [10-90]. 
     * @return TargetThreshold Used capacity to total clusters ratio after expansion. value range: [10-90].
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set Used capacity to total clusters ratio after expansion. value range: [10-90].
     * @param TargetThreshold Used capacity to total clusters ratio after expansion. value range: [10-90].
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    public AutoScaleUpRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleUpRule(AutoScaleUpRule source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScaleThreshold != null) {
            this.ScaleThreshold = new Long(source.ScaleThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScaleThreshold", this.ScaleThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);

    }
}

