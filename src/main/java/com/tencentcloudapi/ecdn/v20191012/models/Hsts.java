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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel{

    /**
    * Whether to enable. Valid values: on, off.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * `MaxAge` value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Whether to include subdomain names. Valid values: on, off.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
     * Get Whether to enable. Valid values: on, off. 
     * @return Switch Whether to enable. Valid values: on, off.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable. Valid values: on, off.
     * @param Switch Whether to enable. Valid values: on, off.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get `MaxAge` value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxAge `MaxAge` value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set `MaxAge` value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxAge `MaxAge` value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Whether to include subdomain names. Valid values: on, off.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Whether to include subdomain names. Valid values: on, off.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
Note: this field may return null, indicating that no valid values can be obtained.
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

