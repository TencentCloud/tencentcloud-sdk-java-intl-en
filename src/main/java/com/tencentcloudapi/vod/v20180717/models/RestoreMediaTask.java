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
    * File ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Original storage class
    */
    @SerializedName("OriginalStorageClass")
    @Expose
    private String OriginalStorageClass;

    /**
    * Target storage class. For temporary retrieval, the target storage class is the same as the original.
    */
    @SerializedName("TargetStorageClass")
    @Expose
    private String TargetStorageClass;

    /**
    * Retrieval mode. Valid values:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
    * Validity period (days) for a temporary copy. `0` indicates permanent retrieval.
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * This field has been disused.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * This field has been disused.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get File ID 
     * @return FileId File ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID
     * @param FileId File ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Original storage class 
     * @return OriginalStorageClass Original storage class
     */
    public String getOriginalStorageClass() {
        return this.OriginalStorageClass;
    }

    /**
     * Set Original storage class
     * @param OriginalStorageClass Original storage class
     */
    public void setOriginalStorageClass(String OriginalStorageClass) {
        this.OriginalStorageClass = OriginalStorageClass;
    }

    /**
     * Get Target storage class. For temporary retrieval, the target storage class is the same as the original. 
     * @return TargetStorageClass Target storage class. For temporary retrieval, the target storage class is the same as the original.
     */
    public String getTargetStorageClass() {
        return this.TargetStorageClass;
    }

    /**
     * Set Target storage class. For temporary retrieval, the target storage class is the same as the original.
     * @param TargetStorageClass Target storage class. For temporary retrieval, the target storage class is the same as the original.
     */
    public void setTargetStorageClass(String TargetStorageClass) {
        this.TargetStorageClass = TargetStorageClass;
    }

    /**
     * Get Retrieval mode. Valid values:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li> 
     * @return RestoreTier Retrieval mode. Valid values:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set Retrieval mode. Valid values:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
     * @param RestoreTier Retrieval mode. Valid values:
<li>Expedited</li>
<li>Standard</li>
<li>Bulk</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    /**
     * Get Validity period (days) for a temporary copy. `0` indicates permanent retrieval. 
     * @return RestoreDay Validity period (days) for a temporary copy. `0` indicates permanent retrieval.
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set Validity period (days) for a temporary copy. `0` indicates permanent retrieval.
     * @param RestoreDay Validity period (days) for a temporary copy. `0` indicates permanent retrieval.
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get This field has been disused. 
     * @return Status This field has been disused.
     * @deprecated
     */
    @Deprecated
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set This field has been disused.
     * @param Status This field has been disused.
     * @deprecated
     */
    @Deprecated
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get This field has been disused. 
     * @return Message This field has been disused.
     * @deprecated
     */
    @Deprecated
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set This field has been disused.
     * @param Message This field has been disused.
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

