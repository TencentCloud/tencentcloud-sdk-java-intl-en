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

public class RestoreMediaTask extends AbstractModel {

    /**
    * File ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Original storage type of the file.
    */
    @SerializedName("OriginalStorageClass")
    @Expose
    private String OriginalStorageClass;

    /**
    * Target storage type of the file. For temporary retrieval, the target storage class is the same as the original storage class.
    */
    @SerializedName("TargetStorageClass")
    @Expose
    private String TargetStorageClass;

    /**
    * Retrieval mode. Valid values:
<li>Expedited: speed mode</li>
<li>Standard: standard mode</li>
<li>Bulk: batch mode</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
    * Temporary retrieval replica validity period in days. For permanent retrieval, the value is 0.
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * Deprecated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Deprecated.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get File ID. 
     * @return FileId File ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID.
     * @param FileId File ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Original storage type of the file. 
     * @return OriginalStorageClass Original storage type of the file.
     */
    public String getOriginalStorageClass() {
        return this.OriginalStorageClass;
    }

    /**
     * Set Original storage type of the file.
     * @param OriginalStorageClass Original storage type of the file.
     */
    public void setOriginalStorageClass(String OriginalStorageClass) {
        this.OriginalStorageClass = OriginalStorageClass;
    }

    /**
     * Get Target storage type of the file. For temporary retrieval, the target storage class is the same as the original storage class. 
     * @return TargetStorageClass Target storage type of the file. For temporary retrieval, the target storage class is the same as the original storage class.
     */
    public String getTargetStorageClass() {
        return this.TargetStorageClass;
    }

    /**
     * Set Target storage type of the file. For temporary retrieval, the target storage class is the same as the original storage class.
     * @param TargetStorageClass Target storage type of the file. For temporary retrieval, the target storage class is the same as the original storage class.
     */
    public void setTargetStorageClass(String TargetStorageClass) {
        this.TargetStorageClass = TargetStorageClass;
    }

    /**
     * Get Retrieval mode. Valid values:
<li>Expedited: speed mode</li>
<li>Standard: standard mode</li>
<li>Bulk: batch mode</li> 
     * @return RestoreTier Retrieval mode. Valid values:
<li>Expedited: speed mode</li>
<li>Standard: standard mode</li>
<li>Bulk: batch mode</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set Retrieval mode. Valid values:
<li>Expedited: speed mode</li>
<li>Standard: standard mode</li>
<li>Bulk: batch mode</li>
     * @param RestoreTier Retrieval mode. Valid values:
<li>Expedited: speed mode</li>
<li>Standard: standard mode</li>
<li>Bulk: batch mode</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    /**
     * Get Temporary retrieval replica validity period in days. For permanent retrieval, the value is 0. 
     * @return RestoreDay Temporary retrieval replica validity period in days. For permanent retrieval, the value is 0.
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set Temporary retrieval replica validity period in days. For permanent retrieval, the value is 0.
     * @param RestoreDay Temporary retrieval replica validity period in days. For permanent retrieval, the value is 0.
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get Deprecated. 
     * @return Status Deprecated.
     * @deprecated
     */
    @Deprecated
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Deprecated.
     * @param Status Deprecated.
     * @deprecated
     */
    @Deprecated
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Deprecated. 
     * @return Message Deprecated.
     * @deprecated
     */
    @Deprecated
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Deprecated.
     * @param Message Deprecated.
     * @deprecated
     */
    @Deprecated
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public RestoreMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreMediaTask(RestoreMediaTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.OriginalStorageClass != null) {
            this.OriginalStorageClass = new String(source.OriginalStorageClass);
        }
        if (source.TargetStorageClass != null) {
            this.TargetStorageClass = new String(source.TargetStorageClass);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
        if (source.RestoreDay != null) {
            this.RestoreDay = new Long(source.RestoreDay);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "OriginalStorageClass", this.OriginalStorageClass);
        this.setParamSimple(map, prefix + "TargetStorageClass", this.TargetStorageClass);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);
        this.setParamSimple(map, prefix + "RestoreDay", this.RestoreDay);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

