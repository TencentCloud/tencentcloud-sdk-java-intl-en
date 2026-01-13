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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMessageEnrichmentRuleRequest extends AbstractModel {

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Message enrichment rule id.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Message enrichment rule id. 
     * @return Id Message enrichment rule id.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Message enrichment rule id.
     * @param Id Message enrichment rule id.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DeleteMessageEnrichmentRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMessageEnrichmentRuleRequest(DeleteMessageEnrichmentRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

