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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientInfo extends AbstractModel {

    /**
    * Endpoint type for login. "Web" means Web workbench. "WeChatMiniProgram" refers to wechat mini program.
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * Whether the currently logged-in endpoint is in the foreground. if the endpoint is Web, the value is true. if the endpoint is WeChatMiniProgram, true indicates the wechat mini program is open, and false indicates it is in the background.
    */
    @SerializedName("IsConnected")
    @Expose
    private Boolean IsConnected;

    /**
     * Get Endpoint type for login. "Web" means Web workbench. "WeChatMiniProgram" refers to wechat mini program. 
     * @return ClientType Endpoint type for login. "Web" means Web workbench. "WeChatMiniProgram" refers to wechat mini program.
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set Endpoint type for login. "Web" means Web workbench. "WeChatMiniProgram" refers to wechat mini program.
     * @param ClientType Endpoint type for login. "Web" means Web workbench. "WeChatMiniProgram" refers to wechat mini program.
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get Whether the currently logged-in endpoint is in the foreground. if the endpoint is Web, the value is true. if the endpoint is WeChatMiniProgram, true indicates the wechat mini program is open, and false indicates it is in the background. 
     * @return IsConnected Whether the currently logged-in endpoint is in the foreground. if the endpoint is Web, the value is true. if the endpoint is WeChatMiniProgram, true indicates the wechat mini program is open, and false indicates it is in the background.
     */
    public Boolean getIsConnected() {
        return this.IsConnected;
    }

    /**
     * Set Whether the currently logged-in endpoint is in the foreground. if the endpoint is Web, the value is true. if the endpoint is WeChatMiniProgram, true indicates the wechat mini program is open, and false indicates it is in the background.
     * @param IsConnected Whether the currently logged-in endpoint is in the foreground. if the endpoint is Web, the value is true. if the endpoint is WeChatMiniProgram, true indicates the wechat mini program is open, and false indicates it is in the background.
     */
    public void setIsConnected(Boolean IsConnected) {
        this.IsConnected = IsConnected;
    }

    public ClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientInfo(ClientInfo source) {
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.IsConnected != null) {
            this.IsConnected = new Boolean(source.IsConnected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "IsConnected", this.IsConnected);

    }
}

