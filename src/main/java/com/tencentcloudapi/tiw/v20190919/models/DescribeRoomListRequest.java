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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomListRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time.
    */
    @SerializedName("TimeRange")
    @Expose
    private Long [] TimeRange;

    /**
    * Extra query conditions.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Maximum number of data entries to be returned. Default value: 1000.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time. 
     * @return TimeRange Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time.
     */
    public Long [] getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time.
     * @param TimeRange Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time.
     */
    public void setTimeRange(Long [] TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Extra query conditions. 
     * @return Query Extra query conditions.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Extra query conditions.
     * @param Query Extra query conditions.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Maximum number of data entries to be returned. Default value: 1000. 
     * @return MaxSize Maximum number of data entries to be returned. Default value: 1000.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of data entries to be returned. Default value: 1000.
     * @param MaxSize Maximum number of data entries to be returned. Default value: 1000.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public DescribeRoomListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomListRequest(DescribeRoomListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new Long[source.TimeRange.length];
            for (int i = 0; i < source.TimeRange.length; i++) {
                this.TimeRange[i] = new Long(source.TimeRange[i]);
            }
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

