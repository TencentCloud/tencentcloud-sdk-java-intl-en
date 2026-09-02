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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendDspmCkafkaTestRequest extends AbstractModel {

    /**
    * 1 represents public network, and 7 represents supporting environment access.
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * CKafka Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Valid if it is 7.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Valid if it is 7.
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Domain name, which is valid when VipType is 1.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain port, which is valid when VipType is 1.
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
    * Username, which is valid when VipType is 1.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * User password, which is valid when VipType is 1.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 1 represents public network, and 7 represents supporting environment access. 
     * @return VipType 1 represents public network, and 7 represents supporting environment access.
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set 1 represents public network, and 7 represents supporting environment access.
     * @param VipType 1 represents public network, and 7 represents supporting environment access.
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get CKafka Instance ID 
     * @return InstanceId CKafka Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CKafka Instance ID
     * @param InstanceId CKafka Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Valid if it is 7. 
     * @return Vip Valid if it is 7.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Valid if it is 7.
     * @param Vip Valid if it is 7.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Valid if it is 7. 
     * @return Vport Valid if it is 7.
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Valid if it is 7.
     * @param Vport Valid if it is 7.
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Domain name, which is valid when VipType is 1. 
     * @return Domain Domain name, which is valid when VipType is 1.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name, which is valid when VipType is 1.
     * @param Domain Domain name, which is valid when VipType is 1.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain port, which is valid when VipType is 1. 
     * @return DomainPort Domain port, which is valid when VipType is 1.
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set Domain port, which is valid when VipType is 1.
     * @param DomainPort Domain port, which is valid when VipType is 1.
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get Username, which is valid when VipType is 1. 
     * @return Username Username, which is valid when VipType is 1.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username, which is valid when VipType is 1.
     * @param Username Username, which is valid when VipType is 1.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get User password, which is valid when VipType is 1. 
     * @return Password User password, which is valid when VipType is 1.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set User password, which is valid when VipType is 1.
     * @param Password User password, which is valid when VipType is 1.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public SendDspmCkafkaTestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendDspmCkafkaTestRequest(SendDspmCkafkaTestRequest source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

