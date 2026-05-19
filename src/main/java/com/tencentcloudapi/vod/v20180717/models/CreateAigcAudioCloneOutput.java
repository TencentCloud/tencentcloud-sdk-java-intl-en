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
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Processing status.</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>voice_id customized by users. Do not return if the task fails.</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>If the audition text is passed in the request body, this parameter returns the audio audition in link format, otherwise this parameter is empty.</p>
    */
    @SerializedName("DemoAudio")
    @Expose
    private String DemoAudio;

    /**
    * <p>Pass-through parameter passed in this call.</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>Task creation time.</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Processing status.</p> 
     * @return State <p>Processing status.</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>Processing status.</p>
     * @param State <p>Processing status.</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>voice_id customized by users. Do not return if the task fails.</p> 
     * @return VoiceId <p>voice_id customized by users. Do not return if the task fails.</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>voice_id customized by users. Do not return if the task fails.</p>
     * @param VoiceId <p>voice_id customized by users. Do not return if the task fails.</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>If the audition text is passed in the request body, this parameter returns the audio audition in link format, otherwise this parameter is empty.</p> 
     * @return DemoAudio <p>If the audition text is passed in the request body, this parameter returns the audio audition in link format, otherwise this parameter is empty.</p>
     */
    public String getDemoAudio() {
        return this.DemoAudio;
    }

    /**
     * Set <p>If the audition text is passed in the request body, this parameter returns the audio audition in link format, otherwise this parameter is empty.</p>
     * @param DemoAudio <p>If the audition text is passed in the request body, this parameter returns the audio audition in link format, otherwise this parameter is empty.</p>
     */
    public void setDemoAudio(String DemoAudio) {
        this.DemoAudio = DemoAudio;
    }

    /**
     * Get <p>Pass-through parameter passed in this call.</p> 
     * @return Payload <p>Pass-through parameter passed in this call.</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>Pass-through parameter passed in this call.</p>
     * @param Payload <p>Pass-through parameter passed in this call.</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>Task creation time.</p> 
     * @return CreatedAt <p>Task creation time.</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Task creation time.</p>
     * @param CreatedAt <p>Task creation time.</p>
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

