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

public class ExtractBlindWatermarkInputInfo extends AbstractModel {

    /**
    * Digital watermark extraction input type. Available values: <li>FILEID: file media asset ID;</li><li>URL: file URL;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Media asset file ID to extract
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * url of the video file to extract
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Digital watermark extraction input type. Available values: <li>FILEID: file media asset ID;</li><li>URL: file URL;</li> 
     * @return Type Digital watermark extraction input type. Available values: <li>FILEID: file media asset ID;</li><li>URL: file URL;</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark extraction input type. Available values: <li>FILEID: file media asset ID;</li><li>URL: file URL;</li>
     * @param Type Digital watermark extraction input type. Available values: <li>FILEID: file media asset ID;</li><li>URL: file URL;</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Media asset file ID to extract 
     * @return FileId Media asset file ID to extract
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media asset file ID to extract
     * @param FileId Media asset file ID to extract
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get url of the video file to extract 
     * @return Url url of the video file to extract
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set url of the video file to extract
     * @param Url url of the video file to extract
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ExtractBlindWatermarkInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkInputInfo(ExtractBlindWatermarkInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

