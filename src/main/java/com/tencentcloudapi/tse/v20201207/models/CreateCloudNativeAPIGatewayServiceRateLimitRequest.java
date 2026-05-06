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

public class CreateCloudNativeAPIGatewayServiceRateLimitRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Service name or service ID
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Configure throttling
    */
    @SerializedName("LimitDetail")
    @Expose
    private CloudNativeAPIGatewayRateLimitDetail LimitDetail;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Service name or service ID 
     * @return Name Service name or service ID
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name or service ID
     * @param Name Service name or service ID
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Configure throttling 
     * @return LimitDetail Configure throttling
     */
    public CloudNativeAPIGatewayRateLimitDetail getLimitDetail() {
        return this.LimitDetail;
    }

    /**
     * Set Configure throttling
     * @param LimitDetail Configure throttling
     */
    public void setLimitDetail(CloudNativeAPIGatewayRateLimitDetail LimitDetail) {
        this.LimitDetail = LimitDetail;
    }

    public CreateCloudNativeAPIGatewayServiceRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayServiceRateLimitRequest(CreateCloudNativeAPIGatewayServiceRateLimitRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "LimitDetail.", this.LimitDetail);

    }
}

