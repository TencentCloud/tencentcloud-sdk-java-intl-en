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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQEnvironmentRolesRequest extends AbstractModel {

    /**
    * Required. Specifies the ID of the RocketMQ cluster.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Starting index. Default is 0 if left empty.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns, default to 10 if not specified, maximum value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Role name.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Filters RoleName by role name for precise query. Type: string. Required: no.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Required. Specifies the ID of the RocketMQ cluster. 
     * @return ClusterId Required. Specifies the ID of the RocketMQ cluster.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Required. Specifies the ID of the RocketMQ cluster.
     * @param ClusterId Required. Specifies the ID of the RocketMQ cluster.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace 
     * @return EnvironmentId Namespace
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace
     * @param EnvironmentId Namespace
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Starting index. Default is 0 if left empty. 
     * @return Offset Starting index. Default is 0 if left empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting index. Default is 0 if left empty.
     * @param Offset Starting index. Default is 0 if left empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns, default to 10 if not specified, maximum value: 20. 
     * @return Limit Number of returns, default to 10 if not specified, maximum value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns, default to 10 if not specified, maximum value: 20.
     * @param Limit Number of returns, default to 10 if not specified, maximum value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Role name. 
     * @return RoleName Role name.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name.
     * @param RoleName Role name.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Filters RoleName by role name for precise query. Type: string. Required: no. 
     * @return Filters Filters RoleName by role name for precise query. Type: string. Required: no.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters RoleName by role name for precise query. Type: string. Required: no.
     * @param Filters Filters RoleName by role name for precise query. Type: string. Required: no.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQEnvironmentRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQEnvironmentRolesRequest(DescribeRocketMQEnvironmentRolesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

