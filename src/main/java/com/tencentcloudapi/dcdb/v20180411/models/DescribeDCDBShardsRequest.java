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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBShardsRequest extends AbstractModel {

    /**
    * Instance ID in the format of dcdbt-ow728lmc.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shard ID list.
    */
    @SerializedName("ShardInstanceIds")
    @Expose
    private String [] ShardInstanceIds;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort by field. Only `createtime` is supported currently.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: desc, asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID in the format of dcdbt-ow728lmc. 
     * @return InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of dcdbt-ow728lmc.
     * @param InstanceId Instance ID in the format of dcdbt-ow728lmc.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shard ID list. 
     * @return ShardInstanceIds Shard ID list.
     */
    public String [] getShardInstanceIds() {
        return this.ShardInstanceIds;
    }

    /**
     * Set Shard ID list.
     * @param ShardInstanceIds Shard ID list.
     */
    public void setShardInstanceIds(String [] ShardInstanceIds) {
        this.ShardInstanceIds = ShardInstanceIds;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort by field. Only `createtime` is supported currently. 
     * @return OrderBy Sort by field. Only `createtime` is supported currently.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field. Only `createtime` is supported currently.
     * @param OrderBy Sort by field. Only `createtime` is supported currently.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: desc, asc 
     * @return OrderByType Sorting order. Valid values: desc, asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: desc, asc
     * @param OrderByType Sorting order. Valid values: desc, asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeDCDBShardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBShardsRequest(DescribeDCDBShardsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardInstanceIds != null) {
            this.ShardInstanceIds = new String[source.ShardInstanceIds.length];
            for (int i = 0; i < source.ShardInstanceIds.length; i++) {
                this.ShardInstanceIds[i] = new String(source.ShardInstanceIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

