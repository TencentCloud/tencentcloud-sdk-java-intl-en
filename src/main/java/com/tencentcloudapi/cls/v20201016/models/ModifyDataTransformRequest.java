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

public class ModifyDataTransformRequest extends AbstractModel {

    /**
    * Data processing task ID
-Get the data processing task Id by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Processing task name
-Get the name of a data processing task by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).

Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Up to 255 characters
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents:

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * Task status. Valid values: 1 (enabled) and 2 (disabled).
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Destination topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Whether to discard log data after the limit is exceeded
    */
    @SerializedName("BackupGiveUpData")
    @Expose
    private Boolean BackupGiveUpData;

    /**
    * Whether to enable delivery service log. 1 for disabled, 2 for enabled
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * Whether to keep the failure log status. Valid values: 1: no; 2: yes.
    */
    @SerializedName("KeepFailureLog")
    @Expose
    private Long KeepFailureLog;

    /**
    * Field name of a failed log.
    */
    @SerializedName("FailureLogKey")
    @Expose
    private String FailureLogKey;

    /**
    * External data source information
    */
    @SerializedName("DataTransformSqlDataSources")
    @Expose
    private DataTransformSqlDataSource [] DataTransformSqlDataSources;

    /**
    * Set environment variable
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
     * Get Data processing task ID
-Get the data processing task Id by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1). 
     * @return TaskId Data processing task ID
-Get the data processing task Id by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Data processing task ID
-Get the data processing task Id by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).
     * @param TaskId Data processing task ID
-Get the data processing task Id by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Processing task name
-Get the name of a data processing task by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).

Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Up to 255 characters 
     * @return Name Processing task name
-Get the name of a data processing task by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).

Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Up to 255 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Processing task name
-Get the name of a data processing task by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).

Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Up to 255 characters
     * @param Name Processing task name
-Get the name of a data processing task by [searching data processing task list basic information](https://www.tencentcloud.com/document/product/614/72182?from_cn_redirect=1).

Name limit
-Cannot be an empty string
-Cannot contain character '|'
-Up to 255 characters
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents:

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1) 
     * @return EtlContent Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents:

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents:

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     * @param EtlContent Processing statement. When FuncType is 2, EtlContent must use [log_auto_output](https://www.tencentcloud.com/document/product/614/70733?from_cn_redirect=1#b3c58797-4825-4807-bef4-68106e25024f). 

Other reference documents:

-[Create a processing task](https://www.tencentcloud.com/document/product/614/63940?from_cn_redirect=1) 
-[Function overview](https://www.tencentcloud.com/document/product/614/70395?from_cn_redirect=1)
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get Task status. Valid values: 1 (enabled) and 2 (disabled). 
     * @return EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task status. Valid values: 1 (enabled) and 2 (disabled).
     * @param EnableFlag Task status. Valid values: 1 (enabled) and 2 (disabled).
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Destination topic ID and alias of the data processing task 
     * @return DstResources Destination topic ID and alias of the data processing task
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Destination topic ID and alias of the data processing task
     * @param DstResources Destination topic ID and alias of the data processing task
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get Whether to discard log data after the limit is exceeded 
     * @return BackupGiveUpData Whether to discard log data after the limit is exceeded
     */
    public Boolean getBackupGiveUpData() {
        return this.BackupGiveUpData;
    }

    /**
     * Set Whether to discard log data after the limit is exceeded
     * @param BackupGiveUpData Whether to discard log data after the limit is exceeded
     */
    public void setBackupGiveUpData(Boolean BackupGiveUpData) {
        this.BackupGiveUpData = BackupGiveUpData;
    }

    /**
     * Get Whether to enable delivery service log. 1 for disabled, 2 for enabled 
     * @return HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable delivery service log. 1 for disabled, 2 for enabled
     * @param HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get Whether to keep the failure log status. Valid values: 1: no; 2: yes. 
     * @return KeepFailureLog Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     */
    public Long getKeepFailureLog() {
        return this.KeepFailureLog;
    }

    /**
     * Set Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     * @param KeepFailureLog Whether to keep the failure log status. Valid values: 1: no; 2: yes.
     */
    public void setKeepFailureLog(Long KeepFailureLog) {
        this.KeepFailureLog = KeepFailureLog;
    }

    /**
     * Get Field name of a failed log. 
     * @return FailureLogKey Field name of a failed log.
     */
    public String getFailureLogKey() {
        return this.FailureLogKey;
    }

    /**
     * Set Field name of a failed log.
     * @param FailureLogKey Field name of a failed log.
     */
    public void setFailureLogKey(String FailureLogKey) {
        this.FailureLogKey = FailureLogKey;
    }

    /**
     * Get External data source information 
     * @return DataTransformSqlDataSources External data source information
     */
    public DataTransformSqlDataSource [] getDataTransformSqlDataSources() {
        return this.DataTransformSqlDataSources;
    }

    /**
     * Set External data source information
     * @param DataTransformSqlDataSources External data source information
     */
    public void setDataTransformSqlDataSources(DataTransformSqlDataSource [] DataTransformSqlDataSources) {
        this.DataTransformSqlDataSources = DataTransformSqlDataSources;
    }

    /**
     * Get Set environment variable 
     * @return EnvInfos Set environment variable
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set Set environment variable
     * @param EnvInfos Set environment variable
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    public ModifyDataTransformRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataTransformRequest(ModifyDataTransformRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.BackupGiveUpData != null) {
            this.BackupGiveUpData = new Boolean(source.BackupGiveUpData);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.KeepFailureLog != null) {
            this.KeepFailureLog = new Long(source.KeepFailureLog);
        }
        if (source.FailureLogKey != null) {
            this.FailureLogKey = new String(source.FailureLogKey);
        }
        if (source.DataTransformSqlDataSources != null) {
            this.DataTransformSqlDataSources = new DataTransformSqlDataSource[source.DataTransformSqlDataSources.length];
            for (int i = 0; i < source.DataTransformSqlDataSources.length; i++) {
                this.DataTransformSqlDataSources[i] = new DataTransformSqlDataSource(source.DataTransformSqlDataSources[i]);
            }
        }
        if (source.EnvInfos != null) {
            this.EnvInfos = new EnvInfo[source.EnvInfos.length];
            for (int i = 0; i < source.EnvInfos.length; i++) {
                this.EnvInfos[i] = new EnvInfo(source.EnvInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "BackupGiveUpData", this.BackupGiveUpData);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "KeepFailureLog", this.KeepFailureLog);
        this.setParamSimple(map, prefix + "FailureLogKey", this.FailureLogKey);
        this.setParamArrayObj(map, prefix + "DataTransformSqlDataSources.", this.DataTransformSqlDataSources);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);

    }
}

