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

public class ExtractTraceWatermarkTaskInput extends AbstractModel {

    /**
    * URL of the media requiring watermark extraction.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Media file ID. Original media file ID corresponding to the Url.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get URL of the media requiring watermark extraction. 
     * @return Url URL of the media requiring watermark extraction.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the media requiring watermark extraction.
     * @param Url URL of the media requiring watermark extraction.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Media file ID. Original media file ID corresponding to the Url. 
     * @return FileId Media file ID. Original media file ID corresponding to the Url.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID. Original media file ID corresponding to the Url.
     * @param FileId Media file ID. Original media file ID corresponding to the Url.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public ExtractTraceWatermarkTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractTraceWatermarkTaskInput(ExtractTraceWatermarkTaskInput source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

