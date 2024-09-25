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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FindAllDomainDetail extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain IP
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * Detection time
    */
    @SerializedName("FindTime")
    @Expose
    private String FindTime;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * WAF type
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Whether to access WAF
    */
    @SerializedName("IsWafDomain")
    @Expose
    private Long IsWafDomain;

    /**
     * Get User ID 
     * @return Appid User ID
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set User ID
     * @param Appid User ID
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain IP 
     * @return Ips Domain IP
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set Domain IP
     * @param Ips Domain IP
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get Detection time 
     * @return FindTime Detection time
     */
    public String getFindTime() {
        return this.FindTime;
    }

    /**
     * Set Detection time
     * @param FindTime Detection time
     */
    public void setFindTime(String FindTime) {
        this.FindTime = FindTime;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get WAF type 
     * @return Edition WAF type
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF type
     * @param Edition WAF type
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Whether to access WAF 
     * @return IsWafDomain Whether to access WAF
     */
    public Long getIsWafDomain() {
        return this.IsWafDomain;
    }

    /**
     * Set Whether to access WAF
     * @param IsWafDomain Whether to access WAF
     */
    public void setIsWafDomain(Long IsWafDomain) {
        this.IsWafDomain = IsWafDomain;
    }

    public FindAllDomainDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FindAllDomainDetail(FindAllDomainDetail source) {
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.FindTime != null) {
            this.FindTime = new String(source.FindTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsWafDomain != null) {
            this.IsWafDomain = new Long(source.IsWafDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "FindTime", this.FindTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsWafDomain", this.IsWafDomain);

    }
}

