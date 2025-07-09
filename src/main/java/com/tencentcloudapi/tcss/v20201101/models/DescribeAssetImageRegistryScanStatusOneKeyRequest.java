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

public class DescribeAssetImageRegistryScanStatusOneKeyRequest extends AbstractModel {

    /**
    * List of images for which to get the progress
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * Whether to get all images
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of IDs of images for which to get the progress
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
     * Get List of images for which to get the progress 
     * @return Images List of images for which to get the progress
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set List of images for which to get the progress
     * @param Images List of images for which to get the progress
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get Whether to get all images 
     * @return All Whether to get all images
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to get all images
     * @param All Whether to get all images
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of IDs of images for which to get the progress 
     * @return Id List of IDs of images for which to get the progress
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set List of IDs of images for which to get the progress
     * @param Id List of IDs of images for which to get the progress
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    public DescribeAssetImageRegistryScanStatusOneKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryScanStatusOneKeyRequest(DescribeAssetImageRegistryScanStatusOneKeyRequest source) {
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
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
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);

    }
}

