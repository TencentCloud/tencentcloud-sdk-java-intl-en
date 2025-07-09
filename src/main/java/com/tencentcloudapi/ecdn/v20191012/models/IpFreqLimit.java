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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpFreqLimit extends AbstractModel {

    /**
    * IP access limit switch. Valid values: on, off.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Number of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
     * Get IP access limit switch. Valid values: on, off. 
     * @return Switch IP access limit switch. Valid values: on, off.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP access limit switch. Valid values: on, off.
     * @param Switch IP access limit switch. Valid values: on, off.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Number of requests per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qps Number of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Number of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qps Number of requests per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    public IpFreqLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpFreqLimit(IpFreqLimit source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Qps", this.Qps);

    }
}

