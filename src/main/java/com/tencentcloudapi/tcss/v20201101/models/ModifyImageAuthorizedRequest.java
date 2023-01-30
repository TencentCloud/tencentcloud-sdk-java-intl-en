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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAuthorizedRequest extends AbstractModel{

    /**
    * Whether to license all local images, which has a higher priority than licensing by local image ID. When it is `true`, `UpdatedLocalImageCnt` should be greater than `0`.
    */
    @SerializedName("AllLocalImages")
    @Expose
    private Boolean AllLocalImages;

    /**
    * Whether to license all repository images, with a higher priority than licensing by image ID. When it is `true`, `UpdatedRegistryImageCnt` should be greater than `0`.
    */
    @SerializedName("AllRegistryImages")
    @Expose
    private Boolean AllRegistryImages;

    /**
    * Specified number of local images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
    */
    @SerializedName("UpdatedLocalImageCnt")
    @Expose
    private Long UpdatedLocalImageCnt;

    /**
    * Specified number of repository images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
    */
    @SerializedName("UpdatedRegistryImageCnt")
    @Expose
    private Long UpdatedRegistryImageCnt;

    /**
    * Licensing by eligible local images. Valid values of local image source: `ASSETIMAGE` (local image list); `IMAGEALL` (local image sync). This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
    */
    @SerializedName("ImageSourceType")
    @Expose
    private String ImageSourceType;

    /**
    * Licensing by eligible local images. This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
    */
    @SerializedName("LocalImageFilter")
    @Expose
    private AssetFilters [] LocalImageFilter;

    /**
    * Licensing by eligible repository images. This parameter is required when `AllRegistryImages` is `false`, `RegistryImageIds` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
    */
    @SerializedName("RegistryImageFilter")
    @Expose
    private AssetFilters [] RegistryImageFilter;

    /**
    * Licensing by eligible images, excluding specified local image IDs
    */
    @SerializedName("ExcludeLocalImageIds")
    @Expose
    private String [] ExcludeLocalImageIds;

    /**
    * Licensing by eligible images, excluding specified repository image IDs
    */
    @SerializedName("ExcludeRegistryImageIds")
    @Expose
    private String [] ExcludeRegistryImageIds;

    /**
    * Licensing by local image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllLocalImages` is `false`, `LocalImageFilter` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
    */
    @SerializedName("LocalImageIds")
    @Expose
    private String [] LocalImageIds;

    /**
    * Licensing by repository image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllRegistryImages` is `false`, `RegistryImageFilter` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
    */
    @SerializedName("RegistryImageIds")
    @Expose
    private String [] RegistryImageIds;

    /**
    * Whether to only include latest images. This parameter is required for repository images when `RegistryImageFilter` is not empty and `UpdatedRegistryImageCnt` is greater than `0`.
    */
    @SerializedName("OnlyShowLatest")
    @Expose
    private Boolean OnlyShowLatest;

    /**
     * Get Whether to license all local images, which has a higher priority than licensing by local image ID. When it is `true`, `UpdatedLocalImageCnt` should be greater than `0`. 
     * @return AllLocalImages Whether to license all local images, which has a higher priority than licensing by local image ID. When it is `true`, `UpdatedLocalImageCnt` should be greater than `0`.
     */
    public Boolean getAllLocalImages() {
        return this.AllLocalImages;
    }

    /**
     * Set Whether to license all local images, which has a higher priority than licensing by local image ID. When it is `true`, `UpdatedLocalImageCnt` should be greater than `0`.
     * @param AllLocalImages Whether to license all local images, which has a higher priority than licensing by local image ID. When it is `true`, `UpdatedLocalImageCnt` should be greater than `0`.
     */
    public void setAllLocalImages(Boolean AllLocalImages) {
        this.AllLocalImages = AllLocalImages;
    }

    /**
     * Get Whether to license all repository images, with a higher priority than licensing by image ID. When it is `true`, `UpdatedRegistryImageCnt` should be greater than `0`. 
     * @return AllRegistryImages Whether to license all repository images, with a higher priority than licensing by image ID. When it is `true`, `UpdatedRegistryImageCnt` should be greater than `0`.
     */
    public Boolean getAllRegistryImages() {
        return this.AllRegistryImages;
    }

    /**
     * Set Whether to license all repository images, with a higher priority than licensing by image ID. When it is `true`, `UpdatedRegistryImageCnt` should be greater than `0`.
     * @param AllRegistryImages Whether to license all repository images, with a higher priority than licensing by image ID. When it is `true`, `UpdatedRegistryImageCnt` should be greater than `0`.
     */
    public void setAllRegistryImages(Boolean AllRegistryImages) {
        this.AllRegistryImages = AllRegistryImages;
    }

    /**
     * Get Specified number of local images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored. 
     * @return UpdatedLocalImageCnt Specified number of local images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     */
    public Long getUpdatedLocalImageCnt() {
        return this.UpdatedLocalImageCnt;
    }

    /**
     * Set Specified number of local images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     * @param UpdatedLocalImageCnt Specified number of local images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     */
    public void setUpdatedLocalImageCnt(Long UpdatedLocalImageCnt) {
        this.UpdatedLocalImageCnt = UpdatedLocalImageCnt;
    }

    /**
     * Get Specified number of repository images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored. 
     * @return UpdatedRegistryImageCnt Specified number of repository images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     */
    public Long getUpdatedRegistryImageCnt() {
        return this.UpdatedRegistryImageCnt;
    }

    /**
     * Set Specified number of repository images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     * @param UpdatedRegistryImageCnt Specified number of repository images to be licensed, with the highest priority. Any difference between this number and the actual number will be randomly ignored.
     */
    public void setUpdatedRegistryImageCnt(Long UpdatedRegistryImageCnt) {
        this.UpdatedRegistryImageCnt = UpdatedRegistryImageCnt;
    }

    /**
     * Get Licensing by eligible local images. Valid values of local image source: `ASSETIMAGE` (local image list); `IMAGEALL` (local image sync). This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`. 
     * @return ImageSourceType Licensing by eligible local images. Valid values of local image source: `ASSETIMAGE` (local image list); `IMAGEALL` (local image sync). This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public String getImageSourceType() {
        return this.ImageSourceType;
    }

    /**
     * Set Licensing by eligible local images. Valid values of local image source: `ASSETIMAGE` (local image list); `IMAGEALL` (local image sync). This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     * @param ImageSourceType Licensing by eligible local images. Valid values of local image source: `ASSETIMAGE` (local image list); `IMAGEALL` (local image sync). This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public void setImageSourceType(String ImageSourceType) {
        this.ImageSourceType = ImageSourceType;
    }

    /**
     * Get Licensing by eligible local images. This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`. 
     * @return LocalImageFilter Licensing by eligible local images. This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public AssetFilters [] getLocalImageFilter() {
        return this.LocalImageFilter;
    }

    /**
     * Set Licensing by eligible local images. This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     * @param LocalImageFilter Licensing by eligible local images. This parameter is required when `AllLocalImages` is `false`, `LocalImageIds` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public void setLocalImageFilter(AssetFilters [] LocalImageFilter) {
        this.LocalImageFilter = LocalImageFilter;
    }

    /**
     * Get Licensing by eligible repository images. This parameter is required when `AllRegistryImages` is `false`, `RegistryImageIds` is empty, and `UpdatedRegistryImageCnt` is greater than `0`. 
     * @return RegistryImageFilter Licensing by eligible repository images. This parameter is required when `AllRegistryImages` is `false`, `RegistryImageIds` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public AssetFilters [] getRegistryImageFilter() {
        return this.RegistryImageFilter;
    }

    /**
     * Set Licensing by eligible repository images. This parameter is required when `AllRegistryImages` is `false`, `RegistryImageIds` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     * @param RegistryImageFilter Licensing by eligible repository images. This parameter is required when `AllRegistryImages` is `false`, `RegistryImageIds` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public void setRegistryImageFilter(AssetFilters [] RegistryImageFilter) {
        this.RegistryImageFilter = RegistryImageFilter;
    }

    /**
     * Get Licensing by eligible images, excluding specified local image IDs 
     * @return ExcludeLocalImageIds Licensing by eligible images, excluding specified local image IDs
     */
    public String [] getExcludeLocalImageIds() {
        return this.ExcludeLocalImageIds;
    }

    /**
     * Set Licensing by eligible images, excluding specified local image IDs
     * @param ExcludeLocalImageIds Licensing by eligible images, excluding specified local image IDs
     */
    public void setExcludeLocalImageIds(String [] ExcludeLocalImageIds) {
        this.ExcludeLocalImageIds = ExcludeLocalImageIds;
    }

    /**
     * Get Licensing by eligible images, excluding specified repository image IDs 
     * @return ExcludeRegistryImageIds Licensing by eligible images, excluding specified repository image IDs
     */
    public String [] getExcludeRegistryImageIds() {
        return this.ExcludeRegistryImageIds;
    }

    /**
     * Set Licensing by eligible images, excluding specified repository image IDs
     * @param ExcludeRegistryImageIds Licensing by eligible images, excluding specified repository image IDs
     */
    public void setExcludeRegistryImageIds(String [] ExcludeRegistryImageIds) {
        this.ExcludeRegistryImageIds = ExcludeRegistryImageIds;
    }

    /**
     * Get Licensing by local image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllLocalImages` is `false`, `LocalImageFilter` is empty, and `UpdatedLocalImageCnt` is greater than `0`. 
     * @return LocalImageIds Licensing by local image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllLocalImages` is `false`, `LocalImageFilter` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public String [] getLocalImageIds() {
        return this.LocalImageIds;
    }

    /**
     * Set Licensing by local image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllLocalImages` is `false`, `LocalImageFilter` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     * @param LocalImageIds Licensing by local image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllLocalImages` is `false`, `LocalImageFilter` is empty, and `UpdatedLocalImageCnt` is greater than `0`.
     */
    public void setLocalImageIds(String [] LocalImageIds) {
        this.LocalImageIds = LocalImageIds;
    }

    /**
     * Get Licensing by repository image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllRegistryImages` is `false`, `RegistryImageFilter` is empty, and `UpdatedRegistryImageCnt` is greater than `0`. 
     * @return RegistryImageIds Licensing by repository image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllRegistryImages` is `false`, `RegistryImageFilter` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public String [] getRegistryImageIds() {
        return this.RegistryImageIds;
    }

    /**
     * Set Licensing by repository image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllRegistryImages` is `false`, `RegistryImageFilter` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     * @param RegistryImageIds Licensing by repository image ID. This parameter has a higher priority than licensing by eligible images. It is required when `AllRegistryImages` is `false`, `RegistryImageFilter` is empty, and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public void setRegistryImageIds(String [] RegistryImageIds) {
        this.RegistryImageIds = RegistryImageIds;
    }

    /**
     * Get Whether to only include latest images. This parameter is required for repository images when `RegistryImageFilter` is not empty and `UpdatedRegistryImageCnt` is greater than `0`. 
     * @return OnlyShowLatest Whether to only include latest images. This parameter is required for repository images when `RegistryImageFilter` is not empty and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public Boolean getOnlyShowLatest() {
        return this.OnlyShowLatest;
    }

    /**
     * Set Whether to only include latest images. This parameter is required for repository images when `RegistryImageFilter` is not empty and `UpdatedRegistryImageCnt` is greater than `0`.
     * @param OnlyShowLatest Whether to only include latest images. This parameter is required for repository images when `RegistryImageFilter` is not empty and `UpdatedRegistryImageCnt` is greater than `0`.
     */
    public void setOnlyShowLatest(Boolean OnlyShowLatest) {
        this.OnlyShowLatest = OnlyShowLatest;
    }

    public ModifyImageAuthorizedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageAuthorizedRequest(ModifyImageAuthorizedRequest source) {
        if (source.AllLocalImages != null) {
            this.AllLocalImages = new Boolean(source.AllLocalImages);
        }
        if (source.AllRegistryImages != null) {
            this.AllRegistryImages = new Boolean(source.AllRegistryImages);
        }
        if (source.UpdatedLocalImageCnt != null) {
            this.UpdatedLocalImageCnt = new Long(source.UpdatedLocalImageCnt);
        }
        if (source.UpdatedRegistryImageCnt != null) {
            this.UpdatedRegistryImageCnt = new Long(source.UpdatedRegistryImageCnt);
        }
        if (source.ImageSourceType != null) {
            this.ImageSourceType = new String(source.ImageSourceType);
        }
        if (source.LocalImageFilter != null) {
            this.LocalImageFilter = new AssetFilters[source.LocalImageFilter.length];
            for (int i = 0; i < source.LocalImageFilter.length; i++) {
                this.LocalImageFilter[i] = new AssetFilters(source.LocalImageFilter[i]);
            }
        }
        if (source.RegistryImageFilter != null) {
            this.RegistryImageFilter = new AssetFilters[source.RegistryImageFilter.length];
            for (int i = 0; i < source.RegistryImageFilter.length; i++) {
                this.RegistryImageFilter[i] = new AssetFilters(source.RegistryImageFilter[i]);
            }
        }
        if (source.ExcludeLocalImageIds != null) {
            this.ExcludeLocalImageIds = new String[source.ExcludeLocalImageIds.length];
            for (int i = 0; i < source.ExcludeLocalImageIds.length; i++) {
                this.ExcludeLocalImageIds[i] = new String(source.ExcludeLocalImageIds[i]);
            }
        }
        if (source.ExcludeRegistryImageIds != null) {
            this.ExcludeRegistryImageIds = new String[source.ExcludeRegistryImageIds.length];
            for (int i = 0; i < source.ExcludeRegistryImageIds.length; i++) {
                this.ExcludeRegistryImageIds[i] = new String(source.ExcludeRegistryImageIds[i]);
            }
        }
        if (source.LocalImageIds != null) {
            this.LocalImageIds = new String[source.LocalImageIds.length];
            for (int i = 0; i < source.LocalImageIds.length; i++) {
                this.LocalImageIds[i] = new String(source.LocalImageIds[i]);
            }
        }
        if (source.RegistryImageIds != null) {
            this.RegistryImageIds = new String[source.RegistryImageIds.length];
            for (int i = 0; i < source.RegistryImageIds.length; i++) {
                this.RegistryImageIds[i] = new String(source.RegistryImageIds[i]);
            }
        }
        if (source.OnlyShowLatest != null) {
            this.OnlyShowLatest = new Boolean(source.OnlyShowLatest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllLocalImages", this.AllLocalImages);
        this.setParamSimple(map, prefix + "AllRegistryImages", this.AllRegistryImages);
        this.setParamSimple(map, prefix + "UpdatedLocalImageCnt", this.UpdatedLocalImageCnt);
        this.setParamSimple(map, prefix + "UpdatedRegistryImageCnt", this.UpdatedRegistryImageCnt);
        this.setParamSimple(map, prefix + "ImageSourceType", this.ImageSourceType);
        this.setParamArrayObj(map, prefix + "LocalImageFilter.", this.LocalImageFilter);
        this.setParamArrayObj(map, prefix + "RegistryImageFilter.", this.RegistryImageFilter);
        this.setParamArraySimple(map, prefix + "ExcludeLocalImageIds.", this.ExcludeLocalImageIds);
        this.setParamArraySimple(map, prefix + "ExcludeRegistryImageIds.", this.ExcludeRegistryImageIds);
        this.setParamArraySimple(map, prefix + "LocalImageIds.", this.LocalImageIds);
        this.setParamArraySimple(map, prefix + "RegistryImageIds.", this.RegistryImageIds);
        this.setParamSimple(map, prefix + "OnlyShowLatest", this.OnlyShowLatest);

    }
}

