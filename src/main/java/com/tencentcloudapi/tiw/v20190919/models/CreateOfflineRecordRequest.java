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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOfflineRecordRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Room ID corresponding to the recording task.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Group ID corresponding to the recording task.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Stream mixing parameters.
The Custom parameter is not supported for offline recording tasks.
    */
    @SerializedName("MixStream")
    @Expose
    private MixStream MixStream;

    /**
    * Whiteboard parameters.
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room ID corresponding to the recording task. 
     * @return RoomId Room ID corresponding to the recording task.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID corresponding to the recording task.
     * @param RoomId Room ID corresponding to the recording task.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Group ID corresponding to the recording task. 
     * @return GroupId Group ID corresponding to the recording task.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID corresponding to the recording task.
     * @param GroupId Group ID corresponding to the recording task.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Stream mixing parameters.
The Custom parameter is not supported for offline recording tasks. 
     * @return MixStream Stream mixing parameters.
The Custom parameter is not supported for offline recording tasks.
     */
    public MixStream getMixStream() {
        return this.MixStream;
    }

    /**
     * Set Stream mixing parameters.
The Custom parameter is not supported for offline recording tasks.
     * @param MixStream Stream mixing parameters.
The Custom parameter is not supported for offline recording tasks.
     */
    public void setMixStream(MixStream MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * Get Whiteboard parameters. 
     * @return Whiteboard Whiteboard parameters.
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set Whiteboard parameters.
     * @param Whiteboard Whiteboard parameters.
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    public CreateOfflineRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineRecordRequest(CreateOfflineRecordRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.MixStream != null) {
            this.MixStream = new MixStream(source.MixStream);
        }
        if (source.Whiteboard != null) {
            this.Whiteboard = new Whiteboard(source.Whiteboard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "MixStream.", this.MixStream);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);

    }
}

