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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreTask extends AbstractModel{

    /**
    * Restoration task ID
    */
    @SerializedName("RestoreTaskId")
    @Expose
    private Long RestoreTaskId;

    /**
    * Restoration task file path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Restoration task type (1: standard; 2: expedited; 3: bulk)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Validity period (in days) of the temporary copy generated during restoration
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * Restoration task status (1: binding file; 2: file binding completed; 3: restoring file; 4: file restoration completed)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Restoration task ID 
     * @return RestoreTaskId Restoration task ID
     */
    public Long getRestoreTaskId() {
        return this.RestoreTaskId;
    }

    /**
     * Set Restoration task ID
     * @param RestoreTaskId Restoration task ID
     */
    public void setRestoreTaskId(Long RestoreTaskId) {
        this.RestoreTaskId = RestoreTaskId;
    }

    /**
     * Get Restoration task file path 
     * @return FilePath Restoration task file path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Restoration task file path
     * @param FilePath Restoration task file path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Restoration task type (1: standard; 2: expedited; 3: bulk) 
     * @return Type Restoration task type (1: standard; 2: expedited; 3: bulk)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Restoration task type (1: standard; 2: expedited; 3: bulk)
     * @param Type Restoration task type (1: standard; 2: expedited; 3: bulk)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Validity period (in days) of the temporary copy generated during restoration 
     * @return Days Validity period (in days) of the temporary copy generated during restoration
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set Validity period (in days) of the temporary copy generated during restoration
     * @param Days Validity period (in days) of the temporary copy generated during restoration
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get Restoration task status (1: binding file; 2: file binding completed; 3: restoring file; 4: file restoration completed) 
     * @return Status Restoration task status (1: binding file; 2: file binding completed; 3: restoring file; 4: file restoration completed)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Restoration task status (1: binding file; 2: file binding completed; 3: restoring file; 4: file restoration completed)
     * @param Status Restoration task status (1: binding file; 2: file binding completed; 3: restoring file; 4: file restoration completed)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.RestoreTaskId != null) {
            this.RestoreTaskId = new Long(source.RestoreTaskId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestoreTaskId", this.RestoreTaskId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

