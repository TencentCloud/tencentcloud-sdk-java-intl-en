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
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Origin protection mode for Layer 7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All Layer 7 accelerated domains in the site are automatically added to the origin protection list, including Layer 7 accelerated domains added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the Layer 7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty. When the number of Layer 7 accelerated domains in the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * <p>List of Layer 7 accelerated domains for which origin protection is to be enabled. This parameter takes effect only when L7EnableMode is specific. A maximum of 200 Layer 7 accelerated domains can be enabled at a time. If you want to enable more than 200 domains, use the ModifyOriginACL API for sharded configuration.</p>
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site are automatically added to the origin protection list, including layer-4 proxy instance resources added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty. When the number of layer-4 proxy instances in the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * <p>List of layer-4 proxy instances for which origin protection is to be enabled. This parameter takes effect only when L4EnableMode is specific. A maximum of 100 layer-4 proxy instances can be enabled at a time. If you want to enable more than 100 layer-4 proxy instances, use the ModifyOriginACL API for sharded configuration.</p>
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * <p>Origin ACL control domain for origin protection. If not specified, the standard global control domain is used by default. Available control domains can be obtained through the DescribeAvailableOriginACLFamily API.<br>Valid values:</p><li>gaz: standard global AZ control domain;</li><li>mlc: standard Chinese mainland AZ control domain;</li><li>emc: standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: simplified global AZ control domain;</li><li>plat-mlc: simplified Chinese mainland AZ control domain;</li><li>plat-emc: simplified global (excluding Chinese mainland) AZ control domain;</li>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Origin protection mode for Layer 7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All Layer 7 accelerated domains in the site are automatically added to the origin protection list, including Layer 7 accelerated domains added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the Layer 7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty. When the number of Layer 7 accelerated domains in the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p> 
     * @return L7EnableMode <p>Origin protection mode for Layer 7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All Layer 7 accelerated domains in the site are automatically added to the origin protection list, including Layer 7 accelerated domains added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the Layer 7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty. When the number of Layer 7 accelerated domains in the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set <p>Origin protection mode for Layer 7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All Layer 7 accelerated domains in the site are automatically added to the origin protection list, including Layer 7 accelerated domains added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the Layer 7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty. When the number of Layer 7 accelerated domains in the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     * @param L7EnableMode <p>Origin protection mode for Layer 7 accelerated domains. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All Layer 7 accelerated domains in the site are automatically added to the origin protection list, including Layer 7 accelerated domains added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the Layer 7 accelerated domains to be added to origin protection (specified by the L7Hosts parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L7Hosts empty. When the number of Layer 7 accelerated domains in the site exceeds 200, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get <p>List of Layer 7 accelerated domains for which origin protection is to be enabled. This parameter takes effect only when L7EnableMode is specific. A maximum of 200 Layer 7 accelerated domains can be enabled at a time. If you want to enable more than 200 domains, use the ModifyOriginACL API for sharded configuration.</p> 
     * @return L7Hosts <p>List of Layer 7 accelerated domains for which origin protection is to be enabled. This parameter takes effect only when L7EnableMode is specific. A maximum of 200 Layer 7 accelerated domains can be enabled at a time. If you want to enable more than 200 domains, use the ModifyOriginACL API for sharded configuration.</p>
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set <p>List of Layer 7 accelerated domains for which origin protection is to be enabled. This parameter takes effect only when L7EnableMode is specific. A maximum of 200 Layer 7 accelerated domains can be enabled at a time. If you want to enable more than 200 domains, use the ModifyOriginACL API for sharded configuration.</p>
     * @param L7Hosts <p>List of Layer 7 accelerated domains for which origin protection is to be enabled. This parameter takes effect only when L7EnableMode is specific. A maximum of 200 Layer 7 accelerated domains can be enabled at a time. If you want to enable more than 200 domains, use the ModifyOriginACL API for sharded configuration.</p>
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site are automatically added to the origin protection list, including layer-4 proxy instance resources added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty. When the number of layer-4 proxy instances in the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p> 
     * @return L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site are automatically added to the origin protection list, including layer-4 proxy instance resources added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty. When the number of layer-4 proxy instances in the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site are automatically added to the origin protection list, including layer-4 proxy instance resources added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty. When the number of layer-4 proxy instances in the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     * @param L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Default value: specific.<li>all: <strong>Automatic protection mode</strong>. All layer-4 proxy instances in the site are automatically added to the origin protection list, including layer-4 proxy instance resources added later.</li><li>specific: <strong>Manual protection mode</strong>. You need to manually specify the layer-4 proxy instances to be added to origin protection (specified by the L4ProxyIds parameter). Resources not specified are not added to the origin protection list. You can adjust protected resources later through the ModifyOriginACL API.</li>Note: When the value is all, leave L4ProxyIds empty. When the number of layer-4 proxy instances in the site exceeds 100, enable protection in specific mode first, enable the remaining resources through the ModifyOriginACL API, and then switch to all through the ModifyOriginACL API.</p>
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get <p>List of layer-4 proxy instances for which origin protection is to be enabled. This parameter takes effect only when L4EnableMode is specific. A maximum of 100 layer-4 proxy instances can be enabled at a time. If you want to enable more than 100 layer-4 proxy instances, use the ModifyOriginACL API for sharded configuration.</p> 
     * @return L4ProxyIds <p>List of layer-4 proxy instances for which origin protection is to be enabled. This parameter takes effect only when L4EnableMode is specific. A maximum of 100 layer-4 proxy instances can be enabled at a time. If you want to enable more than 100 layer-4 proxy instances, use the ModifyOriginACL API for sharded configuration.</p>
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set <p>List of layer-4 proxy instances for which origin protection is to be enabled. This parameter takes effect only when L4EnableMode is specific. A maximum of 100 layer-4 proxy instances can be enabled at a time. If you want to enable more than 100 layer-4 proxy instances, use the ModifyOriginACL API for sharded configuration.</p>
     * @param L4ProxyIds <p>List of layer-4 proxy instances for which origin protection is to be enabled. This parameter takes effect only when L4EnableMode is specific. A maximum of 100 layer-4 proxy instances can be enabled at a time. If you want to enable more than 100 layer-4 proxy instances, use the ModifyOriginACL API for sharded configuration.</p>
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get <p>Origin ACL control domain for origin protection. If not specified, the standard global control domain is used by default. Available control domains can be obtained through the DescribeAvailableOriginACLFamily API.<br>Valid values:</p><li>gaz: standard global AZ control domain;</li><li>mlc: standard Chinese mainland AZ control domain;</li><li>emc: standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: simplified global AZ control domain;</li><li>plat-mlc: simplified Chinese mainland AZ control domain;</li><li>plat-emc: simplified global (excluding Chinese mainland) AZ control domain;</li> 
     * @return OriginACLFamily <p>Origin ACL control domain for origin protection. If not specified, the standard global control domain is used by default. Available control domains can be obtained through the DescribeAvailableOriginACLFamily API.<br>Valid values:</p><li>gaz: standard global AZ control domain;</li><li>mlc: standard Chinese mainland AZ control domain;</li><li>emc: standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: simplified global AZ control domain;</li><li>plat-mlc: simplified Chinese mainland AZ control domain;</li><li>plat-emc: simplified global (excluding Chinese mainland) AZ control domain;</li>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set <p>Origin ACL control domain for origin protection. If not specified, the standard global control domain is used by default. Available control domains can be obtained through the DescribeAvailableOriginACLFamily API.<br>Valid values:</p><li>gaz: standard global AZ control domain;</li><li>mlc: standard Chinese mainland AZ control domain;</li><li>emc: standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: simplified global AZ control domain;</li><li>plat-mlc: simplified Chinese mainland AZ control domain;</li><li>plat-emc: simplified global (excluding Chinese mainland) AZ control domain;</li>
     * @param OriginACLFamily <p>Origin ACL control domain for origin protection. If not specified, the standard global control domain is used by default. Available control domains can be obtained through the DescribeAvailableOriginACLFamily API.<br>Valid values:</p><li>gaz: standard global AZ control domain;</li><li>mlc: standard Chinese mainland AZ control domain;</li><li>emc: standard global (excluding Chinese mainland) AZ control domain;</li><li>plat-gaz: simplified global AZ control domain;</li><li>plat-mlc: simplified Chinese mainland AZ control domain;</li><li>plat-emc: simplified global (excluding Chinese mainland) AZ control domain;</li>
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

