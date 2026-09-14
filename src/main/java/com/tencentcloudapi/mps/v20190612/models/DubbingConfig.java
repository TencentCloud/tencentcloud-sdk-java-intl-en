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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DubbingConfig extends AbstractModel {

    /**
    * <p>Dubbing type. Available values: FullAutoEmotionClone: fully automated high-emotion clone dubbing; RoleBasedSmartDubbing: intelligent dubbing by role; SingleVoice: specify a single voice type;</p>
    */
    @SerializedName("DubbingMode")
    @Expose
    private String DubbingMode;

    /**
    * <p>Background sound volume, range: 0-100</p><p>Default value: 80</p>
    */
    @SerializedName("BackgroundVolume")
    @Expose
    private Long BackgroundVolume;

    /**
    * <p>Secondary fine-tuning switch. Available values: <br>ON: enable secondary fine-tuning; <br>OFF: disable secondary fine-tuning;</p><p>Default value: OFF</p><p>It can be set to ON only for RoleBasedSmartDubbing.</p>
    */
    @SerializedName("SecondaryTuning")
    @Expose
    private String SecondaryTuning;

    /**
    * <p>Specify voice tone</p><p>Valid only for SingleVoice and required for Create</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Dubbing version. Available values: v1, v2</p><p>Default value: v2</p><p>Only takes effect in FullAutoEmotionClone (fully automated high-emotion clone dubbing) mode</p>
    */
    @SerializedName("DubbingVersion")
    @Expose
    private String DubbingVersion;

    /**
     * Get <p>Dubbing type. Available values: FullAutoEmotionClone: fully automated high-emotion clone dubbing; RoleBasedSmartDubbing: intelligent dubbing by role; SingleVoice: specify a single voice type;</p> 
     * @return DubbingMode <p>Dubbing type. Available values: FullAutoEmotionClone: fully automated high-emotion clone dubbing; RoleBasedSmartDubbing: intelligent dubbing by role; SingleVoice: specify a single voice type;</p>
     */
    public String getDubbingMode() {
        return this.DubbingMode;
    }

    /**
     * Set <p>Dubbing type. Available values: FullAutoEmotionClone: fully automated high-emotion clone dubbing; RoleBasedSmartDubbing: intelligent dubbing by role; SingleVoice: specify a single voice type;</p>
     * @param DubbingMode <p>Dubbing type. Available values: FullAutoEmotionClone: fully automated high-emotion clone dubbing; RoleBasedSmartDubbing: intelligent dubbing by role; SingleVoice: specify a single voice type;</p>
     */
    public void setDubbingMode(String DubbingMode) {
        this.DubbingMode = DubbingMode;
    }

    /**
     * Get <p>Background sound volume, range: 0-100</p><p>Default value: 80</p> 
     * @return BackgroundVolume <p>Background sound volume, range: 0-100</p><p>Default value: 80</p>
     */
    public Long getBackgroundVolume() {
        return this.BackgroundVolume;
    }

    /**
     * Set <p>Background sound volume, range: 0-100</p><p>Default value: 80</p>
     * @param BackgroundVolume <p>Background sound volume, range: 0-100</p><p>Default value: 80</p>
     */
    public void setBackgroundVolume(Long BackgroundVolume) {
        this.BackgroundVolume = BackgroundVolume;
    }

    /**
     * Get <p>Secondary fine-tuning switch. Available values: <br>ON: enable secondary fine-tuning; <br>OFF: disable secondary fine-tuning;</p><p>Default value: OFF</p><p>It can be set to ON only for RoleBasedSmartDubbing.</p> 
     * @return SecondaryTuning <p>Secondary fine-tuning switch. Available values: <br>ON: enable secondary fine-tuning; <br>OFF: disable secondary fine-tuning;</p><p>Default value: OFF</p><p>It can be set to ON only for RoleBasedSmartDubbing.</p>
     */
    public String getSecondaryTuning() {
        return this.SecondaryTuning;
    }

    /**
     * Set <p>Secondary fine-tuning switch. Available values: <br>ON: enable secondary fine-tuning; <br>OFF: disable secondary fine-tuning;</p><p>Default value: OFF</p><p>It can be set to ON only for RoleBasedSmartDubbing.</p>
     * @param SecondaryTuning <p>Secondary fine-tuning switch. Available values: <br>ON: enable secondary fine-tuning; <br>OFF: disable secondary fine-tuning;</p><p>Default value: OFF</p><p>It can be set to ON only for RoleBasedSmartDubbing.</p>
     */
    public void setSecondaryTuning(String SecondaryTuning) {
        this.SecondaryTuning = SecondaryTuning;
    }

    /**
     * Get <p>Specify voice tone</p><p>Valid only for SingleVoice and required for Create</p> 
     * @return VoiceId <p>Specify voice tone</p><p>Valid only for SingleVoice and required for Create</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Specify voice tone</p><p>Valid only for SingleVoice and required for Create</p>
     * @param VoiceId <p>Specify voice tone</p><p>Valid only for SingleVoice and required for Create</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Dubbing version. Available values: v1, v2</p><p>Default value: v2</p><p>Only takes effect in FullAutoEmotionClone (fully automated high-emotion clone dubbing) mode</p> 
     * @return DubbingVersion <p>Dubbing version. Available values: v1, v2</p><p>Default value: v2</p><p>Only takes effect in FullAutoEmotionClone (fully automated high-emotion clone dubbing) mode</p>
     */
    public String getDubbingVersion() {
        return this.DubbingVersion;
    }

    /**
     * Set <p>Dubbing version. Available values: v1, v2</p><p>Default value: v2</p><p>Only takes effect in FullAutoEmotionClone (fully automated high-emotion clone dubbing) mode</p>
     * @param DubbingVersion <p>Dubbing version. Available values: v1, v2</p><p>Default value: v2</p><p>Only takes effect in FullAutoEmotionClone (fully automated high-emotion clone dubbing) mode</p>
     */
    public void setDubbingVersion(String DubbingVersion) {
        this.DubbingVersion = DubbingVersion;
    }

    public DubbingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingConfig(DubbingConfig source) {
        if (source.DubbingMode != null) {
            this.DubbingMode = new String(source.DubbingMode);
        }
        if (source.BackgroundVolume != null) {
            this.BackgroundVolume = new Long(source.BackgroundVolume);
        }
        if (source.SecondaryTuning != null) {
            this.SecondaryTuning = new String(source.SecondaryTuning);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.DubbingVersion != null) {
            this.DubbingVersion = new String(source.DubbingVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DubbingMode", this.DubbingMode);
        this.setParamSimple(map, prefix + "BackgroundVolume", this.BackgroundVolume);
        this.setParamSimple(map, prefix + "SecondaryTuning", this.SecondaryTuning);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "DubbingVersion", this.DubbingVersion);

    }
}

