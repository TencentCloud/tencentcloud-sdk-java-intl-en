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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupResponse extends AbstractModel {

    /**
    * Counting.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * GroupList
    */
    @SerializedName("GroupList")
    @Expose
    private DescribeGroup [] GroupList;

    /**
    * Specifies the consumer group quota.
    */
    @SerializedName("GroupCountQuota")
    @Expose
    private Long GroupCountQuota;

    /**
     * Get Counting. 
     * @return TotalCount Counting.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Counting.
     * @param TotalCount Counting.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get GroupList 
     * @return GroupList GroupList
     */
    public DescribeGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set GroupList
     * @param GroupList GroupList
     */
    public void setGroupList(DescribeGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get Specifies the consumer group quota. 
     * @return GroupCountQuota Specifies the consumer group quota.
     */
    public Long getGroupCountQuota() {
        return this.GroupCountQuota;
    }

    /**
     * Set Specifies the consumer group quota.
     * @param GroupCountQuota Specifies the consumer group quota.
     */
    public void setGroupCountQuota(Long GroupCountQuota) {
        this.GroupCountQuota = GroupCountQuota;
    }

    public GroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupResponse(GroupResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.GroupList != null) {
            this.GroupList = new DescribeGroup[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new DescribeGroup(source.GroupList[i]);
            }
        }
        if (source.GroupCountQuota != null) {
            this.GroupCountQuota = new Long(source.GroupCountQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "GroupCountQuota", this.GroupCountQuota);

    }
}

