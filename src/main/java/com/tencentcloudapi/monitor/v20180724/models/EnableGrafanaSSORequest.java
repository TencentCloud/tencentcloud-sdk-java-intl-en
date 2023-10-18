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

public class EnableGrafanaSSORequest extends AbstractModel {

    /**
    * Whether to enable SSO (`true`: Yes; `false`: No)
    */
    @SerializedName("EnableSSO")
    @Expose
    private Boolean EnableSSO;

    /**
    * TCMG instance ID, such as “grafana-abcdefgh”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Whether to enable SSO (`true`: Yes; `false`: No) 
     * @return EnableSSO Whether to enable SSO (`true`: Yes; `false`: No)
     */
    public Boolean getEnableSSO() {
        return this.EnableSSO;
    }

    /**
     * Set Whether to enable SSO (`true`: Yes; `false`: No)
     * @param EnableSSO Whether to enable SSO (`true`: Yes; `false`: No)
     */
    public void setEnableSSO(Boolean EnableSSO) {
        this.EnableSSO = EnableSSO;
    }

    /**
     * Get TCMG instance ID, such as “grafana-abcdefgh”. 
     * @return InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-abcdefgh”.
     * @param InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EnableGrafanaSSORequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableGrafanaSSORequest(EnableGrafanaSSORequest source) {
        if (source.EnableSSO != null) {
            this.EnableSSO = new Boolean(source.EnableSSO);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableSSO", this.EnableSSO);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

