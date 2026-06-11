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

public class AigcImageTaskInputFileInfo extends AbstractModel {

    /**
    * <p>Input file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li> <li>Base64: Base64 string of image or video conversion;</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>The media file ID of the image file, which is the globally unique identifier of this file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.<br>Note:</p><ol><li>Images less than 7M are recommended;</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Accessible file URL. This parameter is valid when the Type value is URL.</p><ol><li>Images less than 7M are recommended.</li><li>Image format values: jpeg, jpg, png, webp.</li></ol>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Accessible file Base64. This parameter is valid when Type value is Base64. Description:</p><ol><li>Total size of all files must not exceed 7 MB to avoid exceeding the 10 MB size limit of the cloud API after converting to Base64;</li><li>Format should be jpeg, jpg, png, or webp;</li><li>Do not include prefixes such as data:image/jpeg;base64,.</li></ol>
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
    * <p>Description of the input image, used to help the model understand the image. Only valid for GEM 2.5 and GEM 3.0.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p><strong>Valid only when ModelName is OG</strong>. Image type.</p><p>Enumeration value:</p><ul><li>mask: Image mask.</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
     * Get <p>Input file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li> <li>Base64: Base64 string of image or video conversion;</li></p> 
     * @return Type <p>Input file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li> <li>Base64: Base64 string of image or video conversion;</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Input file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li> <li>Base64: Base64 string of image or video conversion;</li></p>
     * @param Type <p>Input file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible Url;</li> <li>Base64: Base64 string of image or video conversion;</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>The media file ID of the image file, which is the globally unique identifier of this file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.<br>Note:</p><ol><li>Images less than 7M are recommended;</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol> 
     * @return FileId <p>The media file ID of the image file, which is the globally unique identifier of this file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.<br>Note:</p><ol><li>Images less than 7M are recommended;</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>The media file ID of the image file, which is the globally unique identifier of this file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.<br>Note:</p><ol><li>Images less than 7M are recommended;</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     * @param FileId <p>The media file ID of the image file, which is the globally unique identifier of this file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File.<br>Note:</p><ol><li>Images less than 7M are recommended;</li><li>The image format values are: jpeg, jpg, png, webp.</li></ol>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Accessible file URL. This parameter is valid when the Type value is URL.</p><ol><li>Images less than 7M are recommended.</li><li>Image format values: jpeg, jpg, png, webp.</li></ol> 
     * @return Url <p>Accessible file URL. This parameter is valid when the Type value is URL.</p><ol><li>Images less than 7M are recommended.</li><li>Image format values: jpeg, jpg, png, webp.</li></ol>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Accessible file URL. This parameter is valid when the Type value is URL.</p><ol><li>Images less than 7M are recommended.</li><li>Image format values: jpeg, jpg, png, webp.</li></ol>
     * @param Url <p>Accessible file URL. This parameter is valid when the Type value is URL.</p><ol><li>Images less than 7M are recommended.</li><li>Image format values: jpeg, jpg, png, webp.</li></ol>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Accessible file Base64. This parameter is valid when Type value is Base64. Description:</p><ol><li>Total size of all files must not exceed 7 MB to avoid exceeding the 10 MB size limit of the cloud API after converting to Base64;</li><li>Format should be jpeg, jpg, png, or webp;</li><li>Do not include prefixes such as data:image/jpeg;base64,.</li></ol> 
     * @return Base64 <p>Accessible file Base64. This parameter is valid when Type value is Base64. Description:</p><ol><li>Total size of all files must not exceed 7 MB to avoid exceeding the 10 MB size limit of the cloud API after converting to Base64;</li><li>Format should be jpeg, jpg, png, or webp;</li><li>Do not include prefixes such as data:image/jpeg;base64,.</li></ol>
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set <p>Accessible file Base64. This parameter is valid when Type value is Base64. Description:</p><ol><li>Total size of all files must not exceed 7 MB to avoid exceeding the 10 MB size limit of the cloud API after converting to Base64;</li><li>Format should be jpeg, jpg, png, or webp;</li><li>Do not include prefixes such as data:image/jpeg;base64,.</li></ol>
     * @param Base64 <p>Accessible file Base64. This parameter is valid when Type value is Base64. Description:</p><ol><li>Total size of all files must not exceed 7 MB to avoid exceeding the 10 MB size limit of the cloud API after converting to Base64;</li><li>Format should be jpeg, jpg, png, or webp;</li><li>Do not include prefixes such as data:image/jpeg;base64,.</li></ol>
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    /**
     * Get <p>Description of the input image, used to help the model understand the image. Only valid for GEM 2.5 and GEM 3.0.</p> 
     * @return Text <p>Description of the input image, used to help the model understand the image. Only valid for GEM 2.5 and GEM 3.0.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Description of the input image, used to help the model understand the image. Only valid for GEM 2.5 and GEM 3.0.</p>
     * @param Text <p>Description of the input image, used to help the model understand the image. Only valid for GEM 2.5 and GEM 3.0.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p><strong>Valid only when ModelName is OG</strong>. Image type.</p><p>Enumeration value:</p><ul><li>mask: Image mask.</li></ul> 
     * @return ReferenceType <p><strong>Valid only when ModelName is OG</strong>. Image type.</p><p>Enumeration value:</p><ul><li>mask: Image mask.</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p><strong>Valid only when ModelName is OG</strong>. Image type.</p><p>Enumeration value:</p><ul><li>mask: Image mask.</li></ul>
     * @param ReferenceType <p><strong>Valid only when ModelName is OG</strong>. Image type.</p><p>Enumeration value:</p><ul><li>mask: Image mask.</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    public AigcImageTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageTaskInputFileInfo(AigcImageTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

