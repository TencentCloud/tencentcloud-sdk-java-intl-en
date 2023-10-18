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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image status
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * Image type
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * OS name
    */
    @SerializedName("ImageOsName")
    @Expose
    private String ImageOsName;

    /**
    * Image description
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Image import time
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * Number of bits of the OS
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * OS type
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * OS version
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * OS platform
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Image owner
    */
    @SerializedName("ImageOwner")
    @Expose
    private Long ImageOwner;

    /**
    * Image size in GB
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Image source information
    */
    @SerializedName("SrcImage")
    @Expose
    private SrcImage SrcImage;

    /**
    * Image source type
    */
    @SerializedName("ImageSource")
    @Expose
    private String ImageSource;

    /**
    * ID of the task in intermediate or failed status
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Whether cloud-init is supported
    */
    @SerializedName("IsSupportCloudInit")
    @Expose
    private Boolean IsSupportCloudInit;

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image status 
     * @return ImageState Image status
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set Image status
     * @param ImageState Image status
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get Image type 
     * @return ImageType Image type
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type
     * @param ImageType Image type
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get OS name 
     * @return ImageOsName OS name
     */
    public String getImageOsName() {
        return this.ImageOsName;
    }

    /**
     * Set OS name
     * @param ImageOsName OS name
     */
    public void setImageOsName(String ImageOsName) {
        this.ImageOsName = ImageOsName;
    }

    /**
     * Get Image description 
     * @return ImageDescription Image description
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description
     * @param ImageDescription Image description
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get Image import time 
     * @return ImageCreateTime Image import time
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set Image import time
     * @param ImageCreateTime Image import time
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get Number of bits of the OS 
     * @return Architecture Number of bits of the OS
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Number of bits of the OS
     * @param Architecture Number of bits of the OS
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get OS type 
     * @return OsType OS type
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set OS type
     * @param OsType OS type
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get OS version 
     * @return OsVersion OS version
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set OS version
     * @param OsVersion OS version
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get OS platform 
     * @return Platform OS platform
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set OS platform
     * @param Platform OS platform
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Image owner 
     * @return ImageOwner Image owner
     */
    public Long getImageOwner() {
        return this.ImageOwner;
    }

    /**
     * Set Image owner
     * @param ImageOwner Image owner
     */
    public void setImageOwner(Long ImageOwner) {
        this.ImageOwner = ImageOwner;
    }

    /**
     * Get Image size in GB 
     * @return ImageSize Image size in GB
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size in GB
     * @param ImageSize Image size in GB
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Image source information 
     * @return SrcImage Image source information
     */
    public SrcImage getSrcImage() {
        return this.SrcImage;
    }

    /**
     * Set Image source information
     * @param SrcImage Image source information
     */
    public void setSrcImage(SrcImage SrcImage) {
        this.SrcImage = SrcImage;
    }

    /**
     * Get Image source type 
     * @return ImageSource Image source type
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set Image source type
     * @param ImageSource Image source type
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get ID of the task in intermediate or failed status 
     * @return TaskId ID of the task in intermediate or failed status
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the task in intermediate or failed status
     * @param TaskId ID of the task in intermediate or failed status
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Whether cloud-init is supported 
     * @return IsSupportCloudInit Whether cloud-init is supported
     */
    public Boolean getIsSupportCloudInit() {
        return this.IsSupportCloudInit;
    }

    /**
     * Set Whether cloud-init is supported
     * @param IsSupportCloudInit Whether cloud-init is supported
     */
    public void setIsSupportCloudInit(Boolean IsSupportCloudInit) {
        this.IsSupportCloudInit = IsSupportCloudInit;
    }

    public Image() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Image(Image source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageState != null) {
            this.ImageState = new String(source.ImageState);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageOsName != null) {
            this.ImageOsName = new String(source.ImageOsName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.OsVersion != null) {
            this.OsVersion = new String(source.OsVersion);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ImageOwner != null) {
            this.ImageOwner = new Long(source.ImageOwner);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.SrcImage != null) {
            this.SrcImage = new SrcImage(source.SrcImage);
        }
        if (source.ImageSource != null) {
            this.ImageSource = new String(source.ImageSource);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.IsSupportCloudInit != null) {
            this.IsSupportCloudInit = new Boolean(source.IsSupportCloudInit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageOsName", this.ImageOsName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ImageOwner", this.ImageOwner);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamObj(map, prefix + "SrcImage.", this.SrcImage);
        this.setParamSimple(map, prefix + "ImageSource", this.ImageSource);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "IsSupportCloudInit", this.IsSupportCloudInit);

    }
}

