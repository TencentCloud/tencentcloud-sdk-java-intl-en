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
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("SourceDefinition")
    @Expose
    private Long SourceDefinition;

    /**
    * 
    */
    @SerializedName("WechatStatus")
    @Expose
    private String WechatStatus;

    /**
    * 
    */
    @SerializedName("WechatVid")
    @Expose
    private String WechatVid;

    /**
    * 
    */
    @SerializedName("WechatUrl")
    @Expose
    private String WechatUrl;

    /**
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ErrCode 
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 
     * @param ErrCode 
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get  
     * @return Message 
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 
     * @param Message 
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return SourceDefinition 
     */
    public Long getSourceDefinition() {
        return this.SourceDefinition;
    }

    /**
     * Set 
     * @param SourceDefinition 
     */
    public void setSourceDefinition(Long SourceDefinition) {
        this.SourceDefinition = SourceDefinition;
    }

    /**
     * Get  
     * @return WechatStatus 
     */
    public String getWechatStatus() {
        return this.WechatStatus;
    }

    /**
     * Set 
     * @param WechatStatus 
     */
    public void setWechatStatus(String WechatStatus) {
        this.WechatStatus = WechatStatus;
    }

    /**
     * Get  
     * @return WechatVid 
     */
    public String getWechatVid() {
        return this.WechatVid;
    }

    /**
     * Set 
     * @param WechatVid 
     */
    public void setWechatVid(String WechatVid) {
        this.WechatVid = WechatVid;
    }

    /**
     * Get  
     * @return WechatUrl 
     */
    public String getWechatUrl() {
        return this.WechatUrl;
    }

    /**
     * Set 
     * @param WechatUrl 
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

