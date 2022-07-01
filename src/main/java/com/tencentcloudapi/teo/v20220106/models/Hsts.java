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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel{

    /**
    * Specifies whether to enable. Valid values: `on` and `off`.
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
    * Specifies whether to include subdomain names. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * Specifies whether to preload. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get Specifies whether to enable. Valid values: `on` and `off`. 
     * @return Switch Specifies whether to enable. Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Specifies whether to enable. Valid values: `on` and `off`.
     * @param Switch Specifies whether to enable. Valid values: `on` and `off`.
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
     * Get Specifies whether to include subdomain names. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return IncludeSubDomains Specifies whether to include subdomain names. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Specifies whether to include subdomain names. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param IncludeSubDomains Specifies whether to include subdomain names. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get Specifies whether to preload. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Preload Specifies whether to preload. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set Specifies whether to preload. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Preload Specifies whether to preload. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPreload(String Preload) {
        this.Preload = Preload;
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
        if (source.Preload != null) {
            this.Preload = new String(source.Preload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);
        this.setParamSimple(map, prefix + "Preload", this.Preload);

    }
}

