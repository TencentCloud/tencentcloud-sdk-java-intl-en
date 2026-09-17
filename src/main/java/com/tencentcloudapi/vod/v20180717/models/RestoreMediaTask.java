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
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("OriginalStorageClass")
    @Expose
    private String OriginalStorageClass;

    /**
    * 
    */
    @SerializedName("TargetStorageClass")
    @Expose
    private String TargetStorageClass;

    /**
    * 
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
    * 
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

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
     * @return OriginalStorageClass 
     */
    public String getOriginalStorageClass() {
        return this.OriginalStorageClass;
    }

    /**
     * Set 
     * @param OriginalStorageClass 
     */
    public void setOriginalStorageClass(String OriginalStorageClass) {
        this.OriginalStorageClass = OriginalStorageClass;
    }

    /**
     * Get  
     * @return TargetStorageClass 
     */
    public String getTargetStorageClass() {
        return this.TargetStorageClass;
    }

    /**
     * Set 
     * @param TargetStorageClass 
     */
    public void setTargetStorageClass(String TargetStorageClass) {
        this.TargetStorageClass = TargetStorageClass;
    }

    /**
     * Get  
     * @return RestoreTier 
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set 
     * @param RestoreTier 
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    /**
     * Get  
     * @return RestoreDay 
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set 
     * @param RestoreDay 
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get  
     * @return Status 
     * @deprecated
     */
    @Deprecated
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     * @deprecated
     */
    @Deprecated
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Message 
     * @deprecated
     */
    @Deprecated
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 
     * @param Message 
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

