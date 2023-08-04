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
    * Number of instances returned per page. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * ID of the specified replication group, such as `crs-rpl-m3zt****`. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get it in the global replication group list.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Keyword for fuzzy query, which can be a replication group ID or name. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get u200dthem in the global replication group list.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Number of instances returned per page. Default value: `20`. 
     * @return Limit Number of instances returned per page. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of instances returned per page. Default value: `20`.
     * @param Limit Number of instances returned per page. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1). 
     * @return Offset Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     * @param Offset Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get ID of the specified replication group, such as `crs-rpl-m3zt****`. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get it in the global replication group list. 
     * @return GroupId ID of the specified replication group, such as `crs-rpl-m3zt****`. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get it in the global replication group list.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set ID of the specified replication group, such as `crs-rpl-m3zt****`. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get it in the global replication group list.
     * @param GroupId ID of the specified replication group, such as `crs-rpl-m3zt****`. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get it in the global replication group list.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Keyword for fuzzy query, which can be a replication group ID or name. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get u200dthem in the global replication group list. 
     * @return SearchKey Keyword for fuzzy query, which can be a replication group ID or name. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get u200dthem in the global replication group list.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Keyword for fuzzy query, which can be a replication group ID or name. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get u200dthem in the global replication group list.
     * @param SearchKey Keyword for fuzzy query, which can be a replication group ID or name. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis/replication), and get u200dthem in the global replication group list.
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

