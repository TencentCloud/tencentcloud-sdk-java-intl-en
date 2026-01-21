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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlAIConversationRequest extends AbstractModel {

    /**
    * Task unique identifier.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Control command. currently supports the following commands: - ServerPushText: server sends text to the AI robot, and the AI robot will broadcast the text. - InvokeLLM: server sends text to the large model to trigger dialogue.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Server-Sent broadcast text Command. required when Command is ServerPushText.
    */
    @SerializedName("ServerPushText")
    @Expose
    private ServerPushText ServerPushText;

    /**
    * The server sends a Command to proactively request the large model. when Command is InvokeLLM, it sends the content request to the large model and adds X-Invoke-LLM="1" to the header.
    */
    @SerializedName("InvokeLLM")
    @Expose
    private InvokeLLM InvokeLLM;

    /**
     * Get Task unique identifier. 
     * @return TaskId Task unique identifier.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task unique identifier.
     * @param TaskId Task unique identifier.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Control command. currently supports the following commands: - ServerPushText: server sends text to the AI robot, and the AI robot will broadcast the text. - InvokeLLM: server sends text to the large model to trigger dialogue. 
     * @return Command Control command. currently supports the following commands: - ServerPushText: server sends text to the AI robot, and the AI robot will broadcast the text. - InvokeLLM: server sends text to the large model to trigger dialogue.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Control command. currently supports the following commands: - ServerPushText: server sends text to the AI robot, and the AI robot will broadcast the text. - InvokeLLM: server sends text to the large model to trigger dialogue.
     * @param Command Control command. currently supports the following commands: - ServerPushText: server sends text to the AI robot, and the AI robot will broadcast the text. - InvokeLLM: server sends text to the large model to trigger dialogue.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Server-Sent broadcast text Command. required when Command is ServerPushText. 
     * @return ServerPushText Server-Sent broadcast text Command. required when Command is ServerPushText.
     */
    public ServerPushText getServerPushText() {
        return this.ServerPushText;
    }

    /**
     * Set Server-Sent broadcast text Command. required when Command is ServerPushText.
     * @param ServerPushText Server-Sent broadcast text Command. required when Command is ServerPushText.
     */
    public void setServerPushText(ServerPushText ServerPushText) {
        this.ServerPushText = ServerPushText;
    }

    /**
     * Get The server sends a Command to proactively request the large model. when Command is InvokeLLM, it sends the content request to the large model and adds X-Invoke-LLM="1" to the header. 
     * @return InvokeLLM The server sends a Command to proactively request the large model. when Command is InvokeLLM, it sends the content request to the large model and adds X-Invoke-LLM="1" to the header.
     */
    public InvokeLLM getInvokeLLM() {
        return this.InvokeLLM;
    }

    /**
     * Set The server sends a Command to proactively request the large model. when Command is InvokeLLM, it sends the content request to the large model and adds X-Invoke-LLM="1" to the header.
     * @param InvokeLLM The server sends a Command to proactively request the large model. when Command is InvokeLLM, it sends the content request to the large model and adds X-Invoke-LLM="1" to the header.
     */
    public void setInvokeLLM(InvokeLLM InvokeLLM) {
        this.InvokeLLM = InvokeLLM;
    }

    public ControlAIConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlAIConversationRequest(ControlAIConversationRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServerPushText != null) {
            this.ServerPushText = new ServerPushText(source.ServerPushText);
        }
        if (source.InvokeLLM != null) {
            this.InvokeLLM = new InvokeLLM(source.InvokeLLM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServerPushText.", this.ServerPushText);
        this.setParamObj(map, prefix + "InvokeLLM.", this.InvokeLLM);

    }
}

