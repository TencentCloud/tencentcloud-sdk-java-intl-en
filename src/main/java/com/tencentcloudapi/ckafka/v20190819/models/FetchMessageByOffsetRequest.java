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

public class FetchMessageByOffsetRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.comom/document/product/597/40847?from_cn_redirect=1) api.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Partition ID
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Specifies the position information.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.comom/document/product/597/40847?from_cn_redirect=1) api. 
     * @return Topic Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.comom/document/product/597/40847?from_cn_redirect=1) api.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.comom/document/product/597/40847?from_cn_redirect=1) api.
     * @param Topic Specifies the topic name, which can be obtained through the [DescribeTopic](https://www.tencentcloud.comom/document/product/597/40847?from_cn_redirect=1) api.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Partition ID 
     * @return Partition Partition ID
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition ID
     * @param Partition Partition ID
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Specifies the position information. 
     * @return Offset Specifies the position information.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the position information.
     * @param Offset Specifies the position information.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public FetchMessageByOffsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchMessageByOffsetRequest(FetchMessageByOffsetRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
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
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

