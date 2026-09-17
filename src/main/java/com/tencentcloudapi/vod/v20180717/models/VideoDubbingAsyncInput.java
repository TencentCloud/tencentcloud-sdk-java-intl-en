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

public class VideoDubbingAsyncInput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * 
    */
    @SerializedName("InputFileId")
    @Expose
    private String InputFileId;

    /**
    * 
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * 
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * 
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get  
     * @return InputUrl 
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set 
     * @param InputUrl 
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get  
     * @return InputFileId 
     */
    public String getInputFileId() {
        return this.InputFileId;
    }

    /**
     * Set 
     * @param InputFileId 
     */
    public void setInputFileId(String InputFileId) {
        this.InputFileId = InputFileId;
    }

    /**
     * Get  
     * @return SrcLanguage 
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set 
     * @param SrcLanguage 
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get  
     * @return DstLanguage 
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set 
     * @param DstLanguage 
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get  
     * @return Model 
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 
     * @param Model 
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public VideoDubbingAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDubbingAsyncInput(VideoDubbingAsyncInput source) {
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.InputFileId != null) {
            this.InputFileId = new String(source.InputFileId);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "InputFileId", this.InputFileId);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "DstLanguage", this.DstLanguage);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

