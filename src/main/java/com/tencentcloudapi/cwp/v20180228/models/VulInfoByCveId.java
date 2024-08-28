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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulInfoByCveId extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Repair Support Status. 0-Neither Windows nor Linux supports for repair; 1-Both Windows and Linux support for repair; 2-Only Linux supports for repair; 3-Only Windows supports for repair.
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Repair Support Status. 0-Neither Windows nor Linux supports for repair; 1-Both Windows and Linux support for repair; 2-Only Linux supports for repair; 3-Only Windows supports for repair. 
     * @return FixSwitch Repair Support Status. 0-Neither Windows nor Linux supports for repair; 1-Both Windows and Linux support for repair; 2-Only Linux supports for repair; 3-Only Windows supports for repair.
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set Repair Support Status. 0-Neither Windows nor Linux supports for repair; 1-Both Windows and Linux support for repair; 2-Only Linux supports for repair; 3-Only Windows supports for repair.
     * @param FixSwitch Repair Support Status. 0-Neither Windows nor Linux supports for repair; 1-Both Windows and Linux support for repair; 2-Only Linux supports for repair; 3-Only Windows supports for repair.
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    public VulInfoByCveId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoByCveId(VulInfoByCveId source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);

    }
}

