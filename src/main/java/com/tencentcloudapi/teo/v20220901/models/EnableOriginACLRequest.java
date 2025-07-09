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

public class EnableOriginACLRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The mode of configurating origin ACLs for L7 acceleration domains.
- all: configurate origin ACLs for all L7 acceleration domains under the site.
- specific: configurate origin ACLs for designated L7 acceleration domains under the site.
When the parameter is empty, it defaults to specific.

    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * The list of L7 acceleration domains that require enabling the origin ACLs. This list must be empty when the request parameter L7EnableMode is set to 'all'. A maximum of 200 domains are supported at a time.
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * The mode of configurating origin ACLs for L4 proxy Instances.
- all: configurate origin ACLs for all L4 proxy Instances under the site.
- specific: configurate origin ACLs for designated  L4 proxy Instances under the site.
When the parameter is empty, it defaults to specific.
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * The list of L4 proxy Instances that require enabling origin ACLs. This list must be empty when the request parameter L4EnableMode is set to 'all'. A maximum of 100 instances are supported at a time.
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The mode of configurating origin ACLs for L7 acceleration domains.
- all: configurate origin ACLs for all L7 acceleration domains under the site.
- specific: configurate origin ACLs for designated L7 acceleration domains under the site.
When the parameter is empty, it defaults to specific.
 
     * @return L7EnableMode The mode of configurating origin ACLs for L7 acceleration domains.
- all: configurate origin ACLs for all L7 acceleration domains under the site.
- specific: configurate origin ACLs for designated L7 acceleration domains under the site.
When the parameter is empty, it defaults to specific.

     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set The mode of configurating origin ACLs for L7 acceleration domains.
- all: configurate origin ACLs for all L7 acceleration domains under the site.
- specific: configurate origin ACLs for designated L7 acceleration domains under the site.
When the parameter is empty, it defaults to specific.

     * @param L7EnableMode The mode of configurating origin ACLs for L7 acceleration domains.
- all: configurate origin ACLs for all L7 acceleration domains under the site.
- specific: configurate origin ACLs for designated L7 acceleration domains under the site.
When the parameter is empty, it defaults to specific.

     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get The list of L7 acceleration domains that require enabling the origin ACLs. This list must be empty when the request parameter L7EnableMode is set to 'all'. A maximum of 200 domains are supported at a time. 
     * @return L7Hosts The list of L7 acceleration domains that require enabling the origin ACLs. This list must be empty when the request parameter L7EnableMode is set to 'all'. A maximum of 200 domains are supported at a time.
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set The list of L7 acceleration domains that require enabling the origin ACLs. This list must be empty when the request parameter L7EnableMode is set to 'all'. A maximum of 200 domains are supported at a time.
     * @param L7Hosts The list of L7 acceleration domains that require enabling the origin ACLs. This list must be empty when the request parameter L7EnableMode is set to 'all'. A maximum of 200 domains are supported at a time.
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get The mode of configurating origin ACLs for L4 proxy Instances.
- all: configurate origin ACLs for all L4 proxy Instances under the site.
- specific: configurate origin ACLs for designated  L4 proxy Instances under the site.
When the parameter is empty, it defaults to specific. 
     * @return L4EnableMode The mode of configurating origin ACLs for L4 proxy Instances.
- all: configurate origin ACLs for all L4 proxy Instances under the site.
- specific: configurate origin ACLs for designated  L4 proxy Instances under the site.
When the parameter is empty, it defaults to specific.
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set The mode of configurating origin ACLs for L4 proxy Instances.
- all: configurate origin ACLs for all L4 proxy Instances under the site.
- specific: configurate origin ACLs for designated  L4 proxy Instances under the site.
When the parameter is empty, it defaults to specific.
     * @param L4EnableMode The mode of configurating origin ACLs for L4 proxy Instances.
- all: configurate origin ACLs for all L4 proxy Instances under the site.
- specific: configurate origin ACLs for designated  L4 proxy Instances under the site.
When the parameter is empty, it defaults to specific.
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get The list of L4 proxy Instances that require enabling origin ACLs. This list must be empty when the request parameter L4EnableMode is set to 'all'. A maximum of 100 instances are supported at a time. 
     * @return L4ProxyIds The list of L4 proxy Instances that require enabling origin ACLs. This list must be empty when the request parameter L4EnableMode is set to 'all'. A maximum of 100 instances are supported at a time.
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set The list of L4 proxy Instances that require enabling origin ACLs. This list must be empty when the request parameter L4EnableMode is set to 'all'. A maximum of 100 instances are supported at a time.
     * @param L4ProxyIds The list of L4 proxy Instances that require enabling origin ACLs. This list must be empty when the request parameter L4EnableMode is set to 'all'. A maximum of 100 instances are supported at a time.
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    public EnableOriginACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableOriginACLRequest(EnableOriginACLRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.L7EnableMode != null) {
            this.L7EnableMode = new String(source.L7EnableMode);
        }
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4EnableMode != null) {
            this.L4EnableMode = new String(source.L4EnableMode);
        }
        if (source.L4ProxyIds != null) {
            this.L4ProxyIds = new String[source.L4ProxyIds.length];
            for (int i = 0; i < source.L4ProxyIds.length; i++) {
                this.L4ProxyIds[i] = new String(source.L4ProxyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "L7EnableMode", this.L7EnableMode);
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamSimple(map, prefix + "L4EnableMode", this.L4EnableMode);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);

    }
}

