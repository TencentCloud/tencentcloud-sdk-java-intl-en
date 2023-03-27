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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRoomMessageRequest extends AbstractModel{

    /**
    * The SDKAppID assigned by LCIC.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The starting message sequence. Messages before this sequence will be returned (not including the message whose sequence is `seq`).
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * The maximum number of messages to return. The value of this parameter cannot exceed the maximum message count allowed by your package.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get The starting message sequence. Messages before this sequence will be returned (not including the message whose sequence is `seq`). 
     * @return Seq The starting message sequence. Messages before this sequence will be returned (not including the message whose sequence is `seq`).
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set The starting message sequence. Messages before this sequence will be returned (not including the message whose sequence is `seq`).
     * @param Seq The starting message sequence. Messages before this sequence will be returned (not including the message whose sequence is `seq`).
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get The maximum number of messages to return. The value of this parameter cannot exceed the maximum message count allowed by your package. 
     * @return Limit The maximum number of messages to return. The value of this parameter cannot exceed the maximum message count allowed by your package.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of messages to return. The value of this parameter cannot exceed the maximum message count allowed by your package.
     * @param Limit The maximum number of messages to return. The value of this parameter cannot exceed the maximum message count allowed by your package.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetRoomMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomMessageRequest(GetRoomMessageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Seq != null) {
            this.Seq = new Long(source.Seq);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

