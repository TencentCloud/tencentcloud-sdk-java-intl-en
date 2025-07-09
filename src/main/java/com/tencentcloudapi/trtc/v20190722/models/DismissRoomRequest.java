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

public class DismissRoomRequest extends AbstractModel {

    /**
    * `SDKAppId` of TRTC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room number.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
     * Get `SDKAppId` of TRTC. 
     * @return SdkAppId `SDKAppId` of TRTC.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SDKAppId` of TRTC.
     * @param SdkAppId `SDKAppId` of TRTC.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room number. 
     * @return RoomId Room number.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room number.
     * @param RoomId Room number.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    public DismissRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DismissRoomRequest(DismissRoomRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

