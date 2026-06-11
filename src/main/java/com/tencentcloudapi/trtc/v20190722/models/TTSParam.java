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

public class TTSParam extends AbstractModel {

    /**
    * <p>TTS model</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>TTS language must be in the TargetLang list of TranslationParam.</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>The user requesting TTS playback. They must be on the subscription allowlist and not on the blocklist.</p>
    */
    @SerializedName("TargetUser")
    @Expose
    private TranscriptionUserInfoParams TargetUser;

    /**
    * <p>The robot user that pushes TTS audio back into the room.</p>
    */
    @SerializedName("TTSRobotUser")
    @Expose
    private TranscriptionUserInfoParams TTSRobotUser;

    /**
    * <p>TTS configuration parameters.</p>
    */
    @SerializedName("Voice")
    @Expose
    private TTSVoice Voice;

    /**
     * Get <p>TTS model</p> 
     * @return Model <p>TTS model</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>TTS model</p>
     * @param Model <p>TTS model</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>TTS language must be in the TargetLang list of TranslationParam.</p> 
     * @return Language <p>TTS language must be in the TargetLang list of TranslationParam.</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>TTS language must be in the TargetLang list of TranslationParam.</p>
     * @param Language <p>TTS language must be in the TargetLang list of TranslationParam.</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>The user requesting TTS playback. They must be on the subscription allowlist and not on the blocklist.</p> 
     * @return TargetUser <p>The user requesting TTS playback. They must be on the subscription allowlist and not on the blocklist.</p>
     */
    public TranscriptionUserInfoParams getTargetUser() {
        return this.TargetUser;
    }

    /**
     * Set <p>The user requesting TTS playback. They must be on the subscription allowlist and not on the blocklist.</p>
     * @param TargetUser <p>The user requesting TTS playback. They must be on the subscription allowlist and not on the blocklist.</p>
     */
    public void setTargetUser(TranscriptionUserInfoParams TargetUser) {
        this.TargetUser = TargetUser;
    }

    /**
     * Get <p>The robot user that pushes TTS audio back into the room.</p> 
     * @return TTSRobotUser <p>The robot user that pushes TTS audio back into the room.</p>
     */
    public TranscriptionUserInfoParams getTTSRobotUser() {
        return this.TTSRobotUser;
    }

    /**
     * Set <p>The robot user that pushes TTS audio back into the room.</p>
     * @param TTSRobotUser <p>The robot user that pushes TTS audio back into the room.</p>
     */
    public void setTTSRobotUser(TranscriptionUserInfoParams TTSRobotUser) {
        this.TTSRobotUser = TTSRobotUser;
    }

    /**
     * Get <p>TTS configuration parameters.</p> 
     * @return Voice <p>TTS configuration parameters.</p>
     */
    public TTSVoice getVoice() {
        return this.Voice;
    }

    /**
     * Set <p>TTS configuration parameters.</p>
     * @param Voice <p>TTS configuration parameters.</p>
     */
    public void setVoice(TTSVoice Voice) {
        this.Voice = Voice;
    }

    public TTSParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TTSParam(TTSParam source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.TargetUser != null) {
            this.TargetUser = new TranscriptionUserInfoParams(source.TargetUser);
        }
        if (source.TTSRobotUser != null) {
            this.TTSRobotUser = new TranscriptionUserInfoParams(source.TTSRobotUser);
        }
        if (source.Voice != null) {
            this.Voice = new TTSVoice(source.Voice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamObj(map, prefix + "TargetUser.", this.TargetUser);
        this.setParamObj(map, prefix + "TTSRobotUser.", this.TTSRobotUser);
        this.setParamObj(map, prefix + "Voice.", this.Voice);

    }
}

