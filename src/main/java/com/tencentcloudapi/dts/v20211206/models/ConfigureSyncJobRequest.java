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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureSyncJobRequest extends AbstractModel {

    /**
    * Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet). Note that the valid values are subject to the current link.
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `ckafka` (CKafka instance). Note that the valid values are subject to the current link.
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Information of synced database/table objects
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * Sync task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Enumerated values: `liteMode`: Lite mode; `fullMode`: Standard mode
    */
    @SerializedName("JobMode")
    @Expose
    private String JobMode;

    /**
    * Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * Source database information. This parameter only applies to single-node databases, and `SrcNodeType` must be `single`.
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * Source database information. This parameter is valid for multi-node databases, and the value of `SrcNodeType` must be `cluster`.
    */
    @SerializedName("SrcInfos")
    @Expose
    private SyncDBEndpointInfos SrcInfos;

    /**
    * Enumerated values: `single` (for single-node source database), `cluster` (for multi-node source database).
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * Target database information. This parameter is used by single-node databases.
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * Target database information. This parameter is valid for multi-node databases, and the value of `DstNodeType` must be `cluster`.
    */
    @SerializedName("DstInfos")
    @Expose
    private SyncDBEndpointInfos DstInfos;

    /**
    * Enumerated values: `single` (for single-node target database), `cluster` (for multi-node target database).
    */
    @SerializedName("DstNodeType")
    @Expose
    private String DstNodeType;

    /**
    * Sync task options. The `RateLimitOption` option cannot take effect currently. To modify the speed limit settings, use the `ModifySyncRateLimit` API.
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * Automatic retry time, which can be set to 5-720 minutes. 0 indicates that retry is disabled.
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
     * Get Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task. 
     * @return JobId Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     * @param JobId Sync task instance ID in the format of `sync-werwfs23`, which is used to identify a sync task.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet). Note that the valid values are subject to the current link. 
     * @return SrcAccessType Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet). Note that the valid values are subject to the current link.
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet). Note that the valid values are subject to the current link.
     * @param SrcAccessType Source database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet). Note that the valid values are subject to the current link.
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `ckafka` (CKafka instance). Note that the valid values are subject to the current link. 
     * @return DstAccessType Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `ckafka` (CKafka instance). Note that the valid values are subject to the current link.
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `ckafka` (CKafka instance). Note that the valid values are subject to the current link.
     * @param DstAccessType Target database access type. Valid values: `cdb` (database); `cvm` (self-build on CVM); `vpc` (VPC); `extranet` (public network); `vpncloud` (VPN access); `dcg` (Direct Connect); `ccn` (CCN); `intranet` (intranet); `ckafka` (CKafka instance). Note that the valid values are subject to the current link.
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Information of synced database/table objects 
     * @return Objects Information of synced database/table objects
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set Information of synced database/table objects
     * @param Objects Information of synced database/table objects
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Sync task name 
     * @return JobName Sync task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Sync task name
     * @param JobName Sync task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Enumerated values: `liteMode`: Lite mode; `fullMode`: Standard mode 
     * @return JobMode Enumerated values: `liteMode`: Lite mode; `fullMode`: Standard mode
     */
    public String getJobMode() {
        return this.JobMode;
    }

    /**
     * Set Enumerated values: `liteMode`: Lite mode; `fullMode`: Standard mode
     * @param JobMode Enumerated values: `liteMode`: Lite mode; `fullMode`: Standard mode
     */
    public void setJobMode(String JobMode) {
        this.JobMode = JobMode;
    }

    /**
     * Get Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`. 
     * @return RunMode Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     * @param RunMode Running mode. Valid values: `Immediate`, `Timed`. Default value: `Immediate`.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`. 
     * @return ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     * @param ExpectRunTime Expected start time in the format of "2006-01-02 15:04:05", which is required if `RunMode` is `Timed`.
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get Source database information. This parameter only applies to single-node databases, and `SrcNodeType` must be `single`. 
     * @return SrcInfo Source database information. This parameter only applies to single-node databases, and `SrcNodeType` must be `single`.
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source database information. This parameter only applies to single-node databases, and `SrcNodeType` must be `single`.
     * @param SrcInfo Source database information. This parameter only applies to single-node databases, and `SrcNodeType` must be `single`.
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Source database information. This parameter is valid for multi-node databases, and the value of `SrcNodeType` must be `cluster`. 
     * @return SrcInfos Source database information. This parameter is valid for multi-node databases, and the value of `SrcNodeType` must be `cluster`.
     */
    public SyncDBEndpointInfos getSrcInfos() {
        return this.SrcInfos;
    }

    /**
     * Set Source database information. This parameter is valid for multi-node databases, and the value of `SrcNodeType` must be `cluster`.
     * @param SrcInfos Source database information. This parameter is valid for multi-node databases, and the value of `SrcNodeType` must be `cluster`.
     */
    public void setSrcInfos(SyncDBEndpointInfos SrcInfos) {
        this.SrcInfos = SrcInfos;
    }

    /**
     * Get Enumerated values: `single` (for single-node source database), `cluster` (for multi-node source database). 
     * @return SrcNodeType Enumerated values: `single` (for single-node source database), `cluster` (for multi-node source database).
     */
    public String getSrcNodeType() {
        return this.SrcNodeType;
    }

    /**
     * Set Enumerated values: `single` (for single-node source database), `cluster` (for multi-node source database).
     * @param SrcNodeType Enumerated values: `single` (for single-node source database), `cluster` (for multi-node source database).
     */
    public void setSrcNodeType(String SrcNodeType) {
        this.SrcNodeType = SrcNodeType;
    }

    /**
     * Get Target database information. This parameter is used by single-node databases. 
     * @return DstInfo Target database information. This parameter is used by single-node databases.
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target database information. This parameter is used by single-node databases.
     * @param DstInfo Target database information. This parameter is used by single-node databases.
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Target database information. This parameter is valid for multi-node databases, and the value of `DstNodeType` must be `cluster`. 
     * @return DstInfos Target database information. This parameter is valid for multi-node databases, and the value of `DstNodeType` must be `cluster`.
     */
    public SyncDBEndpointInfos getDstInfos() {
        return this.DstInfos;
    }

    /**
     * Set Target database information. This parameter is valid for multi-node databases, and the value of `DstNodeType` must be `cluster`.
     * @param DstInfos Target database information. This parameter is valid for multi-node databases, and the value of `DstNodeType` must be `cluster`.
     */
    public void setDstInfos(SyncDBEndpointInfos DstInfos) {
        this.DstInfos = DstInfos;
    }

    /**
     * Get Enumerated values: `single` (for single-node target database), `cluster` (for multi-node target database). 
     * @return DstNodeType Enumerated values: `single` (for single-node target database), `cluster` (for multi-node target database).
     */
    public String getDstNodeType() {
        return this.DstNodeType;
    }

    /**
     * Set Enumerated values: `single` (for single-node target database), `cluster` (for multi-node target database).
     * @param DstNodeType Enumerated values: `single` (for single-node target database), `cluster` (for multi-node target database).
     */
    public void setDstNodeType(String DstNodeType) {
        this.DstNodeType = DstNodeType;
    }

    /**
     * Get Sync task options. The `RateLimitOption` option cannot take effect currently. To modify the speed limit settings, use the `ModifySyncRateLimit` API. 
     * @return Options Sync task options. The `RateLimitOption` option cannot take effect currently. To modify the speed limit settings, use the `ModifySyncRateLimit` API.
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set Sync task options. The `RateLimitOption` option cannot take effect currently. To modify the speed limit settings, use the `ModifySyncRateLimit` API.
     * @param Options Sync task options. The `RateLimitOption` option cannot take effect currently. To modify the speed limit settings, use the `ModifySyncRateLimit` API.
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get Automatic retry time, which can be set to 5-720 minutes. 0 indicates that retry is disabled. 
     * @return AutoRetryTimeRangeMinutes Automatic retry time, which can be set to 5-720 minutes. 0 indicates that retry is disabled.
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set Automatic retry time, which can be set to 5-720 minutes. 0 indicates that retry is disabled.
     * @param AutoRetryTimeRangeMinutes Automatic retry time, which can be set to 5-720 minutes. 0 indicates that retry is disabled.
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    public ConfigureSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureSyncJobRequest(ConfigureSyncJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobMode != null) {
            this.JobMode = new String(source.JobMode);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.SrcInfos != null) {
            this.SrcInfos = new SyncDBEndpointInfos(source.SrcInfos);
        }
        if (source.SrcNodeType != null) {
            this.SrcNodeType = new String(source.SrcNodeType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.DstInfos != null) {
            this.DstInfos = new SyncDBEndpointInfos(source.DstInfos);
        }
        if (source.DstNodeType != null) {
            this.DstNodeType = new String(source.DstNodeType);
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobMode", this.JobMode);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "SrcInfos.", this.SrcInfos);
        this.setParamSimple(map, prefix + "SrcNodeType", this.SrcNodeType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "DstInfos.", this.DstInfos);
        this.setParamSimple(map, prefix + "DstNodeType", this.DstNodeType);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);

    }
}

