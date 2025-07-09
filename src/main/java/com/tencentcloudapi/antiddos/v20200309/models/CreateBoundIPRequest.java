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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBoundIPRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP)
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Array of IPs to bind to the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP. If there are no IPs to bind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
    */
    @SerializedName("BoundDevList")
    @Expose
    private BoundIpInfo [] BoundDevList;

    /**
    * Array of IPs to unbind from the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP; if there are no IPs to unbind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
    */
    @SerializedName("UnBoundDevList")
    @Expose
    private BoundIpInfo [] UnBoundDevList;

    /**
    * Disused
    */
    @SerializedName("CopyPolicy")
    @Expose
    private String CopyPolicy;

    /**
     * Get Anti-DDoS service type. `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP) 
     * @return Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP)
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP)
     * @param Business Anti-DDoS service type. `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP)
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Array of IPs to bind to the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP. If there are no IPs to bind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty. 
     * @return BoundDevList Array of IPs to bind to the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP. If there are no IPs to bind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     */
    public BoundIpInfo [] getBoundDevList() {
        return this.BoundDevList;
    }

    /**
     * Set Array of IPs to bind to the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP. If there are no IPs to bind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     * @param BoundDevList Array of IPs to bind to the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP. If there are no IPs to bind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     */
    public void setBoundDevList(BoundIpInfo [] BoundDevList) {
        this.BoundDevList = BoundDevList;
    }

    /**
     * Get Array of IPs to unbind from the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP; if there are no IPs to unbind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty. 
     * @return UnBoundDevList Array of IPs to unbind from the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP; if there are no IPs to unbind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     */
    public BoundIpInfo [] getUnBoundDevList() {
        return this.UnBoundDevList;
    }

    /**
     * Set Array of IPs to unbind from the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP; if there are no IPs to unbind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     * @param UnBoundDevList Array of IPs to unbind from the Anti-DDoS instance. For Anti-DDoS Pro Single IP instance, the array contains only one IP; if there are no IPs to unbind, it is empty; however, either `BoundDevList` or `UnBoundDevList` must not be empty.
     */
    public void setUnBoundDevList(BoundIpInfo [] UnBoundDevList) {
        this.UnBoundDevList = UnBoundDevList;
    }

    /**
     * Get Disused 
     * @return CopyPolicy Disused
     */
    public String getCopyPolicy() {
        return this.CopyPolicy;
    }

    /**
     * Set Disused
     * @param CopyPolicy Disused
     */
    public void setCopyPolicy(String CopyPolicy) {
        this.CopyPolicy = CopyPolicy;
    }

    public CreateBoundIPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBoundIPRequest(CreateBoundIPRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BoundDevList != null) {
            this.BoundDevList = new BoundIpInfo[source.BoundDevList.length];
            for (int i = 0; i < source.BoundDevList.length; i++) {
                this.BoundDevList[i] = new BoundIpInfo(source.BoundDevList[i]);
            }
        }
        if (source.UnBoundDevList != null) {
            this.UnBoundDevList = new BoundIpInfo[source.UnBoundDevList.length];
            for (int i = 0; i < source.UnBoundDevList.length; i++) {
                this.UnBoundDevList[i] = new BoundIpInfo(source.UnBoundDevList[i]);
            }
        }
        if (source.CopyPolicy != null) {
            this.CopyPolicy = new String(source.CopyPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "BoundDevList.", this.BoundDevList);
        this.setParamArrayObj(map, prefix + "UnBoundDevList.", this.UnBoundDevList);
        this.setParamSimple(map, prefix + "CopyPolicy", this.CopyPolicy);

    }
}

