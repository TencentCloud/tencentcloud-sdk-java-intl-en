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

public class ModifyIgnoreVul extends AbstractModel {

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * IDs of images to be ignored. If it is not specified, it indicates to ignore all.
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * When there is an image
Image type. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get IDs of images to be ignored. If it is not specified, it indicates to ignore all. 
     * @return ImageIDs IDs of images to be ignored. If it is not specified, it indicates to ignore all.
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set IDs of images to be ignored. If it is not specified, it indicates to ignore all.
     * @param ImageIDs IDs of images to be ignored. If it is not specified, it indicates to ignore all.
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get When there is an image
Image type. Valid values: `LOCAL` (local image); `REGISTRY` (repository image). 
     * @return ImageType When there is an image
Image type. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set When there is an image
Image type. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     * @param ImageType When there is an image
Image type. Valid values: `LOCAL` (local image); `REGISTRY` (repository image).
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public ModifyIgnoreVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIgnoreVul(ModifyIgnoreVul source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

