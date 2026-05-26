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

public class AigcVideoRedrawTaskInputFileInfo extends AbstractModel {

    /**
    * <p>Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Media file ID, the globally unique identifier of this file in VOD, is assigned by the VOD backend after a successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description: 1. Recommended image size is less than 10M. 2. Image format values: jpeg, jpg, png.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 10M; 2. Image format value is jpeg, jpg, png.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li></p> 
     * @return Type <p>Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li></p>
     * @param Type <p>Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Media file ID, the globally unique identifier of this file in VOD, is assigned by the VOD backend after a successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description: 1. Recommended image size is less than 10M. 2. Image format values: jpeg, jpg, png.</p> 
     * @return FileId <p>Media file ID, the globally unique identifier of this file in VOD, is assigned by the VOD backend after a successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description: 1. Recommended image size is less than 10M. 2. Image format values: jpeg, jpg, png.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID, the globally unique identifier of this file in VOD, is assigned by the VOD backend after a successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description: 1. Recommended image size is less than 10M. 2. Image format values: jpeg, jpg, png.</p>
     * @param FileId <p>Media file ID, the globally unique identifier of this file in VOD, is assigned by the VOD backend after a successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description: 1. Recommended image size is less than 10M. 2. Image format values: jpeg, jpg, png.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 10M; 2. Image format value is jpeg, jpg, png.</p> 
     * @return Url <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 10M; 2. Image format value is jpeg, jpg, png.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 10M; 2. Image format value is jpeg, jpg, png.</p>
     * @param Url <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 10M; 2. Image format value is jpeg, jpg, png.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AigcVideoRedrawTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoRedrawTaskInputFileInfo(AigcVideoRedrawTaskInputFileInfo source) {
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

