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

public class DescribeTIWRoomDailyUsageRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_ric: The duration of real-time recording, in minutes.
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * Start date in the format of YYYY-MM-DD. The start date is included in the query period.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Room IDs to be queried. If you leave this parameter empty, all room IDs are queried.
    */
    @SerializedName("RoomIDs")
    @Expose
    private Long [] RoomIDs;

    /**
    * Offset for query. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries returned per query. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_ric: The duration of real-time recording, in minutes. 
     * @return SubProduct Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_ric: The duration of real-time recording, in minutes.
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_ric: The duration of real-time recording, in minutes.
     * @param SubProduct Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_ric: The duration of real-time recording, in minutes.
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get Start date in the format of YYYY-MM-DD. The start date is included in the query period. 
     * @return StartTime Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     * @param StartTime Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days. 
     * @return EndTime End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     * @param EndTime End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room IDs to be queried. If you leave this parameter empty, all room IDs are queried. 
     * @return RoomIDs Room IDs to be queried. If you leave this parameter empty, all room IDs are queried.
     */
    public Long [] getRoomIDs() {
        return this.RoomIDs;
    }

    /**
     * Set Room IDs to be queried. If you leave this parameter empty, all room IDs are queried.
     * @param RoomIDs Room IDs to be queried. If you leave this parameter empty, all room IDs are queried.
     */
    public void setRoomIDs(Long [] RoomIDs) {
        this.RoomIDs = RoomIDs;
    }

    /**
     * Get Offset for query. Default value: `0`. 
     * @return Offset Offset for query. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for query. Default value: `0`.
     * @param Offset Offset for query. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries returned per query. Default value: `20`. 
     * @return Limit Maximum number of entries returned per query. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries returned per query. Default value: `20`.
     * @param Limit Maximum number of entries returned per query. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTIWRoomDailyUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTIWRoomDailyUsageRequest(DescribeTIWRoomDailyUsageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RoomIDs != null) {
            this.RoomIDs = new Long[source.RoomIDs.length];
            for (int i = 0; i < source.RoomIDs.length; i++) {
                this.RoomIDs[i] = new Long(source.RoomIDs[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "RoomIDs.", this.RoomIDs);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

