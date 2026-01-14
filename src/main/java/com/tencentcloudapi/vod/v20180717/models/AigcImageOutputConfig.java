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

public class AigcImageOutputConfig extends AbstractModel {

    /**
    * Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand), and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod, and the Temporary access URL can be obtained in the event notification.</li>.
Default value: Temporary.
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Output filename, up to 64 characters. default filename is assigned by the system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Image generation resolution. available values are 720P, 1080P, 2K, 4K, 1024x1024, 2048x2048, 2304x1728, 2496x1664, 2560x1440, 3024x1296, 4096x4096, 4694x3520, 4992x3328, 5404x3040, 6198x2656.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Specify the aspect ratio of the generated image. <li>when ModelName is GEM, the available values are 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.</li> <li>when ModelName is Qwen, it is not currently supported.</li>.
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>.
    */
    @SerializedName("PersonGeneration")
    @Expose
    private String PersonGeneration;

    /**
    * Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
    */
    @SerializedName("InputComplianceCheck")
    @Expose
    private String InputComplianceCheck;

    /**
    * Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
    */
    @SerializedName("OutputComplianceCheck")
    @Expose
    private String OutputComplianceCheck;

    /**
     * Get Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand), and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod, and the Temporary access URL can be obtained in the event notification.</li>.
Default value: Temporary. 
     * @return StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand), and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod, and the Temporary access URL can be obtained in the event notification.</li>.
Default value: Temporary.
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand), and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod, and the Temporary access URL can be obtained in the event notification.</li>.
Default value: Temporary.
     * @param StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand), and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod, and the Temporary access URL can be obtained in the event notification.</li>.
Default value: Temporary.
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Output filename, up to 64 characters. default filename is assigned by the system. 
     * @return MediaName Output filename, up to 64 characters. default filename is assigned by the system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. default filename is assigned by the system.
     * @param MediaName Output filename, up to 64 characters. default filename is assigned by the system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>. 
     * @return ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     * @param ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Image generation resolution. available values are 720P, 1080P, 2K, 4K, 1024x1024, 2048x2048, 2304x1728, 2496x1664, 2560x1440, 3024x1296, 4096x4096, 4694x3520, 4992x3328, 5404x3040, 6198x2656. 
     * @return Resolution Image generation resolution. available values are 720P, 1080P, 2K, 4K, 1024x1024, 2048x2048, 2304x1728, 2496x1664, 2560x1440, 3024x1296, 4096x4096, 4694x3520, 4992x3328, 5404x3040, 6198x2656.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Image generation resolution. available values are 720P, 1080P, 2K, 4K, 1024x1024, 2048x2048, 2304x1728, 2496x1664, 2560x1440, 3024x1296, 4096x4096, 4694x3520, 4992x3328, 5404x3040, 6198x2656.
     * @param Resolution Image generation resolution. available values are 720P, 1080P, 2K, 4K, 1024x1024, 2048x2048, 2304x1728, 2496x1664, 2560x1440, 3024x1296, 4096x4096, 4694x3520, 4992x3328, 5404x3040, 6198x2656.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Specify the aspect ratio of the generated image. <li>when ModelName is GEM, the available values are 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.</li> <li>when ModelName is Qwen, it is not currently supported.</li>. 
     * @return AspectRatio Specify the aspect ratio of the generated image. <li>when ModelName is GEM, the available values are 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.</li> <li>when ModelName is Qwen, it is not currently supported.</li>.
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set Specify the aspect ratio of the generated image. <li>when ModelName is GEM, the available values are 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.</li> <li>when ModelName is Qwen, it is not currently supported.</li>.
     * @param AspectRatio Specify the aspect ratio of the generated image. <li>when ModelName is GEM, the available values are 1:1, 3:2, 2:3, 3:4, 4:3, 4:5, 5:4, 9:16, 16:9, and 21:9.</li> <li>when ModelName is Qwen, it is not currently supported.</li>.
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>. 
     * @return PersonGeneration Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>.
     */
    public String getPersonGeneration() {
        return this.PersonGeneration;
    }

    /**
     * Set Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>.
     * @param PersonGeneration Whether to allow figure or human face generation. valid values: <li>AllowAdult: allow adult generation.</li> <li>Disallowed: forbid including figures or human faces in images.</li>.
     */
    public void setPersonGeneration(String PersonGeneration) {
        this.PersonGeneration = PersonGeneration;
    }

    /**
     * Get Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>. 
     * @return InputComplianceCheck Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public String getInputComplianceCheck() {
        return this.InputComplianceCheck;
    }

    /**
     * Set Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     * @param InputComplianceCheck Whether to enable compliance check for input content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public void setInputComplianceCheck(String InputComplianceCheck) {
        this.InputComplianceCheck = InputComplianceCheck;
    }

    /**
     * Get Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>. 
     * @return OutputComplianceCheck Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public String getOutputComplianceCheck() {
        return this.OutputComplianceCheck;
    }

    /**
     * Set Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     * @param OutputComplianceCheck Whether to enable compliance check for output content. valid values: <li>Enabled: enable;</li> <li>Disabled: disable;</li>.
     */
    public void setOutputComplianceCheck(String OutputComplianceCheck) {
        this.OutputComplianceCheck = OutputComplianceCheck;
    }

    public AigcImageOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageOutputConfig(AigcImageOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.PersonGeneration != null) {
            this.PersonGeneration = new String(source.PersonGeneration);
        }
        if (source.InputComplianceCheck != null) {
            this.InputComplianceCheck = new String(source.InputComplianceCheck);
        }
        if (source.OutputComplianceCheck != null) {
            this.OutputComplianceCheck = new String(source.OutputComplianceCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "PersonGeneration", this.PersonGeneration);
        this.setParamSimple(map, prefix + "InputComplianceCheck", this.InputComplianceCheck);
        this.setParamSimple(map, prefix + "OutputComplianceCheck", this.OutputComplianceCheck);

    }
}

