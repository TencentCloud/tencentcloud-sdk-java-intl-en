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

public class CreateConsumerRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Consumer group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Topic name. one of TopicName or TopicNameList must display a specified existing topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic name list.
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Consumer group name. 
     * @return GroupName Consumer group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Consumer group name.
     * @param GroupName Consumer group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Topic name. one of TopicName or TopicNameList must display a specified existing topic name. 
     * @return TopicName Topic name. one of TopicName or TopicNameList must display a specified existing topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. one of TopicName or TopicNameList must display a specified existing topic name.
     * @param TopicName Topic name. one of TopicName or TopicNameList must display a specified existing topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic name list. 
     * @return TopicNameList Topic name list.
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set Topic name list.
     * @param TopicNameList Topic name list.
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    public CreateConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerRequest(CreateConsumerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);

    }
}

