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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationGroupRequest extends AbstractModel{

    /**
    * Instance list size. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integral multiple of `Limit`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Replication group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Instance ID/name. Fuzzy query is supported.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Instance list size. Default value: 20 
     * @return Limit Instance list size. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Instance list size. Default value: 20
     * @param Limit Instance list size. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit` 
     * @return Offset Offset, which is an integral multiple of `Limit`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit`
     * @param Offset Offset, which is an integral multiple of `Limit`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Replication group ID 
     * @return GroupId Replication group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Replication group ID
     * @param GroupId Replication group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Instance ID/name. Fuzzy query is supported. 
     * @return SearchKey Instance ID/name. Fuzzy query is supported.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Instance ID/name. Fuzzy query is supported.
     * @param SearchKey Instance ID/name. Fuzzy query is supported.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeReplicationGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationGroupRequest(DescribeReplicationGroupRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

