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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WechatPublishTask extends AbstractModel{

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * ID of published video file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Release on WeChat template ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * ID of the transcoding template corresponding to the published video. 0 represents the source video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * Release on WeChat status. Valid values:
<li>FAIL: failure;</li>
<li>SUCCESS: success;</li>
<li>AUDITNOTPASS: rejected</li>
<li>NOTTRIGGERED: release on WeChat not initiated yet.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatStatus")
    @Expose
    private String WechatStatus;

    /**
    * WeChat `Vid`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatVid")
    @Expose
    private String WechatVid;

    /**
    * WeChat address.
Note: this field may return null, indicating that no valid values can be obtained.
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
WAITING: waiting;
PROCESSING: processing;
FINISH: completed. 
     * @return Status Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     * @param Status Task status. Valid values:
WAITING: waiting;
PROCESSING: processing;
FINISH: completed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrCode Error code
<li>0: success;</li>
<li>Other values: failure.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Message Error message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get ID of published video file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId ID of published video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set ID of published video file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId ID of published video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Release on WeChat template ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Definition Release on WeChat template ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Release on WeChat template ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Definition Release on WeChat template ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get ID of the transcoding template corresponding to the published video. 0 represents the source video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SourceDefinition ID of the transcoding template corresponding to the published video. 0 represents the source video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * Set ID of the transcoding template corresponding to the published video. 0 represents the source video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SourceDefinition ID of the transcoding template corresponding to the published video. 0 represents the source video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * Get Release on WeChat status. Valid values:
<li>FAIL: failure;</li>
<li>SUCCESS: success;</li>
<li>AUDITNOTPASS: rejected</li>
<li>NOTTRIGGERED: release on WeChat not initiated yet.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WechatStatus Release on WeChat status. Valid values:
<li>FAIL: failure;</li>
<li>SUCCESS: success;</li>
<li>AUDITNOTPASS: rejected</li>
<li>NOTTRIGGERED: release on WeChat not initiated yet.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWechatStatus() {
        return this.WechatStatus;
    }

    /**
     * Set Release on WeChat status. Valid values:
<li>FAIL: failure;</li>
<li>SUCCESS: success;</li>
<li>AUDITNOTPASS: rejected</li>
<li>NOTTRIGGERED: release on WeChat not initiated yet.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WechatStatus Release on WeChat status. Valid values:
<li>FAIL: failure;</li>
<li>SUCCESS: success;</li>
<li>AUDITNOTPASS: rejected</li>
<li>NOTTRIGGERED: release on WeChat not initiated yet.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatStatus(String WechatStatus) {
        this.WechatStatus = WechatStatus;
    }

    /**
     * Get WeChat `Vid`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WechatVid WeChat `Vid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWechatVid() {
        return this.WechatVid;
    }

    /**
     * Set WeChat `Vid`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WechatVid WeChat `Vid`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatVid(String WechatVid) {
        this.WechatVid = WechatVid;
    }

    /**
     * Get WeChat address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WechatUrl WeChat address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getWechatUrl() {
        return this.WechatUrl;
    }

    /**
     * Set WeChat address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WechatUrl WeChat address.
Note: this field may return null, indicating that no valid values can be obtained.
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

