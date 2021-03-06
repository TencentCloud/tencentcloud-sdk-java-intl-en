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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Layer7Rule extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of forwarding types
    */
    @SerializedName("ProxyTypeList")
    @Expose
    private ProxyTypeInfo [] ProxyTypeList;

    /**
    * List of real servers
    */
    @SerializedName("RealServers")
    @Expose
    private SourceServer [] RealServers;

    /**
    * Anti-DDoS instance configured
    */
    @SerializedName("InstanceDetails")
    @Expose
    private InstanceRelation [] InstanceDetails;

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
     * Get List of forwarding types 
     * @return ProxyTypeList List of forwarding types
     */
    public ProxyTypeInfo [] getProxyTypeList() {
        return this.ProxyTypeList;
    }

    /**
     * Set List of forwarding types
     * @param ProxyTypeList List of forwarding types
     */
    public void setProxyTypeList(ProxyTypeInfo [] ProxyTypeList) {
        this.ProxyTypeList = ProxyTypeList;
    }

    /**
     * Get List of real servers 
     * @return RealServers List of real servers
     */
    public SourceServer [] getRealServers() {
        return this.RealServers;
    }

    /**
     * Set List of real servers
     * @param RealServers List of real servers
     */
    public void setRealServers(SourceServer [] RealServers) {
        this.RealServers = RealServers;
    }

    /**
     * Get Anti-DDoS instance configured 
     * @return InstanceDetails Anti-DDoS instance configured
     */
    public InstanceRelation [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set Anti-DDoS instance configured
     * @param InstanceDetails Anti-DDoS instance configured
     */
    public void setInstanceDetails(InstanceRelation [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    public Layer7Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Layer7Rule(Layer7Rule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProxyTypeList != null) {
            this.ProxyTypeList = new ProxyTypeInfo[source.ProxyTypeList.length];
            for (int i = 0; i < source.ProxyTypeList.length; i++) {
                this.ProxyTypeList[i] = new ProxyTypeInfo(source.ProxyTypeList[i]);
            }
        }
        if (source.RealServers != null) {
            this.RealServers = new SourceServer[source.RealServers.length];
            for (int i = 0; i < source.RealServers.length; i++) {
                this.RealServers[i] = new SourceServer(source.RealServers[i]);
            }
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new InstanceRelation[source.InstanceDetails.length];
            for (int i = 0; i < source.InstanceDetails.length; i++) {
                this.InstanceDetails[i] = new InstanceRelation(source.InstanceDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "ProxyTypeList.", this.ProxyTypeList);
        this.setParamArrayObj(map, prefix + "RealServers.", this.RealServers);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);

    }
}

