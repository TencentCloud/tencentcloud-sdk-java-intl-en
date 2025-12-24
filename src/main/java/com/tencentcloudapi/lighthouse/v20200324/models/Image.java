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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel {

    /**
    * CVM Image ID, which is the unique identifier of the image.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image description.
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Image size, in GB.
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Image source.
<li>CREATE_IMAGE: custom image.</li>
<li>EXTERNAL_IMPORT: externally imported image.</li>
    */
    @SerializedName("ImageSource")
    @Expose
    private String ImageSource;

    /**
    * Image classification.
<li>SystemImage: system disk image.</li>
<li>InstanceImage: full-instance image.</li>
    */
    @SerializedName("ImageClass")
    @Expose
    private String ImageClass;

    /**
    * Image status.
CREATING: creating.
NORMAL: normal.
CREATEFAILED: creation failed.
USING: in use.
SYNCING: synchronizing.
IMPORTING: importing.
IMPORTFAILED: import failed.
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * Whether the image supports Cloudinit.
    */
    @SerializedName("IsSupportCloudinit")
    @Expose
    private Boolean IsSupportCloudinit;

    /**
    * Image architecture.
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Image operating system.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Image source platform.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Image creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Whether the image can be shared to Lighthouse.
    */
    @SerializedName("IsShareable")
    @Expose
    private Boolean IsShareable;

    /**
    * Reason for not being shared.
    */
    @SerializedName("UnshareableReason")
    @Expose
    private String UnshareableReason;

    /**
     * Get CVM Image ID, which is the unique identifier of the image. 
     * @return ImageId CVM Image ID, which is the unique identifier of the image.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set CVM Image ID, which is the unique identifier of the image.
     * @param ImageId CVM Image ID, which is the unique identifier of the image.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name. 
     * @return ImageName Image name.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name.
     * @param ImageName Image name.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image description. 
     * @return ImageDescription Image description.
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description.
     * @param ImageDescription Image description.
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get Image size, in GB. 
     * @return ImageSize Image size, in GB.
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size, in GB.
     * @param ImageSize Image size, in GB.
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Image source.
<li>CREATE_IMAGE: custom image.</li>
<li>EXTERNAL_IMPORT: externally imported image.</li> 
     * @return ImageSource Image source.
<li>CREATE_IMAGE: custom image.</li>
<li>EXTERNAL_IMPORT: externally imported image.</li>
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set Image source.
<li>CREATE_IMAGE: custom image.</li>
<li>EXTERNAL_IMPORT: externally imported image.</li>
     * @param ImageSource Image source.
<li>CREATE_IMAGE: custom image.</li>
<li>EXTERNAL_IMPORT: externally imported image.</li>
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get Image classification.
<li>SystemImage: system disk image.</li>
<li>InstanceImage: full-instance image.</li> 
     * @return ImageClass Image classification.
<li>SystemImage: system disk image.</li>
<li>InstanceImage: full-instance image.</li>
     */
    public String getImageClass() {
        return this.ImageClass;
    }

    /**
     * Set Image classification.
<li>SystemImage: system disk image.</li>
<li>InstanceImage: full-instance image.</li>
     * @param ImageClass Image classification.
<li>SystemImage: system disk image.</li>
<li>InstanceImage: full-instance image.</li>
     */
    public void setImageClass(String ImageClass) {
        this.ImageClass = ImageClass;
    }

    /**
     * Get Image status.
CREATING: creating.
NORMAL: normal.
CREATEFAILED: creation failed.
USING: in use.
SYNCING: synchronizing.
IMPORTING: importing.
IMPORTFAILED: import failed. 
     * @return ImageState Image status.
CREATING: creating.
NORMAL: normal.
CREATEFAILED: creation failed.
USING: in use.
SYNCING: synchronizing.
IMPORTING: importing.
IMPORTFAILED: import failed.
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set Image status.
CREATING: creating.
NORMAL: normal.
CREATEFAILED: creation failed.
USING: in use.
SYNCING: synchronizing.
IMPORTING: importing.
IMPORTFAILED: import failed.
     * @param ImageState Image status.
CREATING: creating.
NORMAL: normal.
CREATEFAILED: creation failed.
USING: in use.
SYNCING: synchronizing.
IMPORTING: importing.
IMPORTFAILED: import failed.
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get Whether the image supports Cloudinit. 
     * @return IsSupportCloudinit Whether the image supports Cloudinit.
     */
    public Boolean getIsSupportCloudinit() {
        return this.IsSupportCloudinit;
    }

    /**
     * Set Whether the image supports Cloudinit.
     * @param IsSupportCloudinit Whether the image supports Cloudinit.
     */
    public void setIsSupportCloudinit(Boolean IsSupportCloudinit) {
        this.IsSupportCloudinit = IsSupportCloudinit;
    }

    /**
     * Get Image architecture. 
     * @return Architecture Image architecture.
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Image architecture.
     * @param Architecture Image architecture.
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get Image operating system. 
     * @return OsName Image operating system.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Image operating system.
     * @param OsName Image operating system.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Image source platform. 
     * @return Platform Image source platform.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Image source platform.
     * @param Platform Image source platform.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Image creation time. 
     * @return CreatedTime Image creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Image creation time.
     * @param CreatedTime Image creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Whether the image can be shared to Lighthouse. 
     * @return IsShareable Whether the image can be shared to Lighthouse.
     */
    public Boolean getIsShareable() {
        return this.IsShareable;
    }

    /**
     * Set Whether the image can be shared to Lighthouse.
     * @param IsShareable Whether the image can be shared to Lighthouse.
     */
    public void setIsShareable(Boolean IsShareable) {
        this.IsShareable = IsShareable;
    }

    /**
     * Get Reason for not being shared. 
     * @return UnshareableReason Reason for not being shared.
     */
    public String getUnshareableReason() {
        return this.UnshareableReason;
    }

    /**
     * Set Reason for not being shared.
     * @param UnshareableReason Reason for not being shared.
     */
    public void setUnshareableReason(String UnshareableReason) {
        this.UnshareableReason = UnshareableReason;
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
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ImageSource != null) {
            this.ImageSource = new String(source.ImageSource);
        }
        if (source.ImageClass != null) {
            this.ImageClass = new String(source.ImageClass);
        }
        if (source.ImageState != null) {
            this.ImageState = new String(source.ImageState);
        }
        if (source.IsSupportCloudinit != null) {
            this.IsSupportCloudinit = new Boolean(source.IsSupportCloudinit);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IsShareable != null) {
            this.IsShareable = new Boolean(source.IsShareable);
        }
        if (source.UnshareableReason != null) {
            this.UnshareableReason = new String(source.UnshareableReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageSource", this.ImageSource);
        this.setParamSimple(map, prefix + "ImageClass", this.ImageClass);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "IsSupportCloudinit", this.IsSupportCloudinit);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsShareable", this.IsShareable);
        this.setParamSimple(map, prefix + "UnshareableReason", this.UnshareableReason);

    }
}

