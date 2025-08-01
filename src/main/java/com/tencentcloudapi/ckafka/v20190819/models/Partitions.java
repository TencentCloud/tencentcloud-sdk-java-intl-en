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

public class Partitions extends AbstractModel {

    /**
    * Partition.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Partition consumption offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Partition. 
     * @return Partition Partition.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition.
     * @param Partition Partition.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Partition consumption offset. 
     * @return Offset Partition consumption offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Partition consumption offset.
     * @param Offset Partition consumption offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public Partitions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partitions(Partitions source) {
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
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

