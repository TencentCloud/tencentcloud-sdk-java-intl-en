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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerTraffic extends AbstractModel {

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
    * CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

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
     * Get CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Domain CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Domain CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public LoadBalancerTraffic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerTraffic(LoadBalancerTraffic source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new Float(source.OutBandwidth);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

