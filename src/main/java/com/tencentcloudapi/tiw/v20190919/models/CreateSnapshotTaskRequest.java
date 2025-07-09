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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotTaskRequest extends AbstractModel {

    /**
    * Whiteboard parameters.
    */
    @SerializedName("Whiteboard")
    @Expose
    private SnapshotWhiteboard Whiteboard;

    /**
    * `SdkAppId` of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Whiteboard room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Callback URL to which the whiteboard snapshot result is to be sent.
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
    * `COS` bucket in which the generated whiteboard snapshot file is to be stored. If you leave this parameter empty, the generated file will be stored in the public bucket and retained for only three days.
    */
    @SerializedName("COS")
    @Expose
    private SnapshotCOS COS;

    /**
    * Whiteboard snapshot mode. Default value: `AllMarks`. Valid values:

`AllMarks`: Full mode. In this mode, a snapshot image is generated based on each whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client.

`LatestMarksOnly`: Single-page deduplication mode. In this mode, a snapshot image is generated based only on the latest whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client if the API is called multiple times for the same whiteboard snapshot.

**Note: The `LatestMarksOnly` mode takes effect only when the `addSnapshotMark` API is called by using Tencent Interactive Whiteboard SDK v2.6.8 or later. Otherwise, even if this parameter is set to `LatestMarksOnly`, the default `AllMarks` mode is used.**
    */
    @SerializedName("SnapshotMode")
    @Expose
    private String SnapshotMode;

    /**
     * Get Whiteboard parameters. 
     * @return Whiteboard Whiteboard parameters.
     */
    public SnapshotWhiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set Whiteboard parameters.
     * @param Whiteboard Whiteboard parameters.
     */
    public void setWhiteboard(SnapshotWhiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get `SdkAppId` of the whiteboard application. 
     * @return SdkAppId `SdkAppId` of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set `SdkAppId` of the whiteboard application.
     * @param SdkAppId `SdkAppId` of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Whiteboard room ID. 
     * @return RoomId Whiteboard room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Whiteboard room ID.
     * @param RoomId Whiteboard room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Callback URL to which the whiteboard snapshot result is to be sent. 
     * @return CallbackURL Callback URL to which the whiteboard snapshot result is to be sent.
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set Callback URL to which the whiteboard snapshot result is to be sent.
     * @param CallbackURL Callback URL to which the whiteboard snapshot result is to be sent.
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    /**
     * Get `COS` bucket in which the generated whiteboard snapshot file is to be stored. If you leave this parameter empty, the generated file will be stored in the public bucket and retained for only three days. 
     * @return COS `COS` bucket in which the generated whiteboard snapshot file is to be stored. If you leave this parameter empty, the generated file will be stored in the public bucket and retained for only three days.
     */
    public SnapshotCOS getCOS() {
        return this.COS;
    }

    /**
     * Set `COS` bucket in which the generated whiteboard snapshot file is to be stored. If you leave this parameter empty, the generated file will be stored in the public bucket and retained for only three days.
     * @param COS `COS` bucket in which the generated whiteboard snapshot file is to be stored. If you leave this parameter empty, the generated file will be stored in the public bucket and retained for only three days.
     */
    public void setCOS(SnapshotCOS COS) {
        this.COS = COS;
    }

    /**
     * Get Whiteboard snapshot mode. Default value: `AllMarks`. Valid values:

`AllMarks`: Full mode. In this mode, a snapshot image is generated based on each whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client.

`LatestMarksOnly`: Single-page deduplication mode. In this mode, a snapshot image is generated based only on the latest whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client if the API is called multiple times for the same whiteboard snapshot.

**Note: The `LatestMarksOnly` mode takes effect only when the `addSnapshotMark` API is called by using Tencent Interactive Whiteboard SDK v2.6.8 or later. Otherwise, even if this parameter is set to `LatestMarksOnly`, the default `AllMarks` mode is used.** 
     * @return SnapshotMode Whiteboard snapshot mode. Default value: `AllMarks`. Valid values:

`AllMarks`: Full mode. In this mode, a snapshot image is generated based on each whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client.

`LatestMarksOnly`: Single-page deduplication mode. In this mode, a snapshot image is generated based only on the latest whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client if the API is called multiple times for the same whiteboard snapshot.

**Note: The `LatestMarksOnly` mode takes effect only when the `addSnapshotMark` API is called by using Tencent Interactive Whiteboard SDK v2.6.8 or later. Otherwise, even if this parameter is set to `LatestMarksOnly`, the default `AllMarks` mode is used.**
     */
    public String getSnapshotMode() {
        return this.SnapshotMode;
    }

    /**
     * Set Whiteboard snapshot mode. Default value: `AllMarks`. Valid values:

`AllMarks`: Full mode. In this mode, a snapshot image is generated based on each whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client.

`LatestMarksOnly`: Single-page deduplication mode. In this mode, a snapshot image is generated based only on the latest whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client if the API is called multiple times for the same whiteboard snapshot.

**Note: The `LatestMarksOnly` mode takes effect only when the `addSnapshotMark` API is called by using Tencent Interactive Whiteboard SDK v2.6.8 or later. Otherwise, even if this parameter is set to `LatestMarksOnly`, the default `AllMarks` mode is used.**
     * @param SnapshotMode Whiteboard snapshot mode. Default value: `AllMarks`. Valid values:

`AllMarks`: Full mode. In this mode, a snapshot image is generated based on each whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client.

`LatestMarksOnly`: Single-page deduplication mode. In this mode, a snapshot image is generated based only on the latest whiteboard snapshot mark that is added by calling the `addSnapshotMark` API on the client if the API is called multiple times for the same whiteboard snapshot.

**Note: The `LatestMarksOnly` mode takes effect only when the `addSnapshotMark` API is called by using Tencent Interactive Whiteboard SDK v2.6.8 or later. Otherwise, even if this parameter is set to `LatestMarksOnly`, the default `AllMarks` mode is used.**
     */
    public void setSnapshotMode(String SnapshotMode) {
        this.SnapshotMode = SnapshotMode;
    }

    public CreateSnapshotTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotTaskRequest(CreateSnapshotTaskRequest source) {
        if (source.Whiteboard != null) {
            this.Whiteboard = new SnapshotWhiteboard(source.Whiteboard);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
        if (source.COS != null) {
            this.COS = new SnapshotCOS(source.COS);
        }
        if (source.SnapshotMode != null) {
            this.SnapshotMode = new String(source.SnapshotMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);
        this.setParamObj(map, prefix + "COS.", this.COS);
        this.setParamSimple(map, prefix + "SnapshotMode", this.SnapshotMode);

    }
}

