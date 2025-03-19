/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageAnimateJobRequest extends AbstractModel {

    /**
    * Image format: PNG, JPG, and JPEG formats are supported.
Image resolution: The long edge resolution should not exceed 2056.
Image size: The size should not exceed 10 MB.
Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Image information after Base64 encoding. Image format: PNG, JPG, and JPEG formats are supported. Image resolution: The long side resolution should not exceed 2056. Image size: The size should not exceed 10 MB. Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Action template ID. ke3: kemusan; tuziwu: rabbit dance; huajiangwu: paddling dance.

    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Whether the generated video retains the audio in the template. The default value is true.
    */
    @SerializedName("EnableAudio")
    @Expose
    private Boolean EnableAudio;

    /**
    * Whether to detect 12 body parts in the input image (head, neck, right shoulder, right elbow, right wrist, left shoulder, left elbow, left wrist, right hip, left hip, left knee, and right knee). They are not detected by default.
    */
    @SerializedName("EnableBodyJoins")
    @Expose
    private Boolean EnableBodyJoins;

    /**
    * Whether the final video retains the background of the original image. (This parameter does not take effect when TemplateId is set to tuziwu or huajiangwu.)

    */
    @SerializedName("EnableSegment")
    @Expose
    private Boolean EnableSegment;

    /**
    * Whether to add a mark to the generated video. The default value is 0.
1: A mark is added.
0: No mark is added.
Other values: A mark is added by default.
It is recommended to use an obvious mark to indicate that the video is synthesized by AI.
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * Mark text settings.
By default, the text "Synthesized by AI" is added to the bottom right corner of the generated video. You can also use other text images.
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
     * Get Image format: PNG, JPG, and JPEG formats are supported.
Image resolution: The long edge resolution should not exceed 2056.
Image size: The size should not exceed 10 MB.
Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2. 
     * @return ImageUrl Image format: PNG, JPG, and JPEG formats are supported.
Image resolution: The long edge resolution should not exceed 2056.
Image size: The size should not exceed 10 MB.
Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Image format: PNG, JPG, and JPEG formats are supported.
Image resolution: The long edge resolution should not exceed 2056.
Image size: The size should not exceed 10 MB.
Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     * @param ImageUrl Image format: PNG, JPG, and JPEG formats are supported.
Image resolution: The long edge resolution should not exceed 2056.
Image size: The size should not exceed 10 MB.
Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Image information after Base64 encoding. Image format: PNG, JPG, and JPEG formats are supported. Image resolution: The long side resolution should not exceed 2056. Image size: The size should not exceed 10 MB. Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2. 
     * @return ImageBase64 Image information after Base64 encoding. Image format: PNG, JPG, and JPEG formats are supported. Image resolution: The long side resolution should not exceed 2056. Image size: The size should not exceed 10 MB. Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Image information after Base64 encoding. Image format: PNG, JPG, and JPEG formats are supported. Image resolution: The long side resolution should not exceed 2056. Image size: The size should not exceed 10 MB. Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     * @param ImageBase64 Image information after Base64 encoding. Image format: PNG, JPG, and JPEG formats are supported. Image resolution: The long side resolution should not exceed 2056. Image size: The size should not exceed 10 MB. Image aspect ratio: The ratio of width to height should be in the range of 1:2 to 1:1.2.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Action template ID. ke3: kemusan; tuziwu: rabbit dance; huajiangwu: paddling dance.
 
     * @return TemplateId Action template ID. ke3: kemusan; tuziwu: rabbit dance; huajiangwu: paddling dance.

     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Action template ID. ke3: kemusan; tuziwu: rabbit dance; huajiangwu: paddling dance.

     * @param TemplateId Action template ID. ke3: kemusan; tuziwu: rabbit dance; huajiangwu: paddling dance.

     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether the generated video retains the audio in the template. The default value is true. 
     * @return EnableAudio Whether the generated video retains the audio in the template. The default value is true.
     */
    public Boolean getEnableAudio() {
        return this.EnableAudio;
    }

    /**
     * Set Whether the generated video retains the audio in the template. The default value is true.
     * @param EnableAudio Whether the generated video retains the audio in the template. The default value is true.
     */
    public void setEnableAudio(Boolean EnableAudio) {
        this.EnableAudio = EnableAudio;
    }

    /**
     * Get Whether to detect 12 body parts in the input image (head, neck, right shoulder, right elbow, right wrist, left shoulder, left elbow, left wrist, right hip, left hip, left knee, and right knee). They are not detected by default. 
     * @return EnableBodyJoins Whether to detect 12 body parts in the input image (head, neck, right shoulder, right elbow, right wrist, left shoulder, left elbow, left wrist, right hip, left hip, left knee, and right knee). They are not detected by default.
     */
    public Boolean getEnableBodyJoins() {
        return this.EnableBodyJoins;
    }

    /**
     * Set Whether to detect 12 body parts in the input image (head, neck, right shoulder, right elbow, right wrist, left shoulder, left elbow, left wrist, right hip, left hip, left knee, and right knee). They are not detected by default.
     * @param EnableBodyJoins Whether to detect 12 body parts in the input image (head, neck, right shoulder, right elbow, right wrist, left shoulder, left elbow, left wrist, right hip, left hip, left knee, and right knee). They are not detected by default.
     */
    public void setEnableBodyJoins(Boolean EnableBodyJoins) {
        this.EnableBodyJoins = EnableBodyJoins;
    }

    /**
     * Get Whether the final video retains the background of the original image. (This parameter does not take effect when TemplateId is set to tuziwu or huajiangwu.)
 
     * @return EnableSegment Whether the final video retains the background of the original image. (This parameter does not take effect when TemplateId is set to tuziwu or huajiangwu.)

     */
    public Boolean getEnableSegment() {
        return this.EnableSegment;
    }

    /**
     * Set Whether the final video retains the background of the original image. (This parameter does not take effect when TemplateId is set to tuziwu or huajiangwu.)

     * @param EnableSegment Whether the final video retains the background of the original image. (This parameter does not take effect when TemplateId is set to tuziwu or huajiangwu.)

     */
    public void setEnableSegment(Boolean EnableSegment) {
        this.EnableSegment = EnableSegment;
    }

    /**
     * Get Whether to add a mark to the generated video. The default value is 0.
1: A mark is added.
0: No mark is added.
Other values: A mark is added by default.
It is recommended to use an obvious mark to indicate that the video is synthesized by AI. 
     * @return LogoAdd Whether to add a mark to the generated video. The default value is 0.
1: A mark is added.
0: No mark is added.
Other values: A mark is added by default.
It is recommended to use an obvious mark to indicate that the video is synthesized by AI.
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set Whether to add a mark to the generated video. The default value is 0.
1: A mark is added.
0: No mark is added.
Other values: A mark is added by default.
It is recommended to use an obvious mark to indicate that the video is synthesized by AI.
     * @param LogoAdd Whether to add a mark to the generated video. The default value is 0.
1: A mark is added.
0: No mark is added.
Other values: A mark is added by default.
It is recommended to use an obvious mark to indicate that the video is synthesized by AI.
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get Mark text settings.
By default, the text "Synthesized by AI" is added to the bottom right corner of the generated video. You can also use other text images. 
     * @return LogoParam Mark text settings.
By default, the text "Synthesized by AI" is added to the bottom right corner of the generated video. You can also use other text images.
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set Mark text settings.
By default, the text "Synthesized by AI" is added to the bottom right corner of the generated video. You can also use other text images.
     * @param LogoParam Mark text settings.
By default, the text "Synthesized by AI" is added to the bottom right corner of the generated video. You can also use other text images.
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    public SubmitImageAnimateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageAnimateJobRequest(SubmitImageAnimateJobRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.EnableAudio != null) {
            this.EnableAudio = new Boolean(source.EnableAudio);
        }
        if (source.EnableBodyJoins != null) {
            this.EnableBodyJoins = new Boolean(source.EnableBodyJoins);
        }
        if (source.EnableSegment != null) {
            this.EnableSegment = new Boolean(source.EnableSegment);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "EnableAudio", this.EnableAudio);
        this.setParamSimple(map, prefix + "EnableBodyJoins", this.EnableBodyJoins);
        this.setParamSimple(map, prefix + "EnableSegment", this.EnableSegment);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);

    }
}

