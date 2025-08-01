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

public class BatchDeleteRecordRequest extends AbstractModel {

    /**
    * The room IDs.
    */
    @SerializedName("RoomIds")
    @Expose
    private Long [] RoomIds;

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get The room IDs. 
     * @return RoomIds The room IDs.
     */
    public Long [] getRoomIds() {
        return this.RoomIds;
    }

    /**
     * Set The room IDs.
     * @param RoomIds The room IDs.
     */
    public void setRoomIds(Long [] RoomIds) {
        this.RoomIds = RoomIds;
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

    public BatchDeleteRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteRecordRequest(BatchDeleteRecordRequest source) {
        if (source.RoomIds != null) {
            this.RoomIds = new Long[source.RoomIds.length];
            for (int i = 0; i < source.RoomIds.length; i++) {
                this.RoomIds[i] = new Long(source.RoomIds[i]);
            }
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RoomIds.", this.RoomIds);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

