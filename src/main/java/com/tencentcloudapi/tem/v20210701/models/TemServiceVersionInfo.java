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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemServiceVersionInfo extends AbstractModel {

    /**
    * Version ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Deployment mode
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * JDK version
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Deployed version
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * Publish mode
    */
    @SerializedName("PublishMode")
    @Expose
    private String PublishMode;

    /**
    * Launch parameter
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * Number of initial pods
    */
    @SerializedName("InitPodNum")
    @Expose
    private Long InitPodNum;

    /**
    * CPU specification
    */
    @SerializedName("CpuSpec")
    @Expose
    private Float CpuSpec;

    /**
    * Memory specification
    */
    @SerializedName("MemorySpec")
    @Expose
    private Float MemorySpec;

    /**
    * Image path
    */
    @SerializedName("ImgRepo")
    @Expose
    private String ImgRepo;

    /**
    * Image name
    */
    @SerializedName("ImgName")
    @Expose
    private String ImgName;

    /**
    * Image version
    */
    @SerializedName("ImgVersion")
    @Expose
    private String ImgVersion;

    /**
    * Scaling configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * Environment configuration
    */
    @SerializedName("EnvConf")
    @Expose
    private Pair [] EnvConf;

    /**
    * Storage configuration
    */
    @SerializedName("StorageConfs")
    @Expose
    private StorageConf [] StorageConfs;

    /**
    * Running status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * VPC
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * Subnets
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Creation time
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Modification time
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * Mounting configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageMountConfs")
    @Expose
    private StorageMountConf [] StorageMountConfs;

    /**
    * Version name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Log output configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application description
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationDescription")
    @Expose
    private String ApplicationDescription;

    /**
    * Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Environment ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Public network address
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * Whether to enable public network access
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnablePublicAccess")
    @Expose
    private Boolean EnablePublicAccess;

    /**
    * Number of current instances
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentInstances")
    @Expose
    private Long CurrentInstances;

    /**
    * Number of expected instances
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpectedInstances")
    @Expose
    private Long ExpectedInstances;

    /**
    * Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * Program package name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * Whether to enable auto scaling
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EsEnable")
    @Expose
    private Long EsEnable;

    /**
    * Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EsStrategy")
    @Expose
    private Long EsStrategy;

    /**
    * Image tag
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Whether to enable logging
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogEnable")
    @Expose
    private Long LogEnable;

    /**
    * Minimum number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MinAliveInstances")
    @Expose
    private String MinAliveInstances;

    /**
    * Security group IDs
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Image command
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageCommand")
    @Expose
    private String ImageCommand;

    /**
    * Image command parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageArgs")
    @Expose
    private String [] ImageArgs;

    /**
    * Whether to use the default registry configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UseRegistryDefaultConfig")
    @Expose
    private Boolean UseRegistryDefaultConfig;

    /**
    * EKS access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Service")
    @Expose
    private EksService Service;

    /**
    * Mounting configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SettingConfs")
    @Expose
    private MountedSettingConf [] SettingConfs;

    /**
    * Log path information
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogConfs")
    @Expose
    private String [] LogConfs;

    /**
    * The script to execute right after the startup
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PostStart")
    @Expose
    private String PostStart;

    /**
    * The script to run before stop
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PreStop")
    @Expose
    private String PreStop;

    /**
    * Configuration of aliveness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Liveness")
    @Expose
    private HealthCheckConfig Liveness;

    /**
    * Configuration of readiness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Readiness")
    @Expose
    private HealthCheckConfig Readiness;

    /**
    * Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HorizontalAutoscaler")
    @Expose
    private HorizontalAutoscaler [] HorizontalAutoscaler;

    /**
    * Scheduled auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CronHorizontalAutoscaler")
    @Expose
    private CronHorizontalAutoscaler [] CronHorizontalAutoscaler;

    /**
    * Availability zone of the application
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * The latest deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastDeployDate")
    @Expose
    private String LastDeployDate;

    /**
    * The latest successful deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastDeploySuccessDate")
    @Expose
    private String LastDeploySuccessDate;

    /**
    * Information of the node whether the application is deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfo [] NodeInfos;

    /**
    * Image type. Values: `0` (Demo image), `1` (Normal image)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageType")
    @Expose
    private Long ImageType;

    /**
    * Whether to 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
    * (Disused) Whether to enable linkage tracing and report. It only takes effect when EnableTracing = `1`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableTracingReport")
    @Expose
    private Long EnableTracingReport;

    /**
    * Image type. `0`: Individual image; `1`: Enterprise image; `2`: Public image
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * Status of batch deployment: `batch_updating`, `batch_updating_waiting_confirm`
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BatchDeployStatus")
    @Expose
    private String BatchDeployStatus;

    /**
    * APM instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApmInstanceId")
    @Expose
    private String ApmInstanceId;

    /**
    * Workload information 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkloadInfo")
    @Expose
    private WorkloadInfo WorkloadInfo;

    /**
    * Whether to enable application acceleration
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SpeedUp")
    @Expose
    private Boolean SpeedUp;

    /**
    * Configuration of the startup probe
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartupProbe")
    @Expose
    private HealthCheckConfig StartupProbe;

    /**
    * OS version. Values:
- ALPINE
- CENTOS
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OsFlavour")
    @Expose
    private String OsFlavour;

    /**
    * Image repository server
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RepoServer")
    @Expose
    private String RepoServer;

    /**
    * Whether the application is being deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UnderDeploying")
    @Expose
    private Boolean UnderDeploying;

    /**
    * Whether to enable application metric monitoring 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnablePrometheusConf")
    @Expose
    private EnablePrometheusConf EnablePrometheusConf;

    /**
    * Whether it’s stopped manually
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StoppedManually")
    @Expose
    private Boolean StoppedManually;

    /**
    * TCR instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TcrInstanceId")
    @Expose
    private String TcrInstanceId;

    /**
    * `1`: Automatically enable metrics collection (open-telemetry)
`0`: Disable metrics collection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableMetrics")
    @Expose
    private Long EnableMetrics;

    /**
    * User AppId
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Sub Account UIN
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * User UIN
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Region
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Application group ID
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Whether to enable registry
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EnableRegistry")
    @Expose
    private Long EnableRegistry;

    /**
    * Array of scaling rules
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AutoscalerList")
    @Expose
    private Autoscaler [] AutoscalerList;

    /**
    * Modifier
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * Creator
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Deployment strategy
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

    /**
    * List of pods
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PodList")
    @Expose
    private DescribeRunPodPage PodList;

    /**
    * Whether the configuration has been changed during deployment
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ConfEdited")
    @Expose
    private Boolean ConfEdited;

    /**
    * Tag
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PreStopEncoded")
    @Expose
    private String PreStopEncoded;

    /**
    * Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostStartEncoded")
    @Expose
    private String PostStartEncoded;

    /**
     * Get Version ID 
     * @return VersionId Version ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Version ID
     * @param VersionId Version ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Deployment mode 
     * @return DeployMode Deployment mode
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode
     * @param DeployMode Deployment mode
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get JDK version 
     * @return JdkVersion JDK version
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK version
     * @param JdkVersion JDK version
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Deployed version 
     * @return DeployVersion Deployed version
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set Deployed version
     * @param DeployVersion Deployed version
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get Publish mode 
     * @return PublishMode Publish mode
     */
    public String getPublishMode() {
        return this.PublishMode;
    }

    /**
     * Set Publish mode
     * @param PublishMode Publish mode
     */
    public void setPublishMode(String PublishMode) {
        this.PublishMode = PublishMode;
    }

    /**
     * Get Launch parameter 
     * @return JvmOpts Launch parameter
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set Launch parameter
     * @param JvmOpts Launch parameter
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get Number of initial pods 
     * @return InitPodNum Number of initial pods
     */
    public Long getInitPodNum() {
        return this.InitPodNum;
    }

    /**
     * Set Number of initial pods
     * @param InitPodNum Number of initial pods
     */
    public void setInitPodNum(Long InitPodNum) {
        this.InitPodNum = InitPodNum;
    }

    /**
     * Get CPU specification 
     * @return CpuSpec CPU specification
     */
    public Float getCpuSpec() {
        return this.CpuSpec;
    }

    /**
     * Set CPU specification
     * @param CpuSpec CPU specification
     */
    public void setCpuSpec(Float CpuSpec) {
        this.CpuSpec = CpuSpec;
    }

    /**
     * Get Memory specification 
     * @return MemorySpec Memory specification
     */
    public Float getMemorySpec() {
        return this.MemorySpec;
    }

    /**
     * Set Memory specification
     * @param MemorySpec Memory specification
     */
    public void setMemorySpec(Float MemorySpec) {
        this.MemorySpec = MemorySpec;
    }

    /**
     * Get Image path 
     * @return ImgRepo Image path
     */
    public String getImgRepo() {
        return this.ImgRepo;
    }

    /**
     * Set Image path
     * @param ImgRepo Image path
     */
    public void setImgRepo(String ImgRepo) {
        this.ImgRepo = ImgRepo;
    }

    /**
     * Get Image name 
     * @return ImgName Image name
     */
    public String getImgName() {
        return this.ImgName;
    }

    /**
     * Set Image name
     * @param ImgName Image name
     */
    public void setImgName(String ImgName) {
        this.ImgName = ImgName;
    }

    /**
     * Get Image version 
     * @return ImgVersion Image version
     */
    public String getImgVersion() {
        return this.ImgVersion;
    }

    /**
     * Set Image version
     * @param ImgVersion Image version
     */
    public void setImgVersion(String ImgVersion) {
        this.ImgVersion = ImgVersion;
    }

    /**
     * Get Scaling configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EsInfo Scaling configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set Scaling configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EsInfo Scaling configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get Environment configuration 
     * @return EnvConf Environment configuration
     */
    public Pair [] getEnvConf() {
        return this.EnvConf;
    }

    /**
     * Set Environment configuration
     * @param EnvConf Environment configuration
     */
    public void setEnvConf(Pair [] EnvConf) {
        this.EnvConf = EnvConf;
    }

    /**
     * Get Storage configuration 
     * @return StorageConfs Storage configuration
     */
    public StorageConf [] getStorageConfs() {
        return this.StorageConfs;
    }

    /**
     * Set Storage configuration
     * @param StorageConfs Storage configuration
     */
    public void setStorageConfs(StorageConf [] StorageConfs) {
        this.StorageConfs = StorageConfs;
    }

    /**
     * Get Running status 
     * @return Status Running status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Running status
     * @param Status Running status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get VPC 
     * @return Vpc VPC
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC
     * @param Vpc VPC
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get Subnets 
     * @return SubnetId Subnets
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnets
     * @param SubnetId Subnets
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Creation time 
     * @return CreateDate Creation time
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time
     * @param CreateDate Creation time
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Modification time 
     * @return ModifyDate Modification time
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set Modification time
     * @param ModifyDate Modification time
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get Mounting configuration
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StorageMountConfs Mounting configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public StorageMountConf [] getStorageMountConfs() {
        return this.StorageMountConfs;
    }

    /**
     * Set Mounting configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StorageMountConfs Mounting configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStorageMountConfs(StorageMountConf [] StorageMountConfs) {
        this.StorageMountConfs = StorageMountConfs;
    }

    /**
     * Get Version name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return VersionName Version name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param VersionName Version name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Log output configuration
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogOutputConf Log output configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set Log output configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogOutputConf Log output configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get Application name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application description
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationDescription Application description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationDescription() {
        return this.ApplicationDescription;
    }

    /**
     * Set Application description
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationDescription Application description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationDescription(String ApplicationDescription) {
        this.ApplicationDescription = ApplicationDescription;
    }

    /**
     * Get Environment name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentName Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentName Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Environment ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentId Environment ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentId Environment ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Public network address
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PublicDomain Public network address
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set Public network address
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PublicDomain Public network address
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get Whether to enable public network access
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnablePublicAccess Whether to enable public network access
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getEnablePublicAccess() {
        return this.EnablePublicAccess;
    }

    /**
     * Set Whether to enable public network access
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnablePublicAccess Whether to enable public network access
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnablePublicAccess(Boolean EnablePublicAccess) {
        this.EnablePublicAccess = EnablePublicAccess;
    }

    /**
     * Get Number of current instances
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CurrentInstances Number of current instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getCurrentInstances() {
        return this.CurrentInstances;
    }

    /**
     * Set Number of current instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CurrentInstances Number of current instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCurrentInstances(Long CurrentInstances) {
        this.CurrentInstances = CurrentInstances;
    }

    /**
     * Get Number of expected instances
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExpectedInstances Number of expected instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getExpectedInstances() {
        return this.ExpectedInstances;
    }

    /**
     * Set Number of expected instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExpectedInstances Number of expected instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExpectedInstances(Long ExpectedInstances) {
        this.ExpectedInstances = ExpectedInstances;
    }

    /**
     * Get Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CodingLanguage Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CodingLanguage Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get Program package name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PkgName Program package name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Program package name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PkgName Program package name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get Whether to enable auto scaling
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EsEnable Whether to enable auto scaling
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEsEnable() {
        return this.EsEnable;
    }

    /**
     * Set Whether to enable auto scaling
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EsEnable Whether to enable auto scaling
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEsEnable(Long EsEnable) {
        this.EsEnable = EsEnable;
    }

    /**
     * Get Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EsStrategy Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEsStrategy() {
        return this.EsStrategy;
    }

    /**
     * Set Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EsStrategy Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEsStrategy(Long EsStrategy) {
        this.EsStrategy = EsStrategy;
    }

    /**
     * Get Image tag
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ImageTag Image tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Image tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ImageTag Image tag
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Whether to enable logging
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogEnable Whether to enable logging
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set Whether to enable logging
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogEnable Whether to enable logging
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogEnable(Long LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get Minimum number of instances
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MinAliveInstances Minimum number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMinAliveInstances() {
        return this.MinAliveInstances;
    }

    /**
     * Set Minimum number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MinAliveInstances Minimum number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMinAliveInstances(String MinAliveInstances) {
        this.MinAliveInstances = MinAliveInstances;
    }

    /**
     * Get Security group IDs
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroupIds Security group IDs
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group IDs
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroupIds Security group IDs
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Image command
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ImageCommand Image command
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getImageCommand() {
        return this.ImageCommand;
    }

    /**
     * Set Image command
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ImageCommand Image command
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setImageCommand(String ImageCommand) {
        this.ImageCommand = ImageCommand;
    }

    /**
     * Get Image command parameters
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ImageArgs Image command parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getImageArgs() {
        return this.ImageArgs;
    }

    /**
     * Set Image command parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ImageArgs Image command parameters
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setImageArgs(String [] ImageArgs) {
        this.ImageArgs = ImageArgs;
    }

    /**
     * Get Whether to use the default registry configurations
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UseRegistryDefaultConfig Whether to use the default registry configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getUseRegistryDefaultConfig() {
        return this.UseRegistryDefaultConfig;
    }

    /**
     * Set Whether to use the default registry configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UseRegistryDefaultConfig Whether to use the default registry configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUseRegistryDefaultConfig(Boolean UseRegistryDefaultConfig) {
        this.UseRegistryDefaultConfig = UseRegistryDefaultConfig;
    }

    /**
     * Get EKS access configuration
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Service EKS access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EksService getService() {
        return this.Service;
    }

    /**
     * Set EKS access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Service EKS access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setService(EksService Service) {
        this.Service = Service;
    }

    /**
     * Get Mounting configurations
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SettingConfs Mounting configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public MountedSettingConf [] getSettingConfs() {
        return this.SettingConfs;
    }

    /**
     * Set Mounting configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SettingConfs Mounting configurations
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSettingConfs(MountedSettingConf [] SettingConfs) {
        this.SettingConfs = SettingConfs;
    }

    /**
     * Get Log path information
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LogConfs Log path information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getLogConfs() {
        return this.LogConfs;
    }

    /**
     * Set Log path information
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LogConfs Log path information
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogConfs(String [] LogConfs) {
        this.LogConfs = LogConfs;
    }

    /**
     * Get The script to execute right after the startup
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PostStart The script to execute right after the startup
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPostStart() {
        return this.PostStart;
    }

    /**
     * Set The script to execute right after the startup
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PostStart The script to execute right after the startup
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPostStart(String PostStart) {
        this.PostStart = PostStart;
    }

    /**
     * Get The script to run before stop
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PreStop The script to run before stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPreStop() {
        return this.PreStop;
    }

    /**
     * Set The script to run before stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PreStop The script to run before stop
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPreStop(String PreStop) {
        this.PreStop = PreStop;
    }

    /**
     * Get Configuration of aliveness probe
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Liveness Configuration of aliveness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HealthCheckConfig getLiveness() {
        return this.Liveness;
    }

    /**
     * Set Configuration of aliveness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Liveness Configuration of aliveness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLiveness(HealthCheckConfig Liveness) {
        this.Liveness = Liveness;
    }

    /**
     * Get Configuration of readiness probe
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Readiness Configuration of readiness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HealthCheckConfig getReadiness() {
        return this.Readiness;
    }

    /**
     * Set Configuration of readiness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Readiness Configuration of readiness probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReadiness(HealthCheckConfig Readiness) {
        this.Readiness = Readiness;
    }

    /**
     * Get Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HorizontalAutoscaler Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HorizontalAutoscaler [] getHorizontalAutoscaler() {
        return this.HorizontalAutoscaler;
    }

    /**
     * Set Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HorizontalAutoscaler Auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHorizontalAutoscaler(HorizontalAutoscaler [] HorizontalAutoscaler) {
        this.HorizontalAutoscaler = HorizontalAutoscaler;
    }

    /**
     * Get Scheduled auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CronHorizontalAutoscaler Scheduled auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public CronHorizontalAutoscaler [] getCronHorizontalAutoscaler() {
        return this.CronHorizontalAutoscaler;
    }

    /**
     * Set Scheduled auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CronHorizontalAutoscaler Scheduled auto scaling policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCronHorizontalAutoscaler(CronHorizontalAutoscaler [] CronHorizontalAutoscaler) {
        this.CronHorizontalAutoscaler = CronHorizontalAutoscaler;
    }

    /**
     * Get Availability zone of the application
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Zones Availability zone of the application
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Availability zone of the application
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Zones Availability zone of the application
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get The latest deployment time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LastDeployDate The latest deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastDeployDate() {
        return this.LastDeployDate;
    }

    /**
     * Set The latest deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LastDeployDate The latest deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastDeployDate(String LastDeployDate) {
        this.LastDeployDate = LastDeployDate;
    }

    /**
     * Get The latest successful deployment time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LastDeploySuccessDate The latest successful deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastDeploySuccessDate() {
        return this.LastDeploySuccessDate;
    }

    /**
     * Set The latest successful deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LastDeploySuccessDate The latest successful deployment time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastDeploySuccessDate(String LastDeploySuccessDate) {
        this.LastDeploySuccessDate = LastDeploySuccessDate;
    }

    /**
     * Get Information of the node whether the application is deployed
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return NodeInfos Information of the node whether the application is deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public NodeInfo [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set Information of the node whether the application is deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param NodeInfos Information of the node whether the application is deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNodeInfos(NodeInfo [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get Image type. Values: `0` (Demo image), `1` (Normal image)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ImageType Image type. Values: `0` (Demo image), `1` (Normal image)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type. Values: `0` (Demo image), `1` (Normal image)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ImageType Image type. Values: `0` (Demo image), `1` (Normal image)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setImageType(Long ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get Whether to 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableTracing Whether to 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set Whether to 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnableTracing Whether to 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    /**
     * Get (Disused) Whether to enable linkage tracing and report. It only takes effect when EnableTracing = `1`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableTracingReport (Disused) Whether to enable linkage tracing and report. It only takes effect when EnableTracing = `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableTracingReport() {
        return this.EnableTracingReport;
    }

    /**
     * Set (Disused) Whether to enable linkage tracing and report. It only takes effect when EnableTracing = `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableTracingReport (Disused) Whether to enable linkage tracing and report. It only takes effect when EnableTracing = `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableTracingReport(Long EnableTracingReport) {
        this.EnableTracingReport = EnableTracingReport;
    }

    /**
     * Get Image type. `0`: Individual image; `1`: Enterprise image; `2`: Public image
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RepoType Image type. `0`: Individual image; `1`: Enterprise image; `2`: Public image
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set Image type. `0`: Individual image; `1`: Enterprise image; `2`: Public image
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RepoType Image type. `0`: Individual image; `1`: Enterprise image; `2`: Public image
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get Status of batch deployment: `batch_updating`, `batch_updating_waiting_confirm`
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BatchDeployStatus Status of batch deployment: `batch_updating`, `batch_updating_waiting_confirm`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBatchDeployStatus() {
        return this.BatchDeployStatus;
    }

    /**
     * Set Status of batch deployment: `batch_updating`, `batch_updating_waiting_confirm`
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BatchDeployStatus Status of batch deployment: `batch_updating`, `batch_updating_waiting_confirm`
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBatchDeployStatus(String BatchDeployStatus) {
        this.BatchDeployStatus = BatchDeployStatus;
    }

    /**
     * Get APM instance ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApmInstanceId APM instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApmInstanceId() {
        return this.ApmInstanceId;
    }

    /**
     * Set APM instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApmInstanceId APM instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApmInstanceId(String ApmInstanceId) {
        this.ApmInstanceId = ApmInstanceId;
    }

    /**
     * Get Workload information 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return WorkloadInfo Workload information 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public WorkloadInfo getWorkloadInfo() {
        return this.WorkloadInfo;
    }

    /**
     * Set Workload information 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param WorkloadInfo Workload information 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWorkloadInfo(WorkloadInfo WorkloadInfo) {
        this.WorkloadInfo = WorkloadInfo;
    }

    /**
     * Get Whether to enable application acceleration
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SpeedUp Whether to enable application acceleration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSpeedUp() {
        return this.SpeedUp;
    }

    /**
     * Set Whether to enable application acceleration
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SpeedUp Whether to enable application acceleration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSpeedUp(Boolean SpeedUp) {
        this.SpeedUp = SpeedUp;
    }

    /**
     * Get Configuration of the startup probe
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StartupProbe Configuration of the startup probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public HealthCheckConfig getStartupProbe() {
        return this.StartupProbe;
    }

    /**
     * Set Configuration of the startup probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StartupProbe Configuration of the startup probe
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartupProbe(HealthCheckConfig StartupProbe) {
        this.StartupProbe = StartupProbe;
    }

    /**
     * Get OS version. Values:
- ALPINE
- CENTOS
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return OsFlavour OS version. Values:
- ALPINE
- CENTOS
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOsFlavour() {
        return this.OsFlavour;
    }

    /**
     * Set OS version. Values:
- ALPINE
- CENTOS
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param OsFlavour OS version. Values:
- ALPINE
- CENTOS
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOsFlavour(String OsFlavour) {
        this.OsFlavour = OsFlavour;
    }

    /**
     * Get Image repository server
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RepoServer Image repository server
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRepoServer() {
        return this.RepoServer;
    }

    /**
     * Set Image repository server
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RepoServer Image repository server
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRepoServer(String RepoServer) {
        this.RepoServer = RepoServer;
    }

    /**
     * Get Whether the application is being deployed
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UnderDeploying Whether the application is being deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getUnderDeploying() {
        return this.UnderDeploying;
    }

    /**
     * Set Whether the application is being deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UnderDeploying Whether the application is being deployed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUnderDeploying(Boolean UnderDeploying) {
        this.UnderDeploying = UnderDeploying;
    }

    /**
     * Get Whether to enable application metric monitoring 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnablePrometheusConf Whether to enable application metric monitoring 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EnablePrometheusConf getEnablePrometheusConf() {
        return this.EnablePrometheusConf;
    }

    /**
     * Set Whether to enable application metric monitoring 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnablePrometheusConf Whether to enable application metric monitoring 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnablePrometheusConf(EnablePrometheusConf EnablePrometheusConf) {
        this.EnablePrometheusConf = EnablePrometheusConf;
    }

    /**
     * Get Whether it’s stopped manually
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StoppedManually Whether it’s stopped manually
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getStoppedManually() {
        return this.StoppedManually;
    }

    /**
     * Set Whether it’s stopped manually
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StoppedManually Whether it’s stopped manually
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStoppedManually(Boolean StoppedManually) {
        this.StoppedManually = StoppedManually;
    }

    /**
     * Get TCR instance ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TcrInstanceId TCR instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTcrInstanceId() {
        return this.TcrInstanceId;
    }

    /**
     * Set TCR instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TcrInstanceId TCR instance ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTcrInstanceId(String TcrInstanceId) {
        this.TcrInstanceId = TcrInstanceId;
    }

    /**
     * Get `1`: Automatically enable metrics collection (open-telemetry)
`0`: Disable metrics collection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableMetrics `1`: Automatically enable metrics collection (open-telemetry)
`0`: Disable metrics collection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableMetrics() {
        return this.EnableMetrics;
    }

    /**
     * Set `1`: Automatically enable metrics collection (open-telemetry)
`0`: Disable metrics collection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableMetrics `1`: Automatically enable metrics collection (open-telemetry)
`0`: Disable metrics collection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableMetrics(Long EnableMetrics) {
        this.EnableMetrics = EnableMetrics;
    }

    /**
     * Get User AppId
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AppId User AppId
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
Note: This field may return `null`, indicating that no valid value was found.
     * @param AppId User AppId
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Sub Account UIN
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SubAccountUin Sub Account UIN
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub Account UIN
Note: This field may return `null`, indicating that no valid value was found.
     * @param SubAccountUin Sub Account UIN
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get User UIN
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Uin User UIN
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return `null`, indicating that no valid value was found.
     * @param Uin User UIN
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Region
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Region Region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return `null`, indicating that no valid value was found.
     * @param Region Region
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Application group ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return GroupId Application group ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Application group ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param GroupId Application group ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Whether to enable registry
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EnableRegistry Whether to enable registry
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getEnableRegistry() {
        return this.EnableRegistry;
    }

    /**
     * Set Whether to enable registry
Note: This field may return `null`, indicating that no valid value was found.
     * @param EnableRegistry Whether to enable registry
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEnableRegistry(Long EnableRegistry) {
        this.EnableRegistry = EnableRegistry;
    }

    /**
     * Get Array of scaling rules
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AutoscalerList Array of scaling rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Autoscaler [] getAutoscalerList() {
        return this.AutoscalerList;
    }

    /**
     * Set Array of scaling rules
Note: This field may return `null`, indicating that no valid value was found.
     * @param AutoscalerList Array of scaling rules
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAutoscalerList(Autoscaler [] AutoscalerList) {
        this.AutoscalerList = AutoscalerList;
    }

    /**
     * Get Modifier
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Modifier Modifier
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set Modifier
Note: This field may return `null`, indicating that no valid value was found.
     * @param Modifier Modifier
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get Creator
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Creator Creator
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
Note: This field may return `null`, indicating that no valid value was found.
     * @param Creator Creator
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Deployment strategy
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DeployStrategyConf Deployment strategy
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set Deployment strategy
Note: This field may return `null`, indicating that no valid value was found.
     * @param DeployStrategyConf Deployment strategy
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
    }

    /**
     * Get List of pods
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PodList List of pods
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeRunPodPage getPodList() {
        return this.PodList;
    }

    /**
     * Set List of pods
Note: This field may return `null`, indicating that no valid value was found.
     * @param PodList List of pods
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPodList(DescribeRunPodPage PodList) {
        this.PodList = PodList;
    }

    /**
     * Get Whether the configuration has been changed during deployment
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ConfEdited Whether the configuration has been changed during deployment
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getConfEdited() {
        return this.ConfEdited;
    }

    /**
     * Set Whether the configuration has been changed during deployment
Note: This field may return `null`, indicating that no valid value was found.
     * @param ConfEdited Whether the configuration has been changed during deployment
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setConfEdited(Boolean ConfEdited) {
        this.ConfEdited = ConfEdited;
    }

    /**
     * Get Tag
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to encode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PreStopEncoded Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPreStopEncoded() {
        return this.PreStopEncoded;
    }

    /**
     * Set Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PreStopEncoded Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPreStopEncoded(String PreStopEncoded) {
        this.PreStopEncoded = PreStopEncoded;
    }

    /**
     * Get Whether to encode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PostStartEncoded Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPostStartEncoded() {
        return this.PostStartEncoded;
    }

    /**
     * Set Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PostStartEncoded Whether to encode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPostStartEncoded(String PostStartEncoded) {
        this.PostStartEncoded = PostStartEncoded;
    }

    public TemServiceVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemServiceVersionInfo(TemServiceVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PublishMode != null) {
            this.PublishMode = new String(source.PublishMode);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.InitPodNum != null) {
            this.InitPodNum = new Long(source.InitPodNum);
        }
        if (source.CpuSpec != null) {
            this.CpuSpec = new Float(source.CpuSpec);
        }
        if (source.MemorySpec != null) {
            this.MemorySpec = new Float(source.MemorySpec);
        }
        if (source.ImgRepo != null) {
            this.ImgRepo = new String(source.ImgRepo);
        }
        if (source.ImgName != null) {
            this.ImgName = new String(source.ImgName);
        }
        if (source.ImgVersion != null) {
            this.ImgVersion = new String(source.ImgVersion);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new EsInfo(source.EsInfo);
        }
        if (source.EnvConf != null) {
            this.EnvConf = new Pair[source.EnvConf.length];
            for (int i = 0; i < source.EnvConf.length; i++) {
                this.EnvConf[i] = new Pair(source.EnvConf[i]);
            }
        }
        if (source.StorageConfs != null) {
            this.StorageConfs = new StorageConf[source.StorageConfs.length];
            for (int i = 0; i < source.StorageConfs.length; i++) {
                this.StorageConfs[i] = new StorageConf(source.StorageConfs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.StorageMountConfs != null) {
            this.StorageMountConfs = new StorageMountConf[source.StorageMountConfs.length];
            for (int i = 0; i < source.StorageMountConfs.length; i++) {
                this.StorageMountConfs[i] = new StorageMountConf(source.StorageMountConfs[i]);
            }
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationDescription != null) {
            this.ApplicationDescription = new String(source.ApplicationDescription);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.EnablePublicAccess != null) {
            this.EnablePublicAccess = new Boolean(source.EnablePublicAccess);
        }
        if (source.CurrentInstances != null) {
            this.CurrentInstances = new Long(source.CurrentInstances);
        }
        if (source.ExpectedInstances != null) {
            this.ExpectedInstances = new Long(source.ExpectedInstances);
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.EsEnable != null) {
            this.EsEnable = new Long(source.EsEnable);
        }
        if (source.EsStrategy != null) {
            this.EsStrategy = new Long(source.EsStrategy);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Long(source.LogEnable);
        }
        if (source.MinAliveInstances != null) {
            this.MinAliveInstances = new String(source.MinAliveInstances);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ImageCommand != null) {
            this.ImageCommand = new String(source.ImageCommand);
        }
        if (source.ImageArgs != null) {
            this.ImageArgs = new String[source.ImageArgs.length];
            for (int i = 0; i < source.ImageArgs.length; i++) {
                this.ImageArgs[i] = new String(source.ImageArgs[i]);
            }
        }
        if (source.UseRegistryDefaultConfig != null) {
            this.UseRegistryDefaultConfig = new Boolean(source.UseRegistryDefaultConfig);
        }
        if (source.Service != null) {
            this.Service = new EksService(source.Service);
        }
        if (source.SettingConfs != null) {
            this.SettingConfs = new MountedSettingConf[source.SettingConfs.length];
            for (int i = 0; i < source.SettingConfs.length; i++) {
                this.SettingConfs[i] = new MountedSettingConf(source.SettingConfs[i]);
            }
        }
        if (source.LogConfs != null) {
            this.LogConfs = new String[source.LogConfs.length];
            for (int i = 0; i < source.LogConfs.length; i++) {
                this.LogConfs[i] = new String(source.LogConfs[i]);
            }
        }
        if (source.PostStart != null) {
            this.PostStart = new String(source.PostStart);
        }
        if (source.PreStop != null) {
            this.PreStop = new String(source.PreStop);
        }
        if (source.Liveness != null) {
            this.Liveness = new HealthCheckConfig(source.Liveness);
        }
        if (source.Readiness != null) {
            this.Readiness = new HealthCheckConfig(source.Readiness);
        }
        if (source.HorizontalAutoscaler != null) {
            this.HorizontalAutoscaler = new HorizontalAutoscaler[source.HorizontalAutoscaler.length];
            for (int i = 0; i < source.HorizontalAutoscaler.length; i++) {
                this.HorizontalAutoscaler[i] = new HorizontalAutoscaler(source.HorizontalAutoscaler[i]);
            }
        }
        if (source.CronHorizontalAutoscaler != null) {
            this.CronHorizontalAutoscaler = new CronHorizontalAutoscaler[source.CronHorizontalAutoscaler.length];
            for (int i = 0; i < source.CronHorizontalAutoscaler.length; i++) {
                this.CronHorizontalAutoscaler[i] = new CronHorizontalAutoscaler(source.CronHorizontalAutoscaler[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.LastDeployDate != null) {
            this.LastDeployDate = new String(source.LastDeployDate);
        }
        if (source.LastDeploySuccessDate != null) {
            this.LastDeploySuccessDate = new String(source.LastDeploySuccessDate);
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfo[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfo(source.NodeInfos[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new Long(source.ImageType);
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
        if (source.EnableTracingReport != null) {
            this.EnableTracingReport = new Long(source.EnableTracingReport);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.BatchDeployStatus != null) {
            this.BatchDeployStatus = new String(source.BatchDeployStatus);
        }
        if (source.ApmInstanceId != null) {
            this.ApmInstanceId = new String(source.ApmInstanceId);
        }
        if (source.WorkloadInfo != null) {
            this.WorkloadInfo = new WorkloadInfo(source.WorkloadInfo);
        }
        if (source.SpeedUp != null) {
            this.SpeedUp = new Boolean(source.SpeedUp);
        }
        if (source.StartupProbe != null) {
            this.StartupProbe = new HealthCheckConfig(source.StartupProbe);
        }
        if (source.OsFlavour != null) {
            this.OsFlavour = new String(source.OsFlavour);
        }
        if (source.RepoServer != null) {
            this.RepoServer = new String(source.RepoServer);
        }
        if (source.UnderDeploying != null) {
            this.UnderDeploying = new Boolean(source.UnderDeploying);
        }
        if (source.EnablePrometheusConf != null) {
            this.EnablePrometheusConf = new EnablePrometheusConf(source.EnablePrometheusConf);
        }
        if (source.StoppedManually != null) {
            this.StoppedManually = new Boolean(source.StoppedManually);
        }
        if (source.TcrInstanceId != null) {
            this.TcrInstanceId = new String(source.TcrInstanceId);
        }
        if (source.EnableMetrics != null) {
            this.EnableMetrics = new Long(source.EnableMetrics);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EnableRegistry != null) {
            this.EnableRegistry = new Long(source.EnableRegistry);
        }
        if (source.AutoscalerList != null) {
            this.AutoscalerList = new Autoscaler[source.AutoscalerList.length];
            for (int i = 0; i < source.AutoscalerList.length; i++) {
                this.AutoscalerList[i] = new Autoscaler(source.AutoscalerList[i]);
            }
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
        }
        if (source.PodList != null) {
            this.PodList = new DescribeRunPodPage(source.PodList);
        }
        if (source.ConfEdited != null) {
            this.ConfEdited = new Boolean(source.ConfEdited);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PreStopEncoded != null) {
            this.PreStopEncoded = new String(source.PreStopEncoded);
        }
        if (source.PostStartEncoded != null) {
            this.PostStartEncoded = new String(source.PostStartEncoded);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PublishMode", this.PublishMode);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "ImgRepo", this.ImgRepo);
        this.setParamSimple(map, prefix + "ImgName", this.ImgName);
        this.setParamSimple(map, prefix + "ImgVersion", this.ImgVersion);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamArrayObj(map, prefix + "EnvConf.", this.EnvConf);
        this.setParamArrayObj(map, prefix + "StorageConfs.", this.StorageConfs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamArrayObj(map, prefix + "StorageMountConfs.", this.StorageMountConfs);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationDescription", this.ApplicationDescription);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "EnablePublicAccess", this.EnablePublicAccess);
        this.setParamSimple(map, prefix + "CurrentInstances", this.CurrentInstances);
        this.setParamSimple(map, prefix + "ExpectedInstances", this.ExpectedInstances);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "EsEnable", this.EsEnable);
        this.setParamSimple(map, prefix + "EsStrategy", this.EsStrategy);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "MinAliveInstances", this.MinAliveInstances);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ImageCommand", this.ImageCommand);
        this.setParamArraySimple(map, prefix + "ImageArgs.", this.ImageArgs);
        this.setParamSimple(map, prefix + "UseRegistryDefaultConfig", this.UseRegistryDefaultConfig);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamArrayObj(map, prefix + "SettingConfs.", this.SettingConfs);
        this.setParamArraySimple(map, prefix + "LogConfs.", this.LogConfs);
        this.setParamSimple(map, prefix + "PostStart", this.PostStart);
        this.setParamSimple(map, prefix + "PreStop", this.PreStop);
        this.setParamObj(map, prefix + "Liveness.", this.Liveness);
        this.setParamObj(map, prefix + "Readiness.", this.Readiness);
        this.setParamArrayObj(map, prefix + "HorizontalAutoscaler.", this.HorizontalAutoscaler);
        this.setParamArrayObj(map, prefix + "CronHorizontalAutoscaler.", this.CronHorizontalAutoscaler);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "LastDeployDate", this.LastDeployDate);
        this.setParamSimple(map, prefix + "LastDeploySuccessDate", this.LastDeploySuccessDate);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);
        this.setParamSimple(map, prefix + "EnableTracingReport", this.EnableTracingReport);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "BatchDeployStatus", this.BatchDeployStatus);
        this.setParamSimple(map, prefix + "ApmInstanceId", this.ApmInstanceId);
        this.setParamObj(map, prefix + "WorkloadInfo.", this.WorkloadInfo);
        this.setParamSimple(map, prefix + "SpeedUp", this.SpeedUp);
        this.setParamObj(map, prefix + "StartupProbe.", this.StartupProbe);
        this.setParamSimple(map, prefix + "OsFlavour", this.OsFlavour);
        this.setParamSimple(map, prefix + "RepoServer", this.RepoServer);
        this.setParamSimple(map, prefix + "UnderDeploying", this.UnderDeploying);
        this.setParamObj(map, prefix + "EnablePrometheusConf.", this.EnablePrometheusConf);
        this.setParamSimple(map, prefix + "StoppedManually", this.StoppedManually);
        this.setParamSimple(map, prefix + "TcrInstanceId", this.TcrInstanceId);
        this.setParamSimple(map, prefix + "EnableMetrics", this.EnableMetrics);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableRegistry", this.EnableRegistry);
        this.setParamArrayObj(map, prefix + "AutoscalerList.", this.AutoscalerList);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamObj(map, prefix + "PodList.", this.PodList);
        this.setParamSimple(map, prefix + "ConfEdited", this.ConfEdited);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PreStopEncoded", this.PreStopEncoded);
        this.setParamSimple(map, prefix + "PostStartEncoded", this.PostStartEncoded);

    }
}

