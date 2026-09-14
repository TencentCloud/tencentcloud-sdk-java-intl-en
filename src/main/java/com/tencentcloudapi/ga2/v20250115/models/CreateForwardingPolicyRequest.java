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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateForwardingPolicyRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Listener ID.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Domain name.</p><p>Parameter format: format, must meet the regular expression: ^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p><p>Input limit: length range is 1-80.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Listener ID.</p> 
     * @return ListenerId <p>Listener ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener ID.</p>
     * @param ListenerId <p>Listener ID.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Domain name.</p><p>Parameter format: format, must meet the regular expression: ^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p><p>Input limit: length range is 1-80.</p> 
     * @return Host <p>Domain name.</p><p>Parameter format: format, must meet the regular expression: ^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p><p>Input limit: length range is 1-80.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Domain name.</p><p>Parameter format: format, must meet the regular expression: ^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p><p>Input limit: length range is 1-80.</p>
     * @param Host <p>Domain name.</p><p>Parameter format: format, must meet the regular expression: ^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p><p>Input limit: length range is 1-80.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public CreateForwardingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardingPolicyRequest(CreateForwardingPolicyRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

