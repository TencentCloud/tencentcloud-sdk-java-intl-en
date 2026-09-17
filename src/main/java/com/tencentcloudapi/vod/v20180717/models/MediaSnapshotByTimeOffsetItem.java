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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimeOffsetItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("PicInfoSet")
    @Expose
    private MediaSnapshotByTimePicInfoItem [] PicInfoSet;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return PicInfoSet 
     */
    public MediaSnapshotByTimePicInfoItem [] getPicInfoSet() {
        return this.PicInfoSet;
    }

    /**
     * Set 
     * @param PicInfoSet 
     */
    public void setPicInfoSet(MediaSnapshotByTimePicInfoItem [] PicInfoSet) {
        this.PicInfoSet = PicInfoSet;
    }

    public MediaSnapshotByTimeOffsetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSnapshotByTimeOffsetItem(MediaSnapshotByTimeOffsetItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.PicInfoSet != null) {
            this.PicInfoSet = new MediaSnapshotByTimePicInfoItem[source.PicInfoSet.length];
            for (int i = 0; i < source.PicInfoSet.length; i++) {
                this.PicInfoSet[i] = new MediaSnapshotByTimePicInfoItem(source.PicInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "PicInfoSet.", this.PicInfoSet);

    }
}

