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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCEventRecord extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
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
    * Resource IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Attack start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Attack end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Total requests peak (QPS)
    */
    @SerializedName("ReqQps")
    @Expose
    private Long ReqQps;

    /**
    * Attack peak (QPS)
    */
    @SerializedName("DropQps")
    @Expose
    private Long DropQps;

    /**
    * Attack status. Valid values: [0 (ongoing), 1 (ended)]
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * Resource name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Domain name list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainList")
    @Expose
    private String DomainList;

    /**
    * URI list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UriList")
    @Expose
    private String UriList;

    /**
    * Attack source list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackipList")
    @Expose
    private String AttackipList;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (Single IP); `bgp-multip`: Anti-DDoS Pro (Multi-IP); `net`: Anti-DDoS Ultimate; `basic`: Anti-DDoS Basic
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
     * Get Resource IP 
     * @return Vip Resource IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Resource IP
     * @param Vip Resource IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Attack start time 
     * @return StartTime Attack start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Attack start time
     * @param StartTime Attack start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Attack end time 
     * @return EndTime Attack end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Attack end time
     * @param EndTime Attack end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Total requests peak (QPS) 
     * @return ReqQps Total requests peak (QPS)
     */
    public Long getReqQps() {
        return this.ReqQps;
    }

    /**
     * Set Total requests peak (QPS)
     * @param ReqQps Total requests peak (QPS)
     */
    public void setReqQps(Long ReqQps) {
        this.ReqQps = ReqQps;
    }

    /**
     * Get Attack peak (QPS) 
     * @return DropQps Attack peak (QPS)
     */
    public Long getDropQps() {
        return this.DropQps;
    }

    /**
     * Set Attack peak (QPS)
     * @param DropQps Attack peak (QPS)
     */
    public void setDropQps(Long DropQps) {
        this.DropQps = DropQps;
    }

    /**
     * Get Attack status. Valid values: [0 (ongoing), 1 (ended)] 
     * @return AttackStatus Attack status. Valid values: [0 (ongoing), 1 (ended)]
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set Attack status. Valid values: [0 (ongoing), 1 (ended)]
     * @param AttackStatus Attack status. Valid values: [0 (ongoing), 1 (ended)]
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get Resource name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResourceName Resource name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Domain name list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomainList Domain name list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainList() {
        return this.DomainList;
    }

    /**
     * Set Domain name list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomainList Domain name list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainList(String DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get URI list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UriList URI list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUriList() {
        return this.UriList;
    }

    /**
     * Set URI list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UriList URI list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUriList(String UriList) {
        this.UriList = UriList;
    }

    /**
     * Get Attack source list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttackipList Attack source list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackipList() {
        return this.AttackipList;
    }

    /**
     * Set Attack source list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttackipList Attack source list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackipList(String AttackipList) {
        this.AttackipList = AttackipList;
    }

    public CCEventRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCEventRecord(CCEventRecord source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReqQps != null) {
            this.ReqQps = new Long(source.ReqQps);
        }
        if (source.DropQps != null) {
            this.DropQps = new Long(source.DropQps);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.DomainList != null) {
            this.DomainList = new String(source.DomainList);
        }
        if (source.UriList != null) {
            this.UriList = new String(source.UriList);
        }
        if (source.AttackipList != null) {
            this.AttackipList = new String(source.AttackipList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReqQps", this.ReqQps);
        this.setParamSimple(map, prefix + "DropQps", this.DropQps);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "DomainList", this.DomainList);
        this.setParamSimple(map, prefix + "UriList", this.UriList);
        this.setParamSimple(map, prefix + "AttackipList", this.AttackipList);

    }
}

