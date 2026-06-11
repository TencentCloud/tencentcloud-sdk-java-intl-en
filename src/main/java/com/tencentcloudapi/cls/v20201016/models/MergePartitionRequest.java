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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergePartitionRequest extends AbstractModel {

    /**
    * Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Merged partition id (find the next partition whose InclusiveBeginKey equals the ExclusiveEndKey of the corresponding partition id in the input parameter, and the found partition must be a read-write partition (Status:readwrite), set the input partition id and the found partition id to read-only partition (Status:readonly), then create a new read-write partition). [Get partition list](https://www.tencentcloud.com/document/product/614/56470?from_cn_redirect=1)

1. PartitionId can only be a read-write partition (Status can be readonly or readwrite), and the next read-write partition of PartitionId can be found (the InclusiveBeginKey of the next partition equals to the ExclusiveEndKey of PartitionId).
2. The PartitionId cannot be the last partition (the ExclusiveEndKey of PartitionId cannot be ffffffffffffffffffffffffffffffff).
3. The number of topic partitions is limited (50 by default). After merging, it must not exceed the maximum partition, otherwise merging is not allowed.
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
     * Get Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return TopicId Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param TopicId Log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Merged partition id (find the next partition whose InclusiveBeginKey equals the ExclusiveEndKey of the corresponding partition id in the input parameter, and the found partition must be a read-write partition (Status:readwrite), set the input partition id and the found partition id to read-only partition (Status:readonly), then create a new read-write partition). [Get partition list](https://www.tencentcloud.com/document/product/614/56470?from_cn_redirect=1)

1. PartitionId can only be a read-write partition (Status can be readonly or readwrite), and the next read-write partition of PartitionId can be found (the InclusiveBeginKey of the next partition equals to the ExclusiveEndKey of PartitionId).
2. The PartitionId cannot be the last partition (the ExclusiveEndKey of PartitionId cannot be ffffffffffffffffffffffffffffffff).
3. The number of topic partitions is limited (50 by default). After merging, it must not exceed the maximum partition, otherwise merging is not allowed. 
     * @return PartitionId Merged partition id (find the next partition whose InclusiveBeginKey equals the ExclusiveEndKey of the corresponding partition id in the input parameter, and the found partition must be a read-write partition (Status:readwrite), set the input partition id and the found partition id to read-only partition (Status:readonly), then create a new read-write partition). [Get partition list](https://www.tencentcloud.com/document/product/614/56470?from_cn_redirect=1)

1. PartitionId can only be a read-write partition (Status can be readonly or readwrite), and the next read-write partition of PartitionId can be found (the InclusiveBeginKey of the next partition equals to the ExclusiveEndKey of PartitionId).
2. The PartitionId cannot be the last partition (the ExclusiveEndKey of PartitionId cannot be ffffffffffffffffffffffffffffffff).
3. The number of topic partitions is limited (50 by default). After merging, it must not exceed the maximum partition, otherwise merging is not allowed.
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set Merged partition id (find the next partition whose InclusiveBeginKey equals the ExclusiveEndKey of the corresponding partition id in the input parameter, and the found partition must be a read-write partition (Status:readwrite), set the input partition id and the found partition id to read-only partition (Status:readonly), then create a new read-write partition). [Get partition list](https://www.tencentcloud.com/document/product/614/56470?from_cn_redirect=1)

1. PartitionId can only be a read-write partition (Status can be readonly or readwrite), and the next read-write partition of PartitionId can be found (the InclusiveBeginKey of the next partition equals to the ExclusiveEndKey of PartitionId).
2. The PartitionId cannot be the last partition (the ExclusiveEndKey of PartitionId cannot be ffffffffffffffffffffffffffffffff).
3. The number of topic partitions is limited (50 by default). After merging, it must not exceed the maximum partition, otherwise merging is not allowed.
     * @param PartitionId Merged partition id (find the next partition whose InclusiveBeginKey equals the ExclusiveEndKey of the corresponding partition id in the input parameter, and the found partition must be a read-write partition (Status:readwrite), set the input partition id and the found partition id to read-only partition (Status:readonly), then create a new read-write partition). [Get partition list](https://www.tencentcloud.com/document/product/614/56470?from_cn_redirect=1)

1. PartitionId can only be a read-write partition (Status can be readonly or readwrite), and the next read-write partition of PartitionId can be found (the InclusiveBeginKey of the next partition equals to the ExclusiveEndKey of PartitionId).
2. The PartitionId cannot be the last partition (the ExclusiveEndKey of PartitionId cannot be ffffffffffffffffffffffffffffffff).
3. The number of topic partitions is limited (50 by default). After merging, it must not exceed the maximum partition, otherwise merging is not allowed.
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    public MergePartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergePartitionRequest(MergePartitionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);

    }
}

