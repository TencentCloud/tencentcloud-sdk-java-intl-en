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

public class CreateAssetImageRegistryScanTaskRequest extends AbstractModel {

    /**
    * <p>Whether to scan all images.</p>
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * <p>List of images to be scanned.</p>
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * <p>Scan type array.</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * <p>List of images to be scanned.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * <p>Filter conditions.</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>List of images that do not need to be scanned, used in conjunction with Filters.</p>
    */
    @SerializedName("ExcludeImageList")
    @Expose
    private Long [] ExcludeImageList;

    /**
    * <p>Whether to scan only the latest version of the image in each repository, used in conjunction with Filters.</p>
    */
    @SerializedName("OnlyScanLatest")
    @Expose
    private Boolean OnlyScanLatest;

    /**
    * <p>Task timeout duration.</p><p>Unit: seconds.</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get <p>Whether to scan all images.</p> 
     * @return All <p>Whether to scan all images.</p>
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set <p>Whether to scan all images.</p>
     * @param All <p>Whether to scan all images.</p>
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get <p>List of images to be scanned.</p> 
     * @return Images <p>List of images to be scanned.</p>
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>List of images to be scanned.</p>
     * @param Images <p>List of images to be scanned.</p>
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get <p>Scan type array.</p> 
     * @return ScanType <p>Scan type array.</p>
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Scan type array.</p>
     * @param ScanType <p>Scan type array.</p>
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>List of images to be scanned.</p> 
     * @return Id <p>List of images to be scanned.</p>
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set <p>List of images to be scanned.</p>
     * @param Id <p>List of images to be scanned.</p>
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Filter conditions.</p> 
     * @return Filters <p>Filter conditions.</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions.</p>
     * @param Filters <p>Filter conditions.</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>List of images that do not need to be scanned, used in conjunction with Filters.</p> 
     * @return ExcludeImageList <p>List of images that do not need to be scanned, used in conjunction with Filters.</p>
     */
    public Long [] getExcludeImageList() {
        return this.ExcludeImageList;
    }

    /**
     * Set <p>List of images that do not need to be scanned, used in conjunction with Filters.</p>
     * @param ExcludeImageList <p>List of images that do not need to be scanned, used in conjunction with Filters.</p>
     */
    public void setExcludeImageList(Long [] ExcludeImageList) {
        this.ExcludeImageList = ExcludeImageList;
    }

    /**
     * Get <p>Whether to scan only the latest version of the image in each repository, used in conjunction with Filters.</p> 
     * @return OnlyScanLatest <p>Whether to scan only the latest version of the image in each repository, used in conjunction with Filters.</p>
     */
    public Boolean getOnlyScanLatest() {
        return this.OnlyScanLatest;
    }

    /**
     * Set <p>Whether to scan only the latest version of the image in each repository, used in conjunction with Filters.</p>
     * @param OnlyScanLatest <p>Whether to scan only the latest version of the image in each repository, used in conjunction with Filters.</p>
     */
    public void setOnlyScanLatest(Boolean OnlyScanLatest) {
        this.OnlyScanLatest = OnlyScanLatest;
    }

    /**
     * Get <p>Task timeout duration.</p><p>Unit: seconds.</p> 
     * @return Timeout <p>Task timeout duration.</p><p>Unit: seconds.</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Task timeout duration.</p><p>Unit: seconds.</p>
     * @param Timeout <p>Task timeout duration.</p><p>Unit: seconds.</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateAssetImageRegistryScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageRegistryScanTaskRequest(CreateAssetImageRegistryScanTaskRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageList != null) {
            this.ExcludeImageList = new Long[source.ExcludeImageList.length];
            for (int i = 0; i < source.ExcludeImageList.length; i++) {
                this.ExcludeImageList[i] = new Long(source.ExcludeImageList[i]);
            }
        }
        if (source.OnlyScanLatest != null) {
            this.OnlyScanLatest = new Boolean(source.OnlyScanLatest);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageList.", this.ExcludeImageList);
        this.setParamSimple(map, prefix + "OnlyScanLatest", this.OnlyScanLatest);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

