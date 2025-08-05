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

public class DomainDDoSProtection extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Standalone DDoS switch of the domain. valid values:.
<li>on: enabled;</li>.
<li>off: closed.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Standalone DDoS switch of the domain. valid values:.
<li>on: enabled;</li>.
<li>off: closed.</li>. 
     * @return Switch Standalone DDoS switch of the domain. valid values:.
<li>on: enabled;</li>.
<li>off: closed.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Standalone DDoS switch of the domain. valid values:.
<li>on: enabled;</li>.
<li>off: closed.</li>.
     * @param Switch Standalone DDoS switch of the domain. valid values:.
<li>on: enabled;</li>.
<li>off: closed.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DomainDDoSProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainDDoSProtection(DomainDDoSProtection source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

