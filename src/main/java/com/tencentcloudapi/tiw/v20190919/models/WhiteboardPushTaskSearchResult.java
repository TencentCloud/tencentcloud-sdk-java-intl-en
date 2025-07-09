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

public class WhiteboardPushTaskSearchResult extends AbstractModel {

    /**
    * Unique task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Status of the whiteboard push task.
- PREPARED: Push in preparation.
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Room ID of the whiteboard push task.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Creation time of the task.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Whiteboard push result.
    */
    @SerializedName("Result")
    @Expose
    private WhiteboardPushResult Result;

    /**
    * User ID of the whiteboard push task.
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
     * Get Unique task ID. 
     * @return TaskId Unique task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique task ID.
     * @param TaskId Unique task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Status of the whiteboard push task.
- PREPARED: Push in preparation.
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped. 
     * @return Status Status of the whiteboard push task.
- PREPARED: Push in preparation.
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the whiteboard push task.
- PREPARED: Push in preparation.
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     * @param Status Status of the whiteboard push task.
- PREPARED: Push in preparation.
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Room ID of the whiteboard push task. 
     * @return RoomId Room ID of the whiteboard push task.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID of the whiteboard push task.
     * @param RoomId Room ID of the whiteboard push task.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Creation time of the task. 
     * @return CreateTime Creation time of the task.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the task.
     * @param CreateTime Creation time of the task.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

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
     * Get Whiteboard push result. 
     * @return Result Whiteboard push result.
     */
    public WhiteboardPushResult getResult() {
        return this.Result;
    }

    /**
     * Set Whiteboard push result.
     * @param Result Whiteboard push result.
     */
    public void setResult(WhiteboardPushResult Result) {
        this.Result = Result;
    }

    /**
     * Get User ID of the whiteboard push task. 
     * @return PushUserId User ID of the whiteboard push task.
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set User ID of the whiteboard push task.
     * @param PushUserId User ID of the whiteboard push task.
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    public WhiteboardPushTaskSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardPushTaskSearchResult(WhiteboardPushTaskSearchResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Result != null) {
            this.Result = new WhiteboardPushResult(source.Result);
        }
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);

    }
}

