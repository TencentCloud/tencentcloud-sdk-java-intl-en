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

public class DescribeGroupInfoRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kafka group list. obtain through the API [DescribeConsumerGroup](https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
    */
    @SerializedName("GroupList")
    @Expose
    private String [] GroupList;

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
     * Get Kafka group list. obtain through the API [DescribeConsumerGroup](https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1). 
     * @return GroupList Kafka group list. obtain through the API [DescribeConsumerGroup](https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     */
    public String [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set Kafka group list. obtain through the API [DescribeConsumerGroup](https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     * @param GroupList Kafka group list. obtain through the API [DescribeConsumerGroup](https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     */
    public void setGroupList(String [] GroupList) {
        this.GroupList = GroupList;
    }

    public DescribeGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupInfoRequest(DescribeGroupInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupList != null) {
            this.GroupList = new String[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new String(source.GroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupList.", this.GroupList);

    }
}

