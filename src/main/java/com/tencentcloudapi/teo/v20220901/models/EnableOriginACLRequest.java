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
    * When first enabling origin protection for a site, configure the layer-7 acceleration domain name in specific IP range mode.
<li>ALL: Target all layer-7 acceleration domain names under the current site. When the number of domains exceeds 200, please go through first in specific mode to enable 200 domain names, and enable the remaining resource via the ModifyOriginACL API.</li>
<li>Specific: Enables layer-7 acceleration for the site's designated domain name.</li>Note: When no parameter is defined, the default is specific. For subsequent addition of layer-7 acceleration domain names or layer-4 proxy instances, configure them via the ModifyOriginACL API.
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
    * When first enabling origin protection for a site, configure the Layer 4 Proxy Instance Configuration in specific IP range mode.
<li>ALL: Enable all L4 proxy instances under the current site. When the instance count exceeds 100, please go through specific mode to enable 100 domain names first. Enable the remaining resources via the ModifyOriginACL API.</li>
<li>specific: Enable for the designated L4 proxy instance under the site.</li>Note: When no parameter is defined, the default is specific. Configure subsequent addition of L7 acceleration domains/L4 proxy instances via the ModifyOriginACL API.
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
    * The origin protection back-to-origin ACL control domain. If left empty, the standard global control domain is used by default. Available control domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

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
     * Get When first enabling origin protection for a site, configure the layer-7 acceleration domain name in specific IP range mode.
<li>ALL: Target all layer-7 acceleration domain names under the current site. When the number of domains exceeds 200, please go through first in specific mode to enable 200 domain names, and enable the remaining resource via the ModifyOriginACL API.</li>
<li>Specific: Enables layer-7 acceleration for the site's designated domain name.</li>Note: When no parameter is defined, the default is specific. For subsequent addition of layer-7 acceleration domain names or layer-4 proxy instances, configure them via the ModifyOriginACL API. 
     * @return L7EnableMode When first enabling origin protection for a site, configure the layer-7 acceleration domain name in specific IP range mode.
<li>ALL: Target all layer-7 acceleration domain names under the current site. When the number of domains exceeds 200, please go through first in specific mode to enable 200 domain names, and enable the remaining resource via the ModifyOriginACL API.</li>
<li>Specific: Enables layer-7 acceleration for the site's designated domain name.</li>Note: When no parameter is defined, the default is specific. For subsequent addition of layer-7 acceleration domain names or layer-4 proxy instances, configure them via the ModifyOriginACL API.
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set When first enabling origin protection for a site, configure the layer-7 acceleration domain name in specific IP range mode.
<li>ALL: Target all layer-7 acceleration domain names under the current site. When the number of domains exceeds 200, please go through first in specific mode to enable 200 domain names, and enable the remaining resource via the ModifyOriginACL API.</li>
<li>Specific: Enables layer-7 acceleration for the site's designated domain name.</li>Note: When no parameter is defined, the default is specific. For subsequent addition of layer-7 acceleration domain names or layer-4 proxy instances, configure them via the ModifyOriginACL API.
     * @param L7EnableMode When first enabling origin protection for a site, configure the layer-7 acceleration domain name in specific IP range mode.
<li>ALL: Target all layer-7 acceleration domain names under the current site. When the number of domains exceeds 200, please go through first in specific mode to enable 200 domain names, and enable the remaining resource via the ModifyOriginACL API.</li>
<li>Specific: Enables layer-7 acceleration for the site's designated domain name.</li>Note: When no parameter is defined, the default is specific. For subsequent addition of layer-7 acceleration domain names or layer-4 proxy instances, configure them via the ModifyOriginACL API.
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
     * Get When first enabling origin protection for a site, configure the Layer 4 Proxy Instance Configuration in specific IP range mode.
<li>ALL: Enable all L4 proxy instances under the current site. When the instance count exceeds 100, please go through specific mode to enable 100 domain names first. Enable the remaining resources via the ModifyOriginACL API.</li>
<li>specific: Enable for the designated L4 proxy instance under the site.</li>Note: When no parameter is defined, the default is specific. Configure subsequent addition of L7 acceleration domains/L4 proxy instances via the ModifyOriginACL API. 
     * @return L4EnableMode When first enabling origin protection for a site, configure the Layer 4 Proxy Instance Configuration in specific IP range mode.
<li>ALL: Enable all L4 proxy instances under the current site. When the instance count exceeds 100, please go through specific mode to enable 100 domain names first. Enable the remaining resources via the ModifyOriginACL API.</li>
<li>specific: Enable for the designated L4 proxy instance under the site.</li>Note: When no parameter is defined, the default is specific. Configure subsequent addition of L7 acceleration domains/L4 proxy instances via the ModifyOriginACL API.
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set When first enabling origin protection for a site, configure the Layer 4 Proxy Instance Configuration in specific IP range mode.
<li>ALL: Enable all L4 proxy instances under the current site. When the instance count exceeds 100, please go through specific mode to enable 100 domain names first. Enable the remaining resources via the ModifyOriginACL API.</li>
<li>specific: Enable for the designated L4 proxy instance under the site.</li>Note: When no parameter is defined, the default is specific. Configure subsequent addition of L7 acceleration domains/L4 proxy instances via the ModifyOriginACL API.
     * @param L4EnableMode When first enabling origin protection for a site, configure the Layer 4 Proxy Instance Configuration in specific IP range mode.
<li>ALL: Enable all L4 proxy instances under the current site. When the instance count exceeds 100, please go through specific mode to enable 100 domain names first. Enable the remaining resources via the ModifyOriginACL API.</li>
<li>specific: Enable for the designated L4 proxy instance under the site.</li>Note: When no parameter is defined, the default is specific. Configure subsequent addition of L7 acceleration domains/L4 proxy instances via the ModifyOriginACL API.
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

    /**
     * Get The origin protection back-to-origin ACL control domain. If left empty, the standard global control domain is used by default. Available control domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li> 
     * @return OriginACLFamily The origin protection back-to-origin ACL control domain. If left empty, the standard global control domain is used by default. Available control domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set The origin protection back-to-origin ACL control domain. If left empty, the standard global control domain is used by default. Available control domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     * @param OriginACLFamily The origin protection back-to-origin ACL control domain. If left empty, the standard global control domain is used by default. Available control domain information can be obtained through the DescribeAvailableOriginACLFamily API query.
Valid values are as follows:
<li>gaz: Standard global availability zone control domain;</li>
<li>mlc: Standard Chinese mainland availability zone control domain;</li>
<li>emc: Standard global (exclude Chinese mainland) availability zone control domain;</li>
<li>plat-gaz: Simplify global availability zone control domain;</li>
<li>plat-mlc: Simplified Chinese mainland availability zone control domain;</li>
<li>plat-emc: Simplify the global (excluding Chinese mainland) availability zone control domain;</li>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
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
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
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
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

