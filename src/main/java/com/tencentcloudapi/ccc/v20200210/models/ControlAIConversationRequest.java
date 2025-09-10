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

public class ControlAIConversationRequest extends AbstractModel {

    /**
    * Specifies the session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Control command. currently supports the following commands:.

-ServerPushText. specifies the text sent by the server to the AI robot. the AI robot will broadcast the text.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Specifies the server-sent broadcast text Command. required when Command is ServerPushText.
    */
    @SerializedName("ServerPushText")
    @Expose
    private ServerPushText ServerPushText;

    /**
     * Get Specifies the session ID. 
     * @return SessionId Specifies the session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Specifies the session ID.
     * @param SessionId Specifies the session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get App ID (required). can be used to view https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Control command. currently supports the following commands:.

-ServerPushText. specifies the text sent by the server to the AI robot. the AI robot will broadcast the text. 
     * @return Command Control command. currently supports the following commands:.

-ServerPushText. specifies the text sent by the server to the AI robot. the AI robot will broadcast the text.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Control command. currently supports the following commands:.

-ServerPushText. specifies the text sent by the server to the AI robot. the AI robot will broadcast the text.
     * @param Command Control command. currently supports the following commands:.

-ServerPushText. specifies the text sent by the server to the AI robot. the AI robot will broadcast the text.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Specifies the server-sent broadcast text Command. required when Command is ServerPushText. 
     * @return ServerPushText Specifies the server-sent broadcast text Command. required when Command is ServerPushText.
     */
    public ServerPushText getServerPushText() {
        return this.ServerPushText;
    }

    /**
     * Set Specifies the server-sent broadcast text Command. required when Command is ServerPushText.
     * @param ServerPushText Specifies the server-sent broadcast text Command. required when Command is ServerPushText.
     */
    public void setServerPushText(ServerPushText ServerPushText) {
        this.ServerPushText = ServerPushText;
    }

    public ControlAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlAIConversationRequest(ControlAIConversationRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServerPushText != null) {
            this.ServerPushText = new ServerPushText(source.ServerPushText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServerPushText.", this.ServerPushText);

    }
}

