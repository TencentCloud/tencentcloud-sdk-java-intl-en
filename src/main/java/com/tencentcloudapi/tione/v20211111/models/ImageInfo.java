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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * Image type. Valid values: TCR ( which indicates a Tencent Container Registry (TCR) image), CCR (which indicates a TCR Personal Edition image), PreSet (which indicates a platform preset image), and CUSTOM (which indicates a third-party custom image).
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * Image address.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Region corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * Instance ID corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Whether to allow exporting all content.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowSaveAllContent")
    @Expose
    private Boolean AllowSaveAllContent;

    /**
    * Image name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Whether to support data generation.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportDataPipeline")
    @Expose
    private Boolean SupportDataPipeline;

    /**
     * Get Image type. Valid values: TCR ( which indicates a Tencent Container Registry (TCR) image), CCR (which indicates a TCR Personal Edition image), PreSet (which indicates a platform preset image), and CUSTOM (which indicates a third-party custom image). 
     * @return ImageType Image type. Valid values: TCR ( which indicates a Tencent Container Registry (TCR) image), CCR (which indicates a TCR Personal Edition image), PreSet (which indicates a platform preset image), and CUSTOM (which indicates a third-party custom image).
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type. Valid values: TCR ( which indicates a Tencent Container Registry (TCR) image), CCR (which indicates a TCR Personal Edition image), PreSet (which indicates a platform preset image), and CUSTOM (which indicates a third-party custom image).
     * @param ImageType Image type. Valid values: TCR ( which indicates a Tencent Container Registry (TCR) image), CCR (which indicates a TCR Personal Edition image), PreSet (which indicates a platform preset image), and CUSTOM (which indicates a third-party custom image).
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get Image address. 
     * @return ImageUrl Image address.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Image address.
     * @param ImageUrl Image address.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Region corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryRegion Region corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Region corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryRegion Region corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get Instance ID corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryId Instance ID corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryId Instance ID corresponding to the TCR image.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Whether to allow exporting all content.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowSaveAllContent Whether to allow exporting all content.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAllowSaveAllContent() {
        return this.AllowSaveAllContent;
    }

    /**
     * Set Whether to allow exporting all content.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowSaveAllContent Whether to allow exporting all content.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowSaveAllContent(Boolean AllowSaveAllContent) {
        this.AllowSaveAllContent = AllowSaveAllContent;
    }

    /**
     * Get Image name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageName Image name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageName Image name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Whether to support data generation.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportDataPipeline Whether to support data generation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportDataPipeline() {
        return this.SupportDataPipeline;
    }

    /**
     * Set Whether to support data generation.Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportDataPipeline Whether to support data generation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportDataPipeline(Boolean SupportDataPipeline) {
        this.SupportDataPipeline = SupportDataPipeline;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.AllowSaveAllContent != null) {
            this.AllowSaveAllContent = new Boolean(source.AllowSaveAllContent);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.SupportDataPipeline != null) {
            this.SupportDataPipeline = new Boolean(source.SupportDataPipeline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "AllowSaveAllContent", this.AllowSaveAllContent);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "SupportDataPipeline", this.SupportDataPipeline);

    }
}

