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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractTraceWatermarkTaskInput extends AbstractModel {

    /**
    * The URL of the media on which digital watermark extraction is to be performed.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Media file ID. The original media file ID corresponding to the URL.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get The URL of the media on which digital watermark extraction is to be performed. 
     * @return Url The URL of the media on which digital watermark extraction is to be performed.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of the media on which digital watermark extraction is to be performed.
     * @param Url The URL of the media on which digital watermark extraction is to be performed.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Media file ID. The original media file ID corresponding to the URL. 
     * @return FileId Media file ID. The original media file ID corresponding to the URL.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID. The original media file ID corresponding to the URL.
     * @param FileId Media file ID. The original media file ID corresponding to the URL.
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

