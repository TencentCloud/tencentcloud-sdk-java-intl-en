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

public class StandardDebugParameters extends AbstractModel {

    /**
    * Whether to enable standard debugging. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The client ip to allow. it can be an ipv4/ipv6 address or a cidr block. 0.0.0.0/0 means to allow all ipv4 clients for debugging; ::/0 means to allow all ipv6 clients for debugging; 127.0.0.1 is not allowed. <br>note: this field is required when `switch=on` and the number of entries should be 1-100. when `switch=off`, this field is not required and any value specified will not take effect.
    */
    @SerializedName("AllowClientIPList")
    @Expose
    private String [] AllowClientIPList;

    /**
    * Debug feature expiration time. the feature will be disabled after the set time. <br>note: this field is required when `switch=on`. when `switch=off`, this field is not required and any value specified will not take effect.
    */
    @SerializedName("Expires")
    @Expose
    private String Expires;

    /**
     * Get Whether to enable standard debugging. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable standard debugging. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable standard debugging. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable standard debugging. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The client ip to allow. it can be an ipv4/ipv6 address or a cidr block. 0.0.0.0/0 means to allow all ipv4 clients for debugging; ::/0 means to allow all ipv6 clients for debugging; 127.0.0.1 is not allowed. <br>note: this field is required when `switch=on` and the number of entries should be 1-100. when `switch=off`, this field is not required and any value specified will not take effect. 
     * @return AllowClientIPList The client ip to allow. it can be an ipv4/ipv6 address or a cidr block. 0.0.0.0/0 means to allow all ipv4 clients for debugging; ::/0 means to allow all ipv6 clients for debugging; 127.0.0.1 is not allowed. <br>note: this field is required when `switch=on` and the number of entries should be 1-100. when `switch=off`, this field is not required and any value specified will not take effect.
     */
    public String [] getAllowClientIPList() {
        return this.AllowClientIPList;
    }

    /**
     * Set The client ip to allow. it can be an ipv4/ipv6 address or a cidr block. 0.0.0.0/0 means to allow all ipv4 clients for debugging; ::/0 means to allow all ipv6 clients for debugging; 127.0.0.1 is not allowed. <br>note: this field is required when `switch=on` and the number of entries should be 1-100. when `switch=off`, this field is not required and any value specified will not take effect.
     * @param AllowClientIPList The client ip to allow. it can be an ipv4/ipv6 address or a cidr block. 0.0.0.0/0 means to allow all ipv4 clients for debugging; ::/0 means to allow all ipv6 clients for debugging; 127.0.0.1 is not allowed. <br>note: this field is required when `switch=on` and the number of entries should be 1-100. when `switch=off`, this field is not required and any value specified will not take effect.
     */
    public void setAllowClientIPList(String [] AllowClientIPList) {
        this.AllowClientIPList = AllowClientIPList;
    }

    /**
     * Get Debug feature expiration time. the feature will be disabled after the set time. <br>note: this field is required when `switch=on`. when `switch=off`, this field is not required and any value specified will not take effect. 
     * @return Expires Debug feature expiration time. the feature will be disabled after the set time. <br>note: this field is required when `switch=on`. when `switch=off`, this field is not required and any value specified will not take effect.
     */
    public String getExpires() {
        return this.Expires;
    }

    /**
     * Set Debug feature expiration time. the feature will be disabled after the set time. <br>note: this field is required when `switch=on`. when `switch=off`, this field is not required and any value specified will not take effect.
     * @param Expires Debug feature expiration time. the feature will be disabled after the set time. <br>note: this field is required when `switch=on`. when `switch=off`, this field is not required and any value specified will not take effect.
     */
    public void setExpires(String Expires) {
        this.Expires = Expires;
    }

    public StandardDebugParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardDebugParameters(StandardDebugParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AllowClientIPList != null) {
            this.AllowClientIPList = new String[source.AllowClientIPList.length];
            for (int i = 0; i < source.AllowClientIPList.length; i++) {
                this.AllowClientIPList[i] = new String(source.AllowClientIPList[i]);
            }
        }
        if (source.Expires != null) {
            this.Expires = new String(source.Expires);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "AllowClientIPList.", this.AllowClientIPList);
        this.setParamSimple(map, prefix + "Expires", this.Expires);

    }
}

