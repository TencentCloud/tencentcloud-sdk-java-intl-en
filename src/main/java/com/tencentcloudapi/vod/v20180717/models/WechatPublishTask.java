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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WechatPublishTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values:
WAITING: waiting.
PROCESSING: Processing;
FINISH: completed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code.
<li>0: success;</li>
<li>Other value: unsuccessful.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Video file ID for publishing.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Template ID for publishing on WeChat.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Transcoding template ID of the published video. 0 represents the original video.
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * WeChat publishing status. Valid values:
<li>FAIL: Failed;</li>
<li>SUCCESS: successful;</li>
<li>AUDITNOTPASS: failed to pass moderation;</li>
<li>NOTTRIGGERED: Publishing on WeChat has not been initiated.</li>
    */
    @SerializedName("WechatStatus")
    @Expose
    private String WechatStatus;

    /**
    * WeChat Vid.
    */
    @SerializedName("WechatVid")
    @Expose
    private String WechatVid;

    /**
    * WeChat address.
    */
    @SerializedName("WechatUrl")
    @Expose
    private String WechatUrl;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. Valid values:
WAITING: waiting.
PROCESSING: Processing;
FINISH: completed. 
     * @return Status Task status. Valid values:
WAITING: waiting.
PROCESSING: Processing;
FINISH: completed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values:
WAITING: waiting.
PROCESSING: Processing;
FINISH: completed.
     * @param Status Task status. Valid values:
WAITING: waiting.
PROCESSING: Processing;
FINISH: completed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code.
<li>0: success;</li>
<li>Other value: unsuccessful.</li> 
     * @return ErrCode Error code.
<li>0: success;</li>
<li>Other value: unsuccessful.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code.
<li>0: success;</li>
<li>Other value: unsuccessful.</li>
     * @param ErrCode Error code.
<li>0: success;</li>
<li>Other value: unsuccessful.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Video file ID for publishing. 
     * @return FileId Video file ID for publishing.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Video file ID for publishing.
     * @param FileId Video file ID for publishing.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Template ID for publishing on WeChat. 
     * @return Definition Template ID for publishing on WeChat.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Template ID for publishing on WeChat.
     * @param Definition Template ID for publishing on WeChat.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Transcoding template ID of the published video. 0 represents the original video. 
     * @return SourceDefinition Transcoding template ID of the published video. 0 represents the original video.
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * Set Transcoding template ID of the published video. 0 represents the original video.
     * @param SourceDefinition Transcoding template ID of the published video. 0 represents the original video.
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * Get WeChat publishing status. Valid values:
<li>FAIL: Failed;</li>
<li>SUCCESS: successful;</li>
<li>AUDITNOTPASS: failed to pass moderation;</li>
<li>NOTTRIGGERED: Publishing on WeChat has not been initiated.</li> 
     * @return WechatStatus WeChat publishing status. Valid values:
<li>FAIL: Failed;</li>
<li>SUCCESS: successful;</li>
<li>AUDITNOTPASS: failed to pass moderation;</li>
<li>NOTTRIGGERED: Publishing on WeChat has not been initiated.</li>
     */
    public String getWechatStatus() {
        return this.WechatStatus;
    }

    /**
     * Set WeChat publishing status. Valid values:
<li>FAIL: Failed;</li>
<li>SUCCESS: successful;</li>
<li>AUDITNOTPASS: failed to pass moderation;</li>
<li>NOTTRIGGERED: Publishing on WeChat has not been initiated.</li>
     * @param WechatStatus WeChat publishing status. Valid values:
<li>FAIL: Failed;</li>
<li>SUCCESS: successful;</li>
<li>AUDITNOTPASS: failed to pass moderation;</li>
<li>NOTTRIGGERED: Publishing on WeChat has not been initiated.</li>
     */
    public void setWechatStatus(String WechatStatus) {
        this.WechatStatus = WechatStatus;
    }

    /**
     * Get WeChat Vid. 
     * @return WechatVid WeChat Vid.
     */
    public String getWechatVid() {
        return this.WechatVid;
    }

    /**
     * Set WeChat Vid.
     * @param WechatVid WeChat Vid.
     */
    public void setWechatVid(String WechatVid) {
        this.WechatVid = WechatVid;
    }

    /**
     * Get WeChat address. 
     * @return WechatUrl WeChat address.
     */
    public String getWechatUrl() {
        return this.WechatUrl;
    }

    /**
     * Set WeChat address.
     * @param WechatUrl WeChat address.
     */
    public void setWechatUrl(String WechatUrl) {
        this.WechatUrl = WechatUrl;
    }

    public WechatPublishTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatPublishTask(WechatPublishTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SourceDefinition != null) {
            this.SourceDefinition = new Long(source.SourceDefinition);
        }
        if (source.WechatStatus != null) {
            this.WechatStatus = new String(source.WechatStatus);
        }
        if (source.WechatVid != null) {
            this.WechatVid = new String(source.WechatVid);
        }
        if (source.WechatUrl != null) {
            this.WechatUrl = new String(source.WechatUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SourceDefinition", this.SourceDefinition);
        this.setParamSimple(map, prefix + "WechatStatus", this.WechatStatus);
        this.setParamSimple(map, prefix + "WechatVid", this.WechatVid);
        this.setParamSimple(map, prefix + "WechatUrl", this.WechatUrl);

    }
}

