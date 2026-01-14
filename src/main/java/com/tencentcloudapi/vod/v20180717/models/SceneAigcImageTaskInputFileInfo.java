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

public class SceneAigcImageTaskInputFileInfo extends AbstractModel {

    /**
    * Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The media File ID of the image File, which is the globally unique identifier of the File in vod, is assigned by the vod backend after successful upload. you can obtain this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File.
Note:
1. recommended for use with images less than 7 mb.
2. image format value is jpeg, jpg, png, webp.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Accessible file URL. this parameter is valid when Type value is Url.
Note:
1. recommended for use with images less than 7 MB.
2. image format value is jpeg, jpg, png, webp.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li> 
     * @return Type Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li>
     * @param Type Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The media File ID of the image File, which is the globally unique identifier of the File in vod, is assigned by the vod backend after successful upload. you can obtain this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File.
Note:
1. recommended for use with images less than 7 mb.
2. image format value is jpeg, jpg, png, webp. 
     * @return FileId The media File ID of the image File, which is the globally unique identifier of the File in vod, is assigned by the vod backend after successful upload. you can obtain this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File.
Note:
1. recommended for use with images less than 7 mb.
2. image format value is jpeg, jpg, png, webp.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The media File ID of the image File, which is the globally unique identifier of the File in vod, is assigned by the vod backend after successful upload. you can obtain this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File.
Note:
1. recommended for use with images less than 7 mb.
2. image format value is jpeg, jpg, png, webp.
     * @param FileId The media File ID of the image File, which is the globally unique identifier of the File in vod, is assigned by the vod backend after successful upload. you can obtain this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File.
Note:
1. recommended for use with images less than 7 mb.
2. image format value is jpeg, jpg, png, webp.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Accessible file URL. this parameter is valid when Type value is Url.
Note:
1. recommended for use with images less than 7 MB.
2. image format value is jpeg, jpg, png, webp. 
     * @return Url Accessible file URL. this parameter is valid when Type value is Url.
Note:
1. recommended for use with images less than 7 MB.
2. image format value is jpeg, jpg, png, webp.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Accessible file URL. this parameter is valid when Type value is Url.
Note:
1. recommended for use with images less than 7 MB.
2. image format value is jpeg, jpg, png, webp.
     * @param Url Accessible file URL. this parameter is valid when Type value is Url.
Note:
1. recommended for use with images less than 7 MB.
2. image format value is jpeg, jpg, png, webp.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public SceneAigcImageTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskInputFileInfo(SceneAigcImageTaskInputFileInfo source) {
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

