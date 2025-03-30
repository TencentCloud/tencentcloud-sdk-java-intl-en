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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAsrHotwordsRequest extends AbstractModel {

    /**
    * 0: temporary hotword; 1 file-based hotword.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Hotword lexicon name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Hotword lexicon text. This field is required if Type is set to 0.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Base64-encoded content of the hotword file. This field is required if Type is set to 1.


    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * Name of the uploaded file.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 0: temporary hotword; 1 file-based hotword. 
     * @return Type 0: temporary hotword; 1 file-based hotword.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: temporary hotword; 1 file-based hotword.
     * @param Type 0: temporary hotword; 1 file-based hotword.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Hotword lexicon name. 
     * @return Name Hotword lexicon name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Hotword lexicon name.
     * @param Name Hotword lexicon name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Hotword lexicon text. This field is required if Type is set to 0. 
     * @return Content Hotword lexicon text. This field is required if Type is set to 0.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Hotword lexicon text. This field is required if Type is set to 0.
     * @param Content Hotword lexicon text. This field is required if Type is set to 0.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Base64-encoded content of the hotword file. This field is required if Type is set to 1.

 
     * @return FileContent Base64-encoded content of the hotword file. This field is required if Type is set to 1.


     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set Base64-encoded content of the hotword file. This field is required if Type is set to 1.


     * @param FileContent Base64-encoded content of the hotword file. This field is required if Type is set to 1.


     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get Name of the uploaded file. 
     * @return FileName Name of the uploaded file.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Name of the uploaded file.
     * @param FileName Name of the uploaded file.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public CreateAsrHotwordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAsrHotwordsRequest(CreateAsrHotwordsRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

