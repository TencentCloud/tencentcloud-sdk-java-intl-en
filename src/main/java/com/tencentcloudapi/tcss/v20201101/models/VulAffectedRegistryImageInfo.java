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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedRegistryImageInfo extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image Name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Mirror version
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Image Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Image address.
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * Component List
    */
    @SerializedName("ComponentList")
    @Expose
    private VulAffectedImageComponentInfo [] ComponentList;

    /**
    * Whether the Latest Version of the Image
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * Internal Image Asset ID
    */
    @SerializedName("ImageAssetId")
    @Expose
    private Long ImageAssetId;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image Name 
     * @return ImageName Image Name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image Name
     * @param ImageName Image Name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Mirror version 
     * @return ImageTag Mirror version
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Mirror version
     * @param ImageTag Mirror version
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Image Namespace 
     * @return Namespace Image Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Image Namespace
     * @param Namespace Image Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Image address. 
     * @return ImageRepoAddress Image address.
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set Image address.
     * @param ImageRepoAddress Image address.
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get Component List 
     * @return ComponentList Component List
     */
    public VulAffectedImageComponentInfo [] getComponentList() {
        return this.ComponentList;
    }

    /**
     * Set Component List
     * @param ComponentList Component List
     */
    public void setComponentList(VulAffectedImageComponentInfo [] ComponentList) {
        this.ComponentList = ComponentList;
    }

    /**
     * Get Whether the Latest Version of the Image 
     * @return IsLatestImage Whether the Latest Version of the Image
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set Whether the Latest Version of the Image
     * @param IsLatestImage Whether the Latest Version of the Image
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get Internal Image Asset ID 
     * @return ImageAssetId Internal Image Asset ID
     */
    public Long getImageAssetId() {
        return this.ImageAssetId;
    }

    /**
     * Set Internal Image Asset ID
     * @param ImageAssetId Internal Image Asset ID
     */
    public void setImageAssetId(Long ImageAssetId) {
        this.ImageAssetId = ImageAssetId;
    }

    public VulAffectedRegistryImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedRegistryImageInfo(VulAffectedRegistryImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.ComponentList != null) {
            this.ComponentList = new VulAffectedImageComponentInfo[source.ComponentList.length];
            for (int i = 0; i < source.ComponentList.length; i++) {
                this.ComponentList[i] = new VulAffectedImageComponentInfo(source.ComponentList[i]);
            }
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.ImageAssetId != null) {
            this.ImageAssetId = new Long(source.ImageAssetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamArrayObj(map, prefix + "ComponentList.", this.ComponentList);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "ImageAssetId", this.ImageAssetId);

    }
}

