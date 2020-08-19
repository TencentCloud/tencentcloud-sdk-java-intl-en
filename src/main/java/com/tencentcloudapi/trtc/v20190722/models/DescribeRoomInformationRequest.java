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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomInformationRequest extends AbstractModel{

    /**
    * User `sdkappid`
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time in the format of local UNIX timestamp, such as 1588031999s.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Room ID of uint type
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Page index starting from 0 (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default)
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * Number of entries per page (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default. Maximum value: 100)
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
     * Get User `sdkappid` 
     * @return SdkAppId User `sdkappid`
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User `sdkappid`
     * @param SdkAppId User `sdkappid`
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days. 
     * @return StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     * @param StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of local UNIX timestamp, such as 1588031999s. 
     * @return EndTime Query end time in the format of local UNIX timestamp, such as 1588031999s.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of local UNIX timestamp, such as 1588031999s.
     * @param EndTime Query end time in the format of local UNIX timestamp, such as 1588031999s.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room ID of uint type 
     * @return RoomId Room ID of uint type
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID of uint type
     * @param RoomId Room ID of uint type
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Page index starting from 0 (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default) 
     * @return PageNumber Page index starting from 0 (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default)
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page index starting from 0 (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default)
     * @param PageNumber Page index starting from 0 (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default)
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries per page (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default. Maximum value: 100) 
     * @return PageSize Number of entries per page (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default. Maximum value: 100)
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default. Maximum value: 100)
     * @param PageSize Number of entries per page (if either `PageNumber` or `PageSize` is left empty, 10 data entries will be returned by default. Maximum value: 100)
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
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

