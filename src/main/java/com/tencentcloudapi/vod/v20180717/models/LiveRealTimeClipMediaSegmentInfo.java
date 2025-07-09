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

public class LiveRealTimeClipMediaSegmentInfo extends AbstractModel {

    /**
    * Start time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Start time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732) 
     * @return StartTime Start time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     * @param StartTime Start time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732) 
     * @return EndTime End time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     * @param EndTime End time of the cliped segment, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public LiveRealTimeClipMediaSegmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipMediaSegmentInfo(LiveRealTimeClipMediaSegmentInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

