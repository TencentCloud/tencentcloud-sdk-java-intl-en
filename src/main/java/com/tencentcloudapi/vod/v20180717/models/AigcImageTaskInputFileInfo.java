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

public class AigcImageTaskInputFileInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

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

    public AigcImageTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageTaskInputFileInfo(AigcImageTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

