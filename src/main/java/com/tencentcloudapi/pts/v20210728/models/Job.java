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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * Job ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Scenario ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Load configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * Test datasets.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * Job status, values including:
JobUnknown: 0, JobCreated: 1, JobPending: 2, JobPreparing: 3, JobSelectClustering: 4, JobCreateTasking: 5, JobSyncTasking: 6,
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Start time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Maximum VU.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaxVirtualUserCount")
    @Expose
    private Long MaxVirtualUserCount;

    /**
    * Note.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Error rate percentage.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * Job owner.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LoadSources")
    @Expose
    private LoadSource LoadSources;

    /**
    * Job duration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Maximum requests per second.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * Total number of requests.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RequestTotal")
    @Expose
    private Float RequestTotal;

    /**
    * Average requests per second.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * Average response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeAverage")
    @Expose
    private Float ResponseTimeAverage;

    /**
    * 99th percentile response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeP99")
    @Expose
    private Float ResponseTimeP99;

    /**
    * 95th percentile response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeP95")
    @Expose
    private Float ResponseTimeP95;

    /**
    * 90th percentile response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeP90")
    @Expose
    private Float ResponseTimeP90;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Scripts")
    @Expose
    private String [] Scripts;

    /**
    * Maximum response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeMax")
    @Expose
    private Float ResponseTimeMax;

    /**
    * Minimum response time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResponseTimeMin")
    @Expose
    private Float ResponseTimeMin;

    /**
    * Stress machine information.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LoadSourceInfos")
    @Expose
    private LoadSource [] LoadSourceInfos;

    /**
    * Test script information.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * Protocol file information.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * Request file information.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * Extension file information.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * Cron job ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * Scenario type.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Domain binding configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * Whether the job is a debug job.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * Abort reason.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AbortReason")
    @Expose
    private Long AbortReason;

    /**
    * Create Time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Notification event callback.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NotificationHooks")
    @Expose
    private NotificationHook [] NotificationHooks;

    /**
    * Bytes received per second.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NetworkReceiveRate")
    @Expose
    private Float NetworkReceiveRate;

    /**
    * Bytes sent per second.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NetworkSendRate")
    @Expose
    private Float NetworkSendRate;

    /**
    * Job status description.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Project name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Scenario name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * Billing type.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Job VUM usage.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get Job ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobId Job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID.

Note: This field may return null, indicating that no valid value is found.
     * @param JobId Job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Scenario ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScenarioId Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ScenarioId Scenario ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Load configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return Load Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set Load configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param Load Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return Configs Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param Configs Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get Test datasets.

Note: This field may return null, indicating that no valid value is found. 
     * @return Datasets Test datasets.

Note: This field may return null, indicating that no valid value is found.
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set Test datasets.

Note: This field may return null, indicating that no valid value is found.
     * @param Datasets Test datasets.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return Extensions Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param Extensions Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get Job status, values including:
JobUnknown: 0, JobCreated: 1, JobPending: 2, JobPreparing: 3, JobSelectClustering: 4, JobCreateTasking: 5, JobSyncTasking: 6,
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Job status, values including:
JobUnknown: 0, JobCreated: 1, JobPending: 2, JobPreparing: 3, JobSelectClustering: 4, JobCreateTasking: 5, JobSyncTasking: 6,
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Job status, values including:
JobUnknown: 0, JobCreated: 1, JobPending: 2, JobPreparing: 3, JobSelectClustering: 4, JobCreateTasking: 5, JobSyncTasking: 6,
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21

Note: This field may return null, indicating that no valid value is found.
     * @param Status Job status, values including:
JobUnknown: 0, JobCreated: 1, JobPending: 2, JobPreparing: 3, JobSelectClustering: 4, JobCreateTasking: 5, JobSyncTasking: 6,
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Start time.

Note: This field may return null, indicating that no valid value is found. 
     * @return StartTime Start time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.

Note: This field may return null, indicating that no valid value is found.
     * @param StartTime Start time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time.

Note: This field may return null, indicating that no valid value is found. 
     * @return EndTime End time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.

Note: This field may return null, indicating that no valid value is found.
     * @param EndTime End time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Maximum VU.

Note: This field may return null, indicating that no valid value is found. 
     * @return MaxVirtualUserCount Maximum VU.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getMaxVirtualUserCount() {
        return this.MaxVirtualUserCount;
    }

    /**
     * Set Maximum VU.

Note: This field may return null, indicating that no valid value is found.
     * @param MaxVirtualUserCount Maximum VU.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMaxVirtualUserCount(Long MaxVirtualUserCount) {
        this.MaxVirtualUserCount = MaxVirtualUserCount;
    }

    /**
     * Get Note.

Note: This field may return null, indicating that no valid value is found. 
     * @return Note Note.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Note.

Note: This field may return null, indicating that no valid value is found.
     * @param Note Note.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Error rate percentage.

Note: This field may return null, indicating that no valid value is found. 
     * @return ErrorRate Error rate percentage.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set Error rate percentage.

Note: This field may return null, indicating that no valid value is found.
     * @param ErrorRate Error rate percentage.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    /**
     * Get Job owner.

Note: This field may return null, indicating that no valid value is found. 
     * @return JobOwner Job owner.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set Job owner.

Note: This field may return null, indicating that no valid value is found.
     * @param JobOwner Job owner.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return LoadSources Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public LoadSource getLoadSources() {
        return this.LoadSources;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param LoadSources Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLoadSources(LoadSource LoadSources) {
        this.LoadSources = LoadSources;
    }

    /**
     * Get Job duration.

Note: This field may return null, indicating that no valid value is found. 
     * @return Duration Job duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Job duration.

Note: This field may return null, indicating that no valid value is found.
     * @param Duration Job duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Maximum requests per second.

Note: This field may return null, indicating that no valid value is found. 
     * @return MaxRequestsPerSecond Maximum requests per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set Maximum requests per second.

Note: This field may return null, indicating that no valid value is found.
     * @param MaxRequestsPerSecond Maximum requests per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get Total number of requests.

Note: This field may return null, indicating that no valid value is found. 
     * @return RequestTotal Total number of requests.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getRequestTotal() {
        return this.RequestTotal;
    }

    /**
     * Set Total number of requests.

Note: This field may return null, indicating that no valid value is found.
     * @param RequestTotal Total number of requests.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRequestTotal(Float RequestTotal) {
        this.RequestTotal = RequestTotal;
    }

    /**
     * Get Average requests per second.

Note: This field may return null, indicating that no valid value is found. 
     * @return RequestsPerSecond Average requests per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set Average requests per second.

Note: This field may return null, indicating that no valid value is found.
     * @param RequestsPerSecond Average requests per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get Average response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeAverage Average response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeAverage() {
        return this.ResponseTimeAverage;
    }

    /**
     * Set Average response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeAverage Average response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeAverage(Float ResponseTimeAverage) {
        this.ResponseTimeAverage = ResponseTimeAverage;
    }

    /**
     * Get 99th percentile response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeP99 99th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeP99() {
        return this.ResponseTimeP99;
    }

    /**
     * Set 99th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeP99 99th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeP99(Float ResponseTimeP99) {
        this.ResponseTimeP99 = ResponseTimeP99;
    }

    /**
     * Get 95th percentile response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeP95 95th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeP95() {
        return this.ResponseTimeP95;
    }

    /**
     * Set 95th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeP95 95th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeP95(Float ResponseTimeP95) {
        this.ResponseTimeP95 = ResponseTimeP95;
    }

    /**
     * Get 90th percentile response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeP90 90th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeP90() {
        return this.ResponseTimeP90;
    }

    /**
     * Set 90th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeP90 90th percentile response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeP90(Float ResponseTimeP90) {
        this.ResponseTimeP90 = ResponseTimeP90;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return Scripts Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getScripts() {
        return this.Scripts;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param Scripts Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScripts(String [] Scripts) {
        this.Scripts = Scripts;
    }

    /**
     * Get Maximum response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeMax Maximum response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeMax() {
        return this.ResponseTimeMax;
    }

    /**
     * Set Maximum response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeMax Maximum response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeMax(Float ResponseTimeMax) {
        this.ResponseTimeMax = ResponseTimeMax;
    }

    /**
     * Get Minimum response time.

Note: This field may return null, indicating that no valid value is found. 
     * @return ResponseTimeMin Minimum response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getResponseTimeMin() {
        return this.ResponseTimeMin;
    }

    /**
     * Set Minimum response time.

Note: This field may return null, indicating that no valid value is found.
     * @param ResponseTimeMin Minimum response time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResponseTimeMin(Float ResponseTimeMin) {
        this.ResponseTimeMin = ResponseTimeMin;
    }

    /**
     * Get Stress machine information.

Note: This field may return null, indicating that no valid value is found. 
     * @return LoadSourceInfos Stress machine information.

Note: This field may return null, indicating that no valid value is found.
     */
    public LoadSource [] getLoadSourceInfos() {
        return this.LoadSourceInfos;
    }

    /**
     * Set Stress machine information.

Note: This field may return null, indicating that no valid value is found.
     * @param LoadSourceInfos Stress machine information.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLoadSourceInfos(LoadSource [] LoadSourceInfos) {
        this.LoadSourceInfos = LoadSourceInfos;
    }

    /**
     * Get Test script information.

Note: This field may return null, indicating that no valid value is found. 
     * @return TestScripts Test script information.

Note: This field may return null, indicating that no valid value is found.
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set Test script information.

Note: This field may return null, indicating that no valid value is found.
     * @param TestScripts Test script information.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get Protocol file information.

Note: This field may return null, indicating that no valid value is found. 
     * @return Protocols Protocol file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set Protocol file information.

Note: This field may return null, indicating that no valid value is found.
     * @param Protocols Protocol file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get Request file information.

Note: This field may return null, indicating that no valid value is found. 
     * @return RequestFiles Request file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set Request file information.

Note: This field may return null, indicating that no valid value is found.
     * @param RequestFiles Request file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get Extension file information.

Note: This field may return null, indicating that no valid value is found. 
     * @return Plugins Extension file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set Extension file information.

Note: This field may return null, indicating that no valid value is found.
     * @param Plugins Extension file information.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get Cron job ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return CronId Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     * @param CronId Cron job ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get Scenario type.

Note: This field may return null, indicating that no valid value is found. 
     * @return Type Scenario type.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scenario type.

Note: This field may return null, indicating that no valid value is found.
     * @param Type Scenario type.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Domain binding configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return DomainNameConfig Domain binding configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set Domain binding configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param DomainNameConfig Domain binding configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get Whether the job is a debug job.

Note: This field may return null, indicating that no valid value is found. 
     * @return Debug Whether the job is a debug job.

Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * Set Whether the job is a debug job.

Note: This field may return null, indicating that no valid value is found.
     * @param Debug Whether the job is a debug job.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * Get Abort reason.

Note: This field may return null, indicating that no valid value is found. 
     * @return AbortReason Abort reason.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAbortReason() {
        return this.AbortReason;
    }

    /**
     * Set Abort reason.

Note: This field may return null, indicating that no valid value is found.
     * @param AbortReason Abort reason.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAbortReason(Long AbortReason) {
        this.AbortReason = AbortReason;
    }

    /**
     * Get Create Time.

Note: This field may return null, indicating that no valid value is found. 
     * @return CreatedAt Create Time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create Time.

Note: This field may return null, indicating that no valid value is found.
     * @param CreatedAt Create Time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Notification event callback.

Note: This field may return null, indicating that no valid value is found. 
     * @return NotificationHooks Notification event callback.

Note: This field may return null, indicating that no valid value is found.
     */
    public NotificationHook [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set Notification event callback.

Note: This field may return null, indicating that no valid value is found.
     * @param NotificationHooks Notification event callback.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNotificationHooks(NotificationHook [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get Bytes received per second.

Note: This field may return null, indicating that no valid value is found. 
     * @return NetworkReceiveRate Bytes received per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getNetworkReceiveRate() {
        return this.NetworkReceiveRate;
    }

    /**
     * Set Bytes received per second.

Note: This field may return null, indicating that no valid value is found.
     * @param NetworkReceiveRate Bytes received per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNetworkReceiveRate(Float NetworkReceiveRate) {
        this.NetworkReceiveRate = NetworkReceiveRate;
    }

    /**
     * Get Bytes sent per second.

Note: This field may return null, indicating that no valid value is found. 
     * @return NetworkSendRate Bytes sent per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getNetworkSendRate() {
        return this.NetworkSendRate;
    }

    /**
     * Set Bytes sent per second.

Note: This field may return null, indicating that no valid value is found.
     * @param NetworkSendRate Bytes sent per second.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNetworkSendRate(Float NetworkSendRate) {
        this.NetworkSendRate = NetworkSendRate;
    }

    /**
     * Get Job status description.

Note: This field may return null, indicating that no valid value is found. 
     * @return Message Job status description.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Job status description.

Note: This field may return null, indicating that no valid value is found.
     * @param Message Job status description.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Project name.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectName Project name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectName Project name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Scenario name.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScenarioName Scenario name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set Scenario name.

Note: This field may return null, indicating that no valid value is found.
     * @param ScenarioName Scenario name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get Billing type.

Note: This field may return null, indicating that no valid value is found. 
     * @return PayMode Billing type.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type.

Note: This field may return null, indicating that no valid value is found.
     * @param PayMode Billing type.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Job VUM usage.

Note: This field may return null, indicating that no valid value is found. 
     * @return Usage Job VUM usage.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set Job VUM usage.

Note: This field may return null, indicating that no valid value is found.
     * @param Usage Job VUM usage.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Load != null) {
            this.Load = new Load(source.Load);
        }
        if (source.Configs != null) {
            this.Configs = new String[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new String(source.Configs[i]);
            }
        }
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MaxVirtualUserCount != null) {
            this.MaxVirtualUserCount = new Long(source.MaxVirtualUserCount);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.LoadSources != null) {
            this.LoadSources = new LoadSource(source.LoadSources);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.RequestTotal != null) {
            this.RequestTotal = new Float(source.RequestTotal);
        }
        if (source.RequestsPerSecond != null) {
            this.RequestsPerSecond = new Float(source.RequestsPerSecond);
        }
        if (source.ResponseTimeAverage != null) {
            this.ResponseTimeAverage = new Float(source.ResponseTimeAverage);
        }
        if (source.ResponseTimeP99 != null) {
            this.ResponseTimeP99 = new Float(source.ResponseTimeP99);
        }
        if (source.ResponseTimeP95 != null) {
            this.ResponseTimeP95 = new Float(source.ResponseTimeP95);
        }
        if (source.ResponseTimeP90 != null) {
            this.ResponseTimeP90 = new Float(source.ResponseTimeP90);
        }
        if (source.Scripts != null) {
            this.Scripts = new String[source.Scripts.length];
            for (int i = 0; i < source.Scripts.length; i++) {
                this.Scripts[i] = new String(source.Scripts[i]);
            }
        }
        if (source.ResponseTimeMax != null) {
            this.ResponseTimeMax = new Float(source.ResponseTimeMax);
        }
        if (source.ResponseTimeMin != null) {
            this.ResponseTimeMin = new Float(source.ResponseTimeMin);
        }
        if (source.LoadSourceInfos != null) {
            this.LoadSourceInfos = new LoadSource[source.LoadSourceInfos.length];
            for (int i = 0; i < source.LoadSourceInfos.length; i++) {
                this.LoadSourceInfos[i] = new LoadSource(source.LoadSourceInfos[i]);
            }
        }
        if (source.TestScripts != null) {
            this.TestScripts = new ScriptInfo[source.TestScripts.length];
            for (int i = 0; i < source.TestScripts.length; i++) {
                this.TestScripts[i] = new ScriptInfo(source.TestScripts[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new ProtocolInfo[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new ProtocolInfo(source.Protocols[i]);
            }
        }
        if (source.RequestFiles != null) {
            this.RequestFiles = new FileInfo[source.RequestFiles.length];
            for (int i = 0; i < source.RequestFiles.length; i++) {
                this.RequestFiles[i] = new FileInfo(source.RequestFiles[i]);
            }
        }
        if (source.Plugins != null) {
            this.Plugins = new FileInfo[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new FileInfo(source.Plugins[i]);
            }
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DomainNameConfig != null) {
            this.DomainNameConfig = new DomainNameConfig(source.DomainNameConfig);
        }
        if (source.Debug != null) {
            this.Debug = new Boolean(source.Debug);
        }
        if (source.AbortReason != null) {
            this.AbortReason = new Long(source.AbortReason);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.NotificationHooks != null) {
            this.NotificationHooks = new NotificationHook[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new NotificationHook(source.NotificationHooks[i]);
            }
        }
        if (source.NetworkReceiveRate != null) {
            this.NetworkReceiveRate = new Float(source.NetworkReceiveRate);
        }
        if (source.NetworkSendRate != null) {
            this.NetworkSendRate = new Float(source.NetworkSendRate);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxVirtualUserCount", this.MaxVirtualUserCount);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamObj(map, prefix + "LoadSources.", this.LoadSources);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "RequestTotal", this.RequestTotal);
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "ResponseTimeAverage", this.ResponseTimeAverage);
        this.setParamSimple(map, prefix + "ResponseTimeP99", this.ResponseTimeP99);
        this.setParamSimple(map, prefix + "ResponseTimeP95", this.ResponseTimeP95);
        this.setParamSimple(map, prefix + "ResponseTimeP90", this.ResponseTimeP90);
        this.setParamArraySimple(map, prefix + "Scripts.", this.Scripts);
        this.setParamSimple(map, prefix + "ResponseTimeMax", this.ResponseTimeMax);
        this.setParamSimple(map, prefix + "ResponseTimeMin", this.ResponseTimeMin);
        this.setParamArrayObj(map, prefix + "LoadSourceInfos.", this.LoadSourceInfos);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamSimple(map, prefix + "AbortReason", this.AbortReason);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "NetworkReceiveRate", this.NetworkReceiveRate);
        this.setParamSimple(map, prefix + "NetworkSendRate", this.NetworkSendRate);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

