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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGroupNewRequest extends AbstractModel {

    /**
    * Query type. Network–VPC; business recognition–resource; resource tag–tag
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * Asset group ID, 0: all asset group IDs
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * all: all, including subgroups; own: my asset groups only
    */
    @SerializedName("ShowType")
    @Expose
    private String ShowType;

    /**
     * Get Query type. Network–VPC; business recognition–resource; resource tag–tag 
     * @return QueryType Query type. Network–VPC; business recognition–resource; resource tag–tag
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set Query type. Network–VPC; business recognition–resource; resource tag–tag
     * @param QueryType Query type. Network–VPC; business recognition–resource; resource tag–tag
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get Asset group ID, 0: all asset group IDs 
     * @return GroupId Asset group ID, 0: all asset group IDs
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Asset group ID, 0: all asset group IDs
     * @param GroupId Asset group ID, 0: all asset group IDs
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get all: all, including subgroups; own: my asset groups only 
     * @return ShowType all: all, including subgroups; own: my asset groups only
     */
    public String getShowType() {
        return this.ShowType;
    }

    /**
     * Set all: all, including subgroups; own: my asset groups only
     * @param ShowType all: all, including subgroups; own: my asset groups only
     */
    public void setShowType(String ShowType) {
        this.ShowType = ShowType;
    }

    public DescribeResourceGroupNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGroupNewRequest(DescribeResourceGroupNewRequest source) {
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ShowType != null) {
            this.ShowType = new String(source.ShowType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ShowType", this.ShowType);

    }
}

