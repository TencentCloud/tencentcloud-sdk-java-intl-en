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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel {

    /**
    * Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * MaxAge value. expressed in seconds, maximum value is 1 day.
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * Specifies whether the subdomain is included. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * Whether to enable preloading. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable the configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get MaxAge value. expressed in seconds, maximum value is 1 day. 
     * @return MaxAge MaxAge value. expressed in seconds, maximum value is 1 day.
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set MaxAge value. expressed in seconds, maximum value is 1 day.
     * @param MaxAge MaxAge value. expressed in seconds, maximum value is 1 day.
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get Specifies whether the subdomain is included. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li> 
     * @return IncludeSubDomains Specifies whether the subdomain is included. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Specifies whether the subdomain is included. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     * @param IncludeSubDomains Specifies whether the subdomain is included. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get Whether to enable preloading. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li> 
     * @return Preload Whether to enable preloading. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set Whether to enable preloading. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     * @param Preload Whether to enable preloading. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
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

