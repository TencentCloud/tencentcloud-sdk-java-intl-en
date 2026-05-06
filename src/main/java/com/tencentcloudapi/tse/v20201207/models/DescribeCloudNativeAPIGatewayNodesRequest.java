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

public class DescribeCloudNativeAPIGatewayNodesRequest extends AbstractModel {

    /**
    * Cloud Native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Instance Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Number of paginated items
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start acquisition from page number
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Cloud Native API gateway instance ID. 
     * @return GatewayId Cloud Native API gateway instance ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud Native API gateway instance ID.
     * @param GatewayId Cloud Native API gateway instance ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Instance Group ID 
     * @return GroupId Instance Group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Instance Group ID
     * @param GroupId Instance Group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Number of paginated items 
     * @return Limit Number of paginated items
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of paginated items
     * @param Limit Number of paginated items
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start acquisition from page number 
     * @return Offset Start acquisition from page number
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Start acquisition from page number
     * @param Offset Start acquisition from page number
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCloudNativeAPIGatewayNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayNodesRequest(DescribeCloudNativeAPIGatewayNodesRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

