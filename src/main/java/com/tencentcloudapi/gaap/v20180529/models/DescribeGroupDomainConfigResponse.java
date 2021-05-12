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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupDomainConfigResponse extends AbstractModel{

    /**
    * Nearest access configuration list of domain name resolution.
    */
    @SerializedName("AccessRegionList")
    @Expose
    private DomainAccessRegionDict [] AccessRegionList;

    /**
    * Default accesses Ip.
    */
    @SerializedName("DefaultDnsIp")
    @Expose
    private String DefaultDnsIp;

    /**
    * Connection group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Total number of configuration of access regions.
    */
    @SerializedName("AccessRegionCount")
    @Expose
    private Long AccessRegionCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Nearest access configuration list of domain name resolution. 
     * @return AccessRegionList Nearest access configuration list of domain name resolution.
     */
    public DomainAccessRegionDict [] getAccessRegionList() {
        return this.AccessRegionList;
    }

    /**
     * Set Nearest access configuration list of domain name resolution.
     * @param AccessRegionList Nearest access configuration list of domain name resolution.
     */
    public void setAccessRegionList(DomainAccessRegionDict [] AccessRegionList) {
        this.AccessRegionList = AccessRegionList;
    }

    /**
     * Get Default accesses Ip. 
     * @return DefaultDnsIp Default accesses Ip.
     */
    public String getDefaultDnsIp() {
        return this.DefaultDnsIp;
    }

    /**
     * Set Default accesses Ip.
     * @param DefaultDnsIp Default accesses Ip.
     */
    public void setDefaultDnsIp(String DefaultDnsIp) {
        this.DefaultDnsIp = DefaultDnsIp;
    }

    /**
     * Get Connection group ID. 
     * @return GroupId Connection group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID.
     * @param GroupId Connection group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Total number of configuration of access regions. 
     * @return AccessRegionCount Total number of configuration of access regions.
     */
    public Long getAccessRegionCount() {
        return this.AccessRegionCount;
    }

    /**
     * Set Total number of configuration of access regions.
     * @param AccessRegionCount Total number of configuration of access regions.
     */
    public void setAccessRegionCount(Long AccessRegionCount) {
        this.AccessRegionCount = AccessRegionCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeGroupDomainConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupDomainConfigResponse(DescribeGroupDomainConfigResponse source) {
        if (source.AccessRegionList != null) {
            this.AccessRegionList = new DomainAccessRegionDict[source.AccessRegionList.length];
            for (int i = 0; i < source.AccessRegionList.length; i++) {
                this.AccessRegionList[i] = new DomainAccessRegionDict(source.AccessRegionList[i]);
            }
        }
        if (source.DefaultDnsIp != null) {
            this.DefaultDnsIp = new String(source.DefaultDnsIp);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.AccessRegionCount != null) {
            this.AccessRegionCount = new Long(source.AccessRegionCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRegionList.", this.AccessRegionList);
        this.setParamSimple(map, prefix + "DefaultDnsIp", this.DefaultDnsIp);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AccessRegionCount", this.AccessRegionCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

