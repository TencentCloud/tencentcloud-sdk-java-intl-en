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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRolesRequest extends AbstractModel{

    /**
    * Fuzzy query by role name
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Offset. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Cluster ID (required)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * * RoleName
Filter by role name for exact query.
Type: String
Required: no
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Fuzzy query by role name 
     * @return RoleName Fuzzy query by role name
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Fuzzy query by role name
     * @param RoleName Fuzzy query by role name
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Offset. If this parameter is left empty, 0 will be used by default. 
     * @return Offset Offset. If this parameter is left empty, 0 will be used by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. If this parameter is left empty, 0 will be used by default.
     * @param Offset Offset. If this parameter is left empty, 0 will be used by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20. 
     * @return Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     * @param Limit Number of results to be returned. If this parameter is left empty, 10 will be used by default. The maximum value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Cluster ID (required) 
     * @return ClusterId Cluster ID (required)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID (required)
     * @param ClusterId Cluster ID (required)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get * RoleName
Filter by role name for exact query.
Type: String
Required: no 
     * @return Filters * RoleName
Filter by role name for exact query.
Type: String
Required: no
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * RoleName
Filter by role name for exact query.
Type: String
Required: no
     * @param Filters * RoleName
Filter by role name for exact query.
Type: String
Required: no
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRolesRequest(DescribeRolesRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

