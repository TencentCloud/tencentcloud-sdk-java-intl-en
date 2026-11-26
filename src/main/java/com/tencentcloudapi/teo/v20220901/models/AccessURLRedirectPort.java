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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessURLRedirectPort extends AbstractModel {

    /**
    * <p>Target port configuration</p><p>Enumeration values:</p><ul><li>FollowProtocol: Use the default port of the target protocol. The port is not explicitly specified in the redirect address. The target protocol uses its default port: 80 for HTTP and 443 for HTTPS.</li><li>FollowRequest: Follow the target port of the client request. If the request address explicitly carries a port, continue to use that port. If not, the redirect address does not carry a port.</li><li>Custom: Use the designated custom port.</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Custom destination port.</p><p>Value range: [1, 65535]</p><p>Required when Action is Custom. It is ineffective when Action is FollowProtocol or FollowRequest.</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>Target port configuration</p><p>Enumeration values:</p><ul><li>FollowProtocol: Use the default port of the target protocol. The port is not explicitly specified in the redirect address. The target protocol uses its default port: 80 for HTTP and 443 for HTTPS.</li><li>FollowRequest: Follow the target port of the client request. If the request address explicitly carries a port, continue to use that port. If not, the redirect address does not carry a port.</li><li>Custom: Use the designated custom port.</li></ul> 
     * @return Action <p>Target port configuration</p><p>Enumeration values:</p><ul><li>FollowProtocol: Use the default port of the target protocol. The port is not explicitly specified in the redirect address. The target protocol uses its default port: 80 for HTTP and 443 for HTTPS.</li><li>FollowRequest: Follow the target port of the client request. If the request address explicitly carries a port, continue to use that port. If not, the redirect address does not carry a port.</li><li>Custom: Use the designated custom port.</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Target port configuration</p><p>Enumeration values:</p><ul><li>FollowProtocol: Use the default port of the target protocol. The port is not explicitly specified in the redirect address. The target protocol uses its default port: 80 for HTTP and 443 for HTTPS.</li><li>FollowRequest: Follow the target port of the client request. If the request address explicitly carries a port, continue to use that port. If not, the redirect address does not carry a port.</li><li>Custom: Use the designated custom port.</li></ul>
     * @param Action <p>Target port configuration</p><p>Enumeration values:</p><ul><li>FollowProtocol: Use the default port of the target protocol. The port is not explicitly specified in the redirect address. The target protocol uses its default port: 80 for HTTP and 443 for HTTPS.</li><li>FollowRequest: Follow the target port of the client request. If the request address explicitly carries a port, continue to use that port. If not, the redirect address does not carry a port.</li><li>Custom: Use the designated custom port.</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Custom destination port.</p><p>Value range: [1, 65535]</p><p>Required when Action is Custom. It is ineffective when Action is FollowProtocol or FollowRequest.</p> 
     * @return Value <p>Custom destination port.</p><p>Value range: [1, 65535]</p><p>Required when Action is Custom. It is ineffective when Action is FollowProtocol or FollowRequest.</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>Custom destination port.</p><p>Value range: [1, 65535]</p><p>Required when Action is Custom. It is ineffective when Action is FollowProtocol or FollowRequest.</p>
     * @param Value <p>Custom destination port.</p><p>Value range: [1, 65535]</p><p>Required when Action is Custom. It is ineffective when Action is FollowProtocol or FollowRequest.</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public AccessURLRedirectPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessURLRedirectPort(AccessURLRedirectPort source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

