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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel{

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Instance ID used to create an image.
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
    * Whether to enable Sysprep when creating a Windows image
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * Specified data disk ID included in the full image created from the instance.
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
     * Get Instance ID used to create an image. 
     * @return InstanceId Instance ID used to create an image.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID used to create an image.
     * @param InstanceId Instance ID used to create an image.
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
     * Get Whether to enable Sysprep when creating a Windows image 
     * @return Sysprep Whether to enable Sysprep when creating a Windows image
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * Set Whether to enable Sysprep when creating a Windows image
     * @param Sysprep Whether to enable Sysprep when creating a Windows image
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * Get Specified data disk ID included in the full image created from the instance. 
     * @return DataDiskIds Specified data disk ID included in the full image created from the instance.
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set Specified data disk ID included in the full image created from the instance.
     * @param DataDiskIds Specified data disk ID included in the full image created from the instance.
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

    }
}

