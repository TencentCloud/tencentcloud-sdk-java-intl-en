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

public class ExtractBlindWatermarkTaskConfig extends AbstractModel {

    /**
    * Valid when the watermark type is blind-abseq. specifies the segment duration of the input video. unit: ms.
Segment duration is 5 seconds by default if left empty.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
     * Get Valid when the watermark type is blind-abseq. specifies the segment duration of the input video. unit: ms.
Segment duration is 5 seconds by default if left empty.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SegmentDuration Valid when the watermark type is blind-abseq. specifies the segment duration of the input video. unit: ms.
Segment duration is 5 seconds by default if left empty.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set Valid when the watermark type is blind-abseq. specifies the segment duration of the input video. unit: ms.
Segment duration is 5 seconds by default if left empty.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SegmentDuration Valid when the watermark type is blind-abseq. specifies the segment duration of the input video. unit: ms.
Segment duration is 5 seconds by default if left empty.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    public ExtractBlindWatermarkTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkTaskConfig(ExtractBlindWatermarkTaskConfig source) {
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

