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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamProcessTask extends AbstractModel {

    /**
    * The media processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0: success; other values: failure.
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
    * Live stream URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get The media processing task ID. 
     * @return TaskId The media processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The media processing task ID.
     * @param TaskId The media processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li> 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     * @param Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0: success; other values: failure. 
     * @return ErrCode Error code. 0: success; other values: failure.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0: success; other values: failure.
     * @param ErrCode Error code. 0: success; other values: failure.
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
     * Get Live stream URL. 
     * @return Url Live stream URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Live stream URL.
     * @param Url Live stream URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public LiveStreamProcessTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamProcessTask(LiveStreamProcessTask source) {
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

