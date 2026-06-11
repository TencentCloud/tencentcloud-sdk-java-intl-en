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

public class PartitionOffsetInfo extends AbstractModel {

    /**
    * Partition ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * Offset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Partition ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionId Partition ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set Partition ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionId Partition ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get Offset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Offset Offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Offset Offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public PartitionOffsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionOffsetInfo(PartitionOffsetInfo source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

