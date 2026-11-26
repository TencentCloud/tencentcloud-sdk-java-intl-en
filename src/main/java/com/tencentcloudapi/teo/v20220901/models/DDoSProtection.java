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

public class DDoSProtection extends AbstractModel {

    /**
    * Specify the protection scope of standalone DDoS. Value:
<li> protect_all_domains: exclusive DDoS protection takes effect for all domains in the site. Newly added domain names automatically enable exclusive DDoS protection. When the input parameter is protect_all_domains, the input parameter DomainDDoSProtections will not be processed;</li>
<li> protect_specified_domains: only applicable to specified domains. The specific scope can be specified via the DomainDDoSProtection parameter.</li>
    */
    @SerializedName("ProtectionOption")
    @Expose
    private String ProtectionOption;

    /**
    * Exclusive DDoS protection configuration of the domain. In the input parameter scenario:
<li> When ProtectionOption remains protect_specified_domains: domains not filled in keep their exclusive DDoS protection configuration unchanged, and explicitly specified domains are updated based on the input parameter;</li>
<li> When ProtectionOption is switched from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, exclusive DDoS protection is disabled for all domain names under the site; if DomainDDoSProtections is not empty, exclusive DDoS protection is disabled or retained for the specified domain names in the parameter, and exclusive DDoS protection is disabled for the rest of the unlisted domain names.</li>
    */
    @SerializedName("DomainDDoSProtections")
    @Expose
    private DomainDDoSProtection [] DomainDDoSProtections;

    /**
    * Configuration of exclusive DDoS protection with a shared CNAME. Used only as an output parameter.
    */
    @SerializedName("SharedCNAMEDDoSProtections")
    @Expose
    private DomainDDoSProtection [] SharedCNAMEDDoSProtections;

    /**
     * Get Specify the protection scope of standalone DDoS. Value:
<li> protect_all_domains: exclusive DDoS protection takes effect for all domains in the site. Newly added domain names automatically enable exclusive DDoS protection. When the input parameter is protect_all_domains, the input parameter DomainDDoSProtections will not be processed;</li>
<li> protect_specified_domains: only applicable to specified domains. The specific scope can be specified via the DomainDDoSProtection parameter.</li> 
     * @return ProtectionOption Specify the protection scope of standalone DDoS. Value:
<li> protect_all_domains: exclusive DDoS protection takes effect for all domains in the site. Newly added domain names automatically enable exclusive DDoS protection. When the input parameter is protect_all_domains, the input parameter DomainDDoSProtections will not be processed;</li>
<li> protect_specified_domains: only applicable to specified domains. The specific scope can be specified via the DomainDDoSProtection parameter.</li>
     */
    public String getProtectionOption() {
        return this.ProtectionOption;
    }

    /**
     * Set Specify the protection scope of standalone DDoS. Value:
<li> protect_all_domains: exclusive DDoS protection takes effect for all domains in the site. Newly added domain names automatically enable exclusive DDoS protection. When the input parameter is protect_all_domains, the input parameter DomainDDoSProtections will not be processed;</li>
<li> protect_specified_domains: only applicable to specified domains. The specific scope can be specified via the DomainDDoSProtection parameter.</li>
     * @param ProtectionOption Specify the protection scope of standalone DDoS. Value:
<li> protect_all_domains: exclusive DDoS protection takes effect for all domains in the site. Newly added domain names automatically enable exclusive DDoS protection. When the input parameter is protect_all_domains, the input parameter DomainDDoSProtections will not be processed;</li>
<li> protect_specified_domains: only applicable to specified domains. The specific scope can be specified via the DomainDDoSProtection parameter.</li>
     */
    public void setProtectionOption(String ProtectionOption) {
        this.ProtectionOption = ProtectionOption;
    }

    /**
     * Get Exclusive DDoS protection configuration of the domain. In the input parameter scenario:
<li> When ProtectionOption remains protect_specified_domains: domains not filled in keep their exclusive DDoS protection configuration unchanged, and explicitly specified domains are updated based on the input parameter;</li>
<li> When ProtectionOption is switched from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, exclusive DDoS protection is disabled for all domain names under the site; if DomainDDoSProtections is not empty, exclusive DDoS protection is disabled or retained for the specified domain names in the parameter, and exclusive DDoS protection is disabled for the rest of the unlisted domain names.</li> 
     * @return DomainDDoSProtections Exclusive DDoS protection configuration of the domain. In the input parameter scenario:
<li> When ProtectionOption remains protect_specified_domains: domains not filled in keep their exclusive DDoS protection configuration unchanged, and explicitly specified domains are updated based on the input parameter;</li>
<li> When ProtectionOption is switched from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, exclusive DDoS protection is disabled for all domain names under the site; if DomainDDoSProtections is not empty, exclusive DDoS protection is disabled or retained for the specified domain names in the parameter, and exclusive DDoS protection is disabled for the rest of the unlisted domain names.</li>
     */
    public DomainDDoSProtection [] getDomainDDoSProtections() {
        return this.DomainDDoSProtections;
    }

    /**
     * Set Exclusive DDoS protection configuration of the domain. In the input parameter scenario:
<li> When ProtectionOption remains protect_specified_domains: domains not filled in keep their exclusive DDoS protection configuration unchanged, and explicitly specified domains are updated based on the input parameter;</li>
<li> When ProtectionOption is switched from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, exclusive DDoS protection is disabled for all domain names under the site; if DomainDDoSProtections is not empty, exclusive DDoS protection is disabled or retained for the specified domain names in the parameter, and exclusive DDoS protection is disabled for the rest of the unlisted domain names.</li>
     * @param DomainDDoSProtections Exclusive DDoS protection configuration of the domain. In the input parameter scenario:
<li> When ProtectionOption remains protect_specified_domains: domains not filled in keep their exclusive DDoS protection configuration unchanged, and explicitly specified domains are updated based on the input parameter;</li>
<li> When ProtectionOption is switched from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, exclusive DDoS protection is disabled for all domain names under the site; if DomainDDoSProtections is not empty, exclusive DDoS protection is disabled or retained for the specified domain names in the parameter, and exclusive DDoS protection is disabled for the rest of the unlisted domain names.</li>
     */
    public void setDomainDDoSProtections(DomainDDoSProtection [] DomainDDoSProtections) {
        this.DomainDDoSProtections = DomainDDoSProtections;
    }

    /**
     * Get Configuration of exclusive DDoS protection with a shared CNAME. Used only as an output parameter. 
     * @return SharedCNAMEDDoSProtections Configuration of exclusive DDoS protection with a shared CNAME. Used only as an output parameter.
     */
    public DomainDDoSProtection [] getSharedCNAMEDDoSProtections() {
        return this.SharedCNAMEDDoSProtections;
    }

    /**
     * Set Configuration of exclusive DDoS protection with a shared CNAME. Used only as an output parameter.
     * @param SharedCNAMEDDoSProtections Configuration of exclusive DDoS protection with a shared CNAME. Used only as an output parameter.
     */
    public void setSharedCNAMEDDoSProtections(DomainDDoSProtection [] SharedCNAMEDDoSProtections) {
        this.SharedCNAMEDDoSProtections = SharedCNAMEDDoSProtections;
    }

    public DDoSProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSProtection(DDoSProtection source) {
        if (source.ProtectionOption != null) {
            this.ProtectionOption = new String(source.ProtectionOption);
        }
        if (source.DomainDDoSProtections != null) {
            this.DomainDDoSProtections = new DomainDDoSProtection[source.DomainDDoSProtections.length];
            for (int i = 0; i < source.DomainDDoSProtections.length; i++) {
                this.DomainDDoSProtections[i] = new DomainDDoSProtection(source.DomainDDoSProtections[i]);
            }
        }
        if (source.SharedCNAMEDDoSProtections != null) {
            this.SharedCNAMEDDoSProtections = new DomainDDoSProtection[source.SharedCNAMEDDoSProtections.length];
            for (int i = 0; i < source.SharedCNAMEDDoSProtections.length; i++) {
                this.SharedCNAMEDDoSProtections[i] = new DomainDDoSProtection(source.SharedCNAMEDDoSProtections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectionOption", this.ProtectionOption);
        this.setParamArrayObj(map, prefix + "DomainDDoSProtections.", this.DomainDDoSProtections);
        this.setParamArrayObj(map, prefix + "SharedCNAMEDDoSProtections.", this.SharedCNAMEDDoSProtections);

    }
}

