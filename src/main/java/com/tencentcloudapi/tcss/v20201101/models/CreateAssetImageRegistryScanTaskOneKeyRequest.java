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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetImageRegistryScanTaskOneKeyRequest extends AbstractModel {

    /**
    * Whether to scan all images
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of scanned images
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * Array of scan types
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * List of IDs of scanned images
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
     * Get Whether to scan all images 
     * @return All Whether to scan all images
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to scan all images
     * @param All Whether to scan all images
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of scanned images 
     * @return Images List of scanned images
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set List of scanned images
     * @param Images List of scanned images
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get Array of scan types 
     * @return ScanType Array of scan types
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set Array of scan types
     * @param ScanType Array of scan types
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get List of IDs of scanned images 
     * @return Id List of IDs of scanned images
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set List of IDs of scanned images
     * @param Id List of IDs of scanned images
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    public CreateAssetImageRegistryScanTaskOneKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageRegistryScanTaskOneKeyRequest(CreateAssetImageRegistryScanTaskOneKeyRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);

    }
}

