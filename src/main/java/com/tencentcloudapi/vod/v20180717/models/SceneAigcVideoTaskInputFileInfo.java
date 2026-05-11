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

public class SceneAigcVideoTaskInputFileInfo extends AbstractModel {

    /**
    * Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Media file ID of the image file, which is the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [VOD console](https://console.cloud.tencent.com/vod/media). This parameter is valid when the Type value is File.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Accessible file URL. This parameter is valid when the Type value is Url.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li> 
     * @return Type Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li>
     * @param Type Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Media file ID of the image file, which is the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [VOD console](https://console.cloud.tencent.com/vod/media). This parameter is valid when the Type value is File.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp. 
     * @return FileId Media file ID of the image file, which is the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [VOD console](https://console.cloud.tencent.com/vod/media). This parameter is valid when the Type value is File.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID of the image file, which is the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [VOD console](https://console.cloud.tencent.com/vod/media). This parameter is valid when the Type value is File.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     * @param FileId Media file ID of the image file, which is the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [VOD console](https://console.cloud.tencent.com/vod/media). This parameter is valid when the Type value is File.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Accessible file URL. This parameter is valid when the Type value is Url.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp. 
     * @return Url Accessible file URL. This parameter is valid when the Type value is Url.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Accessible file URL. This parameter is valid when the Type value is Url.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     * @param Url Accessible file URL. This parameter is valid when the Type value is Url.
Description:
1. Use images less than 7M.
Image format. Valid values: jpeg, jpg, png, and webp.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public SceneAigcVideoTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcVideoTaskInputFileInfo(SceneAigcVideoTaskInputFileInfo source) {
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

