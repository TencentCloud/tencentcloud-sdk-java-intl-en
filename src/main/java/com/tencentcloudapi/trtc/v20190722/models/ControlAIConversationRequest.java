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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlAIConversationRequest extends AbstractModel {

    /**
    * Unique ID of the task
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Control commands, currently supported commands are as follows:
- ServerPushText, the server sends text to the AI robot, and the AI robot will play the text
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * The server sends a text broadcast command. This is required when Command is ServerPushText.
    */
    @SerializedName("ServerPushText")
    @Expose
    private ServerPushText ServerPushText;

    /**
     * Get Unique ID of the task 
     * @return TaskId Unique ID of the task
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the task
     * @param TaskId Unique ID of the task
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Control commands, currently supported commands are as follows:
- ServerPushText, the server sends text to the AI robot, and the AI robot will play the text 
     * @return Command Control commands, currently supported commands are as follows:
- ServerPushText, the server sends text to the AI robot, and the AI robot will play the text
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Control commands, currently supported commands are as follows:
- ServerPushText, the server sends text to the AI robot, and the AI robot will play the text
     * @param Command Control commands, currently supported commands are as follows:
- ServerPushText, the server sends text to the AI robot, and the AI robot will play the text
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get The server sends a text broadcast command. This is required when Command is ServerPushText. 
     * @return ServerPushText The server sends a text broadcast command. This is required when Command is ServerPushText.
     */
    public ServerPushText getServerPushText() {
        return this.ServerPushText;
    }

    /**
     * Set The server sends a text broadcast command. This is required when Command is ServerPushText.
     * @param ServerPushText The server sends a text broadcast command. This is required when Command is ServerPushText.
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
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServerPushText.", this.ServerPushText);

    }
}

