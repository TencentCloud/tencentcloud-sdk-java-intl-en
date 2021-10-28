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
    * Query start time (s) in the format of Unix timestamp (e.g., 1588031999), which must be a time point in the last 14 days
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time (s) in the format of Unix timestamp, e.g., 1588034999
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Room ID in string type
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
     * Get Query start time (s) in the format of Unix timestamp (e.g., 1588031999), which must be a time point in the last 14 days 
     * @return StartTime Query start time (s) in the format of Unix timestamp (e.g., 1588031999), which must be a time point in the last 14 days
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time (s) in the format of Unix timestamp (e.g., 1588031999), which must be a time point in the last 14 days
     * @param StartTime Query start time (s) in the format of Unix timestamp (e.g., 1588031999), which must be a time point in the last 14 days
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time (s) in the format of Unix timestamp, e.g., 1588034999 
     * @return EndTime Query end time (s) in the format of Unix timestamp, e.g., 1588034999
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time (s) in the format of Unix timestamp, e.g., 1588034999
     * @param EndTime Query end time (s) in the format of Unix timestamp, e.g., 1588034999
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room ID in string type 
     * @return RoomId Room ID in string type
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID in string type
     * @param RoomId Room ID in string type
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

    public DescribeRoomInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInformationRequest(DescribeRoomInformationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
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
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
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

