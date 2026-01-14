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
    * Input video File type. valid values: <li>File: on-demand media File;</li> <li>Url: accessible Url;</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    * Reference type. Used for the GV model.
Note:
When using the GV model, can be used as a reference method, selectable asset (material), style.
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * Object id.
Applicable model: Vidu-q2.
When an image identifier is required, each image must have a subject id. the subject id can be used via @subject id in subsequent generation.
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * Suitable for the Vidu-q2 model.
When all images carry object ids, you can set the timbre id for the object. timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg.
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

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
     * Get Reference type. Used for the GV model.
Note:
When using the GV model, can be used as a reference method, selectable asset (material), style. 
     * @return ReferenceType Reference type. Used for the GV model.
Note:
When using the GV model, can be used as a reference method, selectable asset (material), style.
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set Reference type. Used for the GV model.
Note:
When using the GV model, can be used as a reference method, selectable asset (material), style.
     * @param ReferenceType Reference type. Used for the GV model.
Note:
When using the GV model, can be used as a reference method, selectable asset (material), style.
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get Object id.
Applicable model: Vidu-q2.
When an image identifier is required, each image must have a subject id. the subject id can be used via @subject id in subsequent generation. 
     * @return ObjectId Object id.
Applicable model: Vidu-q2.
When an image identifier is required, each image must have a subject id. the subject id can be used via @subject id in subsequent generation.
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set Object id.
Applicable model: Vidu-q2.
When an image identifier is required, each image must have a subject id. the subject id can be used via @subject id in subsequent generation.
     * @param ObjectId Object id.
Applicable model: Vidu-q2.
When an image identifier is required, each image must have a subject id. the subject id can be used via @subject id in subsequent generation.
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get Suitable for the Vidu-q2 model.
When all images carry object ids, you can set the timbre id for the object. timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg. 
     * @return VoiceId Suitable for the Vidu-q2 model.
When all images carry object ids, you can set the timbre id for the object. timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg.
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set Suitable for the Vidu-q2 model.
When all images carry object ids, you can set the timbre id for the object. timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg.
     * @param VoiceId Suitable for the Vidu-q2 model.
When all images carry object ids, you can set the timbre id for the object. timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg.
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

