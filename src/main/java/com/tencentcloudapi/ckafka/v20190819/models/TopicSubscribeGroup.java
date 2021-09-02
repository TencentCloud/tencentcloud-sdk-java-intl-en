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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicSubscribeGroup extends AbstractModel{

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Number of consumer group status
    */
    @SerializedName("StatusCountInfo")
    @Expose
    private String StatusCountInfo;

    /**
    * Consumer group information
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupsInfo")
    @Expose
    private GroupInfoResponse [] GroupsInfo;

    /**
    * Whether a request is asynchronous. If there are fewer consumer groups in the instances, the result will be returned directly, and status code is 1. When there are many consumer groups in the instances, cache will be updated asynchronously. When status code is 0, grouping information will not be returned until cache update is completed and status code becomes 1.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Number of consumer group status 
     * @return StatusCountInfo Number of consumer group status
     */
    public String getStatusCountInfo() {
        return this.StatusCountInfo;
    }

    /**
     * Set Number of consumer group status
     * @param StatusCountInfo Number of consumer group status
     */
    public void setStatusCountInfo(String StatusCountInfo) {
        this.StatusCountInfo = StatusCountInfo;
    }

    /**
     * Get Consumer group information
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return GroupsInfo Consumer group information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public GroupInfoResponse [] getGroupsInfo() {
        return this.GroupsInfo;
    }

    /**
     * Set Consumer group information
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param GroupsInfo Consumer group information
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setGroupsInfo(GroupInfoResponse [] GroupsInfo) {
        this.GroupsInfo = GroupsInfo;
    }

    /**
     * Get Whether a request is asynchronous. If there are fewer consumer groups in the instances, the result will be returned directly, and status code is 1. When there are many consumer groups in the instances, cache will be updated asynchronously. When status code is 0, grouping information will not be returned until cache update is completed and status code becomes 1.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Whether a request is asynchronous. If there are fewer consumer groups in the instances, the result will be returned directly, and status code is 1. When there are many consumer groups in the instances, cache will be updated asynchronously. When status code is 0, grouping information will not be returned until cache update is completed and status code becomes 1.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether a request is asynchronous. If there are fewer consumer groups in the instances, the result will be returned directly, and status code is 1. When there are many consumer groups in the instances, cache will be updated asynchronously. When status code is 0, grouping information will not be returned until cache update is completed and status code becomes 1.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Status Whether a request is asynchronous. If there are fewer consumer groups in the instances, the result will be returned directly, and status code is 1. When there are many consumer groups in the instances, cache will be updated asynchronously. When status code is 0, grouping information will not be returned until cache update is completed and status code becomes 1.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public TopicSubscribeGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicSubscribeGroup(TopicSubscribeGroup source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StatusCountInfo != null) {
            this.StatusCountInfo = new String(source.StatusCountInfo);
        }
        if (source.GroupsInfo != null) {
            this.GroupsInfo = new GroupInfoResponse[source.GroupsInfo.length];
            for (int i = 0; i < source.GroupsInfo.length; i++) {
                this.GroupsInfo[i] = new GroupInfoResponse(source.GroupsInfo[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "StatusCountInfo", this.StatusCountInfo);
        this.setParamArrayObj(map, prefix + "GroupsInfo.", this.GroupsInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

