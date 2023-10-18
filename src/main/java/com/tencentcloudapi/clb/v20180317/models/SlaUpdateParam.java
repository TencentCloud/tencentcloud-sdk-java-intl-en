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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaUpdateParam extends AbstractModel {

    /**
    * ID of the CLB instance
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * u200dTo upgrade the instance to an LCU-support instance, set it to `SLA`. `SLA` indicates Super Large 1. 
If you have activated Super Large LCU-supported instances, `SLA` indicates the Super Large 4 specification. Super u200dLarge LCU-supported specification is in beta now. u200cu200dTo join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
     * Get ID of the CLB instance 
     * @return LoadBalancerId ID of the CLB instance
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB instance
     * @param LoadBalancerId ID of the CLB instance
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get u200dTo upgrade the instance to an LCU-support instance, set it to `SLA`. `SLA` indicates Super Large 1. 
If you have activated Super Large LCU-supported instances, `SLA` indicates the Super Large 4 specification. Super u200dLarge LCU-supported specification is in beta now. u200cu200dTo join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category). 
     * @return SlaType u200dTo upgrade the instance to an LCU-support instance, set it to `SLA`. `SLA` indicates Super Large 1. 
If you have activated Super Large LCU-supported instances, `SLA` indicates the Super Large 4 specification. Super u200dLarge LCU-supported specification is in beta now. u200cu200dTo join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set u200dTo upgrade the instance to an LCU-support instance, set it to `SLA`. `SLA` indicates Super Large 1. 
If you have activated Super Large LCU-supported instances, `SLA` indicates the Super Large 4 specification. Super u200dLarge LCU-supported specification is in beta now. u200cu200dTo join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
     * @param SlaType u200dTo upgrade the instance to an LCU-support instance, set it to `SLA`. `SLA` indicates Super Large 1. 
If you have activated Super Large LCU-supported instances, `SLA` indicates the Super Large 4 specification. Super u200dLarge LCU-supported specification is in beta now. u200cu200dTo join the beta, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    public SlaUpdateParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaUpdateParam(SlaUpdateParam source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);

    }
}

