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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFile extends AbstractModel {

    /**
    * Audit log file name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Creation time of the audit log file, in the format: "2019-03-20 17:09:13".
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * File status value. May return the following values:
"creating" - generating
"Failed" - Creation failed.
"success" - generated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * File size in KB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Download URL for the audit log.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * Error message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Download progress
    */
    @SerializedName("ProgressRate")
    @Expose
    private Long ProgressRate;

    /**
     * Get Audit log file name. 
     * @return FileName Audit log file name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Audit log file name.
     * @param FileName Audit log file name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Creation time of the audit log file, in the format: "2019-03-20 17:09:13". 
     * @return CreateTime Creation time of the audit log file, in the format: "2019-03-20 17:09:13".
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the audit log file, in the format: "2019-03-20 17:09:13".
     * @param CreateTime Creation time of the audit log file, in the format: "2019-03-20 17:09:13".
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get File status value. May return the following values:
"creating" - generating
"Failed" - Creation failed.
"success" - generated. 
     * @return Status File status value. May return the following values:
"creating" - generating
"Failed" - Creation failed.
"success" - generated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set File status value. May return the following values:
"creating" - generating
"Failed" - Creation failed.
"success" - generated.
     * @param Status File status value. May return the following values:
"creating" - generating
"Failed" - Creation failed.
"success" - generated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get File size in KB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileSize File size in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileSize File size in KB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Download URL for the audit log.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DownloadUrl Download URL for the audit log.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Download URL for the audit log.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DownloadUrl Download URL for the audit log.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Error message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrMsg Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrMsg Error message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Download progress 
     * @return ProgressRate Download progress
     */
    public Long getProgressRate() {
        return this.ProgressRate;
    }

    /**
     * Set Download progress
     * @param ProgressRate Download progress
     */
    public void setProgressRate(Long ProgressRate) {
        this.ProgressRate = ProgressRate;
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ProgressRate != null) {
            this.ProgressRate = new Long(source.ProgressRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ProgressRate", this.ProgressRate);

    }
}

