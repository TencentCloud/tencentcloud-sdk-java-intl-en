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

public class AigcVideoTaskInputFileInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
    * 
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * 
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
    * 
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Category 
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 
     * @param Category 
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return Base64 
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set 
     * @param Base64 
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    /**
     * Get  
     * @return ReferenceType 
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 
     * @param ReferenceType 
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get  
     * @return ObjectId 
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 
     * @param ObjectId 
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
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
     * @return KeepOriginalSound 
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set 
     * @param KeepOriginalSound 
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    /**
     * Get  
     * @return Usage 
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 
     * @param Usage 
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public AigcVideoTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputFileInfo(AigcVideoTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.KeepOriginalSound != null) {
            this.KeepOriginalSound = new String(source.KeepOriginalSound);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "KeepOriginalSound", this.KeepOriginalSound);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

