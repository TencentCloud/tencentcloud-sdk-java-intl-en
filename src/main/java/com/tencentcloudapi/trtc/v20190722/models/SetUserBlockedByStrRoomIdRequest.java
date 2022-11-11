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

public class SetUserBlockedByStrRoomIdRequest extends AbstractModel{

    /**
    * The application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The room ID (string).
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * The user ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Whether to disable the user’s audio and video. 0: Enable; 1: Disable.
    */
    @SerializedName("IsMute")
    @Expose
    private Long IsMute;

    /**
     * Get The application ID. 
     * @return SdkAppId The application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID.
     * @param SdkAppId The application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The room ID (string). 
     * @return StrRoomId The room ID (string).
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set The room ID (string).
     * @param StrRoomId The room ID (string).
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get The user ID. 
     * @return UserId The user ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID.
     * @param UserId The user ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Whether to disable the user’s audio and video. 0: Enable; 1: Disable. 
     * @return IsMute Whether to disable the user’s audio and video. 0: Enable; 1: Disable.
     */
    public Long getIsMute() {
        return this.IsMute;
    }

    /**
     * Set Whether to disable the user’s audio and video. 0: Enable; 1: Disable.
     * @param IsMute Whether to disable the user’s audio and video. 0: Enable; 1: Disable.
     */
    public void setIsMute(Long IsMute) {
        this.IsMute = IsMute;
    }

    public SetUserBlockedByStrRoomIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetUserBlockedByStrRoomIdRequest(SetUserBlockedByStrRoomIdRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StrRoomId != null) {
            this.StrRoomId = new String(source.StrRoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsMute != null) {
            this.IsMute = new Long(source.IsMute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsMute", this.IsMute);

    }
}

