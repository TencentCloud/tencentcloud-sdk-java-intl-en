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

public class DesignVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Voice attribute.</p>
    */
    @SerializedName("VoiceProfile")
    @Expose
    private VoiceProfile VoiceProfile;

    /**
    * <p>Audition audio text. The length cannot exceed 500.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Extended parameters in the format of a JSON string.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Voice description.</p> 
     * @return Prompt <p>Voice description.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Voice description.</p>
     * @param Prompt <p>Voice description.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Voice attribute.</p> 
     * @return VoiceProfile <p>Voice attribute.</p>
     */
    public VoiceProfile getVoiceProfile() {
        return this.VoiceProfile;
    }

    /**
     * Set <p>Voice attribute.</p>
     * @param VoiceProfile <p>Voice attribute.</p>
     */
    public void setVoiceProfile(VoiceProfile VoiceProfile) {
        this.VoiceProfile = VoiceProfile;
    }

    /**
     * Get <p>Audition audio text. The length cannot exceed 500.</p> 
     * @return Text <p>Audition audio text. The length cannot exceed 500.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Audition audio text. The length cannot exceed 500.</p>
     * @param Text <p>Audition audio text. The length cannot exceed 500.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DesignVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncRequest(DesignVoiceAsyncRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VoiceProfile != null) {
            this.VoiceProfile = new VoiceProfile(source.VoiceProfile);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "VoiceProfile.", this.VoiceProfile);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

