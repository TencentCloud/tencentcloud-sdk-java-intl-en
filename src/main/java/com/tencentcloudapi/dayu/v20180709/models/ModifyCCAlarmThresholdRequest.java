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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCCAlarmThresholdRequest extends AbstractModel {

    /**
    * Anti-DDoS service type (`shield`: Chess Shield, `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("RsId")
    @Expose
    private String RsId;

    /**
    * Alarm threshold, which should be greater than 0 (currently scheduled value). It is set to 1000 on the backend by default
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
    * List of IPs associated with resource. If no Anti-DDoS Pro instance is bound, pass in an empty array. For Anti-DDoS Ultimate, pass in multiple IPs
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get Anti-DDoS service type (`shield`: Chess Shield, `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate) 
     * @return Business Anti-DDoS service type (`shield`: Chess Shield, `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type (`shield`: Chess Shield, `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate)
     * @param Business Anti-DDoS service type (`shield`: Chess Shield, `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return RsId Anti-DDoS instance ID
     */
    public String getRsId() {
        return this.RsId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param RsId Anti-DDoS instance ID
     */
    public void setRsId(String RsId) {
        this.RsId = RsId;
    }

    /**
     * Get Alarm threshold, which should be greater than 0 (currently scheduled value). It is set to 1000 on the backend by default 
     * @return AlarmThreshold Alarm threshold, which should be greater than 0 (currently scheduled value). It is set to 1000 on the backend by default
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set Alarm threshold, which should be greater than 0 (currently scheduled value). It is set to 1000 on the backend by default
     * @param AlarmThreshold Alarm threshold, which should be greater than 0 (currently scheduled value). It is set to 1000 on the backend by default
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    /**
     * Get List of IPs associated with resource. If no Anti-DDoS Pro instance is bound, pass in an empty array. For Anti-DDoS Ultimate, pass in multiple IPs 
     * @return IpList List of IPs associated with resource. If no Anti-DDoS Pro instance is bound, pass in an empty array. For Anti-DDoS Ultimate, pass in multiple IPs
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set List of IPs associated with resource. If no Anti-DDoS Pro instance is bound, pass in an empty array. For Anti-DDoS Ultimate, pass in multiple IPs
     * @param IpList List of IPs associated with resource. If no Anti-DDoS Pro instance is bound, pass in an empty array. For Anti-DDoS Ultimate, pass in multiple IPs
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public ModifyCCAlarmThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCCAlarmThresholdRequest(ModifyCCAlarmThresholdRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RsId != null) {
            this.RsId = new String(source.RsId);
        }
        if (source.AlarmThreshold != null) {
            this.AlarmThreshold = new Long(source.AlarmThreshold);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RsId", this.RsId);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

