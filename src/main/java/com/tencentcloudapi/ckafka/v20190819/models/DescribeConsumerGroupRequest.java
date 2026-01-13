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

public class DescribeConsumerGroupRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the group name you want to query.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Specifies the corresponding topic name in the group to be queried by the user. if this parameter is specified while the group is unspecified, ignore this parameter.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Returns the limit quantity of the consumption group. supports a maximum of 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the starting offset amount of the consumer group list.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the group name you want to query. 
     * @return GroupName Specifies the group name you want to query.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Specifies the group name you want to query.
     * @param GroupName Specifies the group name you want to query.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Specifies the corresponding topic name in the group to be queried by the user. if this parameter is specified while the group is unspecified, ignore this parameter. 
     * @return TopicName Specifies the corresponding topic name in the group to be queried by the user. if this parameter is specified while the group is unspecified, ignore this parameter.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Specifies the corresponding topic name in the group to be queried by the user. if this parameter is specified while the group is unspecified, ignore this parameter.
     * @param TopicName Specifies the corresponding topic name in the group to be queried by the user. if this parameter is specified while the group is unspecified, ignore this parameter.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Returns the limit quantity of the consumption group. supports a maximum of 50. 
     * @return Limit Returns the limit quantity of the consumption group. supports a maximum of 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Returns the limit quantity of the consumption group. supports a maximum of 50.
     * @param Limit Returns the limit quantity of the consumption group. supports a maximum of 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the starting offset amount of the consumer group list. 
     * @return Offset Specifies the starting offset amount of the consumer group list.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the starting offset amount of the consumer group list.
     * @param Offset Specifies the starting offset amount of the consumer group list.
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

