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

public class DescribleRegionCountRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Line search. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. This field is valid only for Anti-DDoS Advanced and should be ignored for other product
    */
    @SerializedName("LineList")
    @Expose
    private Long [] LineList;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP) 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced, `bgp`: Anti-DDoS Pro (single IP), `bgp-multip`: Anti-DDoS Pro (multi-IP)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Line search. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. This field is valid only for Anti-DDoS Advanced and should be ignored for other product 
     * @return LineList Line search. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. This field is valid only for Anti-DDoS Advanced and should be ignored for other product
     */
    public Long [] getLineList() {
        return this.LineList;
    }

    /**
     * Set Line search. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. This field is valid only for Anti-DDoS Advanced and should be ignored for other product
     * @param LineList Line search. Valid values: [1 (BGP line), 2 (Nanjing Telecom), 3 (Nanjing Unicom), 99 (third-party partner line)]. This field is valid only for Anti-DDoS Advanced and should be ignored for other product
     */
    public void setLineList(Long [] LineList) {
        this.LineList = LineList;
    }

    public DescribleRegionCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribleRegionCountRequest(DescribleRegionCountRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.LineList != null) {
            this.LineList = new Long[source.LineList.length];
            for (int i = 0; i < source.LineList.length; i++) {
                this.LineList[i] = new Long(source.LineList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "LineList.", this.LineList);

    }
}

