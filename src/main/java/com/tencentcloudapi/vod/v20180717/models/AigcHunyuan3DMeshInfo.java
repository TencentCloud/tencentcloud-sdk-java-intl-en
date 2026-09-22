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

public class AigcHunyuan3DMeshInfo extends AbstractModel {

    /**
    * <p>Input file type. Valid values: <li>File: VOD file;</li> <li>Url: accessible URL;</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>File ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when Type is File. Note: Supported image formats: glb and obj.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Accessible file URL. This parameter is valid when Type is Url. Note: Supported file formats: glb and obj.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>Input file type. Valid values: <li>File: VOD file;</li> <li>Url: accessible URL;</li></p> 
     * @return Type <p>Input file type. Valid values: <li>File: VOD file;</li> <li>Url: accessible URL;</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Input file type. Valid values: <li>File: VOD file;</li> <li>Url: accessible URL;</li></p>
     * @param Type <p>Input file type. Valid values: <li>File: VOD file;</li> <li>Url: accessible URL;</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>File ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when Type is File. Note: Supported image formats: glb and obj.</p> 
     * @return FileId <p>File ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when Type is File. Note: Supported image formats: glb and obj.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when Type is File. Note: Supported image formats: glb and obj.</p>
     * @param FileId <p>File ID, the globally unique identifier of the file in VOD, assigned by the VOD backend after successful upload. You can obtain this field in the <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when Type is File. Note: Supported image formats: glb and obj.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Accessible file URL. This parameter is valid when Type is Url. Note: Supported file formats: glb and obj.</p> 
     * @return Url <p>Accessible file URL. This parameter is valid when Type is Url. Note: Supported file formats: glb and obj.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Accessible file URL. This parameter is valid when Type is Url. Note: Supported file formats: glb and obj.</p>
     * @param Url <p>Accessible file URL. This parameter is valid when Type is Url. Note: Supported file formats: glb and obj.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AigcHunyuan3DMeshInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DMeshInfo(AigcHunyuan3DMeshInfo source) {
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

