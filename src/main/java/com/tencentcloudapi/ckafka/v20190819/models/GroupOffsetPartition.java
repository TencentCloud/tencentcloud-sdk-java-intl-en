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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupOffsetPartition extends AbstractModel {

    /**
    * Topic `partitionId`
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Offset position submitted by consumer
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Metadata can be passed in for other purposes when the consumer submits messages. Currently, this parameter is usually an empty string
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * Error code
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Latest offset of current partition
    */
    @SerializedName("LogEndOffset")
    @Expose
    private Long LogEndOffset;

    /**
    * Number of unconsumed messages
    */
    @SerializedName("Lag")
    @Expose
    private Long Lag;

    /**
     * Get Topic `partitionId` 
     * @return Partition Topic `partitionId`
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Topic `partitionId`
     * @param Partition Topic `partitionId`
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset position submitted by consumer 
     * @return Offset Offset position submitted by consumer
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset position submitted by consumer
     * @param Offset Offset position submitted by consumer
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Metadata can be passed in for other purposes when the consumer submits messages. Currently, this parameter is usually an empty string
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Metadata Metadata can be passed in for other purposes when the consumer submits messages. Currently, this parameter is usually an empty string
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata can be passed in for other purposes when the consumer submits messages. Currently, this parameter is usually an empty string
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Metadata Metadata can be passed in for other purposes when the consumer submits messages. Currently, this parameter is usually an empty string
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get Error code 
     * @return ErrorCode Error code
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Error code
     * @param ErrorCode Error code
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Latest offset of current partition 
     * @return LogEndOffset Latest offset of current partition
     */
    public Long getLogEndOffset() {
        return this.LogEndOffset;
    }

    /**
     * Set Latest offset of current partition
     * @param LogEndOffset Latest offset of current partition
     */
    public void setLogEndOffset(Long LogEndOffset) {
        this.LogEndOffset = LogEndOffset;
    }

    /**
     * Get Number of unconsumed messages 
     * @return Lag Number of unconsumed messages
     */
    public Long getLag() {
        return this.Lag;
    }

    /**
     * Set Number of unconsumed messages
     * @param Lag Number of unconsumed messages
     */
    public void setLag(Long Lag) {
        this.Lag = Lag;
    }

    public GroupOffsetPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupOffsetPartition(GroupOffsetPartition source) {
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.LogEndOffset != null) {
            this.LogEndOffset = new Long(source.LogEndOffset);
        }
        if (source.Lag != null) {
            this.Lag = new Long(source.Lag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "LogEndOffset", this.LogEndOffset);
        this.setParamSimple(map, prefix + "Lag", this.Lag);

    }
}

