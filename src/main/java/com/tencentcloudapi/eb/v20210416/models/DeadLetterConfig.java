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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterConfig extends AbstractModel{

    /**
    * Three modes are supported: DLQ, drop, and ignore error, which correspond to `DLQ`, `DROP`, and `IGNORE_ERROR` respectively
    */
    @SerializedName("DisposeMethod")
    @Expose
    private String DisposeMethod;

    /**
    * If the DLQ mode is set, this option is required. Error messages will be delivered to the corresponding Kafka topic
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CkafkaDeliveryParams")
    @Expose
    private CkafkaDeliveryParams CkafkaDeliveryParams;

    /**
     * Get Three modes are supported: DLQ, drop, and ignore error, which correspond to `DLQ`, `DROP`, and `IGNORE_ERROR` respectively 
     * @return DisposeMethod Three modes are supported: DLQ, drop, and ignore error, which correspond to `DLQ`, `DROP`, and `IGNORE_ERROR` respectively
     */
    public String getDisposeMethod() {
        return this.DisposeMethod;
    }

    /**
     * Set Three modes are supported: DLQ, drop, and ignore error, which correspond to `DLQ`, `DROP`, and `IGNORE_ERROR` respectively
     * @param DisposeMethod Three modes are supported: DLQ, drop, and ignore error, which correspond to `DLQ`, `DROP`, and `IGNORE_ERROR` respectively
     */
    public void setDisposeMethod(String DisposeMethod) {
        this.DisposeMethod = DisposeMethod;
    }

    /**
     * Get If the DLQ mode is set, this option is required. Error messages will be delivered to the corresponding Kafka topic
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CkafkaDeliveryParams If the DLQ mode is set, this option is required. Error messages will be delivered to the corresponding Kafka topic
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CkafkaDeliveryParams getCkafkaDeliveryParams() {
        return this.CkafkaDeliveryParams;
    }

    /**
     * Set If the DLQ mode is set, this option is required. Error messages will be delivered to the corresponding Kafka topic
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CkafkaDeliveryParams If the DLQ mode is set, this option is required. Error messages will be delivered to the corresponding Kafka topic
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCkafkaDeliveryParams(CkafkaDeliveryParams CkafkaDeliveryParams) {
        this.CkafkaDeliveryParams = CkafkaDeliveryParams;
    }

    public DeadLetterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLetterConfig(DeadLetterConfig source) {
        if (source.DisposeMethod != null) {
            this.DisposeMethod = new String(source.DisposeMethod);
        }
        if (source.CkafkaDeliveryParams != null) {
            this.CkafkaDeliveryParams = new CkafkaDeliveryParams(source.CkafkaDeliveryParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisposeMethod", this.DisposeMethod);
        this.setParamObj(map, prefix + "CkafkaDeliveryParams.", this.CkafkaDeliveryParams);

    }
}

