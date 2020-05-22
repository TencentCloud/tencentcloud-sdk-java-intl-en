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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRuleRequest extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Array of IDs of the forwarding rules to be deleted
    */
    @SerializedName("LocationIds")
    @Expose
    private String [] LocationIds;

    /**
    * Domain name of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding path of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * A listener must be configured with a default domain name. If you need to delete the default domain name, you can specify another one as the new default domain name.
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Array of IDs of the forwarding rules to be deleted 
     * @return LocationIds Array of IDs of the forwarding rules to be deleted
     */
    public String [] getLocationIds() {
        return this.LocationIds;
    }

    /**
     * Set Array of IDs of the forwarding rules to be deleted
     * @param LocationIds Array of IDs of the forwarding rules to be deleted
     */
    public void setLocationIds(String [] LocationIds) {
        this.LocationIds = LocationIds;
    }

    /**
     * Get Domain name of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified 
     * @return Domain Domain name of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     * @param Domain Domain name of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding path of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified 
     * @return Url Forwarding path of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Forwarding path of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     * @param Url Forwarding path of the forwarding rule to be deleted. This parameter does not take effect if LocationIds is specified
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get A listener must be configured with a default domain name. If you need to delete the default domain name, you can specify another one as the new default domain name. 
     * @return NewDefaultServerDomain A listener must be configured with a default domain name. If you need to delete the default domain name, you can specify another one as the new default domain name.
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set A listener must be configured with a default domain name. If you need to delete the default domain name, you can specify another one as the new default domain name.
     * @param NewDefaultServerDomain A listener must be configured with a default domain name. If you need to delete the default domain name, you can specify another one as the new default domain name.
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "LocationIds.", this.LocationIds);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);

    }
}

