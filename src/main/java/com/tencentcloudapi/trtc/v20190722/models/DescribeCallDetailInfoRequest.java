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

public class DescribeCallDetailInfoRequest extends AbstractModel{

    /**
    * The unique ID of a call, whose format is `SdkAppId_CreateTime`, such as `1400xxxxxx_218695_1590065777`. `createTime` is the UNIX timestamp (seconds) when the room was created. Its value can be obtained using the [DescribeRoomInfo](https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1) API.
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: If `DataType` is not null, the end time and start time cannot be more than one hour apart; if `DataType` is null, the end time and start time cannot be more than four hours apart.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The application ID, such as `1400xxxxxx`.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The users to query. If you do not specify this, the data of six users will be returned.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * The metrics to query. If you do not specify this, only the user list will be returned. If you pass in `all`, all metrics will be returned.
`appCpu`: The CPU utilization of the application.
`sysCpu`: The CPU utilization of the system.
`aBit`: The upstream/downstream audio bitrate (bps).
`aBlock`: The audio stutter duration (ms).
`bigvBit`: The upstream/downstream video bitrate (bps).
`bigvCapFps`: The frame rate for capturing videos.
`bigvEncFps`: The frame rate for sending videos.
`bigvDecFps`: The rendering frame rate.
`bigvBlock`: The video stutter duration (ms).
`aLoss`: The upstream/downstream audio packet loss.
`bigvLoss`: The upstream/downstream video packet loss.
`bigvWidth`: The upstream/downstream resolution (width).
`bigvHeight`: The upstream/downstream resolution (height).
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
    * The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, six records will be returned.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * The number of records per page. The default is `6`.
Value range: 1-100.
Note: If `DataType` is not null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `6`.
If `DataType` is null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `100`.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get The unique ID of a call, whose format is `SdkAppId_CreateTime`, such as `1400xxxxxx_218695_1590065777`. `createTime` is the UNIX timestamp (seconds) when the room was created. Its value can be obtained using the [DescribeRoomInfo](https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1) API. 
     * @return CommId The unique ID of a call, whose format is `SdkAppId_CreateTime`, such as `1400xxxxxx_218695_1590065777`. `createTime` is the UNIX timestamp (seconds) when the room was created. Its value can be obtained using the [DescribeRoomInfo](https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1) API.
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set The unique ID of a call, whose format is `SdkAppId_CreateTime`, such as `1400xxxxxx_218695_1590065777`. `createTime` is the UNIX timestamp (seconds) when the room was created. Its value can be obtained using the [DescribeRoomInfo](https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1) API.
     * @param CommId The unique ID of a call, whose format is `SdkAppId_CreateTime`, such as `1400xxxxxx_218695_1590065777`. `createTime` is the UNIX timestamp (seconds) when the room was created. Its value can be obtained using the [DescribeRoomInfo](https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1) API.
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
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
Note: If `DataType` is not null, the end time and start time cannot be more than one hour apart; if `DataType` is null, the end time and start time cannot be more than four hours apart. 
     * @return EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: If `DataType` is not null, the end time and start time cannot be more than one hour apart; if `DataType` is null, the end time and start time cannot be more than four hours apart.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: If `DataType` is not null, the end time and start time cannot be more than one hour apart; if `DataType` is null, the end time and start time cannot be more than four hours apart.
     * @param EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`.
Note: If `DataType` is not null, the end time and start time cannot be more than one hour apart; if `DataType` is null, the end time and start time cannot be more than four hours apart.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

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
     * Get The users to query. If you do not specify this, the data of six users will be returned. 
     * @return UserIds The users to query. If you do not specify this, the data of six users will be returned.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set The users to query. If you do not specify this, the data of six users will be returned.
     * @param UserIds The users to query. If you do not specify this, the data of six users will be returned.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get The metrics to query. If you do not specify this, only the user list will be returned. If you pass in `all`, all metrics will be returned.
`appCpu`: The CPU utilization of the application.
`sysCpu`: The CPU utilization of the system.
`aBit`: The upstream/downstream audio bitrate (bps).
`aBlock`: The audio stutter duration (ms).
`bigvBit`: The upstream/downstream video bitrate (bps).
`bigvCapFps`: The frame rate for capturing videos.
`bigvEncFps`: The frame rate for sending videos.
`bigvDecFps`: The rendering frame rate.
`bigvBlock`: The video stutter duration (ms).
`aLoss`: The upstream/downstream audio packet loss.
`bigvLoss`: The upstream/downstream video packet loss.
`bigvWidth`: The upstream/downstream resolution (width).
`bigvHeight`: The upstream/downstream resolution (height). 
     * @return DataType The metrics to query. If you do not specify this, only the user list will be returned. If you pass in `all`, all metrics will be returned.
`appCpu`: The CPU utilization of the application.
`sysCpu`: The CPU utilization of the system.
`aBit`: The upstream/downstream audio bitrate (bps).
`aBlock`: The audio stutter duration (ms).
`bigvBit`: The upstream/downstream video bitrate (bps).
`bigvCapFps`: The frame rate for capturing videos.
`bigvEncFps`: The frame rate for sending videos.
`bigvDecFps`: The rendering frame rate.
`bigvBlock`: The video stutter duration (ms).
`aLoss`: The upstream/downstream audio packet loss.
`bigvLoss`: The upstream/downstream video packet loss.
`bigvWidth`: The upstream/downstream resolution (width).
`bigvHeight`: The upstream/downstream resolution (height).
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set The metrics to query. If you do not specify this, only the user list will be returned. If you pass in `all`, all metrics will be returned.
`appCpu`: The CPU utilization of the application.
`sysCpu`: The CPU utilization of the system.
`aBit`: The upstream/downstream audio bitrate (bps).
`aBlock`: The audio stutter duration (ms).
`bigvBit`: The upstream/downstream video bitrate (bps).
`bigvCapFps`: The frame rate for capturing videos.
`bigvEncFps`: The frame rate for sending videos.
`bigvDecFps`: The rendering frame rate.
`bigvBlock`: The video stutter duration (ms).
`aLoss`: The upstream/downstream audio packet loss.
`bigvLoss`: The upstream/downstream video packet loss.
`bigvWidth`: The upstream/downstream resolution (width).
`bigvHeight`: The upstream/downstream resolution (height).
     * @param DataType The metrics to query. If you do not specify this, only the user list will be returned. If you pass in `all`, all metrics will be returned.
`appCpu`: The CPU utilization of the application.
`sysCpu`: The CPU utilization of the system.
`aBit`: The upstream/downstream audio bitrate (bps).
`aBlock`: The audio stutter duration (ms).
`bigvBit`: The upstream/downstream video bitrate (bps).
`bigvCapFps`: The frame rate for capturing videos.
`bigvEncFps`: The frame rate for sending videos.
`bigvDecFps`: The rendering frame rate.
`bigvBlock`: The video stutter duration (ms).
`aLoss`: The upstream/downstream audio packet loss.
`bigvLoss`: The upstream/downstream video packet loss.
`bigvWidth`: The upstream/downstream resolution (width).
`bigvHeight`: The upstream/downstream resolution (height).
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Get The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, six records will be returned. 
     * @return PageNumber The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, six records will be returned.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, six records will be returned.
     * @param PageNumber The page number. The default is 0.
Note: If `PageNumber` or `PageSize` is not specified, six records will be returned.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get The number of records per page. The default is `6`.
Value range: 1-100.
Note: If `DataType` is not null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `6`.
If `DataType` is null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `100`. 
     * @return PageSize The number of records per page. The default is `6`.
Value range: 1-100.
Note: If `DataType` is not null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `6`.
If `DataType` is null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `100`.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of records per page. The default is `6`.
Value range: 1-100.
Note: If `DataType` is not null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `6`.
If `DataType` is null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `100`.
     * @param PageSize The number of records per page. The default is `6`.
Value range: 1-100.
Note: If `DataType` is not null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `6`.
If `DataType` is null, the length of the array `UserIds` and the value of `PageSize` cannot exceed `100`.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeCallDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallDetailInfoRequest(DescribeCallDetailInfoRequest source) {
        if (source.CommId != null) {
            this.CommId = new String(source.CommId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.DataType != null) {
            this.DataType = new String[source.DataType.length];
            for (int i = 0; i < source.DataType.length; i++) {
                this.DataType[i] = new String(source.DataType[i]);
            }
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
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

