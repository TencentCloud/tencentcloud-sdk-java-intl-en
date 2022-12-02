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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncJobInfo extends AbstractModel{

    /**
    * Sync task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Sync task name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Running mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * Expected execution time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * All supported operations
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllActions")
    @Expose
    private String [] AllActions;

    /**
    * Operations that can be performed under the current status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Actions")
    @Expose
    private String [] Actions;

    /**
    * Sync options
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Options")
    @Expose
    private Options Options;

    /**
    * Sync database/table objects
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Objects")
    @Expose
    private Objects Objects;

    /**
    * Task specification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Source database region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * Source database type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source database access type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source database information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcInfo")
    @Expose
    private Endpoint SrcInfo;

    /**
    * Target database region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * Target database type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Target database access type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Target database information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstInfo")
    @Expose
    private Endpoint DstInfo;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Step information of the sync task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Detail")
    @Expose
    private SyncDetailInfo Detail;

    /**
     * Get Sync task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Sync task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Sync task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Sync task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Sync task name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobName Sync task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Sync task name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobName Sync task name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Billing mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Running mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunMode Running mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set Running mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunMode Running mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get Expected execution time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpectRunTime Expected execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set Expected execution time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpectRunTime Expected execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get All supported operations
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllActions All supported operations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllActions() {
        return this.AllActions;
    }

    /**
     * Set All supported operations
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllActions All supported operations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllActions(String [] AllActions) {
        this.AllActions = AllActions;
    }

    /**
     * Get Operations that can be performed under the current status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Actions Operations that can be performed under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getActions() {
        return this.Actions;
    }

    /**
     * Set Operations that can be performed under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Actions Operations that can be performed under the current status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActions(String [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Sync options
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Options Sync options
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Options getOptions() {
        return this.Options;
    }

    /**
     * Set Sync options
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Options Sync options
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOptions(Options Options) {
        this.Options = Options;
    }

    /**
     * Get Sync database/table objects
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Objects Sync database/table objects
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Objects getObjects() {
        return this.Objects;
    }

    /**
     * Set Sync database/table objects
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Objects Sync database/table objects
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjects(Objects Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Task specification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Specification Task specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Task specification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Specification Task specification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Source database region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcRegion Source database region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set Source database region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcRegion Source database region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get Source database type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcDatabaseType Source database type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source database type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcDatabaseType Source database type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source database access type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcAccessType Source database access type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source database access type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcAccessType Source database access type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source database information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcInfo Source database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Endpoint getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source database information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcInfo Source database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcInfo(Endpoint SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target database region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstRegion Target database region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set Target database region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstRegion Target database region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get Target database type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstDatabaseType Target database type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target database type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstDatabaseType Target database type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target database access type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstAccessType Target database access type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target database access type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstAccessType Target database access type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Target database information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstInfo Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Endpoint getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstInfo Target database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstInfo(Endpoint DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Step information of the sync task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Detail Step information of the sync task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set Step information of the sync task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Detail Step information of the sync task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    public SyncJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncJobInfo(SyncJobInfo source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.AllActions != null) {
            this.AllActions = new String[source.AllActions.length];
            for (int i = 0; i < source.AllActions.length; i++) {
                this.AllActions[i] = new String(source.AllActions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new String[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new String(source.Actions[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new Options(source.Options);
        }
        if (source.Objects != null) {
            this.Objects = new Objects(source.Objects);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new Endpoint(source.SrcInfo);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new Endpoint(source.DstInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Detail != null) {
            this.Detail = new SyncDetailInfo(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamArraySimple(map, prefix + "AllActions.", this.AllActions);
        this.setParamArraySimple(map, prefix + "Actions.", this.Actions);
        this.setParamObj(map, prefix + "Options.", this.Options);
        this.setParamObj(map, prefix + "Objects.", this.Objects);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Detail.", this.Detail);

    }
}

