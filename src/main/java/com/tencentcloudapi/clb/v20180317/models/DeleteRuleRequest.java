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
    * The domain name associated with the forwarding rule to delete. If the rule is associated with multiple domain names, specify any one of them.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The forwarding path of the forwarding rule to delete.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
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
     * Get The domain name associated with the forwarding rule to delete. If the rule is associated with multiple domain names, specify any one of them. 
     * @return Domain The domain name associated with the forwarding rule to delete. If the rule is associated with multiple domain names, specify any one of them.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain name associated with the forwarding rule to delete. If the rule is associated with multiple domain names, specify any one of them.
     * @param Domain The domain name associated with the forwarding rule to delete. If the rule is associated with multiple domain names, specify any one of them.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The forwarding path of the forwarding rule to delete. 
     * @return Url The forwarding path of the forwarding rule to delete.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The forwarding path of the forwarding rule to delete.
     * @param Url The forwarding path of the forwarding rule to delete.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them. 
     * @return NewDefaultServerDomain Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     * @param NewDefaultServerDomain Specifies a new default domain name for the listener. This field is used when the original default domain name is disabled. If there are multiple domain names, specify one of them.
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    public DeleteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRuleRequest(DeleteRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationIds != null) {
            this.LocationIds = new String[source.LocationIds.length];
            for (int i = 0; i < source.LocationIds.length; i++) {
                this.LocationIds[i] = new String(source.LocationIds[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.NewDefaultServerDomain != null) {
            this.NewDefaultServerDomain = new String(source.NewDefaultServerDomain);
        }
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

