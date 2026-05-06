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

public class DescribeCloudNativeAPIGatewayCORSRequest extends AbstractModel {

    /**
    * gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Resource type bound by the cross-origin plug-in: route|service
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * id of the route or services
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

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
     * Get Resource type bound by the cross-origin plug-in: route|service 
     * @return SourceType Resource type bound by the cross-origin plug-in: route|service
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Resource type bound by the cross-origin plug-in: route|service
     * @param SourceType Resource type bound by the cross-origin plug-in: route|service
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get id of the route or services 
     * @return SourceId id of the route or services
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set id of the route or services
     * @param SourceId id of the route or services
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    public DescribeCloudNativeAPIGatewayCORSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayCORSRequest(DescribeCloudNativeAPIGatewayCORSRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);

    }
}

