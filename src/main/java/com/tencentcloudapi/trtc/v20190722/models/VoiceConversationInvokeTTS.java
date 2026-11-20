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

public class VoiceConversationInvokeTTS extends AbstractModel {

    /**
    * <p>Content to inject.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Priority. If no conversation is in progress, the injected content is sent to TTS. Otherwise, the behavior depends on this value. Default: 0.
Valid values:
- 0: High. Interrupt the current conversation, clear the waiting queue, and send the injected content to TTS.
- 1: Medium. Do not interrupt the current conversation. Clear the waiting queue and queue the injected content. If no conversation is in progress, the injected content is still queued.
- 2: Low. Discard the injected content.
`InvokeLLM` and `InvokeTTS` share one queue. The queue can hold only one Invoke event.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>Content to inject.</p> 
     * @return Content <p>Content to inject.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Content to inject.</p>
     * @param Content <p>Content to inject.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Priority. If no conversation is in progress, the injected content is sent to TTS. Otherwise, the behavior depends on this value. Default: 0.
Valid values:
- 0: High. Interrupt the current conversation, clear the waiting queue, and send the injected content to TTS.
- 1: Medium. Do not interrupt the current conversation. Clear the waiting queue and queue the injected content. If no conversation is in progress, the injected content is still queued.
- 2: Low. Discard the injected content.
`InvokeLLM` and `InvokeTTS` share one queue. The queue can hold only one Invoke event. 
     * @return Priority Priority. If no conversation is in progress, the injected content is sent to TTS. Otherwise, the behavior depends on this value. Default: 0.
Valid values:
- 0: High. Interrupt the current conversation, clear the waiting queue, and send the injected content to TTS.
- 1: Medium. Do not interrupt the current conversation. Clear the waiting queue and queue the injected content. If no conversation is in progress, the injected content is still queued.
- 2: Low. Discard the injected content.
`InvokeLLM` and `InvokeTTS` share one queue. The queue can hold only one Invoke event.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. If no conversation is in progress, the injected content is sent to TTS. Otherwise, the behavior depends on this value. Default: 0.
Valid values:
- 0: High. Interrupt the current conversation, clear the waiting queue, and send the injected content to TTS.
- 1: Medium. Do not interrupt the current conversation. Clear the waiting queue and queue the injected content. If no conversation is in progress, the injected content is still queued.
- 2: Low. Discard the injected content.
`InvokeLLM` and `InvokeTTS` share one queue. The queue can hold only one Invoke event.
     * @param Priority Priority. If no conversation is in progress, the injected content is sent to TTS. Otherwise, the behavior depends on this value. Default: 0.
Valid values:
- 0: High. Interrupt the current conversation, clear the waiting queue, and send the injected content to TTS.
- 1: Medium. Do not interrupt the current conversation. Clear the waiting queue and queue the injected content. If no conversation is in progress, the injected content is still queued.
- 2: Low. Discard the injected content.
`InvokeLLM` and `InvokeTTS` share one queue. The queue can hold only one Invoke event.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public VoiceConversationInvokeTTS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationInvokeTTS(VoiceConversationInvokeTTS source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

