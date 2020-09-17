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
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Whether to include subdomain names. Valid values: on, off.
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
     * @return MaxAge `MaxAge` value.
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set `MaxAge` value.
     * @param MaxAge `MaxAge` value.
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Whether to include subdomain names. Valid values: on, off. 
     * @return IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Whether to include subdomain names. Valid values: on, off.
     * @param IncludeSubDomains Whether to include subdomain names. Valid values: on, off.
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
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

