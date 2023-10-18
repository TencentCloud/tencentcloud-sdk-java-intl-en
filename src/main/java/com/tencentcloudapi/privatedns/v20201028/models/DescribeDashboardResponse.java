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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDashboardResponse extends AbstractModel {

    /**
    * Total number of private domain DNS records
    */
    @SerializedName("ZoneTotal")
    @Expose
    private Long ZoneTotal;

    /**
    * Number of VPCs associated with private domain
    */
    @SerializedName("ZoneVpcCount")
    @Expose
    private Long ZoneVpcCount;

    /**
    * Total number of historical requests
    */
    @SerializedName("RequestTotalCount")
    @Expose
    private Long RequestTotalCount;

    /**
    * Traffic package usage
    */
    @SerializedName("FlowUsage")
    @Expose
    private FlowUsage [] FlowUsage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of private domain DNS records 
     * @return ZoneTotal Total number of private domain DNS records
     */
    public Long getZoneTotal() {
        return this.ZoneTotal;
    }

    /**
     * Set Total number of private domain DNS records
     * @param ZoneTotal Total number of private domain DNS records
     */
    public void setZoneTotal(Long ZoneTotal) {
        this.ZoneTotal = ZoneTotal;
    }

    /**
     * Get Number of VPCs associated with private domain 
     * @return ZoneVpcCount Number of VPCs associated with private domain
     */
    public Long getZoneVpcCount() {
        return this.ZoneVpcCount;
    }

    /**
     * Set Number of VPCs associated with private domain
     * @param ZoneVpcCount Number of VPCs associated with private domain
     */
    public void setZoneVpcCount(Long ZoneVpcCount) {
        this.ZoneVpcCount = ZoneVpcCount;
    }

    /**
     * Get Total number of historical requests 
     * @return RequestTotalCount Total number of historical requests
     */
    public Long getRequestTotalCount() {
        return this.RequestTotalCount;
    }

    /**
     * Set Total number of historical requests
     * @param RequestTotalCount Total number of historical requests
     */
    public void setRequestTotalCount(Long RequestTotalCount) {
        this.RequestTotalCount = RequestTotalCount;
    }

    /**
     * Get Traffic package usage 
     * @return FlowUsage Traffic package usage
     */
    public FlowUsage [] getFlowUsage() {
        return this.FlowUsage;
    }

    /**
     * Set Traffic package usage
     * @param FlowUsage Traffic package usage
     */
    public void setFlowUsage(FlowUsage [] FlowUsage) {
        this.FlowUsage = FlowUsage;
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

    public DescribeDashboardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDashboardResponse(DescribeDashboardResponse source) {
        if (source.ZoneTotal != null) {
            this.ZoneTotal = new Long(source.ZoneTotal);
        }
        if (source.ZoneVpcCount != null) {
            this.ZoneVpcCount = new Long(source.ZoneVpcCount);
        }
        if (source.RequestTotalCount != null) {
            this.RequestTotalCount = new Long(source.RequestTotalCount);
        }
        if (source.FlowUsage != null) {
            this.FlowUsage = new FlowUsage[source.FlowUsage.length];
            for (int i = 0; i < source.FlowUsage.length; i++) {
                this.FlowUsage[i] = new FlowUsage(source.FlowUsage[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneTotal", this.ZoneTotal);
        this.setParamSimple(map, prefix + "ZoneVpcCount", this.ZoneVpcCount);
        this.setParamSimple(map, prefix + "RequestTotalCount", this.RequestTotalCount);
        this.setParamArrayObj(map, prefix + "FlowUsage.", this.FlowUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

