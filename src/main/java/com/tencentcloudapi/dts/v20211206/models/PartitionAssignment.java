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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionAssignment extends AbstractModel {

    /**
    * The clientId of the consumer
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * The partition is being consumed by this consumer.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionNo")
    @Expose
    private Long [] PartitionNo;

    /**
     * Get The clientId of the consumer 
     * @return ClientId The clientId of the consumer
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set The clientId of the consumer
     * @param ClientId The clientId of the consumer
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get The partition is being consumed by this consumer.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionNo The partition is being consumed by this consumer.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPartitionNo() {
        return this.PartitionNo;
    }

    /**
     * Set The partition is being consumed by this consumer.Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionNo The partition is being consumed by this consumer.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionNo(Long [] PartitionNo) {
        this.PartitionNo = PartitionNo;
    }

    public PartitionAssignment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionAssignment(PartitionAssignment source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.PartitionNo != null) {
            this.PartitionNo = new Long[source.PartitionNo.length];
            for (int i = 0; i < source.PartitionNo.length; i++) {
                this.PartitionNo[i] = new Long(source.PartitionNo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamArraySimple(map, prefix + "PartitionNo.", this.PartitionNo);

    }
}

