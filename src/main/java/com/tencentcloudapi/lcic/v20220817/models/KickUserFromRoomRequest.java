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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KickUserFromRoomRequest extends AbstractModel {

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The ID of the user to be removed.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The removal type: 
`1`: Keep the user out temporarily. The `Duration` parameter specifies the ban duration, during which the user is banned from entering the room. 
`2`: Remove the user permanently.
    */
    @SerializedName("KickType")
    @Expose
    private Long KickType;

    /**
    * The ban duration (seconds). This parameter is valid if `KickType` is `1`. The default value is `0`.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get The room ID. 
     * @return RoomId The room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
     * @param RoomId The room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The SDKAppID assigned by LCIC. 
     * @return SdkAppId The SDKAppID assigned by LCIC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.
     * @param SdkAppId The SDKAppID assigned by LCIC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The ID of the user to be removed. 
     * @return UserId The ID of the user to be removed.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The ID of the user to be removed.
     * @param UserId The ID of the user to be removed.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The removal type: 
`1`: Keep the user out temporarily. The `Duration` parameter specifies the ban duration, during which the user is banned from entering the room. 
`2`: Remove the user permanently. 
     * @return KickType The removal type: 
`1`: Keep the user out temporarily. The `Duration` parameter specifies the ban duration, during which the user is banned from entering the room. 
`2`: Remove the user permanently.
     */
    public Long getKickType() {
        return this.KickType;
    }

    /**
     * Set The removal type: 
`1`: Keep the user out temporarily. The `Duration` parameter specifies the ban duration, during which the user is banned from entering the room. 
`2`: Remove the user permanently.
     * @param KickType The removal type: 
`1`: Keep the user out temporarily. The `Duration` parameter specifies the ban duration, during which the user is banned from entering the room. 
`2`: Remove the user permanently.
     */
    public void setKickType(Long KickType) {
        this.KickType = KickType;
    }

    /**
     * Get The ban duration (seconds). This parameter is valid if `KickType` is `1`. The default value is `0`. 
     * @return Duration The ban duration (seconds). This parameter is valid if `KickType` is `1`. The default value is `0`.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The ban duration (seconds). This parameter is valid if `KickType` is `1`. The default value is `0`.
     * @param Duration The ban duration (seconds). This parameter is valid if `KickType` is `1`. The default value is `0`.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public KickUserFromRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KickUserFromRoomRequest(KickUserFromRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.KickType != null) {
            this.KickType = new Long(source.KickType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "KickType", this.KickType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

