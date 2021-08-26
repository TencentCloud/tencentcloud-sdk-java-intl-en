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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployApplicationRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Number of initialized pods
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
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Image repository
    */
    @SerializedName("ImgRepo")
    @Expose
    private String ImgRepo;

    /**
    * Version description
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * Launch parameters
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * Auto scaling configuration (This field is disused. Please use `HorizontalAutoscaler` to set the auto scaling policy.)
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * Environment variable configuration
    */
    @SerializedName("EnvConf")
    @Expose
    private Pair [] EnvConf;

    /**
    * Log configuration
    */
    @SerializedName("LogConfs")
    @Expose
    private String [] LogConfs;

    /**
    * Data volume configuration
    */
    @SerializedName("StorageConfs")
    @Expose
    private StorageConf [] StorageConfs;

    /**
    * Data volume mount configuration
    */
    @SerializedName("StorageMountConfs")
    @Expose
    private StorageMountConf [] StorageMountConfs;

    /**
    * Deployment type
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * When the deployment type is `IMAGE`, this parameter indicates the image tag
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * Package name, which is required when using JAR or WAR packages for deployment
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * JDK version
- KONA: use KONA JDK
- OPEN: use open JDK
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * Security group IDs
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Log output configuration
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * Source channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Version description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Image command
    */
    @SerializedName("ImageCommand")
    @Expose
    private String ImageCommand;

    /**
    * Image command parameters
    */
    @SerializedName("ImageArgs")
    @Expose
    private String [] ImageArgs;

    /**
    * Whether to add the registry's default configurations
    */
    @SerializedName("UseRegistryDefaultConfig")
    @Expose
    private Boolean UseRegistryDefaultConfig;

    /**
    * Mounting configurations
    */
    @SerializedName("SettingConfs")
    @Expose
    private MountedSettingConf [] SettingConfs;

    /**
    * Application access configuration
    */
    @SerializedName("Service")
    @Expose
    private EksService Service;

    /**
    * ID of the version that you want to roll back to
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * The script to run after startup
    */
    @SerializedName("PostStart")
    @Expose
    private String PostStart;

    /**
    * The script to run before stop
    */
    @SerializedName("PreStop")
    @Expose
    private String PreStop;

    /**
    * Configuration of aliveness probe
    */
    @SerializedName("Liveness")
    @Expose
    private HealthCheckConfig Liveness;

    /**
    * Configuration of readiness probe
    */
    @SerializedName("Readiness")
    @Expose
    private HealthCheckConfig Readiness;

    /**
    * Configuration of batch release policies
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

    /**
    * Auto scaling policy
    */
    @SerializedName("HorizontalAutoscaler")
    @Expose
    private HorizontalAutoscaler [] HorizontalAutoscaler;

    /**
    * Scheduled auto scaling policy
    */
    @SerializedName("CronHorizontalAutoscaler")
    @Expose
    private CronHorizontalAutoscaler [] CronHorizontalAutoscaler;

    /**
    * 
    */
    @SerializedName("LogEnable")
    @Expose
    private Long LogEnable;

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
     * Get Number of initialized pods 
     * @return InitPodNum Number of initialized pods
     */
    public Long getInitPodNum() {
        return this.InitPodNum;
    }

    /**
     * Set Number of initialized pods
     * @param InitPodNum Number of initialized pods
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
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Image repository 
     * @return ImgRepo Image repository
     */
    public String getImgRepo() {
        return this.ImgRepo;
    }

    /**
     * Set Image repository
     * @param ImgRepo Image repository
     */
    public void setImgRepo(String ImgRepo) {
        this.ImgRepo = ImgRepo;
    }

    /**
     * Get Version description 
     * @return VersionDesc Version description
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set Version description
     * @param VersionDesc Version description
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get Launch parameters 
     * @return JvmOpts Launch parameters
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set Launch parameters
     * @param JvmOpts Launch parameters
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get Auto scaling configuration (This field is disused. Please use `HorizontalAutoscaler` to set the auto scaling policy.) 
     * @return EsInfo Auto scaling configuration (This field is disused. Please use `HorizontalAutoscaler` to set the auto scaling policy.)
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set Auto scaling configuration (This field is disused. Please use `HorizontalAutoscaler` to set the auto scaling policy.)
     * @param EsInfo Auto scaling configuration (This field is disused. Please use `HorizontalAutoscaler` to set the auto scaling policy.)
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get Environment variable configuration 
     * @return EnvConf Environment variable configuration
     */
    public Pair [] getEnvConf() {
        return this.EnvConf;
    }

    /**
     * Set Environment variable configuration
     * @param EnvConf Environment variable configuration
     */
    public void setEnvConf(Pair [] EnvConf) {
        this.EnvConf = EnvConf;
    }

    /**
     * Get Log configuration 
     * @return LogConfs Log configuration
     */
    public String [] getLogConfs() {
        return this.LogConfs;
    }

    /**
     * Set Log configuration
     * @param LogConfs Log configuration
     */
    public void setLogConfs(String [] LogConfs) {
        this.LogConfs = LogConfs;
    }

    /**
     * Get Data volume configuration 
     * @return StorageConfs Data volume configuration
     */
    public StorageConf [] getStorageConfs() {
        return this.StorageConfs;
    }

    /**
     * Set Data volume configuration
     * @param StorageConfs Data volume configuration
     */
    public void setStorageConfs(StorageConf [] StorageConfs) {
        this.StorageConfs = StorageConfs;
    }

    /**
     * Get Data volume mount configuration 
     * @return StorageMountConfs Data volume mount configuration
     */
    public StorageMountConf [] getStorageMountConfs() {
        return this.StorageMountConfs;
    }

    /**
     * Set Data volume mount configuration
     * @param StorageMountConfs Data volume mount configuration
     */
    public void setStorageMountConfs(StorageMountConf [] StorageMountConfs) {
        this.StorageMountConfs = StorageMountConfs;
    }

    /**
     * Get Deployment type
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image 
     * @return DeployMode Deployment type
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment type
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     * @param DeployMode Deployment type
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get When the deployment type is `IMAGE`, this parameter indicates the image tag
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number 
     * @return DeployVersion When the deployment type is `IMAGE`, this parameter indicates the image tag
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set When the deployment type is `IMAGE`, this parameter indicates the image tag
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number
     * @param DeployVersion When the deployment type is `IMAGE`, this parameter indicates the image tag
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get Package name, which is required when using JAR or WAR packages for deployment 
     * @return PkgName Package name, which is required when using JAR or WAR packages for deployment
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Package name, which is required when using JAR or WAR packages for deployment
     * @param PkgName Package name, which is required when using JAR or WAR packages for deployment
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get JDK version
- KONA: use KONA JDK
- OPEN: use open JDK 
     * @return JdkVersion JDK version
- KONA: use KONA JDK
- OPEN: use open JDK
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK version
- KONA: use KONA JDK
- OPEN: use open JDK
     * @param JdkVersion JDK version
- KONA: use KONA JDK
- OPEN: use open JDK
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get Security group IDs 
     * @return SecurityGroupIds Security group IDs
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group IDs
     * @param SecurityGroupIds Security group IDs
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Log output configuration 
     * @return LogOutputConf Log output configuration
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set Log output configuration
     * @param LogOutputConf Log output configuration
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get Source channel 
     * @return SourceChannel Source channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel
     * @param SourceChannel Source channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Version description 
     * @return Description Version description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Version description
     * @param Description Version description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Image command 
     * @return ImageCommand Image command
     */
    public String getImageCommand() {
        return this.ImageCommand;
    }

    /**
     * Set Image command
     * @param ImageCommand Image command
     */
    public void setImageCommand(String ImageCommand) {
        this.ImageCommand = ImageCommand;
    }

    /**
     * Get Image command parameters 
     * @return ImageArgs Image command parameters
     */
    public String [] getImageArgs() {
        return this.ImageArgs;
    }

    /**
     * Set Image command parameters
     * @param ImageArgs Image command parameters
     */
    public void setImageArgs(String [] ImageArgs) {
        this.ImageArgs = ImageArgs;
    }

    /**
     * Get Whether to add the registry's default configurations 
     * @return UseRegistryDefaultConfig Whether to add the registry's default configurations
     */
    public Boolean getUseRegistryDefaultConfig() {
        return this.UseRegistryDefaultConfig;
    }

    /**
     * Set Whether to add the registry's default configurations
     * @param UseRegistryDefaultConfig Whether to add the registry's default configurations
     */
    public void setUseRegistryDefaultConfig(Boolean UseRegistryDefaultConfig) {
        this.UseRegistryDefaultConfig = UseRegistryDefaultConfig;
    }

    /**
     * Get Mounting configurations 
     * @return SettingConfs Mounting configurations
     */
    public MountedSettingConf [] getSettingConfs() {
        return this.SettingConfs;
    }

    /**
     * Set Mounting configurations
     * @param SettingConfs Mounting configurations
     */
    public void setSettingConfs(MountedSettingConf [] SettingConfs) {
        this.SettingConfs = SettingConfs;
    }

    /**
     * Get Application access configuration 
     * @return Service Application access configuration
     */
    public EksService getService() {
        return this.Service;
    }

    /**
     * Set Application access configuration
     * @param Service Application access configuration
     */
    public void setService(EksService Service) {
        this.Service = Service;
    }

    /**
     * Get ID of the version that you want to roll back to 
     * @return VersionId ID of the version that you want to roll back to
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the version that you want to roll back to
     * @param VersionId ID of the version that you want to roll back to
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get The script to run after startup 
     * @return PostStart The script to run after startup
     */
    public String getPostStart() {
        return this.PostStart;
    }

    /**
     * Set The script to run after startup
     * @param PostStart The script to run after startup
     */
    public void setPostStart(String PostStart) {
        this.PostStart = PostStart;
    }

    /**
     * Get The script to run before stop 
     * @return PreStop The script to run before stop
     */
    public String getPreStop() {
        return this.PreStop;
    }

    /**
     * Set The script to run before stop
     * @param PreStop The script to run before stop
     */
    public void setPreStop(String PreStop) {
        this.PreStop = PreStop;
    }

    /**
     * Get Configuration of aliveness probe 
     * @return Liveness Configuration of aliveness probe
     */
    public HealthCheckConfig getLiveness() {
        return this.Liveness;
    }

    /**
     * Set Configuration of aliveness probe
     * @param Liveness Configuration of aliveness probe
     */
    public void setLiveness(HealthCheckConfig Liveness) {
        this.Liveness = Liveness;
    }

    /**
     * Get Configuration of readiness probe 
     * @return Readiness Configuration of readiness probe
     */
    public HealthCheckConfig getReadiness() {
        return this.Readiness;
    }

    /**
     * Set Configuration of readiness probe
     * @param Readiness Configuration of readiness probe
     */
    public void setReadiness(HealthCheckConfig Readiness) {
        this.Readiness = Readiness;
    }

    /**
     * Get Configuration of batch release policies 
     * @return DeployStrategyConf Configuration of batch release policies
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set Configuration of batch release policies
     * @param DeployStrategyConf Configuration of batch release policies
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
    }

    /**
     * Get Auto scaling policy 
     * @return HorizontalAutoscaler Auto scaling policy
     */
    public HorizontalAutoscaler [] getHorizontalAutoscaler() {
        return this.HorizontalAutoscaler;
    }

    /**
     * Set Auto scaling policy
     * @param HorizontalAutoscaler Auto scaling policy
     */
    public void setHorizontalAutoscaler(HorizontalAutoscaler [] HorizontalAutoscaler) {
        this.HorizontalAutoscaler = HorizontalAutoscaler;
    }

    /**
     * Get Scheduled auto scaling policy 
     * @return CronHorizontalAutoscaler Scheduled auto scaling policy
     */
    public CronHorizontalAutoscaler [] getCronHorizontalAutoscaler() {
        return this.CronHorizontalAutoscaler;
    }

    /**
     * Set Scheduled auto scaling policy
     * @param CronHorizontalAutoscaler Scheduled auto scaling policy
     */
    public void setCronHorizontalAutoscaler(CronHorizontalAutoscaler [] CronHorizontalAutoscaler) {
        this.CronHorizontalAutoscaler = CronHorizontalAutoscaler;
    }

    /**
     * Get  
     * @return LogEnable 
     */
    public Long getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 
     * @param LogEnable 
     */
    public void setLogEnable(Long LogEnable) {
        this.LogEnable = LogEnable;
    }

    public DeployApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployApplicationRequest(DeployApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
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
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ImgRepo != null) {
            this.ImgRepo = new String(source.ImgRepo);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
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
        if (source.LogConfs != null) {
            this.LogConfs = new String[source.LogConfs.length];
            for (int i = 0; i < source.LogConfs.length; i++) {
                this.LogConfs[i] = new String(source.LogConfs[i]);
            }
        }
        if (source.StorageConfs != null) {
            this.StorageConfs = new StorageConf[source.StorageConfs.length];
            for (int i = 0; i < source.StorageConfs.length; i++) {
                this.StorageConfs[i] = new StorageConf(source.StorageConfs[i]);
            }
        }
        if (source.StorageMountConfs != null) {
            this.StorageMountConfs = new StorageMountConf[source.StorageMountConfs.length];
            for (int i = 0; i < source.StorageMountConfs.length; i++) {
                this.StorageMountConfs[i] = new StorageMountConf(source.StorageMountConfs[i]);
            }
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.SettingConfs != null) {
            this.SettingConfs = new MountedSettingConf[source.SettingConfs.length];
            for (int i = 0; i < source.SettingConfs.length; i++) {
                this.SettingConfs[i] = new MountedSettingConf(source.SettingConfs[i]);
            }
        }
        if (source.Service != null) {
            this.Service = new EksService(source.Service);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
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
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
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
        if (source.LogEnable != null) {
            this.LogEnable = new Long(source.LogEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ImgRepo", this.ImgRepo);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamArrayObj(map, prefix + "EnvConf.", this.EnvConf);
        this.setParamArraySimple(map, prefix + "LogConfs.", this.LogConfs);
        this.setParamArrayObj(map, prefix + "StorageConfs.", this.StorageConfs);
        this.setParamArrayObj(map, prefix + "StorageMountConfs.", this.StorageMountConfs);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ImageCommand", this.ImageCommand);
        this.setParamArraySimple(map, prefix + "ImageArgs.", this.ImageArgs);
        this.setParamSimple(map, prefix + "UseRegistryDefaultConfig", this.UseRegistryDefaultConfig);
        this.setParamArrayObj(map, prefix + "SettingConfs.", this.SettingConfs);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "PostStart", this.PostStart);
        this.setParamSimple(map, prefix + "PreStop", this.PreStop);
        this.setParamObj(map, prefix + "Liveness.", this.Liveness);
        this.setParamObj(map, prefix + "Readiness.", this.Readiness);
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamArrayObj(map, prefix + "HorizontalAutoscaler.", this.HorizontalAutoscaler);
        this.setParamArrayObj(map, prefix + "CronHorizontalAutoscaler.", this.CronHorizontalAutoscaler);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);

    }
}

