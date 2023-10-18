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

public class CreateDefaultAlarmThresholdRequest extends AbstractModel {

    /**
    * Default alarm threshold configuration
    */
    @SerializedName("DefaultAlarmConfig")
    @Expose
    private DefaultAlarmThreshold DefaultAlarmConfig;

    /**
    * Product category. Valid values:
`bgp`: Anti-DDoS Pro
`bgpip`: Anti-DDoS Advanced
]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get Default alarm threshold configuration 
     * @return DefaultAlarmConfig Default alarm threshold configuration
     */
    public DefaultAlarmThreshold getDefaultAlarmConfig() {
        return this.DefaultAlarmConfig;
    }

    /**
     * Set Default alarm threshold configuration
     * @param DefaultAlarmConfig Default alarm threshold configuration
     */
    public void setDefaultAlarmConfig(DefaultAlarmThreshold DefaultAlarmConfig) {
        this.DefaultAlarmConfig = DefaultAlarmConfig;
    }

    /**
     * Get Product category. Valid values:
`bgp`: Anti-DDoS Pro
`bgpip`: Anti-DDoS Advanced
] 
     * @return InstanceType Product category. Valid values:
`bgp`: Anti-DDoS Pro
`bgpip`: Anti-DDoS Advanced
]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Product category. Valid values:
`bgp`: Anti-DDoS Pro
`bgpip`: Anti-DDoS Advanced
]
     * @param InstanceType Product category. Valid values:
`bgp`: Anti-DDoS Pro
`bgpip`: Anti-DDoS Advanced
]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreateDefaultAlarmThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDefaultAlarmThresholdRequest(CreateDefaultAlarmThresholdRequest source) {
        if (source.DefaultAlarmConfig != null) {
            this.DefaultAlarmConfig = new DefaultAlarmThreshold(source.DefaultAlarmConfig);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DefaultAlarmConfig.", this.DefaultAlarmConfig);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

