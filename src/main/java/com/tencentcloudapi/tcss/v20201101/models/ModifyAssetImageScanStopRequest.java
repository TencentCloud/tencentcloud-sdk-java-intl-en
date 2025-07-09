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

public class ModifyAssetImageScanStopRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * Image ID
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

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
    private String ExcludeImageIds;

    /**
     * Get Task ID 
     * @return TaskID Task ID
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set Task ID
     * @param TaskID Task ID
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get Image ID 
     * @return Images Image ID
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set Image ID
     * @param Images Image ID
     */
    public void setImages(String [] Images) {
        this.Images = Images;
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
    public String getExcludeImageIds() {
        return this.ExcludeImageIds;
    }

    /**
     * Set Specified image IDs to be excluded
     * @param ExcludeImageIds Specified image IDs to be excluded
     */
    public void setExcludeImageIds(String ExcludeImageIds) {
        this.ExcludeImageIds = ExcludeImageIds;
    }

    public ModifyAssetImageScanStopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetImageScanStopRequest(ModifyAssetImageScanStopRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.ExcludeImageIds != null) {
            this.ExcludeImageIds = new String(source.ExcludeImageIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ExcludeImageIds", this.ExcludeImageIds);

    }
}

