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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimeOffsetItem extends AbstractModel{

    /**
    * Specification of a time point screenshot. For more information, please see [Parameter Template for Time Point Screencapturing](https://cloud.tencent.com/document/product/266/33480#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Information set of screenshots of the same specification. Each element represents a screenshot.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PicInfoSet")
    @Expose
    private MediaSnapshotByTimePicInfoItem [] PicInfoSet;

    /**
     * Get Specification of a time point screenshot. For more information, please see [Parameter Template for Time Point Screencapturing](https://cloud.tencent.com/document/product/266/33480#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Definition Specification of a time point screenshot. For more information, please see [Parameter Template for Time Point Screencapturing](https://cloud.tencent.com/document/product/266/33480#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Specification of a time point screenshot. For more information, please see [Parameter Template for Time Point Screencapturing](https://cloud.tencent.com/document/product/266/33480#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Definition Specification of a time point screenshot. For more information, please see [Parameter Template for Time Point Screencapturing](https://cloud.tencent.com/document/product/266/33480#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Information set of screenshots of the same specification. Each element represents a screenshot.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PicInfoSet Information set of screenshots of the same specification. Each element represents a screenshot.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSnapshotByTimePicInfoItem [] getPicInfoSet() {
        return this.PicInfoSet;
    }

    /**
     * Set Information set of screenshots of the same specification. Each element represents a screenshot.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PicInfoSet Information set of screenshots of the same specification. Each element represents a screenshot.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPicInfoSet(MediaSnapshotByTimePicInfoItem [] PicInfoSet) {
        this.PicInfoSet = PicInfoSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "PicInfoSet.", this.PicInfoSet);

    }
}

