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

public class PartitionOffset extends AbstractModel {

    /**
    * Partition, such as "0" or "1"
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * Offset, such as 100
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Partition, such as "0" or "1"
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Partition Partition, such as "0" or "1"
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition, such as "0" or "1"
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Partition Partition, such as "0" or "1"
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset, such as 100
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Offset Offset, such as 100
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, such as 100
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Offset Offset, such as 100
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public PartitionOffset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionOffset(PartitionOffset source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

