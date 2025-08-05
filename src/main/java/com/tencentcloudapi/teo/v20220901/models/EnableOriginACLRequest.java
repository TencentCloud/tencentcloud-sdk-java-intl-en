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
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * L7 acceleration domain name activation in origin protection mode.
<li>`all`: enable layer-7 acceleration domain names for the site.</li>.
<Li>Specific: enable for the site's designated layer-7 acceleration domain name.</li>when no parameter is defined, the default is specific.
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * Enable the list of layer-7 acceleration domain names with origin protection. this parameter is valid only when L7EnableMode is set to specific. when L7EnableMode is set to all, retain this parameter as empty. only supports up to 200 layer-7 acceleration domain names in a single operation.
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * Specifies the origin protection mode of the l4 proxy instance.
<Li>ALL: enable for all l4 proxy instances under the site.</li>.
<Li>Specific: enable for the designated layer 4 proxy instance of the site.</li>when no parameter is defined, the default is specific.
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * The list of L4 proxy instances with origin protection enabled. this parameter is valid only when L4EnableMode is set to specific. retain this parameter empty when L4EnableMode is set to all. only supports up to 100 layer-4 proxy instances per operation.
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get L7 acceleration domain name activation in origin protection mode.
<li>`all`: enable layer-7 acceleration domain names for the site.</li>.
<Li>Specific: enable for the site's designated layer-7 acceleration domain name.</li>when no parameter is defined, the default is specific. 
     * @return L7EnableMode L7 acceleration domain name activation in origin protection mode.
<li>`all`: enable layer-7 acceleration domain names for the site.</li>.
<Li>Specific: enable for the site's designated layer-7 acceleration domain name.</li>when no parameter is defined, the default is specific.
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set L7 acceleration domain name activation in origin protection mode.
<li>`all`: enable layer-7 acceleration domain names for the site.</li>.
<Li>Specific: enable for the site's designated layer-7 acceleration domain name.</li>when no parameter is defined, the default is specific.
     * @param L7EnableMode L7 acceleration domain name activation in origin protection mode.
<li>`all`: enable layer-7 acceleration domain names for the site.</li>.
<Li>Specific: enable for the site's designated layer-7 acceleration domain name.</li>when no parameter is defined, the default is specific.
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get Enable the list of layer-7 acceleration domain names with origin protection. this parameter is valid only when L7EnableMode is set to specific. when L7EnableMode is set to all, retain this parameter as empty. only supports up to 200 layer-7 acceleration domain names in a single operation. 
     * @return L7Hosts Enable the list of layer-7 acceleration domain names with origin protection. this parameter is valid only when L7EnableMode is set to specific. when L7EnableMode is set to all, retain this parameter as empty. only supports up to 200 layer-7 acceleration domain names in a single operation.
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set Enable the list of layer-7 acceleration domain names with origin protection. this parameter is valid only when L7EnableMode is set to specific. when L7EnableMode is set to all, retain this parameter as empty. only supports up to 200 layer-7 acceleration domain names in a single operation.
     * @param L7Hosts Enable the list of layer-7 acceleration domain names with origin protection. this parameter is valid only when L7EnableMode is set to specific. when L7EnableMode is set to all, retain this parameter as empty. only supports up to 200 layer-7 acceleration domain names in a single operation.
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get Specifies the origin protection mode of the l4 proxy instance.
<Li>ALL: enable for all l4 proxy instances under the site.</li>.
<Li>Specific: enable for the designated layer 4 proxy instance of the site.</li>when no parameter is defined, the default is specific. 
     * @return L4EnableMode Specifies the origin protection mode of the l4 proxy instance.
<Li>ALL: enable for all l4 proxy instances under the site.</li>.
<Li>Specific: enable for the designated layer 4 proxy instance of the site.</li>when no parameter is defined, the default is specific.
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set Specifies the origin protection mode of the l4 proxy instance.
<Li>ALL: enable for all l4 proxy instances under the site.</li>.
<Li>Specific: enable for the designated layer 4 proxy instance of the site.</li>when no parameter is defined, the default is specific.
     * @param L4EnableMode Specifies the origin protection mode of the l4 proxy instance.
<Li>ALL: enable for all l4 proxy instances under the site.</li>.
<Li>Specific: enable for the designated layer 4 proxy instance of the site.</li>when no parameter is defined, the default is specific.
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get The list of L4 proxy instances with origin protection enabled. this parameter is valid only when L4EnableMode is set to specific. retain this parameter empty when L4EnableMode is set to all. only supports up to 100 layer-4 proxy instances per operation. 
     * @return L4ProxyIds The list of L4 proxy instances with origin protection enabled. this parameter is valid only when L4EnableMode is set to specific. retain this parameter empty when L4EnableMode is set to all. only supports up to 100 layer-4 proxy instances per operation.
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set The list of L4 proxy instances with origin protection enabled. this parameter is valid only when L4EnableMode is set to specific. retain this parameter empty when L4EnableMode is set to all. only supports up to 100 layer-4 proxy instances per operation.
     * @param L4ProxyIds The list of L4 proxy instances with origin protection enabled. this parameter is valid only when L4EnableMode is set to specific. retain this parameter empty when L4EnableMode is set to all. only supports up to 100 layer-4 proxy instances per operation.
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

