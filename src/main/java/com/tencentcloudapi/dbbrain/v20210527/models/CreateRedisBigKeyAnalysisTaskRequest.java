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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedisBigKeyAnalysisTaskRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Service type. Valid value: `redis` (TencentDB for Redis).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * The list of the serial numbers of shard nodes. When the list is empty, all shard nodes will be selected.
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

    /**
    * The list of separators of top key prefixes.
Currently, the following separators are supported: ",", ";", ":", "_", "-", "+", "@", "=", "|", "#", ".". When the list is empty, all separators will be selected by default.
    */
    @SerializedName("KeyDelimiterList")
    @Expose
    private String [] KeyDelimiterList;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Service type. Valid value: `redis` (TencentDB for Redis). 
     * @return Product Service type. Valid value: `redis` (TencentDB for Redis).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid value: `redis` (TencentDB for Redis).
     * @param Product Service type. Valid value: `redis` (TencentDB for Redis).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get The list of the serial numbers of shard nodes. When the list is empty, all shard nodes will be selected. 
     * @return ShardIds The list of the serial numbers of shard nodes. When the list is empty, all shard nodes will be selected.
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set The list of the serial numbers of shard nodes. When the list is empty, all shard nodes will be selected.
     * @param ShardIds The list of the serial numbers of shard nodes. When the list is empty, all shard nodes will be selected.
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    /**
     * Get The list of separators of top key prefixes.
Currently, the following separators are supported: ",", ";", ":", "_", "-", "+", "@", "=", "|", "#", ".". When the list is empty, all separators will be selected by default. 
     * @return KeyDelimiterList The list of separators of top key prefixes.
Currently, the following separators are supported: ",", ";", ":", "_", "-", "+", "@", "=", "|", "#", ".". When the list is empty, all separators will be selected by default.
     */
    public String [] getKeyDelimiterList() {
        return this.KeyDelimiterList;
    }

    /**
     * Set The list of separators of top key prefixes.
Currently, the following separators are supported: ",", ";", ":", "_", "-", "+", "@", "=", "|", "#", ".". When the list is empty, all separators will be selected by default.
     * @param KeyDelimiterList The list of separators of top key prefixes.
Currently, the following separators are supported: ",", ";", ":", "_", "-", "+", "@", "=", "|", "#", ".". When the list is empty, all separators will be selected by default.
     */
    public void setKeyDelimiterList(String [] KeyDelimiterList) {
        this.KeyDelimiterList = KeyDelimiterList;
    }

    public CreateRedisBigKeyAnalysisTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedisBigKeyAnalysisTaskRequest(CreateRedisBigKeyAnalysisTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
        if (source.KeyDelimiterList != null) {
            this.KeyDelimiterList = new String[source.KeyDelimiterList.length];
            for (int i = 0; i < source.KeyDelimiterList.length; i++) {
                this.KeyDelimiterList[i] = new String(source.KeyDelimiterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);
        this.setParamArraySimple(map, prefix + "KeyDelimiterList.", this.KeyDelimiterList);

    }
}

