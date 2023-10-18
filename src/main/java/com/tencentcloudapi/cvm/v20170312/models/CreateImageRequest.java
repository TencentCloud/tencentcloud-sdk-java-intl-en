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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel {

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * ID of the instance from which an image will be created. This parameter is required when using instance to create an image.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Image description
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Whether to force shut down an instance to create an image when a soft shutdown fails
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * Whether to enable Sysprep when creating a Windows image.
Valid values: `TRUE` and `FALSE`; default value: `FALSE`.

Click [here](https://intl.cloud.tencent.com/document/product/213/43498?from_cn_redirect=1) to learn more about Sysprep.
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * IDs of data disks included in the image. 
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
    * Specified snapshot ID used to create an image. A system disk snapshot must be included. It cannot be passed together with `InstanceId`.
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Success status of this request, without affecting the resources involved
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Tag description list. This parameter is used to bind a tag to a custom image.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

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
     * Get ID of the instance from which an image will be created. This parameter is required when using instance to create an image. 
     * @return InstanceId ID of the instance from which an image will be created. This parameter is required when using instance to create an image.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance from which an image will be created. This parameter is required when using instance to create an image.
     * @param InstanceId ID of the instance from which an image will be created. This parameter is required when using instance to create an image.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Whether to force shut down an instance to create an image when a soft shutdown fails 
     * @return ForcePoweroff Whether to force shut down an instance to create an image when a soft shutdown fails
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set Whether to force shut down an instance to create an image when a soft shutdown fails
     * @param ForcePoweroff Whether to force shut down an instance to create an image when a soft shutdown fails
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * Get Whether to enable Sysprep when creating a Windows image.
Valid values: `TRUE` and `FALSE`; default value: `FALSE`.

Click [here](https://intl.cloud.tencent.com/document/product/213/43498?from_cn_redirect=1) to learn more about Sysprep. 
     * @return Sysprep Whether to enable Sysprep when creating a Windows image.
Valid values: `TRUE` and `FALSE`; default value: `FALSE`.

Click [here](https://intl.cloud.tencent.com/document/product/213/43498?from_cn_redirect=1) to learn more about Sysprep.
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * Set Whether to enable Sysprep when creating a Windows image.
Valid values: `TRUE` and `FALSE`; default value: `FALSE`.

Click [here](https://intl.cloud.tencent.com/document/product/213/43498?from_cn_redirect=1) to learn more about Sysprep.
     * @param Sysprep Whether to enable Sysprep when creating a Windows image.
Valid values: `TRUE` and `FALSE`; default value: `FALSE`.

Click [here](https://intl.cloud.tencent.com/document/product/213/43498?from_cn_redirect=1) to learn more about Sysprep.
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * Get IDs of data disks included in the image.  
     * @return DataDiskIds IDs of data disks included in the image. 
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set IDs of data disks included in the image. 
     * @param DataDiskIds IDs of data disks included in the image. 
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    /**
     * Get Specified snapshot ID used to create an image. A system disk snapshot must be included. It cannot be passed together with `InstanceId`. 
     * @return SnapshotIds Specified snapshot ID used to create an image. A system disk snapshot must be included. It cannot be passed together with `InstanceId`.
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set Specified snapshot ID used to create an image. A system disk snapshot must be included. It cannot be passed together with `InstanceId`.
     * @param SnapshotIds Specified snapshot ID used to create an image. A system disk snapshot must be included. It cannot be passed together with `InstanceId`.
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Success status of this request, without affecting the resources involved 
     * @return DryRun Success status of this request, without affecting the resources involved
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Success status of this request, without affecting the resources involved
     * @param DryRun Success status of this request, without affecting the resources involved
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Tag description list. This parameter is used to bind a tag to a custom image. 
     * @return TagSpecification Tag description list. This parameter is used to bind a tag to a custom image.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Tag description list. This parameter is used to bind a tag to a custom image.
     * @param TagSpecification Tag description list. This parameter is used to bind a tag to a custom image.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ForcePoweroff != null) {
            this.ForcePoweroff = new String(source.ForcePoweroff);
        }
        if (source.Sysprep != null) {
            this.Sysprep = new String(source.Sysprep);
        }
        if (source.DataDiskIds != null) {
            this.DataDiskIds = new String[source.DataDiskIds.length];
            for (int i = 0; i < source.DataDiskIds.length; i++) {
                this.DataDiskIds[i] = new String(source.DataDiskIds[i]);
            }
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);
        this.setParamSimple(map, prefix + "Sysprep", this.Sysprep);
        this.setParamArraySimple(map, prefix + "DataDiskIds.", this.DataDiskIds);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

