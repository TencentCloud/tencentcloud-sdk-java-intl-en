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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicResponse extends AbstractModel {

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Valid value: 0 or 1. Non-partitioned topic: No partitions. A value greater than 1: The partition count of a partitioned topic. `0` is returned for existing non-partitioned topics, and `1` is returned for incremental non-partitioned topics.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Valid value: 0 or 1. Non-partitioned topic: No partitions. A value greater than 1: The partition count of a partitioned topic. `0` is returned for existing non-partitioned topics, and `1` is returned for incremental non-partitioned topics. 
     * @return Partitions Valid value: 0 or 1. Non-partitioned topic: No partitions. A value greater than 1: The partition count of a partitioned topic. `0` is returned for existing non-partitioned topics, and `1` is returned for incremental non-partitioned topics.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Valid value: 0 or 1. Non-partitioned topic: No partitions. A value greater than 1: The partition count of a partitioned topic. `0` is returned for existing non-partitioned topics, and `1` is returned for incremental non-partitioned topics.
     * @param Partitions Valid value: 0 or 1. Non-partitioned topic: No partitions. A value greater than 1: The partition count of a partitioned topic. `0` is returned for existing non-partitioned topics, and `1` is returned for incremental non-partitioned topics.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicType 0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set 0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicType 0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateTopicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicResponse(CreateTopicResponse source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

