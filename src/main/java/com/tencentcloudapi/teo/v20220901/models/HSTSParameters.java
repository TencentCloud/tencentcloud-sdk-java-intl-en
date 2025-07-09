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

public class HSTSParameters extends AbstractModel {

    /**
    * Whether to enable hsts. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache hsts header time, unit: seconds. value range: 1-31536000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Whether to allow other subdomains to inherit the same hsts header. values:.
<Li>On: allows other subdomains to inherit the same hsts header.</li>.
<Li>Off: does not allow other subdomains to inherit the same hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * Whether to allow the browser to preload the hsts header. valid values:.
<Li>On: allows the browser to preload the hsts header.</li>.
<Li>Off: does not allow the browser to preload the hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get Whether to enable hsts. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable hsts. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable hsts. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable hsts. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache hsts header time, unit: seconds. value range: 1-31536000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled. 
     * @return Timeout Cache hsts header time, unit: seconds. value range: 1-31536000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Cache hsts header time, unit: seconds. value range: 1-31536000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     * @param Timeout Cache hsts header time, unit: seconds. value range: 1-31536000.<br>note: this field is required when switch is on; when switch is off, this field is not required and will not take effect if filled.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Whether to allow other subdomains to inherit the same hsts header. values:.
<Li>On: allows other subdomains to inherit the same hsts header.</li>.
<Li>Off: does not allow other subdomains to inherit the same hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled. 
     * @return IncludeSubDomains Whether to allow other subdomains to inherit the same hsts header. values:.
<Li>On: allows other subdomains to inherit the same hsts header.</li>.
<Li>Off: does not allow other subdomains to inherit the same hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Whether to allow other subdomains to inherit the same hsts header. values:.
<Li>On: allows other subdomains to inherit the same hsts header.</li>.
<Li>Off: does not allow other subdomains to inherit the same hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     * @param IncludeSubDomains Whether to allow other subdomains to inherit the same hsts header. values:.
<Li>On: allows other subdomains to inherit the same hsts header.</li>.
<Li>Off: does not allow other subdomains to inherit the same hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get Whether to allow the browser to preload the hsts header. valid values:.
<Li>On: allows the browser to preload the hsts header.</li>.
<Li>Off: does not allow the browser to preload the hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled. 
     * @return Preload Whether to allow the browser to preload the hsts header. valid values:.
<Li>On: allows the browser to preload the hsts header.</li>.
<Li>Off: does not allow the browser to preload the hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set Whether to allow the browser to preload the hsts header. valid values:.
<Li>On: allows the browser to preload the hsts header.</li>.
<Li>Off: does not allow the browser to preload the hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     * @param Preload Whether to allow the browser to preload the hsts header. valid values:.
<Li>On: allows the browser to preload the hsts header.</li>.
<Li>Off: does not allow the browser to preload the hsts header.</li> note: when switch is on, this field is required; when switch is off, this field is not required and will not take effect if filled.
     */
    public void setPreload(String Preload) {
        this.Preload = Preload;
    }

    public HSTSParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HSTSParameters(HSTSParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
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
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);
        this.setParamSimple(map, prefix + "Preload", this.Preload);

    }
}

