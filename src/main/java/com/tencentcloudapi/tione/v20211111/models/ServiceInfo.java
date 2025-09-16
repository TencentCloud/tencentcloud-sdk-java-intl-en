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

public class ServiceInfo extends AbstractModel {

    /**
    * Expected number of running Pods. The instance is 0 when the stop status is reached.Corresponding relationships under different billing and scaling modes are as follows.PREPAID and POSTPAID_BY_HOUR:Corresponding number of instances in the manual scaling mode.Corresponding number of instances based on the default time-based policy in the auto-scaling mode.HYBRID_PAID:
Corresponding number of instances for postpaid instances in the manual scaling mode.Corresponding number of instances under the default time-based policy for postpaid instances in the auto-scaling mode.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Image information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * Environment variables.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Env")
    @Expose
    private EnvVar [] Env;

    /**
    * Resource information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo Resources;

    /**
    * Type specifications corresponding to the postpaid instance.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Model information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * Whether to enable logs.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * Log configurations.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * Whether to enable authentication.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * HPA configurations.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * Description of the service status.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private WorkloadStatus Status;

    /**
    * Weight.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Total resources.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTotal")
    @Expose
    private ResourceInfo ResourceTotal;

    /**
    * Number of historical instances.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldReplicas")
    @Expose
    private Long OldReplicas;

    /**
    * This parameter is valid when the billing mode is HYBRID_PAID, and is used to identify the number of prepaid instances in the hybrid billing mode. The default value is 1 if this parameter is left unspecified.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HybridBillingPrepaidReplicas")
    @Expose
    private Long HybridBillingPrepaidReplicas;

    /**
    * Number of instances during the historical HYBRID_PAID period. The user restores services.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldHybridBillingPrepaidReplicas")
    @Expose
    private Long OldHybridBillingPrepaidReplicas;

    /**
    * Whether to enable hot update for the model. By default, hot update is disabled.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModelHotUpdateEnable")
    @Expose
    private Boolean ModelHotUpdateEnable;

    /**
    * Service specification alias.
    */
    @SerializedName("InstanceAlias")
    @Expose
    private String InstanceAlias;

    /**
    * Instance quantity adjusting mode. Defaults to manual.Supported valid values: AUTO (automatic), MANUAL (manual).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * Scheduled scaling task.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CronScaleJobs")
    @Expose
    private CronScaleJob [] CronScaleJobs;

    /**
    * Scheduled scaling policy.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScaleStrategy")
    @Expose
    private String ScaleStrategy;

    /**
    * Configurations of the scheduled stop.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * Instance list.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodList")
    @Expose
    private String [] PodList;

    /**
    * Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pods")
    @Expose
    private Pod Pods;

    /**
    * Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodInfos")
    @Expose
    private Pod [] PodInfos;

    /**
    * Configurations related to speed limit and throttling of services.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * Whether to enable model acceleration, which is only valid for models in the StableDiffusion (dynamic acceleration) format.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModelTurboEnable")
    @Expose
    private Boolean ModelTurboEnable;

    /**
    * Mounting.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VolumeMount")
    @Expose
    private VolumeMount VolumeMount;

    /**
    * Inference code information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InferCodeInfo")
    @Expose
    private InferCodeInfo InferCodeInfo;

    /**
    * Service startup command.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Settings of enabling the TI-ONE private network to access external resources.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceEIP")
    @Expose
    private ServiceEIP ServiceEIP;

    /**
    * Service port, with the default value of 8501.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServicePort")
    @Expose
    private Long ServicePort;

    /**
    * Graceful exit time limit of the service, in seconds. Default value: 30. Minimum value: 1.
    */
    @SerializedName("TerminationGracePeriodSeconds")
    @Expose
    private Long TerminationGracePeriodSeconds;

    /**
    * Command executed before the service instance stops. The instance ends after the command execution is completed or after the execution time exceeds the graceful exit time limit.
    */
    @SerializedName("PreStopCommand")
    @Expose
    private String [] PreStopCommand;

    /**
    * Whether to enable the gRPC port.
    */
    @SerializedName("GrpcEnable")
    @Expose
    private Boolean GrpcEnable;

    /**
    * Health probe.
    */
    @SerializedName("HealthProbe")
    @Expose
    private HealthProbe HealthProbe;

    /**
    * Rolling update configurations.
    */
    @SerializedName("RollingUpdate")
    @Expose
    private RollingUpdate RollingUpdate;

    /**
    * Number of instances per replica. This parameter is valid only when the deployment type is DIST or ROLE. Default value: 1.
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private Long InstancePerReplicas;

    /**
    * Batch data disk mounting configurations.
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
     * Get Expected number of running Pods. The instance is 0 when the stop status is reached.Corresponding relationships under different billing and scaling modes are as follows.PREPAID and POSTPAID_BY_HOUR:Corresponding number of instances in the manual scaling mode.Corresponding number of instances based on the default time-based policy in the auto-scaling mode.HYBRID_PAID:
Corresponding number of instances for postpaid instances in the manual scaling mode.Corresponding number of instances under the default time-based policy for postpaid instances in the auto-scaling mode.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Replicas Expected number of running Pods. The instance is 0 when the stop status is reached.Corresponding relationships under different billing and scaling modes are as follows.PREPAID and POSTPAID_BY_HOUR:Corresponding number of instances in the manual scaling mode.Corresponding number of instances based on the default time-based policy in the auto-scaling mode.HYBRID_PAID:
Corresponding number of instances for postpaid instances in the manual scaling mode.Corresponding number of instances under the default time-based policy for postpaid instances in the auto-scaling mode.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Expected number of running Pods. The instance is 0 when the stop status is reached.Corresponding relationships under different billing and scaling modes are as follows.PREPAID and POSTPAID_BY_HOUR:Corresponding number of instances in the manual scaling mode.Corresponding number of instances based on the default time-based policy in the auto-scaling mode.HYBRID_PAID:
Corresponding number of instances for postpaid instances in the manual scaling mode.Corresponding number of instances under the default time-based policy for postpaid instances in the auto-scaling mode.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Replicas Expected number of running Pods. The instance is 0 when the stop status is reached.Corresponding relationships under different billing and scaling modes are as follows.PREPAID and POSTPAID_BY_HOUR:Corresponding number of instances in the manual scaling mode.Corresponding number of instances based on the default time-based policy in the auto-scaling mode.HYBRID_PAID:
Corresponding number of instances for postpaid instances in the manual scaling mode.Corresponding number of instances under the default time-based policy for postpaid instances in the auto-scaling mode.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Image information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageInfo Image information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set Image information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageInfo Image information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get Environment variables.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Env Environment variables.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EnvVar [] getEnv() {
        return this.Env;
    }

    /**
     * Set Environment variables.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Env Environment variables.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnv(EnvVar [] Env) {
        this.Env = Env;
    }

    /**
     * Get Resource information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resources Resource information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set Resource information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resources Resource information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResources(ResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Type specifications corresponding to the postpaid instance.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Type specifications corresponding to the postpaid instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Type specifications corresponding to the postpaid instance.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Type specifications corresponding to the postpaid instance.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Model information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModelInfo Model information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set Model information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModelInfo Model information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
    }

    /**
     * Get Whether to enable logs.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogEnable Whether to enable logs.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set Whether to enable logs.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogEnable Whether to enable logs.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get Log configurations.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogConfig Log configurations.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set Log configurations.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogConfig Log configurations.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get Whether to enable authentication.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizationEnable Whether to enable authentication.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set Whether to enable authentication.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthorizationEnable Whether to enable authentication.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get HPA configurations.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HorizontalPodAutoscaler HPA configurations.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set HPA configurations.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HorizontalPodAutoscaler HPA configurations.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get Description of the service status.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Description of the service status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkloadStatus getStatus() {
        return this.Status;
    }

    /**
     * Set Description of the service status.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Description of the service status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(WorkloadStatus Status) {
        this.Status = Status;
    }

    /**
     * Get Weight.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Weight.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Weight.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Total resources.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceTotal Total resources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceInfo getResourceTotal() {
        return this.ResourceTotal;
    }

    /**
     * Set Total resources.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceTotal Total resources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceTotal(ResourceInfo ResourceTotal) {
        this.ResourceTotal = ResourceTotal;
    }

    /**
     * Get Number of historical instances.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OldReplicas Number of historical instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOldReplicas() {
        return this.OldReplicas;
    }

    /**
     * Set Number of historical instances.Note: This field may return null, indicating that no valid values can be obtained.
     * @param OldReplicas Number of historical instances.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOldReplicas(Long OldReplicas) {
        this.OldReplicas = OldReplicas;
    }

    /**
     * Get This parameter is valid when the billing mode is HYBRID_PAID, and is used to identify the number of prepaid instances in the hybrid billing mode. The default value is 1 if this parameter is left unspecified.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HybridBillingPrepaidReplicas This parameter is valid when the billing mode is HYBRID_PAID, and is used to identify the number of prepaid instances in the hybrid billing mode. The default value is 1 if this parameter is left unspecified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHybridBillingPrepaidReplicas() {
        return this.HybridBillingPrepaidReplicas;
    }

    /**
     * Set This parameter is valid when the billing mode is HYBRID_PAID, and is used to identify the number of prepaid instances in the hybrid billing mode. The default value is 1 if this parameter is left unspecified.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HybridBillingPrepaidReplicas This parameter is valid when the billing mode is HYBRID_PAID, and is used to identify the number of prepaid instances in the hybrid billing mode. The default value is 1 if this parameter is left unspecified.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHybridBillingPrepaidReplicas(Long HybridBillingPrepaidReplicas) {
        this.HybridBillingPrepaidReplicas = HybridBillingPrepaidReplicas;
    }

    /**
     * Get Number of instances during the historical HYBRID_PAID period. The user restores services.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OldHybridBillingPrepaidReplicas Number of instances during the historical HYBRID_PAID period. The user restores services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOldHybridBillingPrepaidReplicas() {
        return this.OldHybridBillingPrepaidReplicas;
    }

    /**
     * Set Number of instances during the historical HYBRID_PAID period. The user restores services.Note: This field may return null, indicating that no valid values can be obtained.
     * @param OldHybridBillingPrepaidReplicas Number of instances during the historical HYBRID_PAID period. The user restores services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOldHybridBillingPrepaidReplicas(Long OldHybridBillingPrepaidReplicas) {
        this.OldHybridBillingPrepaidReplicas = OldHybridBillingPrepaidReplicas;
    }

    /**
     * Get Whether to enable hot update for the model. By default, hot update is disabled.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModelHotUpdateEnable Whether to enable hot update for the model. By default, hot update is disabled.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getModelHotUpdateEnable() {
        return this.ModelHotUpdateEnable;
    }

    /**
     * Set Whether to enable hot update for the model. By default, hot update is disabled.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModelHotUpdateEnable Whether to enable hot update for the model. By default, hot update is disabled.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModelHotUpdateEnable(Boolean ModelHotUpdateEnable) {
        this.ModelHotUpdateEnable = ModelHotUpdateEnable;
    }

    /**
     * Get Service specification alias. 
     * @return InstanceAlias Service specification alias.
     */
    public String getInstanceAlias() {
        return this.InstanceAlias;
    }

    /**
     * Set Service specification alias.
     * @param InstanceAlias Service specification alias.
     */
    public void setInstanceAlias(String InstanceAlias) {
        this.InstanceAlias = InstanceAlias;
    }

    /**
     * Get Instance quantity adjusting mode. Defaults to manual.Supported valid values: AUTO (automatic), MANUAL (manual).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScaleMode Instance quantity adjusting mode. Defaults to manual.Supported valid values: AUTO (automatic), MANUAL (manual).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * Set Instance quantity adjusting mode. Defaults to manual.Supported valid values: AUTO (automatic), MANUAL (manual).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScaleMode Instance quantity adjusting mode. Defaults to manual.Supported valid values: AUTO (automatic), MANUAL (manual).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * Get Scheduled scaling task.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CronScaleJobs Scheduled scaling task.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CronScaleJob [] getCronScaleJobs() {
        return this.CronScaleJobs;
    }

    /**
     * Set Scheduled scaling task.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CronScaleJobs Scheduled scaling task.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCronScaleJobs(CronScaleJob [] CronScaleJobs) {
        this.CronScaleJobs = CronScaleJobs;
    }

    /**
     * Get Scheduled scaling policy.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScaleStrategy Scheduled scaling policy.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScaleStrategy() {
        return this.ScaleStrategy;
    }

    /**
     * Set Scheduled scaling policy.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScaleStrategy Scheduled scaling policy.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScaleStrategy(String ScaleStrategy) {
        this.ScaleStrategy = ScaleStrategy;
    }

    /**
     * Get Configurations of the scheduled stop.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduledAction Configurations of the scheduled stop.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set Configurations of the scheduled stop.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduledAction Configurations of the scheduled stop.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get Instance list.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodList Instance list.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String [] getPodList() {
        return this.PodList;
    }

    /**
     * Set Instance list.Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodList Instance list.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setPodList(String [] PodList) {
        this.PodList = PodList;
    }

    /**
     * Get Pod list information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pods Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Pod getPods() {
        return this.Pods;
    }

    /**
     * Set Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pods Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setPods(Pod Pods) {
        this.Pods = Pods;
    }

    /**
     * Get Pod list information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodInfos Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Pod [] getPodInfos() {
        return this.PodInfos;
    }

    /**
     * Set Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodInfos Pod list information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodInfos(Pod [] PodInfos) {
        this.PodInfos = PodInfos;
    }

    /**
     * Get Configurations related to speed limit and throttling of services.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceLimit Configurations related to speed limit and throttling of services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set Configurations related to speed limit and throttling of services.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceLimit Configurations related to speed limit and throttling of services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get Whether to enable model acceleration, which is only valid for models in the StableDiffusion (dynamic acceleration) format.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModelTurboEnable Whether to enable model acceleration, which is only valid for models in the StableDiffusion (dynamic acceleration) format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getModelTurboEnable() {
        return this.ModelTurboEnable;
    }

    /**
     * Set Whether to enable model acceleration, which is only valid for models in the StableDiffusion (dynamic acceleration) format.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModelTurboEnable Whether to enable model acceleration, which is only valid for models in the StableDiffusion (dynamic acceleration) format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModelTurboEnable(Boolean ModelTurboEnable) {
        this.ModelTurboEnable = ModelTurboEnable;
    }

    /**
     * Get Mounting.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VolumeMount Mounting.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VolumeMount getVolumeMount() {
        return this.VolumeMount;
    }

    /**
     * Set Mounting.Note: This field may return null, indicating that no valid values can be obtained.
     * @param VolumeMount Mounting.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVolumeMount(VolumeMount VolumeMount) {
        this.VolumeMount = VolumeMount;
    }

    /**
     * Get Inference code information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InferCodeInfo Inference code information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InferCodeInfo getInferCodeInfo() {
        return this.InferCodeInfo;
    }

    /**
     * Set Inference code information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InferCodeInfo Inference code information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInferCodeInfo(InferCodeInfo InferCodeInfo) {
        this.InferCodeInfo = InferCodeInfo;
    }

    /**
     * Get Service startup command.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Command Service startup command.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Service startup command.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Command Service startup command.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Settings of enabling the TI-ONE private network to access external resources.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceEIP Settings of enabling the TI-ONE private network to access external resources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceEIP getServiceEIP() {
        return this.ServiceEIP;
    }

    /**
     * Set Settings of enabling the TI-ONE private network to access external resources.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceEIP Settings of enabling the TI-ONE private network to access external resources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceEIP(ServiceEIP ServiceEIP) {
        this.ServiceEIP = ServiceEIP;
    }

    /**
     * Get Service port, with the default value of 8501.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServicePort Service port, with the default value of 8501.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set Service port, with the default value of 8501.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServicePort Service port, with the default value of 8501.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServicePort(Long ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get Graceful exit time limit of the service, in seconds. Default value: 30. Minimum value: 1. 
     * @return TerminationGracePeriodSeconds Graceful exit time limit of the service, in seconds. Default value: 30. Minimum value: 1.
     */
    public Long getTerminationGracePeriodSeconds() {
        return this.TerminationGracePeriodSeconds;
    }

    /**
     * Set Graceful exit time limit of the service, in seconds. Default value: 30. Minimum value: 1.
     * @param TerminationGracePeriodSeconds Graceful exit time limit of the service, in seconds. Default value: 30. Minimum value: 1.
     */
    public void setTerminationGracePeriodSeconds(Long TerminationGracePeriodSeconds) {
        this.TerminationGracePeriodSeconds = TerminationGracePeriodSeconds;
    }

    /**
     * Get Command executed before the service instance stops. The instance ends after the command execution is completed or after the execution time exceeds the graceful exit time limit. 
     * @return PreStopCommand Command executed before the service instance stops. The instance ends after the command execution is completed or after the execution time exceeds the graceful exit time limit.
     */
    public String [] getPreStopCommand() {
        return this.PreStopCommand;
    }

    /**
     * Set Command executed before the service instance stops. The instance ends after the command execution is completed or after the execution time exceeds the graceful exit time limit.
     * @param PreStopCommand Command executed before the service instance stops. The instance ends after the command execution is completed or after the execution time exceeds the graceful exit time limit.
     */
    public void setPreStopCommand(String [] PreStopCommand) {
        this.PreStopCommand = PreStopCommand;
    }

    /**
     * Get Whether to enable the gRPC port. 
     * @return GrpcEnable Whether to enable the gRPC port.
     */
    public Boolean getGrpcEnable() {
        return this.GrpcEnable;
    }

    /**
     * Set Whether to enable the gRPC port.
     * @param GrpcEnable Whether to enable the gRPC port.
     */
    public void setGrpcEnable(Boolean GrpcEnable) {
        this.GrpcEnable = GrpcEnable;
    }

    /**
     * Get Health probe. 
     * @return HealthProbe Health probe.
     */
    public HealthProbe getHealthProbe() {
        return this.HealthProbe;
    }

    /**
     * Set Health probe.
     * @param HealthProbe Health probe.
     */
    public void setHealthProbe(HealthProbe HealthProbe) {
        this.HealthProbe = HealthProbe;
    }

    /**
     * Get Rolling update configurations. 
     * @return RollingUpdate Rolling update configurations.
     */
    public RollingUpdate getRollingUpdate() {
        return this.RollingUpdate;
    }

    /**
     * Set Rolling update configurations.
     * @param RollingUpdate Rolling update configurations.
     */
    public void setRollingUpdate(RollingUpdate RollingUpdate) {
        this.RollingUpdate = RollingUpdate;
    }

    /**
     * Get Number of instances per replica. This parameter is valid only when the deployment type is DIST or ROLE. Default value: 1. 
     * @return InstancePerReplicas Number of instances per replica. This parameter is valid only when the deployment type is DIST or ROLE. Default value: 1.
     */
    public Long getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set Number of instances per replica. This parameter is valid only when the deployment type is DIST or ROLE. Default value: 1.
     * @param InstancePerReplicas Number of instances per replica. This parameter is valid only when the deployment type is DIST or ROLE. Default value: 1.
     */
    public void setInstancePerReplicas(Long InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
    }

    /**
     * Get Batch data disk mounting configurations. 
     * @return VolumeMounts Batch data disk mounting configurations.
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set Batch data disk mounting configurations.
     * @param VolumeMounts Batch data disk mounting configurations.
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    public ServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceInfo(ServiceInfo source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.Env != null) {
            this.Env = new EnvVar[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new EnvVar(source.Env[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo(source.Resources);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ModelInfo != null) {
            this.ModelInfo = new ModelInfo(source.ModelInfo);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.AuthorizationEnable != null) {
            this.AuthorizationEnable = new Boolean(source.AuthorizationEnable);
        }
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscaler(source.HorizontalPodAutoscaler);
        }
        if (source.Status != null) {
            this.Status = new WorkloadStatus(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ResourceTotal != null) {
            this.ResourceTotal = new ResourceInfo(source.ResourceTotal);
        }
        if (source.OldReplicas != null) {
            this.OldReplicas = new Long(source.OldReplicas);
        }
        if (source.HybridBillingPrepaidReplicas != null) {
            this.HybridBillingPrepaidReplicas = new Long(source.HybridBillingPrepaidReplicas);
        }
        if (source.OldHybridBillingPrepaidReplicas != null) {
            this.OldHybridBillingPrepaidReplicas = new Long(source.OldHybridBillingPrepaidReplicas);
        }
        if (source.ModelHotUpdateEnable != null) {
            this.ModelHotUpdateEnable = new Boolean(source.ModelHotUpdateEnable);
        }
        if (source.InstanceAlias != null) {
            this.InstanceAlias = new String(source.InstanceAlias);
        }
        if (source.ScaleMode != null) {
            this.ScaleMode = new String(source.ScaleMode);
        }
        if (source.CronScaleJobs != null) {
            this.CronScaleJobs = new CronScaleJob[source.CronScaleJobs.length];
            for (int i = 0; i < source.CronScaleJobs.length; i++) {
                this.CronScaleJobs[i] = new CronScaleJob(source.CronScaleJobs[i]);
            }
        }
        if (source.ScaleStrategy != null) {
            this.ScaleStrategy = new String(source.ScaleStrategy);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.PodList != null) {
            this.PodList = new String[source.PodList.length];
            for (int i = 0; i < source.PodList.length; i++) {
                this.PodList[i] = new String(source.PodList[i]);
            }
        }
        if (source.Pods != null) {
            this.Pods = new Pod(source.Pods);
        }
        if (source.PodInfos != null) {
            this.PodInfos = new Pod[source.PodInfos.length];
            for (int i = 0; i < source.PodInfos.length; i++) {
                this.PodInfos[i] = new Pod(source.PodInfos[i]);
            }
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
        if (source.ModelTurboEnable != null) {
            this.ModelTurboEnable = new Boolean(source.ModelTurboEnable);
        }
        if (source.VolumeMount != null) {
            this.VolumeMount = new VolumeMount(source.VolumeMount);
        }
        if (source.InferCodeInfo != null) {
            this.InferCodeInfo = new InferCodeInfo(source.InferCodeInfo);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ServiceEIP != null) {
            this.ServiceEIP = new ServiceEIP(source.ServiceEIP);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new Long(source.ServicePort);
        }
        if (source.TerminationGracePeriodSeconds != null) {
            this.TerminationGracePeriodSeconds = new Long(source.TerminationGracePeriodSeconds);
        }
        if (source.PreStopCommand != null) {
            this.PreStopCommand = new String[source.PreStopCommand.length];
            for (int i = 0; i < source.PreStopCommand.length; i++) {
                this.PreStopCommand[i] = new String(source.PreStopCommand[i]);
            }
        }
        if (source.GrpcEnable != null) {
            this.GrpcEnable = new Boolean(source.GrpcEnable);
        }
        if (source.HealthProbe != null) {
            this.HealthProbe = new HealthProbe(source.HealthProbe);
        }
        if (source.RollingUpdate != null) {
            this.RollingUpdate = new RollingUpdate(source.RollingUpdate);
        }
        if (source.InstancePerReplicas != null) {
            this.InstancePerReplicas = new Long(source.InstancePerReplicas);
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "ModelInfo.", this.ModelInfo);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamObj(map, prefix + "ResourceTotal.", this.ResourceTotal);
        this.setParamSimple(map, prefix + "OldReplicas", this.OldReplicas);
        this.setParamSimple(map, prefix + "HybridBillingPrepaidReplicas", this.HybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "OldHybridBillingPrepaidReplicas", this.OldHybridBillingPrepaidReplicas);
        this.setParamSimple(map, prefix + "ModelHotUpdateEnable", this.ModelHotUpdateEnable);
        this.setParamSimple(map, prefix + "InstanceAlias", this.InstanceAlias);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamArrayObj(map, prefix + "CronScaleJobs.", this.CronScaleJobs);
        this.setParamSimple(map, prefix + "ScaleStrategy", this.ScaleStrategy);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamArraySimple(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "Pods.", this.Pods);
        this.setParamArrayObj(map, prefix + "PodInfos.", this.PodInfos);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamSimple(map, prefix + "ModelTurboEnable", this.ModelTurboEnable);
        this.setParamObj(map, prefix + "VolumeMount.", this.VolumeMount);
        this.setParamObj(map, prefix + "InferCodeInfo.", this.InferCodeInfo);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "ServiceEIP.", this.ServiceEIP);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "TerminationGracePeriodSeconds", this.TerminationGracePeriodSeconds);
        this.setParamArraySimple(map, prefix + "PreStopCommand.", this.PreStopCommand);
        this.setParamSimple(map, prefix + "GrpcEnable", this.GrpcEnable);
        this.setParamObj(map, prefix + "HealthProbe.", this.HealthProbe);
        this.setParamObj(map, prefix + "RollingUpdate.", this.RollingUpdate);
        this.setParamSimple(map, prefix + "InstancePerReplicas", this.InstancePerReplicas);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);

    }
}

