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
    * HSTS configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache HSTS header time in seconds. Value range: 1-31536000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Whether other subdomains are allowed to inherit the same HSTS header. Valid values:
<li>on: Allow other subdomains to inherit the same HSTS header;</li>
<li>off: Other subdomains cannot inherit the same HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * Whether the browser is allowed to preload the HSTS header. Valid values:
<li>on: Allow the browser to preload the HSTS header;</li>
<li>off: The browser is not allowed to preload the HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get HSTS configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch HSTS configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set HSTS configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch HSTS configuration switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache HSTS header time in seconds. Value range: 1-31536000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. 
     * @return Timeout Cache HSTS header time in seconds. Value range: 1-31536000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Cache HSTS header time in seconds. Value range: 1-31536000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     * @param Timeout Cache HSTS header time in seconds. Value range: 1-31536000.<br>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Whether other subdomains are allowed to inherit the same HSTS header. Valid values:
<li>on: Allow other subdomains to inherit the same HSTS header;</li>
<li>off: Other subdomains cannot inherit the same HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. 
     * @return IncludeSubDomains Whether other subdomains are allowed to inherit the same HSTS header. Valid values:
<li>on: Allow other subdomains to inherit the same HSTS header;</li>
<li>off: Other subdomains cannot inherit the same HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set Whether other subdomains are allowed to inherit the same HSTS header. Valid values:
<li>on: Allow other subdomains to inherit the same HSTS header;</li>
<li>off: Other subdomains cannot inherit the same HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     * @param IncludeSubDomains Whether other subdomains are allowed to inherit the same HSTS header. Valid values:
<li>on: Allow other subdomains to inherit the same HSTS header;</li>
<li>off: Other subdomains cannot inherit the same HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get Whether the browser is allowed to preload the HSTS header. Valid values:
<li>on: Allow the browser to preload the HSTS header;</li>
<li>off: The browser is not allowed to preload the HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified. 
     * @return Preload Whether the browser is allowed to preload the HSTS header. Valid values:
<li>on: Allow the browser to preload the HSTS header;</li>
<li>off: The browser is not allowed to preload the HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set Whether the browser is allowed to preload the HSTS header. Valid values:
<li>on: Allow the browser to preload the HSTS header;</li>
<li>off: The browser is not allowed to preload the HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
     * @param Preload Whether the browser is allowed to preload the HSTS header. Valid values:
<li>on: Allow the browser to preload the HSTS header;</li>
<li>off: The browser is not allowed to preload the HSTS header.</li>Note: This field is required when Switch is on. When Switch is off, no need to specify this field, and it does not take effect if specified.
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

