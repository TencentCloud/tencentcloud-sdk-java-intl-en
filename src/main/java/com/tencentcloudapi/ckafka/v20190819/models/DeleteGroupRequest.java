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

public class DeleteGroupRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Consumer group name, which can be obtained through the DescribeConsumerGroup API (https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
     * Get The ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Consumer group name, which can be obtained through the DescribeConsumerGroup API (https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1). 
     * @return Group Consumer group name, which can be obtained through the DescribeConsumerGroup API (https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Consumer group name, which can be obtained through the DescribeConsumerGroup API (https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     * @param Group Consumer group name, which can be obtained through the DescribeConsumerGroup API (https://www.tencentcloud.com/document/product/597/40841?from_cn_redirect=1).
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    public DeleteGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGroupRequest(DeleteGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);

    }
}

