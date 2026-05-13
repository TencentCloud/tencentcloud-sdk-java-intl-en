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
    * <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Topic name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1">DescribeTopic</a> API</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Partition id</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>Location info</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p> 
     * @return InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     * @param InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Topic name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1">DescribeTopic</a> API</p> 
     * @return Topic <p>Topic name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1">DescribeTopic</a> API</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>Topic name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1">DescribeTopic</a> API</p>
     * @param Topic <p>Topic name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40847?from_cn_redirect=1">DescribeTopic</a> API</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Partition id</p> 
     * @return Partition <p>Partition id</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>Partition id</p>
     * @param Partition <p>Partition id</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>Location info</p> 
     * @return Offset <p>Location info</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Location info</p>
     * @param Offset <p>Location info</p>
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

