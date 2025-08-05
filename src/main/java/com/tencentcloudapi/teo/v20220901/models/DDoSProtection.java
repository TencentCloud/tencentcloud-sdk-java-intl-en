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
    * Specifies the protection scope of standalone DDoS. valid values:.
<li>protect_all_domains: specifies exclusive Anti-DDoS protection for all domain names in the site. newly added domain names automatically enable exclusive Anti-DDoS protection. when this parameter is specified, DomainDDoSProtections will not be processed.</li>.
<li>protect_specified_domains: only applicable to specified domains. specific scope can be set via DomainDDoSProtection parameter.</li>.
    */
    @SerializedName("ProtectionOption")
    @Expose
    private String ProtectionOption;

    /**
    * Anti-DDoS configuration of the domain. specifies the exclusive ddos protection settings for the domain in request parameters.
<li>When ProtectionOption remains protect_specified_domains, the domain names not filled in keep their exclusive Anti-DDoS protection configuration unchanged, while explicitly specified domain names are updated according to the input parameters.</li>.
<li>When ProtectionOption switches from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, disable exclusive DDoS protection for all domains under the site; if DomainDDoSProtections is not empty, disable or maintain exclusive DDoS protection for the domain names specified in the parameter, and disable exclusive DDoS protection for other unlisted domain names.</li>.
    */
    @SerializedName("DomainDDoSProtections")
    @Expose
    private DomainDDoSProtection [] DomainDDoSProtections;

    /**
    * Specifies the exclusive DDoS protection configuration of a shared CNAME. used as an output parameter.
    */
    @SerializedName("SharedCNAMEDDoSProtections")
    @Expose
    private DomainDDoSProtection [] SharedCNAMEDDoSProtections;

    /**
     * Get Specifies the protection scope of standalone DDoS. valid values:.
<li>protect_all_domains: specifies exclusive Anti-DDoS protection for all domain names in the site. newly added domain names automatically enable exclusive Anti-DDoS protection. when this parameter is specified, DomainDDoSProtections will not be processed.</li>.
<li>protect_specified_domains: only applicable to specified domains. specific scope can be set via DomainDDoSProtection parameter.</li>. 
     * @return ProtectionOption Specifies the protection scope of standalone DDoS. valid values:.
<li>protect_all_domains: specifies exclusive Anti-DDoS protection for all domain names in the site. newly added domain names automatically enable exclusive Anti-DDoS protection. when this parameter is specified, DomainDDoSProtections will not be processed.</li>.
<li>protect_specified_domains: only applicable to specified domains. specific scope can be set via DomainDDoSProtection parameter.</li>.
     */
    public String getProtectionOption() {
        return this.ProtectionOption;
    }

    /**
     * Set Specifies the protection scope of standalone DDoS. valid values:.
<li>protect_all_domains: specifies exclusive Anti-DDoS protection for all domain names in the site. newly added domain names automatically enable exclusive Anti-DDoS protection. when this parameter is specified, DomainDDoSProtections will not be processed.</li>.
<li>protect_specified_domains: only applicable to specified domains. specific scope can be set via DomainDDoSProtection parameter.</li>.
     * @param ProtectionOption Specifies the protection scope of standalone DDoS. valid values:.
<li>protect_all_domains: specifies exclusive Anti-DDoS protection for all domain names in the site. newly added domain names automatically enable exclusive Anti-DDoS protection. when this parameter is specified, DomainDDoSProtections will not be processed.</li>.
<li>protect_specified_domains: only applicable to specified domains. specific scope can be set via DomainDDoSProtection parameter.</li>.
     */
    public void setProtectionOption(String ProtectionOption) {
        this.ProtectionOption = ProtectionOption;
    }

    /**
     * Get Anti-DDoS configuration of the domain. specifies the exclusive ddos protection settings for the domain in request parameters.
<li>When ProtectionOption remains protect_specified_domains, the domain names not filled in keep their exclusive Anti-DDoS protection configuration unchanged, while explicitly specified domain names are updated according to the input parameters.</li>.
<li>When ProtectionOption switches from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, disable exclusive DDoS protection for all domains under the site; if DomainDDoSProtections is not empty, disable or maintain exclusive DDoS protection for the domain names specified in the parameter, and disable exclusive DDoS protection for other unlisted domain names.</li>. 
     * @return DomainDDoSProtections Anti-DDoS configuration of the domain. specifies the exclusive ddos protection settings for the domain in request parameters.
<li>When ProtectionOption remains protect_specified_domains, the domain names not filled in keep their exclusive Anti-DDoS protection configuration unchanged, while explicitly specified domain names are updated according to the input parameters.</li>.
<li>When ProtectionOption switches from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, disable exclusive DDoS protection for all domains under the site; if DomainDDoSProtections is not empty, disable or maintain exclusive DDoS protection for the domain names specified in the parameter, and disable exclusive DDoS protection for other unlisted domain names.</li>.
     */
    public DomainDDoSProtection [] getDomainDDoSProtections() {
        return this.DomainDDoSProtections;
    }

    /**
     * Set Anti-DDoS configuration of the domain. specifies the exclusive ddos protection settings for the domain in request parameters.
<li>When ProtectionOption remains protect_specified_domains, the domain names not filled in keep their exclusive Anti-DDoS protection configuration unchanged, while explicitly specified domain names are updated according to the input parameters.</li>.
<li>When ProtectionOption switches from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, disable exclusive DDoS protection for all domains under the site; if DomainDDoSProtections is not empty, disable or maintain exclusive DDoS protection for the domain names specified in the parameter, and disable exclusive DDoS protection for other unlisted domain names.</li>.
     * @param DomainDDoSProtections Anti-DDoS configuration of the domain. specifies the exclusive ddos protection settings for the domain in request parameters.
<li>When ProtectionOption remains protect_specified_domains, the domain names not filled in keep their exclusive Anti-DDoS protection configuration unchanged, while explicitly specified domain names are updated according to the input parameters.</li>.
<li>When ProtectionOption switches from protect_all_domains to protect_specified_domains: if DomainDDoSProtections is empty, disable exclusive DDoS protection for all domains under the site; if DomainDDoSProtections is not empty, disable or maintain exclusive DDoS protection for the domain names specified in the parameter, and disable exclusive DDoS protection for other unlisted domain names.</li>.
     */
    public void setDomainDDoSProtections(DomainDDoSProtection [] DomainDDoSProtections) {
        this.DomainDDoSProtections = DomainDDoSProtections;
    }

    /**
     * Get Specifies the exclusive DDoS protection configuration of a shared CNAME. used as an output parameter. 
     * @return SharedCNAMEDDoSProtections Specifies the exclusive DDoS protection configuration of a shared CNAME. used as an output parameter.
     */
    public DomainDDoSProtection [] getSharedCNAMEDDoSProtections() {
        return this.SharedCNAMEDDoSProtections;
    }

    /**
     * Set Specifies the exclusive DDoS protection configuration of a shared CNAME. used as an output parameter.
     * @param SharedCNAMEDDoSProtections Specifies the exclusive DDoS protection configuration of a shared CNAME. used as an output parameter.
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

