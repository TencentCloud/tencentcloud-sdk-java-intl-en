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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaRouteInfo extends AbstractModel {

    /**
    * Route ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteID")
    @Expose
    private Long RouteID;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
    * VIP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VIP type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * Access type
// `0`: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
	// `1`: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
	// `2`: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
	// `3`: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
     * Get Route ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteID Route ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRouteID() {
        return this.RouteID;
    }

    /**
     * Set Route ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteID Route ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteID(Long RouteID) {
        this.RouteID = RouteID;
    }

    /**
     * Get Domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainPort Domain port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Domain port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainPort Domain port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get VIP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip VIP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VIP type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VipType VIP type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set VIP type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VipType VIP type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get Access type
// `0`: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
	// `1`: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
	// `2`: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
	// `3`: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessType Access type
// `0`: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
	// `1`: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
	// `2`: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
	// `3`: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access type
// `0`: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
	// `1`: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
	// `2`: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
	// `3`: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessType Access type
// `0`: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
	// `1`: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
	// `2`: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
	// `3`: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    public CkafkaRouteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaRouteInfo(CkafkaRouteInfo source) {
        if (source.RouteID != null) {
            this.RouteID = new Long(source.RouteID);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteID", this.RouteID);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);

    }
}

