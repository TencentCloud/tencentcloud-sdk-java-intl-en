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

public class VoiceConversationHistoryMessage extends AbstractModel {

    /**
    * <p>The Conversation role, for example, "user", "assistant", "system".</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>Conversation content.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>The Conversation role, for example, "user", "assistant", "system".</p> 
     * @return Role <p>The Conversation role, for example, "user", "assistant", "system".</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>The Conversation role, for example, "user", "assistant", "system".</p>
     * @param Role <p>The Conversation role, for example, "user", "assistant", "system".</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Conversation content.</p> 
     * @return Content <p>Conversation content.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Conversation content.</p>
     * @param Content <p>Conversation content.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public VoiceConversationHistoryMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationHistoryMessage(VoiceConversationHistoryMessage source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

