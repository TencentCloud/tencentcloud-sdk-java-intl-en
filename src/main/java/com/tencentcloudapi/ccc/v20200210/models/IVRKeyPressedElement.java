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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IVRKeyPressedElement extends AbstractModel {

    /**
    * Hit keyword or press.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag associated with the key.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * UNIX millisecond timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Node tags.
    */
    @SerializedName("NodeLabel")
    @Expose
    private String NodeLabel;

    /**
    * User'S original input.
    */
    @SerializedName("OriginalContent")
    @Expose
    private String OriginalContent;

    /**
    * TTS prompt content.
    */
    @SerializedName("TTSPrompt")
    @Expose
    private String TTSPrompt;

    /**
     * Get Hit keyword or press. 
     * @return Key Hit keyword or press.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Hit keyword or press.
     * @param Key Hit keyword or press.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Tag associated with the key. 
     * @return Label Tag associated with the key.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag associated with the key.
     * @param Label Tag associated with the key.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get UNIX millisecond timestamp. 
     * @return Timestamp UNIX millisecond timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set UNIX millisecond timestamp.
     * @param Timestamp UNIX millisecond timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Node tags. 
     * @return NodeLabel Node tags.
     */
    public String getNodeLabel() {
        return this.NodeLabel;
    }

    /**
     * Set Node tags.
     * @param NodeLabel Node tags.
     */
    public void setNodeLabel(String NodeLabel) {
        this.NodeLabel = NodeLabel;
    }

    /**
     * Get User'S original input. 
     * @return OriginalContent User'S original input.
     */
    public String getOriginalContent() {
        return this.OriginalContent;
    }

    /**
     * Set User'S original input.
     * @param OriginalContent User'S original input.
     */
    public void setOriginalContent(String OriginalContent) {
        this.OriginalContent = OriginalContent;
    }

    /**
     * Get TTS prompt content. 
     * @return TTSPrompt TTS prompt content.
     */
    public String getTTSPrompt() {
        return this.TTSPrompt;
    }

    /**
     * Set TTS prompt content.
     * @param TTSPrompt TTS prompt content.
     */
    public void setTTSPrompt(String TTSPrompt) {
        this.TTSPrompt = TTSPrompt;
    }

    public IVRKeyPressedElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IVRKeyPressedElement(IVRKeyPressedElement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.NodeLabel != null) {
            this.NodeLabel = new String(source.NodeLabel);
        }
        if (source.OriginalContent != null) {
            this.OriginalContent = new String(source.OriginalContent);
        }
        if (source.TTSPrompt != null) {
            this.TTSPrompt = new String(source.TTSPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "NodeLabel", this.NodeLabel);
        this.setParamSimple(map, prefix + "OriginalContent", this.OriginalContent);
        this.setParamSimple(map, prefix + "TTSPrompt", this.TTSPrompt);

    }
}

