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

public class AdvancedConsumerConfiguration extends AbstractModel {

    /**
    * Kafka partition hash status. Default false.

-true: Enable sending messages with equal field Hash values to the same Kafka partition.
-false: Disable sending messages with equivalent field Hash values to the same kafka partition.
    */
    @SerializedName("PartitionHashStatus")
    @Expose
    private Boolean PartitionHashStatus;

    /**
    * Field list to calculate hash. Supports a maximum of 5 fields.
    */
    @SerializedName("PartitionFields")
    @Expose
    private String [] PartitionFields;

    /**
     * Get Kafka partition hash status. Default false.

-true: Enable sending messages with equal field Hash values to the same Kafka partition.
-false: Disable sending messages with equivalent field Hash values to the same kafka partition. 
     * @return PartitionHashStatus Kafka partition hash status. Default false.

-true: Enable sending messages with equal field Hash values to the same Kafka partition.
-false: Disable sending messages with equivalent field Hash values to the same kafka partition.
     */
    public Boolean getPartitionHashStatus() {
        return this.PartitionHashStatus;
    }

    /**
     * Set Kafka partition hash status. Default false.

-true: Enable sending messages with equal field Hash values to the same Kafka partition.
-false: Disable sending messages with equivalent field Hash values to the same kafka partition.
     * @param PartitionHashStatus Kafka partition hash status. Default false.

-true: Enable sending messages with equal field Hash values to the same Kafka partition.
-false: Disable sending messages with equivalent field Hash values to the same kafka partition.
     */
    public void setPartitionHashStatus(Boolean PartitionHashStatus) {
        this.PartitionHashStatus = PartitionHashStatus;
    }

    /**
     * Get Field list to calculate hash. Supports a maximum of 5 fields. 
     * @return PartitionFields Field list to calculate hash. Supports a maximum of 5 fields.
     */
    public String [] getPartitionFields() {
        return this.PartitionFields;
    }

    /**
     * Set Field list to calculate hash. Supports a maximum of 5 fields.
     * @param PartitionFields Field list to calculate hash. Supports a maximum of 5 fields.
     */
    public void setPartitionFields(String [] PartitionFields) {
        this.PartitionFields = PartitionFields;
    }

    public AdvancedConsumerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedConsumerConfiguration(AdvancedConsumerConfiguration source) {
        if (source.PartitionHashStatus != null) {
            this.PartitionHashStatus = new Boolean(source.PartitionHashStatus);
        }
        if (source.PartitionFields != null) {
            this.PartitionFields = new String[source.PartitionFields.length];
            for (int i = 0; i < source.PartitionFields.length; i++) {
                this.PartitionFields[i] = new String(source.PartitionFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionHashStatus", this.PartitionHashStatus);
        this.setParamArraySimple(map, prefix + "PartitionFields.", this.PartitionFields);

    }
}

