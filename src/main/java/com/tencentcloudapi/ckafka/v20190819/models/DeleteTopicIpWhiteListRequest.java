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

public class DeleteTopicIpWhiteListRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1) api.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * IP allowlist list
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1) api. 
     * @return TopicName Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1) api.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1) api.
     * @param TopicName Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1) api.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get IP allowlist list 
     * @return IpWhiteList IP allowlist list
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP allowlist list
     * @param IpWhiteList IP allowlist list
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    public DeleteTopicIpWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTopicIpWhiteListRequest(DeleteTopicIpWhiteListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);

    }
}

