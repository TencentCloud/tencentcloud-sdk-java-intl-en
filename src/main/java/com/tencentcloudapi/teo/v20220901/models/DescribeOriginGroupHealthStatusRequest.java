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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginGroupHealthStatusRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * CLB instance ID.
    */
    @SerializedName("LBInstanceId")
    @Expose
    private String LBInstanceId;

    /**
    * Origin server group ID. If left empty, the health status of all origin server groups under a LoadBalancer is obtained by default.
    */
    @SerializedName("OriginGroupIds")
    @Expose
    private String [] OriginGroupIds;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get CLB instance ID. 
     * @return LBInstanceId CLB instance ID.
     */
    public String getLBInstanceId() {
        return this.LBInstanceId;
    }

    /**
     * Set CLB instance ID.
     * @param LBInstanceId CLB instance ID.
     */
    public void setLBInstanceId(String LBInstanceId) {
        this.LBInstanceId = LBInstanceId;
    }

    /**
     * Get Origin server group ID. If left empty, the health status of all origin server groups under a LoadBalancer is obtained by default. 
     * @return OriginGroupIds Origin server group ID. If left empty, the health status of all origin server groups under a LoadBalancer is obtained by default.
     */
    public String [] getOriginGroupIds() {
        return this.OriginGroupIds;
    }

    /**
     * Set Origin server group ID. If left empty, the health status of all origin server groups under a LoadBalancer is obtained by default.
     * @param OriginGroupIds Origin server group ID. If left empty, the health status of all origin server groups under a LoadBalancer is obtained by default.
     */
    public void setOriginGroupIds(String [] OriginGroupIds) {
        this.OriginGroupIds = OriginGroupIds;
    }

    public DescribeOriginGroupHealthStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupHealthStatusRequest(DescribeOriginGroupHealthStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LBInstanceId != null) {
            this.LBInstanceId = new String(source.LBInstanceId);
        }
        if (source.OriginGroupIds != null) {
            this.OriginGroupIds = new String[source.OriginGroupIds.length];
            for (int i = 0; i < source.OriginGroupIds.length; i++) {
                this.OriginGroupIds[i] = new String(source.OriginGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LBInstanceId", this.LBInstanceId);
        this.setParamArraySimple(map, prefix + "OriginGroupIds.", this.OriginGroupIds);

    }
}

