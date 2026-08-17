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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimeOffsetItem extends AbstractModel {

    /**
    * Specification for SnapshotByTimeOffset, please refer to the [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * A screenshot information set of the same specification, each element represents a screenshot.
    */
    @SerializedName("PicInfoSet")
    @Expose
    private MediaSnapshotByTimePicInfoItem [] PicInfoSet;

    /**
    * Storage location of the SnapshotByTimeOffset file.
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
     * Get Specification for SnapshotByTimeOffset, please refer to the [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Specification for SnapshotByTimeOffset, please refer to the [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Specification for SnapshotByTimeOffset, please refer to the [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Specification for SnapshotByTimeOffset, please refer to the [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get A screenshot information set of the same specification, each element represents a screenshot. 
     * @return PicInfoSet A screenshot information set of the same specification, each element represents a screenshot.
     */
    public MediaSnapshotByTimePicInfoItem [] getPicInfoSet() {
        return this.PicInfoSet;
    }

    /**
     * Set A screenshot information set of the same specification, each element represents a screenshot.
     * @param PicInfoSet A screenshot information set of the same specification, each element represents a screenshot.
     */
    public void setPicInfoSet(MediaSnapshotByTimePicInfoItem [] PicInfoSet) {
        this.PicInfoSet = PicInfoSet;
    }

    /**
     * Get Storage location of the SnapshotByTimeOffset file. 
     * @return Storage Storage location of the SnapshotByTimeOffset file.
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage location of the SnapshotByTimeOffset file.
     * @param Storage Storage location of the SnapshotByTimeOffset file.
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
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
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "PicInfoSet.", this.PicInfoSet);
        this.setParamObj(map, prefix + "Storage.", this.Storage);

    }
}

