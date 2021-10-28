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
    * Query start time (s) in the format of Unix timestamp (e.g., 1590065777), which must be a time point in the last 14 days
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time (s) in the format of Unix timestamp (e.g., 1590065877)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * `SDKAppID` of the users to query, e.g., 1400353843
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
     * Get Query start time (s) in the format of Unix timestamp (e.g., 1590065777), which must be a time point in the last 14 days 
     * @return StartTime Query start time (s) in the format of Unix timestamp (e.g., 1590065777), which must be a time point in the last 14 days
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time (s) in the format of Unix timestamp (e.g., 1590065777), which must be a time point in the last 14 days
     * @param StartTime Query start time (s) in the format of Unix timestamp (e.g., 1590065777), which must be a time point in the last 14 days
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time (s) in the format of Unix timestamp (e.g., 1590065877) 
     * @return EndTime Query end time (s) in the format of Unix timestamp (e.g., 1590065877)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time (s) in the format of Unix timestamp (e.g., 1590065877)
     * @param EndTime Query end time (s) in the format of Unix timestamp (e.g., 1590065877)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get `SDKAppID` of the users to query, e.g., 1400353843 
     * @return SdkAppId `SDKAppID` of the users to query, e.g., 1400353843
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SDKAppID` of the users to query, e.g., 1400353843
     * @param SdkAppId `SDKAppID` of the users to query, e.g., 1400353843
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

    public DescribeUserInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInformationRequest(DescribeUserInformationRequest source) {
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
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
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
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

