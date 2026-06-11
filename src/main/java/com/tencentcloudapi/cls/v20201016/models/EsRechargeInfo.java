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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsRechargeInfo extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Main account id.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * es index.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Elasticsearch Query Statement.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * es cluster information.
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * es import information.
    */
    @SerializedName("ImportInfo")
    @Expose
    private EsImportInfo ImportInfo;

    /**
    * ES import time configuration message.
    */
    @SerializedName("TimeInfo")
    @Expose
    private EsTimeInfo TimeInfo;

    /**
    * Task status.
1. Running
Suspend
3. Complete
4. Exception
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress 0-100 percentage. 100: means done.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Sub-account id.
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Modify the time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Main account id. 
     * @return Uin Main account id.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Main account id.
     * @param Uin Main account id.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1). 
     * @return TopicId Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     * @param TopicId Log topic ID.
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
- Obtain the log topic Id through [Create Log Topic](https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Configuration name 
     * @return Name Configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Configuration name
     * @param Name Configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get es index. 
     * @return Index es index.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set es index.
     * @param Index es index.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Elasticsearch Query Statement. 
     * @return Query Elasticsearch Query Statement.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Elasticsearch Query Statement.
     * @param Query Elasticsearch Query Statement.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get es cluster information. 
     * @return EsInfo es cluster information.
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es cluster information.
     * @param EsInfo es cluster information.
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get es import information. 
     * @return ImportInfo es import information.
     */
    public EsImportInfo getImportInfo() {
        return this.ImportInfo;
    }

    /**
     * Set es import information.
     * @param ImportInfo es import information.
     */
    public void setImportInfo(EsImportInfo ImportInfo) {
        this.ImportInfo = ImportInfo;
    }

    /**
     * Get ES import time configuration message. 
     * @return TimeInfo ES import time configuration message.
     */
    public EsTimeInfo getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * Set ES import time configuration message.
     * @param TimeInfo ES import time configuration message.
     */
    public void setTimeInfo(EsTimeInfo TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    /**
     * Get Task status.
1. Running
Suspend
3. Complete
4. Exception 
     * @return Status Task status.
1. Running
Suspend
3. Complete
4. Exception
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
1. Running
Suspend
3. Complete
4. Exception
     * @param Status Task status.
1. Running
Suspend
3. Complete
4. Exception
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress 0-100 percentage. 100: means done. 
     * @return Progress Task progress 0-100 percentage. 100: means done.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress 0-100 percentage. 100: means done.
     * @param Progress Task progress 0-100 percentage. 100: means done.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Sub-account id. 
     * @return SubUin Sub-account id.
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account id.
     * @param SubUin Sub-account id.
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modify the time. 
     * @return UpdateTime Modify the time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modify the time.
     * @param UpdateTime Modify the time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether to enable service log shipping. Valid values: 1: disable; 2: enable. 
     * @return HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     * @param HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public EsRechargeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsRechargeInfo(EsRechargeInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new EsInfo(source.EsInfo);
        }
        if (source.ImportInfo != null) {
            this.ImportInfo = new EsImportInfo(source.ImportInfo);
        }
        if (source.TimeInfo != null) {
            this.TimeInfo = new EsTimeInfo(source.TimeInfo);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamObj(map, prefix + "ImportInfo.", this.ImportInfo);
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

