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

public class AigcAudioReferenceAudioInfo extends AbstractModel {

    /**
    * <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 7M; 2. Image format value: jpeg, jpg, png, webp.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>The media file ID of the audio file, which is the globally unique identifier of this file on VOD, is assigned by the VOD backend after a successful upload. You can retrieve this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Audio file URL, which must be external network accessible. This parameter is valid when the Type value is Url.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 7M; 2. Image format value: jpeg, jpg, png, webp.</p> 
     * @return Type <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 7M; 2. Image format value: jpeg, jpg, png, webp.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 7M; 2. Image format value: jpeg, jpg, png, webp.</p>
     * @param Type <p>Accessible file URL. This parameter is valid when Type value is Url. Description: 1. Recommended image less than 7M; 2. Image format value: jpeg, jpg, png, webp.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>The media file ID of the audio file, which is the globally unique identifier of this file on VOD, is assigned by the VOD backend after a successful upload. You can retrieve this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.</p> 
     * @return FileId <p>The media file ID of the audio file, which is the globally unique identifier of this file on VOD, is assigned by the VOD backend after a successful upload. You can retrieve this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>The media file ID of the audio file, which is the globally unique identifier of this file on VOD, is assigned by the VOD backend after a successful upload. You can retrieve this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.</p>
     * @param FileId <p>The media file ID of the audio file, which is the globally unique identifier of this file on VOD, is assigned by the VOD backend after a successful upload. You can retrieve this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Audio file URL, which must be external network accessible. This parameter is valid when the Type value is Url.</p> 
     * @return Url <p>Audio file URL, which must be external network accessible. This parameter is valid when the Type value is Url.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Audio file URL, which must be external network accessible. This parameter is valid when the Type value is Url.</p>
     * @param Url <p>Audio file URL, which must be external network accessible. This parameter is valid when the Type value is Url.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AigcAudioReferenceAudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioReferenceAudioInfo(AigcAudioReferenceAudioInfo source) {
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

