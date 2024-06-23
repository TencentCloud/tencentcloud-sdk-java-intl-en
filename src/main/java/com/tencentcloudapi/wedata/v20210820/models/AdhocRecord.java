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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdhocRecord extends AbstractModel {

    /**
    * Task Submission Record ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Script ContentNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Task Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task StatusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Task Submission Record ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Task Submission Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Task Submission Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Task Submission Record ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Script ContentNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ScriptContent Script ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script ContentNote: This field may return null, indicating that no valid value can be obtained.
     * @param ScriptContent Script ContentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Task Submission Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Task Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Task Submission Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task StatusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status Task StatusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public AdhocRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdhocRecord(AdhocRecord source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

