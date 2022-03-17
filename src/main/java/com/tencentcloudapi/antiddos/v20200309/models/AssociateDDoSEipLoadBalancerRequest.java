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

public class AssociateDDoSEipLoadBalancerRequest extends AbstractModel{

    /**
    * Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * EIP of the Anti-DDoS instance ID.
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * ID of the CLB to bind, such as `lb-0000002i`. It can be queried in the console or obtained from `LoadBalancerId` returned by the `DescribeLoadBalancers` API.
    */
    @SerializedName("LoadBalancerID")
    @Expose
    private String LoadBalancerID;

    /**
    * Region of the CLB instance, such as `ap-hongkong`.
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
    * CLB private IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`. 
     * @return InstanceId Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     * @param InstanceId Anti-DDoS instance ID (only Anti-DDoS Advanced). For example, `bgpip-0000011x`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get EIP of the Anti-DDoS instance ID. 
     * @return Eip EIP of the Anti-DDoS instance ID.
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set EIP of the Anti-DDoS instance ID.
     * @param Eip EIP of the Anti-DDoS instance ID.
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get ID of the CLB to bind, such as `lb-0000002i`. It can be queried in the console or obtained from `LoadBalancerId` returned by the `DescribeLoadBalancers` API. 
     * @return LoadBalancerID ID of the CLB to bind, such as `lb-0000002i`. It can be queried in the console or obtained from `LoadBalancerId` returned by the `DescribeLoadBalancers` API.
     */
    public String getLoadBalancerID() {
        return this.LoadBalancerID;
    }

    /**
     * Set ID of the CLB to bind, such as `lb-0000002i`. It can be queried in the console or obtained from `LoadBalancerId` returned by the `DescribeLoadBalancers` API.
     * @param LoadBalancerID ID of the CLB to bind, such as `lb-0000002i`. It can be queried in the console or obtained from `LoadBalancerId` returned by the `DescribeLoadBalancers` API.
     */
    public void setLoadBalancerID(String LoadBalancerID) {
        this.LoadBalancerID = LoadBalancerID;
    }

    /**
     * Get Region of the CLB instance, such as `ap-hongkong`. 
     * @return LoadBalancerRegion Region of the CLB instance, such as `ap-hongkong`.
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set Region of the CLB instance, such as `ap-hongkong`.
     * @param LoadBalancerRegion Region of the CLB instance, such as `ap-hongkong`.
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    /**
     * Get CLB private IP 
     * @return Vip CLB private IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CLB private IP
     * @param Vip CLB private IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public AssociateDDoSEipLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateDDoSEipLoadBalancerRequest(AssociateDDoSEipLoadBalancerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.LoadBalancerID != null) {
            this.LoadBalancerID = new String(source.LoadBalancerID);
        }
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "LoadBalancerID", this.LoadBalancerID);
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

