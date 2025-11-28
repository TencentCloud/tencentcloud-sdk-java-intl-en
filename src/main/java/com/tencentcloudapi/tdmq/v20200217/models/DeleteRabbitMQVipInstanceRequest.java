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

public class DeleteRabbitMQVipInstanceRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the request is from the international website. Default value: false.
    */
    @SerializedName("IsIntl")
    @Expose
    private Boolean IsIntl;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether the request is from the international website. Default value: false. 
     * @return IsIntl Whether the request is from the international website. Default value: false.
     */
    public Boolean getIsIntl() {
        return this.IsIntl;
    }

    /**
     * Set Whether the request is from the international website. Default value: false.
     * @param IsIntl Whether the request is from the international website. Default value: false.
     */
    public void setIsIntl(Boolean IsIntl) {
        this.IsIntl = IsIntl;
    }

    public DeleteRabbitMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRabbitMQVipInstanceRequest(DeleteRabbitMQVipInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsIntl != null) {
            this.IsIntl = new Boolean(source.IsIntl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsIntl", this.IsIntl);

    }
}

