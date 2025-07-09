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

public class AssetSimpleImageInfo extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Number of associated containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Last scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Image size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
     * Get Number of associated containers 
     * @return ContainerCnt Number of associated containers
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of associated containers
     * @param ContainerCnt Number of associated containers
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Last scan time 
     * @return ScanTime Last scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Last scan time
     * @param ScanTime Last scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Image size 
     * @return Size Image size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Image size
     * @param Size Image size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public AssetSimpleImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSimpleImageInfo(AssetSimpleImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

