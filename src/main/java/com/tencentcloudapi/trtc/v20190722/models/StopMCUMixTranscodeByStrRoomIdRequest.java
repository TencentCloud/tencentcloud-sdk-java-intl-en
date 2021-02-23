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

public class StopMCUMixTranscodeByStrRoomIdRequest extends AbstractModel{

    /**
    * `SDKAppId` of TRTC
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room ID in string type
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
     * Get `SDKAppId` of TRTC 
     * @return SdkAppId `SDKAppId` of TRTC
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SDKAppId` of TRTC
     * @param SdkAppId `SDKAppId` of TRTC
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room ID in string type 
     * @return StrRoomId Room ID in string type
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set Room ID in string type
     * @param StrRoomId Room ID in string type
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);

    }
}

