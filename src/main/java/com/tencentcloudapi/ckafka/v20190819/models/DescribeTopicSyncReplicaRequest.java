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

public class DescribeTopicSyncReplicaRequest extends AbstractModel {

    /**
    * <p>Instance ID</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Offset, which is 0 by default</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned results. Default value: 20. Must be greater than 0.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Only filter unsynced replicas</p>
    */
    @SerializedName("OutOfSyncReplicaOnly")
    @Expose
    private Boolean OutOfSyncReplicaOnly;

    /**
     * Get <p>Instance ID</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p> 
     * @return InstanceId <p>Instance ID</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     * @param InstanceId <p>Instance ID</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p> 
     * @return TopicName <p>Topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     * @param TopicName <p>Topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Offset, which is 0 by default</p> 
     * @return Offset <p>Offset, which is 0 by default</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset, which is 0 by default</p>
     * @param Offset <p>Offset, which is 0 by default</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned results. Default value: 20. Must be greater than 0.</p> 
     * @return Limit <p>Number of returned results. Default value: 20. Must be greater than 0.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. Default value: 20. Must be greater than 0.</p>
     * @param Limit <p>Number of returned results. Default value: 20. Must be greater than 0.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Only filter unsynced replicas</p> 
     * @return OutOfSyncReplicaOnly <p>Only filter unsynced replicas</p>
     */
    public Boolean getOutOfSyncReplicaOnly() {
        return this.OutOfSyncReplicaOnly;
    }

    /**
     * Set <p>Only filter unsynced replicas</p>
     * @param OutOfSyncReplicaOnly <p>Only filter unsynced replicas</p>
     */
    public void setOutOfSyncReplicaOnly(Boolean OutOfSyncReplicaOnly) {
        this.OutOfSyncReplicaOnly = OutOfSyncReplicaOnly;
    }

    public DescribeTopicSyncReplicaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicSyncReplicaRequest(DescribeTopicSyncReplicaRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OutOfSyncReplicaOnly != null) {
            this.OutOfSyncReplicaOnly = new Boolean(source.OutOfSyncReplicaOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OutOfSyncReplicaOnly", this.OutOfSyncReplicaOnly);

    }
}

