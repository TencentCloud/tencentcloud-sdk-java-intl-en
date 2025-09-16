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

public class Service extends AbstractModel {

    /**
    * Service group ID.
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * Service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Service group name.
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * Service description.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * Service details.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceInfo")
    @Expose
    private ServiceInfo ServiceInfo;

    /**
    * Cluster ID.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Region.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Namespace.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Billing type.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Resource group ID for yearly/monthly subscription services. The value is null for pay-as-you-go services.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Resource group name corresponding to the yearly/monthly subscription service.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * Tag of the service.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Name of the ingress where the service is located.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * Creator.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * Creation time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Root account.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub-account.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * app_id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Operational status of the service.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * Cause for service creation failure. The default value of this field is CREATE_SUCCEED upon successful creation.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateFailedReason")
    @Expose
    private String CreateFailedReason;

    /**
    * Service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Billing information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * Model weight.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Creation source of the service.AUTO_ML: comes from one-click release of automatic learning.DEFAULT: other sources.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * Version number.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * The latest version number of services under a service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * Resource group category. Valid values: NORMAL (hosting) and SW (half-hosting).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupSWType")
    @Expose
    private String ResourceGroupSWType;

    /**
    * Archiving status of the service. Valid values: Waiting (pending archiving) and Archived (archived).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArchiveStatus")
    @Expose
    private String ArchiveStatus;

    /**
    * Deployment type of the service. Valid values: STANDARD (standard deployment) and DIST (multi-machine distributed deployment). The default value is STANDARD.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * Number of instances per replica. This parameter is valid only when the deployment type is DIST. Default value: 1.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private String InstancePerReplicas;

    /**
    * Source for monitoring queries.Enumeration value. May differ from CreateSource in certain scenarios. This field is designed to be compatible.
    */
    @SerializedName("MonitorSource")
    @Expose
    private String MonitorSource;

    /**
    * Sub-account name of the service creator.
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * Scheduling policy of the service.
    */
    @SerializedName("SchedulingPolicy")
    @Expose
    private SchedulingPolicy SchedulingPolicy;

    /**
    * External resource group information, indicating which resources are borrowed from resource groups.
    */
    @SerializedName("ExternalResourceGroups")
    @Expose
    private ResourceGroupInfo [] ExternalResourceGroups;

    /**
     * Get Service group ID. 
     * @return ServiceGroupId Service group ID.
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set Service group ID.
     * @param ServiceGroupId Service group ID.
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get Service ID. 
     * @return ServiceId Service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID.
     * @param ServiceId Service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Service group name. 
     * @return ServiceGroupName Service group name.
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set Service group name.
     * @param ServiceGroupName Service group name.
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get Service description.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDescription Service description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set Service description.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceDescription Service description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get Service details.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceInfo Service details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * Set Service details.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceInfo Service details.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceInfo(ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * Get Cluster ID.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Region.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Namespace.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Namespace.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Billing type.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing type.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing type.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Resource group ID for yearly/monthly subscription services. The value is null for pay-as-you-go services.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupId Resource group ID for yearly/monthly subscription services. The value is null for pay-as-you-go services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set Resource group ID for yearly/monthly subscription services. The value is null for pay-as-you-go services.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupId Resource group ID for yearly/monthly subscription services. The value is null for pay-as-you-go services.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Resource group name corresponding to the yearly/monthly subscription service.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupName Resource group name corresponding to the yearly/monthly subscription service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name corresponding to the yearly/monthly subscription service.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupName Resource group name corresponding to the yearly/monthly subscription service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get Tag of the service.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag of the service.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Name of the ingress where the service is located.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IngressName Name of the ingress where the service is located.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set Name of the ingress where the service is located.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IngressName Name of the ingress where the service is located.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    /**
     * Get Creator.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedBy Creator.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set Creator.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedBy Creator.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get Creation time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Root account.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin Root account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Root account.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin Root account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubUin Sub-account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account.Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubUin Sub-account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get app_id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId app_id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app_id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId app_id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Operational status of the service.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessStatus Operational status of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set Operational status of the service.Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessStatus Operational status of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceLimit Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceLimit Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduledAction Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduledAction Deprecated. See the corresponding field in ServiceInfo.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get Cause for service creation failure. The default value of this field is CREATE_SUCCEED upon successful creation.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateFailedReason Cause for service creation failure. The default value of this field is CREATE_SUCCEED upon successful creation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateFailedReason() {
        return this.CreateFailedReason;
    }

    /**
     * Set Cause for service creation failure. The default value of this field is CREATE_SUCCEED upon successful creation.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateFailedReason Cause for service creation failure. The default value of this field is CREATE_SUCCEED upon successful creation.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateFailedReason(String CreateFailedReason) {
        this.CreateFailedReason = CreateFailedReason;
    }

    /**
     * Get Service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Billing information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingInfo Billing information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set Billing information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingInfo Billing information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get Model weight.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Model weight.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Model weight.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Model weight.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Creation source of the service.AUTO_ML: comes from one-click release of automatic learning.DEFAULT: other sources.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateSource Creation source of the service.AUTO_ML: comes from one-click release of automatic learning.DEFAULT: other sources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set Creation source of the service.AUTO_ML: comes from one-click release of automatic learning.DEFAULT: other sources.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateSource Creation source of the service.AUTO_ML: comes from one-click release of automatic learning.DEFAULT: other sources.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get Version number.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version number.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version number.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version number.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get The latest version number of services under a service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LatestVersion The latest version number of services under a service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set The latest version number of services under a service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LatestVersion The latest version number of services under a service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get Resource group category. Valid values: NORMAL (hosting) and SW (half-hosting).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupSWType Resource group category. Valid values: NORMAL (hosting) and SW (half-hosting).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupSWType() {
        return this.ResourceGroupSWType;
    }

    /**
     * Set Resource group category. Valid values: NORMAL (hosting) and SW (half-hosting).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupSWType Resource group category. Valid values: NORMAL (hosting) and SW (half-hosting).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupSWType(String ResourceGroupSWType) {
        this.ResourceGroupSWType = ResourceGroupSWType;
    }

    /**
     * Get Archiving status of the service. Valid values: Waiting (pending archiving) and Archived (archived).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArchiveStatus Archiving status of the service. Valid values: Waiting (pending archiving) and Archived (archived).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getArchiveStatus() {
        return this.ArchiveStatus;
    }

    /**
     * Set Archiving status of the service. Valid values: Waiting (pending archiving) and Archived (archived).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArchiveStatus Archiving status of the service. Valid values: Waiting (pending archiving) and Archived (archived).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArchiveStatus(String ArchiveStatus) {
        this.ArchiveStatus = ArchiveStatus;
    }

    /**
     * Get Deployment type of the service. Valid values: STANDARD (standard deployment) and DIST (multi-machine distributed deployment). The default value is STANDARD.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeployType Deployment type of the service. Valid values: STANDARD (standard deployment) and DIST (multi-machine distributed deployment). The default value is STANDARD.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set Deployment type of the service. Valid values: STANDARD (standard deployment) and DIST (multi-machine distributed deployment). The default value is STANDARD.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeployType Deployment type of the service. Valid values: STANDARD (standard deployment) and DIST (multi-machine distributed deployment). The default value is STANDARD.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get Number of instances per replica. This parameter is valid only when the deployment type is DIST. Default value: 1.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstancePerReplicas Number of instances per replica. This parameter is valid only when the deployment type is DIST. Default value: 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set Number of instances per replica. This parameter is valid only when the deployment type is DIST. Default value: 1.Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstancePerReplicas Number of instances per replica. This parameter is valid only when the deployment type is DIST. Default value: 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstancePerReplicas(String InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
    }

    /**
     * Get Source for monitoring queries.Enumeration value. May differ from CreateSource in certain scenarios. This field is designed to be compatible. 
     * @return MonitorSource Source for monitoring queries.Enumeration value. May differ from CreateSource in certain scenarios. This field is designed to be compatible.
     */
    public String getMonitorSource() {
        return this.MonitorSource;
    }

    /**
     * Set Source for monitoring queries.Enumeration value. May differ from CreateSource in certain scenarios. This field is designed to be compatible.
     * @param MonitorSource Source for monitoring queries.Enumeration value. May differ from CreateSource in certain scenarios. This field is designed to be compatible.
     */
    public void setMonitorSource(String MonitorSource) {
        this.MonitorSource = MonitorSource;
    }

    /**
     * Get Sub-account name of the service creator. 
     * @return SubUinName Sub-account name of the service creator.
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set Sub-account name of the service creator.
     * @param SubUinName Sub-account name of the service creator.
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get Scheduling policy of the service. 
     * @return SchedulingPolicy Scheduling policy of the service.
     */
    public SchedulingPolicy getSchedulingPolicy() {
        return this.SchedulingPolicy;
    }

    /**
     * Set Scheduling policy of the service.
     * @param SchedulingPolicy Scheduling policy of the service.
     */
    public void setSchedulingPolicy(SchedulingPolicy SchedulingPolicy) {
        this.SchedulingPolicy = SchedulingPolicy;
    }

    /**
     * Get External resource group information, indicating which resources are borrowed from resource groups. 
     * @return ExternalResourceGroups External resource group information, indicating which resources are borrowed from resource groups.
     */
    public ResourceGroupInfo [] getExternalResourceGroups() {
        return this.ExternalResourceGroups;
    }

    /**
     * Set External resource group information, indicating which resources are borrowed from resource groups.
     * @param ExternalResourceGroups External resource group information, indicating which resources are borrowed from resource groups.
     */
    public void setExternalResourceGroups(ResourceGroupInfo [] ExternalResourceGroups) {
        this.ExternalResourceGroups = ExternalResourceGroups;
    }

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.ServiceInfo != null) {
            this.ServiceInfo = new ServiceInfo(source.ServiceInfo);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.CreateFailedReason != null) {
            this.CreateFailedReason = new String(source.CreateFailedReason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.ResourceGroupSWType != null) {
            this.ResourceGroupSWType = new String(source.ResourceGroupSWType);
        }
        if (source.ArchiveStatus != null) {
            this.ArchiveStatus = new String(source.ArchiveStatus);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.InstancePerReplicas != null) {
            this.InstancePerReplicas = new String(source.InstancePerReplicas);
        }
        if (source.MonitorSource != null) {
            this.MonitorSource = new String(source.MonitorSource);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.SchedulingPolicy != null) {
            this.SchedulingPolicy = new SchedulingPolicy(source.SchedulingPolicy);
        }
        if (source.ExternalResourceGroups != null) {
            this.ExternalResourceGroups = new ResourceGroupInfo[source.ExternalResourceGroups.length];
            for (int i = 0; i < source.ExternalResourceGroups.length; i++) {
                this.ExternalResourceGroups[i] = new ResourceGroupInfo(source.ExternalResourceGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamObj(map, prefix + "ServiceInfo.", this.ServiceInfo);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamSimple(map, prefix + "CreateFailedReason", this.CreateFailedReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "ResourceGroupSWType", this.ResourceGroupSWType);
        this.setParamSimple(map, prefix + "ArchiveStatus", this.ArchiveStatus);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "InstancePerReplicas", this.InstancePerReplicas);
        this.setParamSimple(map, prefix + "MonitorSource", this.MonitorSource);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamObj(map, prefix + "SchedulingPolicy.", this.SchedulingPolicy);
        this.setParamArrayObj(map, prefix + "ExternalResourceGroups.", this.ExternalResourceGroups);

    }
}

