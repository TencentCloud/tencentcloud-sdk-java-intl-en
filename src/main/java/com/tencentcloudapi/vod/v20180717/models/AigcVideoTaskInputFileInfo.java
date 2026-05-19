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
    * <p>Input video file type. Valid values: <li>File: On-demand media file;</li> <li>Url: Accessible URL;</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>File category. Value is:</p><ul><li>Image: image. <strong>Note that the Usage field defines the image type.</strong></li><li>Video: video.</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description:</p><ol><li>Images less than 10M are recommended;</li><li>Image format values: jpeg, jpg, png.</li></ol>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Accessible file URL. This parameter is valid when the Type value is URL.<br>Description:</p><ol><li>Images less than 10M are recommended.</li><li>Image format values: jpeg, jpg, png.</li></ol>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Reference Type, applicable to GV, Kling, and PixVerse models.<br>Note:<br>When using the GV model, it can be used as a reference method, available values: asset means material, style means style;<br>When using the Kling model and Category is Video, distinct reference video types can be identified, feature means feature reference video, base means video to be edited;<br>When using the PixVerse model, applicable to multi-image (subject) reference generation mode, available values: subject means subject, background means background;</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>Usage: Vidu subject Id.<br>Vidu subject Id: prompt can be used via @subject Id. Valid at that time when Category is Image.</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>Suitable for the Vidu-q2 model.<br>When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Supported timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>Whether to retain the original sound of the video. Valid when Category is Video. Values are as follows:</p><li>Enabled: Retain</li><li>Disabled: Not retain</li>
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
    * <p>Used to distinguish whether the input image is for <strong>first (last) frame to video</strong>, <strong>image to video</strong>, or <strong>reference to video</strong>. Available values:</p><ul><li>FirstFrame: For first (last) frame to video or image to video;</li><li>Reference: For reference to video;</li></ul><p><strong>Note: FirstFrame is selected by default</strong></p>
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * <p><strong>Only the multi-image (subject) reference mode of the PixVerse model takes effect</strong>. Specify a name for the image to achieve more precise results. Usage: When the field value is "kitten", use @kitten in the Prompt to accurately describe the scenario. There must be a space after @Text, for example, @kitten run. The name referenced in the Prompt must be the same as the field value.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get <p>Input video file type. Valid values: <li>File: On-demand media file;</li> <li>Url: Accessible URL;</li></p> 
     * @return Type <p>Input video file type. Valid values: <li>File: On-demand media file;</li> <li>Url: Accessible URL;</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Input video file type. Valid values: <li>File: On-demand media file;</li> <li>Url: Accessible URL;</li></p>
     * @param Type <p>Input video file type. Valid values: <li>File: On-demand media file;</li> <li>Url: Accessible URL;</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>File category. Value is:</p><ul><li>Image: image. <strong>Note that the Usage field defines the image type.</strong></li><li>Video: video.</li></ul> 
     * @return Category <p>File category. Value is:</p><ul><li>Image: image. <strong>Note that the Usage field defines the image type.</strong></li><li>Video: video.</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>File category. Value is:</p><ul><li>Image: image. <strong>Note that the Usage field defines the image type.</strong></li><li>Video: video.</li></ul>
     * @param Category <p>File category. Value is:</p><ul><li>Image: image. <strong>Note that the Usage field defines the image type.</strong></li><li>Video: video.</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description:</p><ol><li>Images less than 10M are recommended;</li><li>Image format values: jpeg, jpg, png.</li></ol> 
     * @return FileId <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description:</p><ol><li>Images less than 10M are recommended;</li><li>Image format values: jpeg, jpg, png.</li></ol>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description:</p><ol><li>Images less than 10M are recommended;</li><li>Image format values: jpeg, jpg, png.</li></ol>
     * @param FileId <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after successful upload. You can obtain this field in the <a href="/document/product/266/7830">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>. This parameter is valid when the Type value is File. Description:</p><ol><li>Images less than 10M are recommended;</li><li>Image format values: jpeg, jpg, png.</li></ol>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Accessible file URL. This parameter is valid when the Type value is URL.<br>Description:</p><ol><li>Images less than 10M are recommended.</li><li>Image format values: jpeg, jpg, png.</li></ol> 
     * @return Url <p>Accessible file URL. This parameter is valid when the Type value is URL.<br>Description:</p><ol><li>Images less than 10M are recommended.</li><li>Image format values: jpeg, jpg, png.</li></ol>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Accessible file URL. This parameter is valid when the Type value is URL.<br>Description:</p><ol><li>Images less than 10M are recommended.</li><li>Image format values: jpeg, jpg, png.</li></ol>
     * @param Url <p>Accessible file URL. This parameter is valid when the Type value is URL.<br>Description:</p><ol><li>Images less than 10M are recommended.</li><li>Image format values: jpeg, jpg, png.</li></ol>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Reference Type, applicable to GV, Kling, and PixVerse models.<br>Note:<br>When using the GV model, it can be used as a reference method, available values: asset means material, style means style;<br>When using the Kling model and Category is Video, distinct reference video types can be identified, feature means feature reference video, base means video to be edited;<br>When using the PixVerse model, applicable to multi-image (subject) reference generation mode, available values: subject means subject, background means background;</p> 
     * @return ReferenceType <p>Reference Type, applicable to GV, Kling, and PixVerse models.<br>Note:<br>When using the GV model, it can be used as a reference method, available values: asset means material, style means style;<br>When using the Kling model and Category is Video, distinct reference video types can be identified, feature means feature reference video, base means video to be edited;<br>When using the PixVerse model, applicable to multi-image (subject) reference generation mode, available values: subject means subject, background means background;</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>Reference Type, applicable to GV, Kling, and PixVerse models.<br>Note:<br>When using the GV model, it can be used as a reference method, available values: asset means material, style means style;<br>When using the Kling model and Category is Video, distinct reference video types can be identified, feature means feature reference video, base means video to be edited;<br>When using the PixVerse model, applicable to multi-image (subject) reference generation mode, available values: subject means subject, background means background;</p>
     * @param ReferenceType <p>Reference Type, applicable to GV, Kling, and PixVerse models.<br>Note:<br>When using the GV model, it can be used as a reference method, available values: asset means material, style means style;<br>When using the Kling model and Category is Video, distinct reference video types can be identified, feature means feature reference video, base means video to be edited;<br>When using the PixVerse model, applicable to multi-image (subject) reference generation mode, available values: subject means subject, background means background;</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Usage: Vidu subject Id.<br>Vidu subject Id: prompt can be used via @subject Id. Valid at that time when Category is Image.</p> 
     * @return ObjectId <p>Usage: Vidu subject Id.<br>Vidu subject Id: prompt can be used via @subject Id. Valid at that time when Category is Image.</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>Usage: Vidu subject Id.<br>Vidu subject Id: prompt can be used via @subject Id. Valid at that time when Category is Image.</p>
     * @param ObjectId <p>Usage: Vidu subject Id.<br>Vidu subject Id: prompt can be used via @subject Id. Valid at that time when Category is Image.</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>Suitable for the Vidu-q2 model.<br>When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Supported timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p> 
     * @return VoiceId <p>Suitable for the Vidu-q2 model.<br>When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Supported timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>Suitable for the Vidu-q2 model.<br>When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Supported timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     * @param VoiceId <p>Suitable for the Vidu-q2 model.<br>When all images carry the subject Id, you can set the timbre Id targeting the subject. Valid when Category is Image. Supported timbre list: https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>Whether to retain the original sound of the video. Valid when Category is Video. Values are as follows:</p><li>Enabled: Retain</li><li>Disabled: Not retain</li> 
     * @return KeepOriginalSound <p>Whether to retain the original sound of the video. Valid when Category is Video. Values are as follows:</p><li>Enabled: Retain</li><li>Disabled: Not retain</li>
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set <p>Whether to retain the original sound of the video. Valid when Category is Video. Values are as follows:</p><li>Enabled: Retain</li><li>Disabled: Not retain</li>
     * @param KeepOriginalSound <p>Whether to retain the original sound of the video. Valid when Category is Video. Values are as follows:</p><li>Enabled: Retain</li><li>Disabled: Not retain</li>
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    /**
     * Get <p>Used to distinguish whether the input image is for <strong>first (last) frame to video</strong>, <strong>image to video</strong>, or <strong>reference to video</strong>. Available values:</p><ul><li>FirstFrame: For first (last) frame to video or image to video;</li><li>Reference: For reference to video;</li></ul><p><strong>Note: FirstFrame is selected by default</strong></p> 
     * @return Usage <p>Used to distinguish whether the input image is for <strong>first (last) frame to video</strong>, <strong>image to video</strong>, or <strong>reference to video</strong>. Available values:</p><ul><li>FirstFrame: For first (last) frame to video or image to video;</li><li>Reference: For reference to video;</li></ul><p><strong>Note: FirstFrame is selected by default</strong></p>
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Used to distinguish whether the input image is for <strong>first (last) frame to video</strong>, <strong>image to video</strong>, or <strong>reference to video</strong>. Available values:</p><ul><li>FirstFrame: For first (last) frame to video or image to video;</li><li>Reference: For reference to video;</li></ul><p><strong>Note: FirstFrame is selected by default</strong></p>
     * @param Usage <p>Used to distinguish whether the input image is for <strong>first (last) frame to video</strong>, <strong>image to video</strong>, or <strong>reference to video</strong>. Available values:</p><ul><li>FirstFrame: For first (last) frame to video or image to video;</li><li>Reference: For reference to video;</li></ul><p><strong>Note: FirstFrame is selected by default</strong></p>
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get <p><strong>Only the multi-image (subject) reference mode of the PixVerse model takes effect</strong>. Specify a name for the image to achieve more precise results. Usage: When the field value is "kitten", use @kitten in the Prompt to accurately describe the scenario. There must be a space after @Text, for example, @kitten run. The name referenced in the Prompt must be the same as the field value.</p> 
     * @return Text <p><strong>Only the multi-image (subject) reference mode of the PixVerse model takes effect</strong>. Specify a name for the image to achieve more precise results. Usage: When the field value is "kitten", use @kitten in the Prompt to accurately describe the scenario. There must be a space after @Text, for example, @kitten run. The name referenced in the Prompt must be the same as the field value.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p><strong>Only the multi-image (subject) reference mode of the PixVerse model takes effect</strong>. Specify a name for the image to achieve more precise results. Usage: When the field value is "kitten", use @kitten in the Prompt to accurately describe the scenario. There must be a space after @Text, for example, @kitten run. The name referenced in the Prompt must be the same as the field value.</p>
     * @param Text <p><strong>Only the multi-image (subject) reference mode of the PixVerse model takes effect</strong>. Specify a name for the image to achieve more precise results. Usage: When the field value is "kitten", use @kitten in the Prompt to accurately describe the scenario. There must be a space after @Text, for example, @kitten run. The name referenced in the Prompt must be the same as the field value.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
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
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
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
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

