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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupHealthStatusDetail extends AbstractModel {

    /**
    * Origin server group ID.
    */
    @SerializedName("OriginGroupId")
    @Expose
    private String OriginGroupId;

    /**
    * The health status of each origin server in an origin server group, which is comprehensively decided based on the results of all detection regions. If more than half of the regions determine that the origin server is unhealthy, the corresponding status is unhealthy; otherwise, it is healthy.
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
    * Health status of origin servers in each health check region.
    */
    @SerializedName("CheckRegionHealthStatus")
    @Expose
    private CheckRegionHealthStatus [] CheckRegionHealthStatus;

    /**
     * Get Origin server group ID. 
     * @return OriginGroupId Origin server group ID.
     */
    public String getOriginGroupId() {
        return this.OriginGroupId;
    }

    /**
     * Set Origin server group ID.
     * @param OriginGroupId Origin server group ID.
     */
    public void setOriginGroupId(String OriginGroupId) {
        this.OriginGroupId = OriginGroupId;
    }

    /**
     * Get The health status of each origin server in an origin server group, which is comprehensively decided based on the results of all detection regions. If more than half of the regions determine that the origin server is unhealthy, the corresponding status is unhealthy; otherwise, it is healthy. 
     * @return OriginHealthStatus The health status of each origin server in an origin server group, which is comprehensively decided based on the results of all detection regions. If more than half of the regions determine that the origin server is unhealthy, the corresponding status is unhealthy; otherwise, it is healthy.
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set The health status of each origin server in an origin server group, which is comprehensively decided based on the results of all detection regions. If more than half of the regions determine that the origin server is unhealthy, the corresponding status is unhealthy; otherwise, it is healthy.
     * @param OriginHealthStatus The health status of each origin server in an origin server group, which is comprehensively decided based on the results of all detection regions. If more than half of the regions determine that the origin server is unhealthy, the corresponding status is unhealthy; otherwise, it is healthy.
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    /**
     * Get Health status of origin servers in each health check region. 
     * @return CheckRegionHealthStatus Health status of origin servers in each health check region.
     */
    public CheckRegionHealthStatus [] getCheckRegionHealthStatus() {
        return this.CheckRegionHealthStatus;
    }

    /**
     * Set Health status of origin servers in each health check region.
     * @param CheckRegionHealthStatus Health status of origin servers in each health check region.
     */
    public void setCheckRegionHealthStatus(CheckRegionHealthStatus [] CheckRegionHealthStatus) {
        this.CheckRegionHealthStatus = CheckRegionHealthStatus;
    }

    public OriginGroupHealthStatusDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupHealthStatusDetail(OriginGroupHealthStatusDetail source) {
        if (source.OriginGroupId != null) {
            this.OriginGroupId = new String(source.OriginGroupId);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
        if (source.CheckRegionHealthStatus != null) {
            this.CheckRegionHealthStatus = new CheckRegionHealthStatus[source.CheckRegionHealthStatus.length];
            for (int i = 0; i < source.CheckRegionHealthStatus.length; i++) {
                this.CheckRegionHealthStatus[i] = new CheckRegionHealthStatus(source.CheckRegionHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginGroupId", this.OriginGroupId);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);
        this.setParamArrayObj(map, prefix + "CheckRegionHealthStatus.", this.CheckRegionHealthStatus);

    }
}

