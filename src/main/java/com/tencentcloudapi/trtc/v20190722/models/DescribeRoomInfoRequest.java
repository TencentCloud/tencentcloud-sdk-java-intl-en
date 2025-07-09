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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomInfoRequest extends AbstractModel {

    /**
    * The application ID, such as `1400xxxxxx`.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: The end and start time cannot be more than 24 hours apart.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The room ID, such as `223`.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, 10 records will be returned.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * The number of records per page. The default is `10`.
Value range: 1-100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get The application ID, such as `1400xxxxxx`. 
     * @return SdkAppId The application ID, such as `1400xxxxxx`.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID, such as `1400xxxxxx`.
     * @param SdkAppId The application ID, such as `1400xxxxxx`.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried. 
     * @return StartTime The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     * @param StartTime The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: The end and start time cannot be more than 24 hours apart. 
     * @return EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: The end and start time cannot be more than 24 hours apart.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: The end and start time cannot be more than 24 hours apart.
     * @param EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: The end and start time cannot be more than 24 hours apart.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The room ID, such as `223`. 
     * @return RoomId The room ID, such as `223`.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID, such as `223`.
     * @param RoomId The room ID, such as `223`.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, 10 records will be returned. 
     * @return PageNumber The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, 10 records will be returned.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, 10 records will be returned.
     * @param PageNumber The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, 10 records will be returned.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get The number of records per page. The default is `10`.
Value range: 1-100. 
     * @return PageSize The number of records per page. The default is `10`.
Value range: 1-100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of records per page. The default is `10`.
Value range: 1-100.
     * @param PageSize The number of records per page. The default is `10`.
Value range: 1-100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeRoomInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInfoRequest(DescribeRoomInfoRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

