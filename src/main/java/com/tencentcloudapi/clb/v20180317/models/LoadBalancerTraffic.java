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

public class LoadBalancerTraffic extends AbstractModel{

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * CLB instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CLB instance VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Maximum outbound bandwidth in Mbps
    */
    @SerializedName("OutBandwidth")
    @Expose
    private Float OutBandwidth;

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
     * Get CLB instance name 
     * @return LoadBalancerName CLB instance name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
     * @param LoadBalancerName CLB instance name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get CLB instance region 
     * @return Region CLB instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CLB instance region
     * @param Region CLB instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CLB instance VIP 
     * @return Vip CLB instance VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CLB instance VIP
     * @param Vip CLB instance VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Maximum outbound bandwidth in Mbps 
     * @return OutBandwidth Maximum outbound bandwidth in Mbps
     */
    public Float getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set Maximum outbound bandwidth in Mbps
     * @param OutBandwidth Maximum outbound bandwidth in Mbps
     */
    public void setOutBandwidth(Float OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "OutBandwidth", this.OutBandwidth);

    }
}

