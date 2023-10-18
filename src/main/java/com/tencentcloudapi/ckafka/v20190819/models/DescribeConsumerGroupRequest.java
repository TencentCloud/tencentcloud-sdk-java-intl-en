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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerGroupRequest extends AbstractModel {

    /**
    * CKafka instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the group to be queried, which is optional.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Name of the corresponding topic in the group to be queried, which is optional. If this parameter is specified but `group` is not specified, this parameter will be ignored.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of results to be returned in this request
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset position
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get CKafka instance ID. 
     * @return InstanceId CKafka instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CKafka instance ID.
     * @param InstanceId CKafka instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the group to be queried, which is optional. 
     * @return GroupName Name of the group to be queried, which is optional.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Name of the group to be queried, which is optional.
     * @param GroupName Name of the group to be queried, which is optional.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Name of the corresponding topic in the group to be queried, which is optional. If this parameter is specified but `group` is not specified, this parameter will be ignored. 
     * @return TopicName Name of the corresponding topic in the group to be queried, which is optional. If this parameter is specified but `group` is not specified, this parameter will be ignored.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Name of the corresponding topic in the group to be queried, which is optional. If this parameter is specified but `group` is not specified, this parameter will be ignored.
     * @param TopicName Name of the corresponding topic in the group to be queried, which is optional. If this parameter is specified but `group` is not specified, this parameter will be ignored.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Number of results to be returned in this request 
     * @return Limit Number of results to be returned in this request
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned in this request
     * @param Limit Number of results to be returned in this request
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset position 
     * @return Offset Offset position
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset position
     * @param Offset Offset position
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupRequest(DescribeConsumerGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

