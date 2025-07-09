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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployServiceV2Request extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Container port
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

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
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

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
    * Auto scaling configuration. If this parameter is left empty, auto scaling will not be enabled
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
    * Deployment type.
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * When the deployment type is `IMAGE`, this parameter indicates the image tag.
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number.
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * Package name, which is required when using JAR or WAR packages for deployment.
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * JDK version.
- KONA: use KONA JDK.
- OPEN: use open JDK.
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
    * Service port mapping.
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
    * Whether to add the registry’s default configurations.
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
    * EKS access configuration
    */
    @SerializedName("EksService")
    @Expose
    private EksService EksService;

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
    * Configuration of 
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

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
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Container port 
     * @return ContainerPort Container port
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set Container port
     * @param ContainerPort Container port
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
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
     * @return NamespaceId Environment ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Environment ID
     * @param NamespaceId Environment ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
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
     * Get Auto scaling configuration. If this parameter is left empty, auto scaling will not be enabled 
     * @return EsInfo Auto scaling configuration. If this parameter is left empty, auto scaling will not be enabled
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set Auto scaling configuration. If this parameter is left empty, auto scaling will not be enabled
     * @param EsInfo Auto scaling configuration. If this parameter is left empty, auto scaling will not be enabled
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
     * Get Deployment type.
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image 
     * @return DeployMode Deployment type.
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment type.
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     * @param DeployMode Deployment type.
- JAR: deployment through JAR package
- WAR: deployment through WAR package
- IMAGE: deployment through image
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get When the deployment type is `IMAGE`, this parameter indicates the image tag.
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number. 
     * @return DeployVersion When the deployment type is `IMAGE`, this parameter indicates the image tag.
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number.
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set When the deployment type is `IMAGE`, this parameter indicates the image tag.
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number.
     * @param DeployVersion When the deployment type is `IMAGE`, this parameter indicates the image tag.
When the deployment type is `JAR` or `WAR`, this parameter indicates the package version number.
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get Package name, which is required when using JAR or WAR packages for deployment. 
     * @return PkgName Package name, which is required when using JAR or WAR packages for deployment.
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set Package name, which is required when using JAR or WAR packages for deployment.
     * @param PkgName Package name, which is required when using JAR or WAR packages for deployment.
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get JDK version.
- KONA: use KONA JDK.
- OPEN: use open JDK. 
     * @return JdkVersion JDK version.
- KONA: use KONA JDK.
- OPEN: use open JDK.
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK version.
- KONA: use KONA JDK.
- OPEN: use open JDK.
     * @param JdkVersion JDK version.
- KONA: use KONA JDK.
- OPEN: use open JDK.
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
     * Get Service port mapping. 
     * @return PortMappings Service port mapping.
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set Service port mapping.
     * @param PortMappings Service port mapping.
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
    }

    /**
     * Get Whether to add the registry’s default configurations. 
     * @return UseRegistryDefaultConfig Whether to add the registry’s default configurations.
     */
    public Boolean getUseRegistryDefaultConfig() {
        return this.UseRegistryDefaultConfig;
    }

    /**
     * Set Whether to add the registry’s default configurations.
     * @param UseRegistryDefaultConfig Whether to add the registry’s default configurations.
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
     * Get EKS access configuration 
     * @return EksService EKS access configuration
     */
    public EksService getEksService() {
        return this.EksService;
    }

    /**
     * Set EKS access configuration
     * @param EksService EKS access configuration
     */
    public void setEksService(EksService EksService) {
        this.EksService = EksService;
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
     * Get Configuration of  
     * @return DeployStrategyConf Configuration of 
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set Configuration of 
     * @param DeployStrategyConf Configuration of 
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
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

    public DeployServiceV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployServiceV2Request(DeployServiceV2Request source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
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
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
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
        if (source.PortMappings != null) {
            this.PortMappings = new PortMapping[source.PortMappings.length];
            for (int i = 0; i < source.PortMappings.length; i++) {
                this.PortMappings[i] = new PortMapping(source.PortMappings[i]);
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
        if (source.EksService != null) {
            this.EksService = new EksService(source.EksService);
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
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
        }
        if (source.Liveness != null) {
            this.Liveness = new HealthCheckConfig(source.Liveness);
        }
        if (source.Readiness != null) {
            this.Readiness = new HealthCheckConfig(source.Readiness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
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
        this.setParamArrayObj(map, prefix + "PortMappings.", this.PortMappings);
        this.setParamSimple(map, prefix + "UseRegistryDefaultConfig", this.UseRegistryDefaultConfig);
        this.setParamArrayObj(map, prefix + "SettingConfs.", this.SettingConfs);
        this.setParamObj(map, prefix + "EksService.", this.EksService);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "PostStart", this.PostStart);
        this.setParamSimple(map, prefix + "PreStop", this.PreStop);
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamObj(map, prefix + "Liveness.", this.Liveness);
        this.setParamObj(map, prefix + "Readiness.", this.Readiness);

    }
}

