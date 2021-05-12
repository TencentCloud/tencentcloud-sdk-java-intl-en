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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel{

    /**
    * Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Route ID
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * VIP network type (1: public network TGW; 2: classic network; 3: VPC; 4: Tencent Cloud-supported environment (generally used for internal instances); 5: SSL public network access; 6: BM VPC)
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * Virtual IP list
    */
    @SerializedName("VipList")
    @Expose
    private VipEntity [] VipList;

    /**
    * Domain name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainPort")
    @Expose
    private Long DomainPort;

    /**
     * Get Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition) 
     * @return AccessType Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     * @param AccessType Instance connection method
0: PLAINTEXT (plaintext method, which does not carry user information and is supported for legacy versions and Community Edition)
1: SASL_PLAINTEXT (plaintext method, which authenticates the login through SASL before data start and is supported only for Community Edition)
2: SSL (SSL-encrypted communication, which does not carry user information and is supported for legacy versions and Community Edition)
3: SASL_SSL (SSL-encrypted communication, which authenticates the login through SASL before data start and is supported only for Community Edition)
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Route ID 
     * @return RouteId Route ID
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID
     * @param RouteId Route ID
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get VIP network type (1: public network TGW; 2: classic network; 3: VPC; 4: Tencent Cloud-supported environment (generally used for internal instances); 5: SSL public network access; 6: BM VPC) 
     * @return VipType VIP network type (1: public network TGW; 2: classic network; 3: VPC; 4: Tencent Cloud-supported environment (generally used for internal instances); 5: SSL public network access; 6: BM VPC)
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set VIP network type (1: public network TGW; 2: classic network; 3: VPC; 4: Tencent Cloud-supported environment (generally used for internal instances); 5: SSL public network access; 6: BM VPC)
     * @param VipType VIP network type (1: public network TGW; 2: classic network; 3: VPC; 4: Tencent Cloud-supported environment (generally used for internal instances); 5: SSL public network access; 6: BM VPC)
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get Virtual IP list 
     * @return VipList Virtual IP list
     */
    public VipEntity [] getVipList() {
        return this.VipList;
    }

    /**
     * Set Virtual IP list
     * @param VipList Virtual IP list
     */
    public void setVipList(VipEntity [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get Domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain name port
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomainPort Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomainPort Domain name port
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainPort(Long DomainPort) {
        this.DomainPort = DomainPort;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VipList != null) {
            this.VipList = new VipEntity[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new VipEntity(source.VipList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new Long(source.DomainPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);

    }
}

