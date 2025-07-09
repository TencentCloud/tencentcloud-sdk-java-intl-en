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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel {

    /**
    * Whether to enable HSTS. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * `MaxAge` value.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Whether to include subdomain names. Valid values: on, off.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
     * Get Whether to enable HSTS. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable HSTS. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable HSTS. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable HSTS. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get `MaxAge` value.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MaxAge `MaxAge` value.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set `MaxAge` value.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MaxAge `MaxAge` value.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Whether to include subdomain names. Valid values: on, off.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Whether to include subdomain names. Valid values: on, off.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    public Hsts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hsts(Hsts source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new Long(source.MaxAge);
        }
        if (source.IncludeSubDomains != null) {
            this.IncludeSubDomains = new String(source.IncludeSubDomains);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);

    }
}

