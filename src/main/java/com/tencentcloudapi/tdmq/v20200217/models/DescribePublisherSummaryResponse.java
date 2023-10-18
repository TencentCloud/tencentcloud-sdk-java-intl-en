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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublisherSummaryResponse extends AbstractModel {

    /**
    * Production rate (messages/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateIn")
    @Expose
    private Float MsgRateIn;

    /**
    * Production rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private Float MsgThroughputIn;

    /**
    * The number of producers.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PublisherCount")
    @Expose
    private Long PublisherCount;

    /**
    * Message storage size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Production rate (messages/sec).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MsgRateIn Production rate (messages/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set Production rate (messages/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MsgRateIn Production rate (messages/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMsgRateIn(Float MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get Production rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MsgThroughputIn Production rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set Production rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MsgThroughputIn Production rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputIn(Float MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get The number of producers.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PublisherCount The number of producers.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPublisherCount() {
        return this.PublisherCount;
    }

    /**
     * Set The number of producers.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PublisherCount The number of producers.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPublisherCount(Long PublisherCount) {
        this.PublisherCount = PublisherCount;
    }

    /**
     * Get Message storage size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StorageSize Message storage size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Message storage size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StorageSize Message storage size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
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

    public DescribePublisherSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublisherSummaryResponse(DescribePublisherSummaryResponse source) {
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new Float(source.MsgRateIn);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new Float(source.MsgThroughputIn);
        }
        if (source.PublisherCount != null) {
            this.PublisherCount = new Long(source.PublisherCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "PublisherCount", this.PublisherCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

