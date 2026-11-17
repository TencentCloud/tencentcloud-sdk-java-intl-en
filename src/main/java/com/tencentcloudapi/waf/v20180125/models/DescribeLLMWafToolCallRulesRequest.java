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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMWafToolCallRulesRequest extends AbstractModel {

    /**
    * <p>Service ID.</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Service ID.</p> 
     * @return ServiceId <p>Service ID.</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>Service ID.</p>
     * @param ServiceId <p>Service ID.</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeLLMWafToolCallRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMWafToolCallRulesRequest(DescribeLLMWafToolCallRulesRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

