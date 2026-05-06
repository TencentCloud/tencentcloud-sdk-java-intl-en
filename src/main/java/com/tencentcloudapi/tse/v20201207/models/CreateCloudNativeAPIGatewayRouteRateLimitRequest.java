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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudNativeAPIGatewayRouteRateLimitRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Route id or routing name.
"Unnamed" is not supported.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Configure stream
    */
    @SerializedName("LimitDetail")
    @Expose
    private CloudNativeAPIGatewayRateLimitDetail LimitDetail;

    /**
     * Get gateway ID 
     * @return GatewayId gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set gateway ID
     * @param GatewayId gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Route id or routing name.
"Unnamed" is not supported. 
     * @return Id Route id or routing name.
"Unnamed" is not supported.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Route id or routing name.
"Unnamed" is not supported.
     * @param Id Route id or routing name.
"Unnamed" is not supported.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Configure stream 
     * @return LimitDetail Configure stream
     */
    public CloudNativeAPIGatewayRateLimitDetail getLimitDetail() {
        return this.LimitDetail;
    }

    /**
     * Set Configure stream
     * @param LimitDetail Configure stream
     */
    public void setLimitDetail(CloudNativeAPIGatewayRateLimitDetail LimitDetail) {
        this.LimitDetail = LimitDetail;
    }

    public CreateCloudNativeAPIGatewayRouteRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayRouteRateLimitRequest(CreateCloudNativeAPIGatewayRouteRateLimitRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.LimitDetail != null) {
            this.LimitDetail = new CloudNativeAPIGatewayRateLimitDetail(source.LimitDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "LimitDetail.", this.LimitDetail);

    }
}

