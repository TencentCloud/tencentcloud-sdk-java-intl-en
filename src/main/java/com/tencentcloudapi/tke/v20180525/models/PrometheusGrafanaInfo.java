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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusGrafanaInfo extends AbstractModel {

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Domain name. It will be effective only when the public network access is enabled.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The private network or public network address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Whether the public network access is enabled.
`close`: the public network access is not enabled
`opening`: the public network access is being enabled
`open`: the public network access is enabled
    */
    @SerializedName("Internet")
    @Expose
    private String Internet;

    /**
    * The user name of the grafana admin
    */
    @SerializedName("AdminUser")
    @Expose
    private String AdminUser;

    /**
     * Get Whether it is enabled 
     * @return Enabled Whether it is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
     * @param Enabled Whether it is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Domain name. It will be effective only when the public network access is enabled. 
     * @return Domain Domain name. It will be effective only when the public network access is enabled.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name. It will be effective only when the public network access is enabled.
     * @param Domain Domain name. It will be effective only when the public network access is enabled.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The private network or public network address 
     * @return Address The private network or public network address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set The private network or public network address
     * @param Address The private network or public network address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Whether the public network access is enabled.
`close`: the public network access is not enabled
`opening`: the public network access is being enabled
`open`: the public network access is enabled 
     * @return Internet Whether the public network access is enabled.
`close`: the public network access is not enabled
`opening`: the public network access is being enabled
`open`: the public network access is enabled
     */
    public String getInternet() {
        return this.Internet;
    }

    /**
     * Set Whether the public network access is enabled.
`close`: the public network access is not enabled
`opening`: the public network access is being enabled
`open`: the public network access is enabled
     * @param Internet Whether the public network access is enabled.
`close`: the public network access is not enabled
`opening`: the public network access is being enabled
`open`: the public network access is enabled
     */
    public void setInternet(String Internet) {
        this.Internet = Internet;
    }

    /**
     * Get The user name of the grafana admin 
     * @return AdminUser The user name of the grafana admin
     */
    public String getAdminUser() {
        return this.AdminUser;
    }

    /**
     * Set The user name of the grafana admin
     * @param AdminUser The user name of the grafana admin
     */
    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    public PrometheusGrafanaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusGrafanaInfo(PrometheusGrafanaInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Internet != null) {
            this.Internet = new String(source.Internet);
        }
        if (source.AdminUser != null) {
            this.AdminUser = new String(source.AdminUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Internet", this.Internet);
        this.setParamSimple(map, prefix + "AdminUser", this.AdminUser);

    }
}

