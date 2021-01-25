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

public class DescribeUserInformationRequest extends AbstractModel{

    /**
    * Unique ID of a call: sdkappid_roomgString_createTime. The `roomgString` refers to the room ID, and `createTime` refers to the creation time of a room in the format of UNIX timestamp in seconds, such as 1400353843_218695_1590065777. Its value can be obtained from the `DescribeRoomInformation` API (related document: https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1).
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * Query start time in the format of UNIX timestamp (e.g. 1588031999s) in the last 5 days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time in the format of UNIX timestamp (e.g. 1588031999s).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * User `SDKAppID` (e.g. 1400188366).
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * The array of user IDs for query. You can enter up to 6 user IDs. If it is left empty, data of 6 users will be returned.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * Page index starting from 0. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned.
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * Number of entries per page. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. `PageSize` is up to 100.
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
     * Get Unique ID of a call: sdkappid_roomgString_createTime. The `roomgString` refers to the room ID, and `createTime` refers to the creation time of a room in the format of UNIX timestamp in seconds, such as 1400353843_218695_1590065777. Its value can be obtained from the `DescribeRoomInformation` API (related document: https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1). 
     * @return CommId Unique ID of a call: sdkappid_roomgString_createTime. The `roomgString` refers to the room ID, and `createTime` refers to the creation time of a room in the format of UNIX timestamp in seconds, such as 1400353843_218695_1590065777. Its value can be obtained from the `DescribeRoomInformation` API (related document: https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1).
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set Unique ID of a call: sdkappid_roomgString_createTime. The `roomgString` refers to the room ID, and `createTime` refers to the creation time of a room in the format of UNIX timestamp in seconds, such as 1400353843_218695_1590065777. Its value can be obtained from the `DescribeRoomInformation` API (related document: https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1).
     * @param CommId Unique ID of a call: sdkappid_roomgString_createTime. The `roomgString` refers to the room ID, and `createTime` refers to the creation time of a room in the format of UNIX timestamp in seconds, such as 1400353843_218695_1590065777. Its value can be obtained from the `DescribeRoomInformation` API (related document: https://intl.cloud.tencent.com/document/product/647/44050?from_cn_redirect=1).
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get Query start time in the format of UNIX timestamp (e.g. 1588031999s) in the last 5 days. 
     * @return StartTime Query start time in the format of UNIX timestamp (e.g. 1588031999s) in the last 5 days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of UNIX timestamp (e.g. 1588031999s) in the last 5 days.
     * @param StartTime Query start time in the format of UNIX timestamp (e.g. 1588031999s) in the last 5 days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of UNIX timestamp (e.g. 1588031999s). 
     * @return EndTime Query end time in the format of UNIX timestamp (e.g. 1588031999s).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of UNIX timestamp (e.g. 1588031999s).
     * @param EndTime Query end time in the format of UNIX timestamp (e.g. 1588031999s).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get User `SDKAppID` (e.g. 1400188366). 
     * @return SdkAppId User `SDKAppID` (e.g. 1400188366).
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User `SDKAppID` (e.g. 1400188366).
     * @param SdkAppId User `SDKAppID` (e.g. 1400188366).
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The array of user IDs for query. You can enter up to 6 user IDs. If it is left empty, data of 6 users will be returned. 
     * @return UserIds The array of user IDs for query. You can enter up to 6 user IDs. If it is left empty, data of 6 users will be returned.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set The array of user IDs for query. You can enter up to 6 user IDs. If it is left empty, data of 6 users will be returned.
     * @param UserIds The array of user IDs for query. You can enter up to 6 user IDs. If it is left empty, data of 6 users will be returned.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get Page index starting from 0. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. 
     * @return PageNumber Page index starting from 0. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned.
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page index starting from 0. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned.
     * @param PageNumber Page index starting from 0. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned.
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries per page. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. `PageSize` is up to 100. 
     * @return PageSize Number of entries per page. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. `PageSize` is up to 100.
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. `PageSize` is up to 100.
     * @param PageSize Number of entries per page. If either `PageNumber` or `PageSize` is left empty, 6 data entries will be returned. `PageSize` is up to 100.
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

