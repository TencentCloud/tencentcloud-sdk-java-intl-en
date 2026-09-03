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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTrainingTaskRequest extends AbstractModel {

    /**
    * Training task name. The name cannot exceed 60 characters in length, and can contain only Chinese characters, letters, digits, underscores (_), and hyphens (-). It must start with a Chinese character, letter, or digit.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Billing mode. For example, PREPAID indicates yearly/monthly subscription (resource group).
POSTPAID_BY_HOUR indicates pay-as-you-go mode.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Resource configuration. Specify the CVM instance specification ID and number of nodes. The API for querying the CVM instance specification ID is DescribeBillingSpecsPrice. For example, [{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}].
    */
    @SerializedName("ResourceConfigInfos")
    @Expose
    private ResourceConfigInfo [] ResourceConfigInfos;

    /**
    * TI Workspace ID. Used solely for the "Workspace" allowlist feature. To use this feature, please contact a TI administrator to enable allowlisting.
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * Training framework name, which can be queried via the DescribeTrainingFrameworks API. For example, SPARK, PYSPARK, TENSORFLOW, and PYTORCH.
    */
    @SerializedName("FrameworkName")
    @Expose
    private String FrameworkName;

    /**
    * Training framework version, which can be queried via the DescribeTrainingFrameworks API. For example, 1.15 and 1.9.
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * Training framework environment, which can be queried via the DescribeTrainingFrameworks API. For example, tf1.15-py3.7-cpu and torch1.9-py3.8-cuda11.1-gpu.
    */
    @SerializedName("FrameworkEnvironment")
    @Expose
    private String FrameworkEnvironment;

    /**
    * ID of the prepaid dedicated resource group, which can be queried via the DescribeBillingResourceGroups API.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Tag configuration.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Custom image information.
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * COS code package path.
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * Task startup command. Specify this parameter based on the task training mode. If the configuration fails due to special characters, use the EncodedStartCmdInfo parameter instead.
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private StartCmdInfo StartCmdInfo;

    /**
    * Training mode, which can be queried via the DescribeTrainingFrameworks API. For example, PS_WORKER, DDP, MPI, and HOROVOD.
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * Data configurations. This parameter depends on the DataSource field. The maximum number of configurations is 10.
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * VPC Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * COS training output path.
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

    /**
    * CLS logging configuration.
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * Tuning parameters. The value of this parameter cannot exceed 2048 characters in length.
    */
    @SerializedName("TuningParameters")
    @Expose
    private String TuningParameters;

    /**
    * Indicates whether to report logs.
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * Remarks. The value of this parameter cannot exceed 1024 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Data source. For example, DATASET, COS, CFS, CFSTurbo, HDFS, and GooseFSx.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * Callback URL. This parameter is used for the asynchronous callback to create, start, or stop training tasks. For the callback format and content, see [[TI-ONE API Callback Description]](https://www.tencentcloud.com/document/product/851/84292?from_cn_redirect=1).
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * Encoded task startup command. If StartCmdInfo is also configured, only this parameter takes effect.
    */
    @SerializedName("EncodedStartCmdInfo")
    @Expose
    private EncodedStartCmdInfo EncodedStartCmdInfo;

    /**
    * Code repository configuration.
    */
    @SerializedName("CodeRepos")
    @Expose
    private CodeRepoConfig [] CodeRepos;

    /**
    * Network exposure configuration.
    */
    @SerializedName("ExposeNetworkConfig")
    @Expose
    private ExposeNetworkConfig ExposeNetworkConfig;

    /**
    * Environment Variables.
    */
    @SerializedName("Envs")
    @Expose
    private EnvVar [] Envs;

    /**
    * Train tool configuration.
    */
    @SerializedName("TrainToolConfig")
    @Expose
    private TrainToolConfig TrainToolConfig;

    /**
    * Training Diagnostic Tool Configuration.
    */
    @SerializedName("ResourceSupplyAttribute")
    @Expose
    private ResourceSupplyAttribute ResourceSupplyAttribute;

    /**
    * Queue ID.
    */
    @SerializedName("Queues")
    @Expose
    private String [] Queues;

    /**
     * Get Training task name. The name cannot exceed 60 characters in length, and can contain only Chinese characters, letters, digits, underscores (_), and hyphens (-). It must start with a Chinese character, letter, or digit. 
     * @return Name Training task name. The name cannot exceed 60 characters in length, and can contain only Chinese characters, letters, digits, underscores (_), and hyphens (-). It must start with a Chinese character, letter, or digit.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Training task name. The name cannot exceed 60 characters in length, and can contain only Chinese characters, letters, digits, underscores (_), and hyphens (-). It must start with a Chinese character, letter, or digit.
     * @param Name Training task name. The name cannot exceed 60 characters in length, and can contain only Chinese characters, letters, digits, underscores (_), and hyphens (-). It must start with a Chinese character, letter, or digit.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Billing mode. For example, PREPAID indicates yearly/monthly subscription (resource group).
POSTPAID_BY_HOUR indicates pay-as-you-go mode. 
     * @return ChargeType Billing mode. For example, PREPAID indicates yearly/monthly subscription (resource group).
POSTPAID_BY_HOUR indicates pay-as-you-go mode.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode. For example, PREPAID indicates yearly/monthly subscription (resource group).
POSTPAID_BY_HOUR indicates pay-as-you-go mode.
     * @param ChargeType Billing mode. For example, PREPAID indicates yearly/monthly subscription (resource group).
POSTPAID_BY_HOUR indicates pay-as-you-go mode.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Resource configuration. Specify the CVM instance specification ID and number of nodes. The API for querying the CVM instance specification ID is DescribeBillingSpecsPrice. For example, [{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}]. 
     * @return ResourceConfigInfos Resource configuration. Specify the CVM instance specification ID and number of nodes. The API for querying the CVM instance specification ID is DescribeBillingSpecsPrice. For example, [{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}].
     */
    public ResourceConfigInfo [] getResourceConfigInfos() {
        return this.ResourceConfigInfos;
    }

    /**
     * Set Resource configuration. Specify the CVM instance specification ID and number of nodes. The API for querying the CVM instance specification ID is DescribeBillingSpecsPrice. For example, [{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}].
     * @param ResourceConfigInfos Resource configuration. Specify the CVM instance specification ID and number of nodes. The API for querying the CVM instance specification ID is DescribeBillingSpecsPrice. For example, [{"Role":"WORKER", "InstanceType": "TI.S.MEDIUM.POST", "InstanceNum": 1}].
     */
    public void setResourceConfigInfos(ResourceConfigInfo [] ResourceConfigInfos) {
        this.ResourceConfigInfos = ResourceConfigInfos;
    }

    /**
     * Get TI Workspace ID. Used solely for the "Workspace" allowlist feature. To use this feature, please contact a TI administrator to enable allowlisting. 
     * @return TiProjectId TI Workspace ID. Used solely for the "Workspace" allowlist feature. To use this feature, please contact a TI administrator to enable allowlisting.
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set TI Workspace ID. Used solely for the "Workspace" allowlist feature. To use this feature, please contact a TI administrator to enable allowlisting.
     * @param TiProjectId TI Workspace ID. Used solely for the "Workspace" allowlist feature. To use this feature, please contact a TI administrator to enable allowlisting.
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get Training framework name, which can be queried via the DescribeTrainingFrameworks API. For example, SPARK, PYSPARK, TENSORFLOW, and PYTORCH. 
     * @return FrameworkName Training framework name, which can be queried via the DescribeTrainingFrameworks API. For example, SPARK, PYSPARK, TENSORFLOW, and PYTORCH.
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set Training framework name, which can be queried via the DescribeTrainingFrameworks API. For example, SPARK, PYSPARK, TENSORFLOW, and PYTORCH.
     * @param FrameworkName Training framework name, which can be queried via the DescribeTrainingFrameworks API. For example, SPARK, PYSPARK, TENSORFLOW, and PYTORCH.
     */
    public void setFrameworkName(String FrameworkName) {
        this.FrameworkName = FrameworkName;
    }

    /**
     * Get Training framework version, which can be queried via the DescribeTrainingFrameworks API. For example, 1.15 and 1.9. 
     * @return FrameworkVersion Training framework version, which can be queried via the DescribeTrainingFrameworks API. For example, 1.15 and 1.9.
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set Training framework version, which can be queried via the DescribeTrainingFrameworks API. For example, 1.15 and 1.9.
     * @param FrameworkVersion Training framework version, which can be queried via the DescribeTrainingFrameworks API. For example, 1.15 and 1.9.
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get Training framework environment, which can be queried via the DescribeTrainingFrameworks API. For example, tf1.15-py3.7-cpu and torch1.9-py3.8-cuda11.1-gpu. 
     * @return FrameworkEnvironment Training framework environment, which can be queried via the DescribeTrainingFrameworks API. For example, tf1.15-py3.7-cpu and torch1.9-py3.8-cuda11.1-gpu.
     */
    public String getFrameworkEnvironment() {
        return this.FrameworkEnvironment;
    }

    /**
     * Set Training framework environment, which can be queried via the DescribeTrainingFrameworks API. For example, tf1.15-py3.7-cpu and torch1.9-py3.8-cuda11.1-gpu.
     * @param FrameworkEnvironment Training framework environment, which can be queried via the DescribeTrainingFrameworks API. For example, tf1.15-py3.7-cpu and torch1.9-py3.8-cuda11.1-gpu.
     */
    public void setFrameworkEnvironment(String FrameworkEnvironment) {
        this.FrameworkEnvironment = FrameworkEnvironment;
    }

    /**
     * Get ID of the prepaid dedicated resource group, which can be queried via the DescribeBillingResourceGroups API. 
     * @return ResourceGroupId ID of the prepaid dedicated resource group, which can be queried via the DescribeBillingResourceGroups API.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set ID of the prepaid dedicated resource group, which can be queried via the DescribeBillingResourceGroups API.
     * @param ResourceGroupId ID of the prepaid dedicated resource group, which can be queried via the DescribeBillingResourceGroups API.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Tag configuration. 
     * @return Tags Tag configuration.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag configuration.
     * @param Tags Tag configuration.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Custom image information. 
     * @return ImageInfo Custom image information.
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set Custom image information.
     * @param ImageInfo Custom image information.
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get COS code package path. 
     * @return CodePackagePath COS code package path.
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set COS code package path.
     * @param CodePackagePath COS code package path.
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get Task startup command. Specify this parameter based on the task training mode. If the configuration fails due to special characters, use the EncodedStartCmdInfo parameter instead. 
     * @return StartCmdInfo Task startup command. Specify this parameter based on the task training mode. If the configuration fails due to special characters, use the EncodedStartCmdInfo parameter instead.
     */
    public StartCmdInfo getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set Task startup command. Specify this parameter based on the task training mode. If the configuration fails due to special characters, use the EncodedStartCmdInfo parameter instead.
     * @param StartCmdInfo Task startup command. Specify this parameter based on the task training mode. If the configuration fails due to special characters, use the EncodedStartCmdInfo parameter instead.
     */
    public void setStartCmdInfo(StartCmdInfo StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    /**
     * Get Training mode, which can be queried via the DescribeTrainingFrameworks API. For example, PS_WORKER, DDP, MPI, and HOROVOD. 
     * @return TrainingMode Training mode, which can be queried via the DescribeTrainingFrameworks API. For example, PS_WORKER, DDP, MPI, and HOROVOD.
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set Training mode, which can be queried via the DescribeTrainingFrameworks API. For example, PS_WORKER, DDP, MPI, and HOROVOD.
     * @param TrainingMode Training mode, which can be queried via the DescribeTrainingFrameworks API. For example, PS_WORKER, DDP, MPI, and HOROVOD.
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get Data configurations. This parameter depends on the DataSource field. The maximum number of configurations is 10. 
     * @return DataConfigs Data configurations. This parameter depends on the DataSource field. The maximum number of configurations is 10.
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set Data configurations. This parameter depends on the DataSource field. The maximum number of configurations is 10.
     * @param DataConfigs Data configurations. This parameter depends on the DataSource field. The maximum number of configurations is 10.
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get VPC Id 
     * @return VpcId VPC Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC Id
     * @param VpcId VPC Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get COS training output path. 
     * @return Output COS training output path.
     */
    public CosPathInfo getOutput() {
        return this.Output;
    }

    /**
     * Set COS training output path.
     * @param Output COS training output path.
     */
    public void setOutput(CosPathInfo Output) {
        this.Output = Output;
    }

    /**
     * Get CLS logging configuration. 
     * @return LogConfig CLS logging configuration.
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set CLS logging configuration.
     * @param LogConfig CLS logging configuration.
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get Tuning parameters. The value of this parameter cannot exceed 2048 characters in length. 
     * @return TuningParameters Tuning parameters. The value of this parameter cannot exceed 2048 characters in length.
     */
    public String getTuningParameters() {
        return this.TuningParameters;
    }

    /**
     * Set Tuning parameters. The value of this parameter cannot exceed 2048 characters in length.
     * @param TuningParameters Tuning parameters. The value of this parameter cannot exceed 2048 characters in length.
     */
    public void setTuningParameters(String TuningParameters) {
        this.TuningParameters = TuningParameters;
    }

    /**
     * Get Indicates whether to report logs. 
     * @return LogEnable Indicates whether to report logs.
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set Indicates whether to report logs.
     * @param LogEnable Indicates whether to report logs.
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get Remarks. The value of this parameter cannot exceed 1024 characters. 
     * @return Remark Remarks. The value of this parameter cannot exceed 1024 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks. The value of this parameter cannot exceed 1024 characters.
     * @param Remark Remarks. The value of this parameter cannot exceed 1024 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Data source. For example, DATASET, COS, CFS, CFSTurbo, HDFS, and GooseFSx. 
     * @return DataSource Data source. For example, DATASET, COS, CFS, CFSTurbo, HDFS, and GooseFSx.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source. For example, DATASET, COS, CFS, CFSTurbo, HDFS, and GooseFSx.
     * @param DataSource Data source. For example, DATASET, COS, CFS, CFSTurbo, HDFS, and GooseFSx.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get Callback URL. This parameter is used for the asynchronous callback to create, start, or stop training tasks. For the callback format and content, see [[TI-ONE API Callback Description]](https://www.tencentcloud.com/document/product/851/84292?from_cn_redirect=1). 
     * @return CallbackUrl Callback URL. This parameter is used for the asynchronous callback to create, start, or stop training tasks. For the callback format and content, see [[TI-ONE API Callback Description]](https://www.tencentcloud.com/document/product/851/84292?from_cn_redirect=1).
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set Callback URL. This parameter is used for the asynchronous callback to create, start, or stop training tasks. For the callback format and content, see [[TI-ONE API Callback Description]](https://www.tencentcloud.com/document/product/851/84292?from_cn_redirect=1).
     * @param CallbackUrl Callback URL. This parameter is used for the asynchronous callback to create, start, or stop training tasks. For the callback format and content, see [[TI-ONE API Callback Description]](https://www.tencentcloud.com/document/product/851/84292?from_cn_redirect=1).
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get Encoded task startup command. If StartCmdInfo is also configured, only this parameter takes effect. 
     * @return EncodedStartCmdInfo Encoded task startup command. If StartCmdInfo is also configured, only this parameter takes effect.
     */
    public EncodedStartCmdInfo getEncodedStartCmdInfo() {
        return this.EncodedStartCmdInfo;
    }

    /**
     * Set Encoded task startup command. If StartCmdInfo is also configured, only this parameter takes effect.
     * @param EncodedStartCmdInfo Encoded task startup command. If StartCmdInfo is also configured, only this parameter takes effect.
     */
    public void setEncodedStartCmdInfo(EncodedStartCmdInfo EncodedStartCmdInfo) {
        this.EncodedStartCmdInfo = EncodedStartCmdInfo;
    }

    /**
     * Get Code repository configuration. 
     * @return CodeRepos Code repository configuration.
     */
    public CodeRepoConfig [] getCodeRepos() {
        return this.CodeRepos;
    }

    /**
     * Set Code repository configuration.
     * @param CodeRepos Code repository configuration.
     */
    public void setCodeRepos(CodeRepoConfig [] CodeRepos) {
        this.CodeRepos = CodeRepos;
    }

    /**
     * Get Network exposure configuration. 
     * @return ExposeNetworkConfig Network exposure configuration.
     */
    public ExposeNetworkConfig getExposeNetworkConfig() {
        return this.ExposeNetworkConfig;
    }

    /**
     * Set Network exposure configuration.
     * @param ExposeNetworkConfig Network exposure configuration.
     */
    public void setExposeNetworkConfig(ExposeNetworkConfig ExposeNetworkConfig) {
        this.ExposeNetworkConfig = ExposeNetworkConfig;
    }

    /**
     * Get Environment Variables. 
     * @return Envs Environment Variables.
     */
    public EnvVar [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set Environment Variables.
     * @param Envs Environment Variables.
     */
    public void setEnvs(EnvVar [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get Train tool configuration. 
     * @return TrainToolConfig Train tool configuration.
     */
    public TrainToolConfig getTrainToolConfig() {
        return this.TrainToolConfig;
    }

    /**
     * Set Train tool configuration.
     * @param TrainToolConfig Train tool configuration.
     */
    public void setTrainToolConfig(TrainToolConfig TrainToolConfig) {
        this.TrainToolConfig = TrainToolConfig;
    }

    /**
     * Get Training Diagnostic Tool Configuration. 
     * @return ResourceSupplyAttribute Training Diagnostic Tool Configuration.
     */
    public ResourceSupplyAttribute getResourceSupplyAttribute() {
        return this.ResourceSupplyAttribute;
    }

    /**
     * Set Training Diagnostic Tool Configuration.
     * @param ResourceSupplyAttribute Training Diagnostic Tool Configuration.
     */
    public void setResourceSupplyAttribute(ResourceSupplyAttribute ResourceSupplyAttribute) {
        this.ResourceSupplyAttribute = ResourceSupplyAttribute;
    }

    /**
     * Get Queue ID. 
     * @return Queues Queue ID.
     */
    public String [] getQueues() {
        return this.Queues;
    }

    /**
     * Set Queue ID.
     * @param Queues Queue ID.
     */
    public void setQueues(String [] Queues) {
        this.Queues = Queues;
    }

    public CreateTrainingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrainingTaskRequest(CreateTrainingTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConfigInfos != null) {
            this.ResourceConfigInfos = new ResourceConfigInfo[source.ResourceConfigInfos.length];
            for (int i = 0; i < source.ResourceConfigInfos.length; i++) {
                this.ResourceConfigInfos[i] = new ResourceConfigInfo(source.ResourceConfigInfos[i]);
            }
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.FrameworkName != null) {
            this.FrameworkName = new String(source.FrameworkName);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.FrameworkEnvironment != null) {
            this.FrameworkEnvironment = new String(source.FrameworkEnvironment);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.CodePackagePath != null) {
            this.CodePackagePath = new CosPathInfo(source.CodePackagePath);
        }
        if (source.StartCmdInfo != null) {
            this.StartCmdInfo = new StartCmdInfo(source.StartCmdInfo);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Output != null) {
            this.Output = new CosPathInfo(source.Output);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.TuningParameters != null) {
            this.TuningParameters = new String(source.TuningParameters);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.EncodedStartCmdInfo != null) {
            this.EncodedStartCmdInfo = new EncodedStartCmdInfo(source.EncodedStartCmdInfo);
        }
        if (source.CodeRepos != null) {
            this.CodeRepos = new CodeRepoConfig[source.CodeRepos.length];
            for (int i = 0; i < source.CodeRepos.length; i++) {
                this.CodeRepos[i] = new CodeRepoConfig(source.CodeRepos[i]);
            }
        }
        if (source.ExposeNetworkConfig != null) {
            this.ExposeNetworkConfig = new ExposeNetworkConfig(source.ExposeNetworkConfig);
        }
        if (source.Envs != null) {
            this.Envs = new EnvVar[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new EnvVar(source.Envs[i]);
            }
        }
        if (source.TrainToolConfig != null) {
            this.TrainToolConfig = new TrainToolConfig(source.TrainToolConfig);
        }
        if (source.ResourceSupplyAttribute != null) {
            this.ResourceSupplyAttribute = new ResourceSupplyAttribute(source.ResourceSupplyAttribute);
        }
        if (source.Queues != null) {
            this.Queues = new String[source.Queues.length];
            for (int i = 0; i < source.Queues.length; i++) {
                this.Queues[i] = new String(source.Queues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "FrameworkEnvironment", this.FrameworkEnvironment);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodePackagePath.", this.CodePackagePath);
        this.setParamObj(map, prefix + "StartCmdInfo.", this.StartCmdInfo);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "TuningParameters", this.TuningParameters);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "EncodedStartCmdInfo.", this.EncodedStartCmdInfo);
        this.setParamArrayObj(map, prefix + "CodeRepos.", this.CodeRepos);
        this.setParamObj(map, prefix + "ExposeNetworkConfig.", this.ExposeNetworkConfig);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamObj(map, prefix + "TrainToolConfig.", this.TrainToolConfig);
        this.setParamObj(map, prefix + "ResourceSupplyAttribute.", this.ResourceSupplyAttribute);
        this.setParamArraySimple(map, prefix + "Queues.", this.Queues);

    }
}

