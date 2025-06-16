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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseDoc extends AbstractModel {

    /**
    * File name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status.
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Status description.
    */
    @SerializedName("ActionDesc")
    @Expose
    private String ActionDesc;

    /**
    * Reason for failure.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Document business ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
     * Get File name. 
     * @return FileName File name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name.
     * @param FileName File name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File type. 
     * @return FileType File type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type.
     * @param FileType File type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status. 
     * @return Action Status.
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Status.
     * @param Action Status.
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Status description. 
     * @return ActionDesc Status description.
     */
    public String getActionDesc() {
        return this.ActionDesc;
    }

    /**
     * Set Status description.
     * @param ActionDesc Status description.
     */
    public void setActionDesc(String ActionDesc) {
        this.ActionDesc = ActionDesc;
    }

    /**
     * Get Reason for failure. 
     * @return Message Reason for failure.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Reason for failure.
     * @param Message Reason for failure.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Document business ID. 
     * @return DocBizId Document business ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document business ID.
     * @param DocBizId Document business ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    public ReleaseDoc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseDoc(ReleaseDoc source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDesc != null) {
            this.ActionDesc = new String(source.ActionDesc);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDesc", this.ActionDesc);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);

    }
}

