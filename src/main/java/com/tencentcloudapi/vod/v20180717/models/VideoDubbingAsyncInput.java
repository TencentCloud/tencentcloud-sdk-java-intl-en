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
    * <p>Input video Url</p>
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * <p>FileId of the input video</p>
    */
    @SerializedName("InputFileId")
    @Expose
    private String InputFileId;

    /**
    * <p>Video source language. The default value is zh.</p>
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * <p>Target language of the video. Default: en</p>
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * <p>Dubbing model</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>Input video Url</p> 
     * @return InputUrl <p>Input video Url</p>
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set <p>Input video Url</p>
     * @param InputUrl <p>Input video Url</p>
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get <p>FileId of the input video</p> 
     * @return InputFileId <p>FileId of the input video</p>
     */
    public String getInputFileId() {
        return this.InputFileId;
    }

    /**
     * Set <p>FileId of the input video</p>
     * @param InputFileId <p>FileId of the input video</p>
     */
    public void setInputFileId(String InputFileId) {
        this.InputFileId = InputFileId;
    }

    /**
     * Get <p>Video source language. The default value is zh.</p> 
     * @return SrcLanguage <p>Video source language. The default value is zh.</p>
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set <p>Video source language. The default value is zh.</p>
     * @param SrcLanguage <p>Video source language. The default value is zh.</p>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get <p>Target language of the video. Default: en</p> 
     * @return DstLanguage <p>Target language of the video. Default: en</p>
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set <p>Target language of the video. Default: en</p>
     * @param DstLanguage <p>Target language of the video. Default: en</p>
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get <p>Dubbing model</p> 
     * @return Model <p>Dubbing model</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Dubbing model</p>
     * @param Model <p>Dubbing model</p>
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

