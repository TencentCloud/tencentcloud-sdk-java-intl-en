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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchWaterPrintConfigRequest extends AbstractModel {

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Watermark status. `1`: enabled; `0`: disabled.
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * Whether to enable proxy. Values: `1` (Enable proxy and ignore IP+port verification), `0` (Do not enable proxy and IP+port verification is required)
    */
    @SerializedName("CloudSdkProxy")
    @Expose
    private Long CloudSdkProxy;

    /**
     * Get Anti-DDoS instance ID 
     * @return InstanceId Anti-DDoS instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param InstanceId Anti-DDoS instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Watermark status. `1`: enabled; `0`: disabled. 
     * @return OpenStatus Watermark status. `1`: enabled; `0`: disabled.
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set Watermark status. `1`: enabled; `0`: disabled.
     * @param OpenStatus Watermark status. `1`: enabled; `0`: disabled.
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get Whether to enable proxy. Values: `1` (Enable proxy and ignore IP+port verification), `0` (Do not enable proxy and IP+port verification is required) 
     * @return CloudSdkProxy Whether to enable proxy. Values: `1` (Enable proxy and ignore IP+port verification), `0` (Do not enable proxy and IP+port verification is required)
     */
    public Long getCloudSdkProxy() {
        return this.CloudSdkProxy;
    }

    /**
     * Set Whether to enable proxy. Values: `1` (Enable proxy and ignore IP+port verification), `0` (Do not enable proxy and IP+port verification is required)
     * @param CloudSdkProxy Whether to enable proxy. Values: `1` (Enable proxy and ignore IP+port verification), `0` (Do not enable proxy and IP+port verification is required)
     */
    public void setCloudSdkProxy(Long CloudSdkProxy) {
        this.CloudSdkProxy = CloudSdkProxy;
    }

    public SwitchWaterPrintConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchWaterPrintConfigRequest(SwitchWaterPrintConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new Long(source.OpenStatus);
        }
        if (source.CloudSdkProxy != null) {
            this.CloudSdkProxy = new Long(source.CloudSdkProxy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "CloudSdkProxy", this.CloudSdkProxy);

    }
}

