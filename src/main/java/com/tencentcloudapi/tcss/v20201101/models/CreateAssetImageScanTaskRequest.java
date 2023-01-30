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

public class CreateAssetImageScanTaskRequest extends AbstractModel{

    /**
    * Whether to scan all images.
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * List of images to be scanned.
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * Scan for vulnerabilities.
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * Scan for trojans.
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * Scan for risks.
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * Filter
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Specified image IDs to be excluded
    */
    @SerializedName("ExcludeImageIds")
    @Expose
    private String [] ExcludeImageIds;

    /**
     * Get Whether to scan all images. 
     * @return All Whether to scan all images.
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to scan all images.
     * @param All Whether to scan all images.
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get List of images to be scanned. 
     * @return Images List of images to be scanned.
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set List of images to be scanned.
     * @param Images List of images to be scanned.
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get Scan for vulnerabilities. 
     * @return ScanVul Scan for vulnerabilities.
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set Scan for vulnerabilities.
     * @param ScanVul Scan for vulnerabilities.
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get Scan for trojans. 
     * @return ScanVirus Scan for trojans.
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set Scan for trojans.
     * @param ScanVirus Scan for trojans.
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get Scan for risks. 
     * @return ScanRisk Scan for risks.
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set Scan for risks.
     * @param ScanRisk Scan for risks.
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get Filter 
     * @return Filters Filter
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
     * @param Filters Filter
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specified image IDs to be excluded 
     * @return ExcludeImageIds Specified image IDs to be excluded
     */
    public String [] getExcludeImageIds() {
        return this.ExcludeImageIds;
    }

    /**
     * Set Specified image IDs to be excluded
     * @param ExcludeImageIds Specified image IDs to be excluded
     */
    public void setExcludeImageIds(String [] ExcludeImageIds) {
        this.ExcludeImageIds = ExcludeImageIds;
    }

    public CreateAssetImageScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanTaskRequest(CreateAssetImageScanTaskRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageIds != null) {
            this.ExcludeImageIds = new String[source.ExcludeImageIds.length];
            for (int i = 0; i < source.ExcludeImageIds.length; i++) {
                this.ExcludeImageIds[i] = new String(source.ExcludeImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeImageIds.", this.ExcludeImageIds);

    }
}

