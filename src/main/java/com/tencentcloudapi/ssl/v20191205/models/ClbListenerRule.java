/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbListenerRule extends AbstractModel{

    /**
    * The rule ID.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * The domains bound.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Whether the rule matches the domains to be associated with a certificate.
    */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
    * The certificates associated with the rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Certificate")
    @Expose
    private Certificate Certificate;

    /**
    * The list of non-matching domains.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get The rule ID. 
     * @return LocationId The rule ID.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set The rule ID.
     * @param LocationId The rule ID.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get The domains bound. 
     * @return Domain The domains bound.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domains bound.
     * @param Domain The domains bound.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Whether the rule matches the domains to be associated with a certificate. 
     * @return IsMatch Whether the rule matches the domains to be associated with a certificate.
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set Whether the rule matches the domains to be associated with a certificate.
     * @param IsMatch Whether the rule matches the domains to be associated with a certificate.
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Get The certificates associated with the rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Certificate The certificates associated with the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Certificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set The certificates associated with the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Certificate The certificates associated with the rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificate(Certificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get The list of non-matching domains.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoMatchDomains The list of non-matching domains.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set The list of non-matching domains.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoMatchDomains The list of non-matching domains.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public ClbListenerRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerRule(ClbListenerRule source) {
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IsMatch != null) {
            this.IsMatch = new Boolean(source.IsMatch);
        }
        if (source.Certificate != null) {
            this.Certificate = new Certificate(source.Certificate);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

