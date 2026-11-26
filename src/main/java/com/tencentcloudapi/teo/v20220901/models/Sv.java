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

public class Sv extends AbstractModel {

    /**
    * Price inquiry parameter key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Quotation parameter value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Quota for inquiry parameter mapping. Valid values:
<li>zone: sites;</li>
<li>custom-rule: number of custom rules;</li>
<li>rate-limiting-rule: rate limiting rule;</li>
<li>l4-proxy-instance: number of L4 proxy instances.</li>
    */
    @SerializedName("Pack")
    @Expose
    private String Pack;

    /**
    * L4 proxy instance Id mapped to the price inquiry parameter.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Inquiry parameter corresponding to the protection level.
Valid values: <li> cm_30G: 30 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_60G: 60 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_100G: 100 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> anycast_300G: 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> anycast_unlimited: unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_300G: 30 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_unlimited: 30 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_300G: 60 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_unlimited: 60 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_300G: 100 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_unlimited: 100 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland).</li>
    */
    @SerializedName("ProtectionSpecs")
    @Expose
    private String ProtectionSpecs;

    /**
     * Get Price inquiry parameter key. 
     * @return Key Price inquiry parameter key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Price inquiry parameter key.
     * @param Key Price inquiry parameter key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Quotation parameter value. 
     * @return Value Quotation parameter value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Quotation parameter value.
     * @param Value Quotation parameter value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Quota for inquiry parameter mapping. Valid values:
<li>zone: sites;</li>
<li>custom-rule: number of custom rules;</li>
<li>rate-limiting-rule: rate limiting rule;</li>
<li>l4-proxy-instance: number of L4 proxy instances.</li> 
     * @return Pack Quota for inquiry parameter mapping. Valid values:
<li>zone: sites;</li>
<li>custom-rule: number of custom rules;</li>
<li>rate-limiting-rule: rate limiting rule;</li>
<li>l4-proxy-instance: number of L4 proxy instances.</li>
     */
    public String getPack() {
        return this.Pack;
    }

    /**
     * Set Quota for inquiry parameter mapping. Valid values:
<li>zone: sites;</li>
<li>custom-rule: number of custom rules;</li>
<li>rate-limiting-rule: rate limiting rule;</li>
<li>l4-proxy-instance: number of L4 proxy instances.</li>
     * @param Pack Quota for inquiry parameter mapping. Valid values:
<li>zone: sites;</li>
<li>custom-rule: number of custom rules;</li>
<li>rate-limiting-rule: rate limiting rule;</li>
<li>l4-proxy-instance: number of L4 proxy instances.</li>
     */
    public void setPack(String Pack) {
        this.Pack = Pack;
    }

    /**
     * Get L4 proxy instance Id mapped to the price inquiry parameter. 
     * @return InstanceId L4 proxy instance Id mapped to the price inquiry parameter.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set L4 proxy instance Id mapped to the price inquiry parameter.
     * @param InstanceId L4 proxy instance Id mapped to the price inquiry parameter.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Inquiry parameter corresponding to the protection level.
Valid values: <li> cm_30G: 30 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_60G: 60 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_100G: 100 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> anycast_300G: 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> anycast_unlimited: unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_300G: 30 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_unlimited: 30 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_300G: 60 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_unlimited: 60 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_300G: 100 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_unlimited: 100 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland).</li> 
     * @return ProtectionSpecs Inquiry parameter corresponding to the protection level.
Valid values: <li> cm_30G: 30 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_60G: 60 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_100G: 100 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> anycast_300G: 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> anycast_unlimited: unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_300G: 30 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_unlimited: 30 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_300G: 60 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_unlimited: 60 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_300G: 100 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_unlimited: 100 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland).</li>
     */
    public String getProtectionSpecs() {
        return this.ProtectionSpecs;
    }

    /**
     * Set Inquiry parameter corresponding to the protection level.
Valid values: <li> cm_30G: 30 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_60G: 60 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_100G: 100 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> anycast_300G: 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> anycast_unlimited: unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_300G: 30 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_unlimited: 30 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_300G: 60 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_unlimited: 60 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_300G: 100 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_unlimited: 100 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland).</li>
     * @param ProtectionSpecs Inquiry parameter corresponding to the protection level.
Valid values: <li> cm_30G: 30 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_60G: 60 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> cm_100G: 100 Gbps baseline protection for the Chinese mainland acceleration area;</li><li> anycast_300G: 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> anycast_unlimited: unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_300G: 30 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_30G_anycast_unlimited: 30 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_300G: 60 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_60G_anycast_unlimited: 60 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_300G: 100 Gbps baseline protection for the Chinese mainland acceleration area, 300 Gbps anycast joint protection for the global acceleration region (outside Chinese mainland);</li><li> cm_100G_anycast_unlimited: 100 Gbps baseline protection for the Chinese mainland acceleration area, unlimited anycast full protection for the global acceleration region (outside Chinese mainland).</li>
     */
    public void setProtectionSpecs(String ProtectionSpecs) {
        this.ProtectionSpecs = ProtectionSpecs;
    }

    public Sv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sv(Sv source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Pack != null) {
            this.Pack = new String(source.Pack);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProtectionSpecs != null) {
            this.ProtectionSpecs = new String(source.ProtectionSpecs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Pack", this.Pack);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProtectionSpecs", this.ProtectionSpecs);

    }
}

