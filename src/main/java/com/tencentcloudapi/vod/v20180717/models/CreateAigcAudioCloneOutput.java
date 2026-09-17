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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcAudioCloneOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("DemoAudio")
    @Expose
    private String DemoAudio;

    /**
    * 
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return State 
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 
     * @param State 
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get  
     * @return VoiceId 
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 
     * @param VoiceId 
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get  
     * @return DemoAudio 
     */
    public String getDemoAudio() {
        return this.DemoAudio;
    }

    /**
     * Set 
     * @param DemoAudio 
     */
    public void setDemoAudio(String DemoAudio) {
        this.DemoAudio = DemoAudio;
    }

    /**
     * Get  
     * @return Payload 
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 
     * @param Payload 
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get  
     * @return CreatedAt 
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 
     * @param CreatedAt 
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public CreateAigcAudioCloneOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneOutput(CreateAigcAudioCloneOutput source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.DemoAudio != null) {
            this.DemoAudio = new String(source.DemoAudio);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "DemoAudio", this.DemoAudio);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

