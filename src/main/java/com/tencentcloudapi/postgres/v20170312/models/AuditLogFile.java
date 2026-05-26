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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFile extends AbstractModel {

    /**
    * <p>File name</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Task status.</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>running: Creating, </li><li>failed: Failure.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>File size</p><p>Unit: MB</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Download link</p>
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * <p>Error message</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>Download progress</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Completion time.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get <p>File name</p> 
     * @return FileName <p>File name</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name</p>
     * @param FileName <p>File name</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Task status.</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>running: Creating, </li><li>failed: Failure.</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>running: Creating, </li><li>failed: Failure.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>running: Creating, </li><li>failed: Failure.</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration values: </p><ul><li>success: Success, </li><li>running: Creating, </li><li>failed: Failure.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>File size</p><p>Unit: MB</p> 
     * @return FileSize <p>File size</p><p>Unit: MB</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size</p><p>Unit: MB</p>
     * @param FileSize <p>File size</p><p>Unit: MB</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Download link</p> 
     * @return DownloadUrl <p>Download link</p>
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set <p>Download link</p>
     * @param DownloadUrl <p>Download link</p>
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get <p>Error message</p> 
     * @return ErrMsg <p>Error message</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error message</p>
     * @param ErrMsg <p>Error message</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>Download progress</p> 
     * @return Progress <p>Download progress</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Download progress</p>
     * @param Progress <p>Download progress</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Completion time.</p> 
     * @return FinishTime <p>Completion time.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Completion time.</p>
     * @param FinishTime <p>Completion time.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AuditLogFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFile(AuditLogFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

