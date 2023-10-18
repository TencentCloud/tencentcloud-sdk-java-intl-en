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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGrafanaIntegrationRequest extends AbstractModel {

    /**
    * TCMG instance ID, such as “grafana-12345678”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Integration ID, such as “integration-abcd1234”. You can view it by going to the instance details page and clicking **Tencent Cloud Service Integration** > **Integration List**.
    */
    @SerializedName("IntegrationId")
    @Expose
    private String IntegrationId;

    /**
     * Get TCMG instance ID, such as “grafana-12345678”. 
     * @return InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-12345678”.
     * @param InstanceId TCMG instance ID, such as “grafana-12345678”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Integration ID, such as “integration-abcd1234”. You can view it by going to the instance details page and clicking **Tencent Cloud Service Integration** > **Integration List**. 
     * @return IntegrationId Integration ID, such as “integration-abcd1234”. You can view it by going to the instance details page and clicking **Tencent Cloud Service Integration** > **Integration List**.
     */
    public String getIntegrationId() {
        return this.IntegrationId;
    }

    /**
     * Set Integration ID, such as “integration-abcd1234”. You can view it by going to the instance details page and clicking **Tencent Cloud Service Integration** > **Integration List**.
     * @param IntegrationId Integration ID, such as “integration-abcd1234”. You can view it by going to the instance details page and clicking **Tencent Cloud Service Integration** > **Integration List**.
     */
    public void setIntegrationId(String IntegrationId) {
        this.IntegrationId = IntegrationId;
    }

    public DeleteGrafanaIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGrafanaIntegrationRequest(DeleteGrafanaIntegrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IntegrationId != null) {
            this.IntegrationId = new String(source.IntegrationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IntegrationId", this.IntegrationId);

    }
}

