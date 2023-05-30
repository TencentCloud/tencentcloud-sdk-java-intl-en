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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBoardSDKLogRequest extends AbstractModel{

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room ID to be used to query logs.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * User ID to be used to query logs.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Query period, which consists of two Unix timestamps in milliseconds. The first indicates the start time and the second the end time.
    */
    @SerializedName("TimeRange")
    @Expose
    private Long [] TimeRange;

    /**
    * Interval for aggregating log number queries. Example values: `5m`, `1h`, `4h`
    */
    @SerializedName("AggregationInterval")
    @Expose
    private String AggregationInterval;

    /**
    * Extra query conditions.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Specifies whether to sort results in ascending order of time.
    */
    @SerializedName("Ascending")
    @Expose
    private Boolean Ascending;

    /**
    * Context key used for recursive extraction. Obtain this parameter in the response to the last request.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

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
     * Get Room ID to be used to query logs. 
     * @return RoomId Room ID to be used to query logs.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID to be used to query logs.
     * @param RoomId Room ID to be used to query logs.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get User ID to be used to query logs. 
     * @return UserId User ID to be used to query logs.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID to be used to query logs.
     * @param UserId User ID to be used to query logs.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get Interval for aggregating log number queries. Example values: `5m`, `1h`, `4h` 
     * @return AggregationInterval Interval for aggregating log number queries. Example values: `5m`, `1h`, `4h`
     */
    public String getAggregationInterval() {
        return this.AggregationInterval;
    }

    /**
     * Set Interval for aggregating log number queries. Example values: `5m`, `1h`, `4h`
     * @param AggregationInterval Interval for aggregating log number queries. Example values: `5m`, `1h`, `4h`
     */
    public void setAggregationInterval(String AggregationInterval) {
        this.AggregationInterval = AggregationInterval;
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
     * Get Specifies whether to sort results in ascending order of time. 
     * @return Ascending Specifies whether to sort results in ascending order of time.
     */
    public Boolean getAscending() {
        return this.Ascending;
    }

    /**
     * Set Specifies whether to sort results in ascending order of time.
     * @param Ascending Specifies whether to sort results in ascending order of time.
     */
    public void setAscending(Boolean Ascending) {
        this.Ascending = Ascending;
    }

    /**
     * Get Context key used for recursive extraction. Obtain this parameter in the response to the last request. 
     * @return Context Context key used for recursive extraction. Obtain this parameter in the response to the last request.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context key used for recursive extraction. Obtain this parameter in the response to the last request.
     * @param Context Context key used for recursive extraction. Obtain this parameter in the response to the last request.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeBoardSDKLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBoardSDKLogRequest(DescribeBoardSDKLogRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new Long[source.TimeRange.length];
            for (int i = 0; i < source.TimeRange.length; i++) {
                this.TimeRange[i] = new Long(source.TimeRange[i]);
            }
        }
        if (source.AggregationInterval != null) {
            this.AggregationInterval = new String(source.AggregationInterval);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Ascending != null) {
            this.Ascending = new Boolean(source.Ascending);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamSimple(map, prefix + "AggregationInterval", this.AggregationInterval);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Ascending", this.Ascending);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

