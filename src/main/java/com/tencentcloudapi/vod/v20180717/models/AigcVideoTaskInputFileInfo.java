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

public class AigcVideoTaskInputFileInfo extends AbstractModel {

    /**
    * Input video file type. Valid values: <li>File: on-demand media file;</li> <li>Url: accessible URL;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * File category. Valid values:
<li>Image: image.</li>
<li>Video: video.</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * The media File ID, which is the globally unique identifier (guid) of the File in vod, is assigned by the vod backend after successful upload. you can retrieve this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File. description:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Accessible file URL. this parameter is valid when Type value is URL.
Note:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Reference Type. The GV Model applies.
Note:
When using the GV model, this can be used as the reference method. Available values: asset means material, style means style.
When using the Kling model and Category as Video, the reference video type is distinguishable: feature indicates feature reference video, and base indicates video for editing.
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * Subject Id.
Applicable model: Vidu-q2.
When identifying the subject in an Image, each Image must include a subject Id, which can be used via @subject Id in subsequent generation. Valid when Category is Image.
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Suitable for the Vidu-q2 model.
When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * Whether to retain the original sound. Valid when Category is Video. Values as follows:
<li>Enabled: Reserved</li>
<li>Disabled: not retain</li>
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

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
     * Get File category. Valid values:
<li>Image: image.</li>
<li>Video: video.</li> 
     * @return Category File category. Valid values:
<li>Image: image.</li>
<li>Video: video.</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set File category. Valid values:
<li>Image: image.</li>
<li>Video: video.</li>
     * @param Category File category. Valid values:
<li>Image: image.</li>
<li>Video: video.</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get The media File ID, which is the globally unique identifier (guid) of the File in vod, is assigned by the vod backend after successful upload. you can retrieve this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File. description:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png. 
     * @return FileId The media File ID, which is the globally unique identifier (guid) of the File in vod, is assigned by the vod backend after successful upload. you can retrieve this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File. description:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The media File ID, which is the globally unique identifier (guid) of the File in vod, is assigned by the vod backend after successful upload. you can retrieve this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File. description:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     * @param FileId The media File ID, which is the globally unique identifier (guid) of the File in vod, is assigned by the vod backend after successful upload. you can retrieve this field in the [video upload completion event notification](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). this parameter is valid when the Type value is File. description:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Accessible file URL. this parameter is valid when Type value is URL.
Note:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png. 
     * @return Url Accessible file URL. this parameter is valid when Type value is URL.
Note:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Accessible file URL. this parameter is valid when Type value is URL.
Note:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     * @param Url Accessible file URL. this parameter is valid when Type value is URL.
Note:.
1. recommended image size: less than 10 mb.
2. image format value is jpeg, jpg, png.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Reference Type. The GV Model applies.
Note:
When using the GV model, this can be used as the reference method. Available values: asset means material, style means style.
When using the Kling model and Category as Video, the reference video type is distinguishable: feature indicates feature reference video, and base indicates video for editing. 
     * @return ReferenceType Reference Type. The GV Model applies.
Note:
When using the GV model, this can be used as the reference method. Available values: asset means material, style means style.
When using the Kling model and Category as Video, the reference video type is distinguishable: feature indicates feature reference video, and base indicates video for editing.
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set Reference Type. The GV Model applies.
Note:
When using the GV model, this can be used as the reference method. Available values: asset means material, style means style.
When using the Kling model and Category as Video, the reference video type is distinguishable: feature indicates feature reference video, and base indicates video for editing.
     * @param ReferenceType Reference Type. The GV Model applies.
Note:
When using the GV model, this can be used as the reference method. Available values: asset means material, style means style.
When using the Kling model and Category as Video, the reference video type is distinguishable: feature indicates feature reference video, and base indicates video for editing.
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get Subject Id.
Applicable model: Vidu-q2.
When identifying the subject in an Image, each Image must include a subject Id, which can be used via @subject Id in subsequent generation. Valid when Category is Image. 
     * @return ObjectId Subject Id.
Applicable model: Vidu-q2.
When identifying the subject in an Image, each Image must include a subject Id, which can be used via @subject Id in subsequent generation. Valid when Category is Image.
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Subject Id.
Applicable model: Vidu-q2.
When identifying the subject in an Image, each Image must include a subject Id, which can be used via @subject Id in subsequent generation. Valid when Category is Image.
     * @param ObjectId Subject Id.
Applicable model: Vidu-q2.
When identifying the subject in an Image, each Image must include a subject Id, which can be used via @subject Id in subsequent generation. Valid when Category is Image.
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Suitable for the Vidu-q2 model.
When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg 
     * @return VoiceId Suitable for the Vidu-q2 model.
When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set Suitable for the Vidu-q2 model.
When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     * @param VoiceId Suitable for the Vidu-q2 model.
When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get Whether to retain the original sound. Valid when Category is Video. Values as follows:
<li>Enabled: Reserved</li>
<li>Disabled: not retain</li> 
     * @return KeepOriginalSound Whether to retain the original sound. Valid when Category is Video. Values as follows:
<li>Enabled: Reserved</li>
<li>Disabled: not retain</li>
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set Whether to retain the original sound. Valid when Category is Video. Values as follows:
<li>Enabled: Reserved</li>
<li>Disabled: not retain</li>
     * @param KeepOriginalSound Whether to retain the original sound. Valid when Category is Video. Values as follows:
<li>Enabled: Reserved</li>
<li>Disabled: not retain</li>
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    public AigcVideoTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputFileInfo(AigcVideoTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.KeepOriginalSound != null) {
            this.KeepOriginalSound = new String(source.KeepOriginalSound);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "KeepOriginalSound", this.KeepOriginalSound);

    }
}

