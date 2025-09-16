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

public class ServiceGroup extends AbstractModel {

    /**
    * Service group ID.
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * Service group name.
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * Creator.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Root account.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Total number of services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Number of running services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RunningServiceCount")
    @Expose
    private Long RunningServiceCount;

    /**
    * Service description.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Services")
    @Expose
    private Service [] Services;

    /**
    * Service group status, which aligns with service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Service group tags.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The latest version in the service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * Operational status of the service.CREATING: creating.CREATE_FAILED: creation failed.ARREARS_STOP: service suspended due to overdue payments.BILLING: billing.WHITELIST_USING: allowlist feature is in trial.WHITELIST_STOP: insufficient allowlist quota.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * Billing information of the service.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * Creation source of the service.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * Weight update status of the service group.UPDATING: updating.UPDATED: updated successfully.UPDATE FAILED: failed to update.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeightUpdateStatus")
    @Expose
    private String WeightUpdateStatus;

    /**
    * Number of running Pods in the service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplicasCount")
    @Expose
    private Long ReplicasCount;

    /**
    * Expected number of Pods under the service group.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableReplicasCount")
    @Expose
    private Long AvailableReplicasCount;

    /**
    * Service group's subuin.
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * Service group's app_id.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Whether to enable authentication.
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * List of throttling authentication tokens.
    */
    @SerializedName("AuthTokens")
    @Expose
    private AuthToken [] AuthTokens;

    /**
    * Field for monitoring creation source.
    */
    @SerializedName("MonitorSource")
    @Expose
    private String MonitorSource;

    /**
    * Nickname of the sub-user.
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

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
     * Get Creator. 
     * @return CreatedBy Creator.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set Creator.
     * @param CreatedBy Creator.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Root account. 
     * @return Uin Root account.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Root account.
     * @param Uin Root account.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Total number of services in the service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceCount Total number of services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Total number of services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceCount Total number of services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Number of running services in the service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RunningServiceCount Number of running services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRunningServiceCount() {
        return this.RunningServiceCount;
    }

    /**
     * Set Number of running services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RunningServiceCount Number of running services in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRunningServiceCount(Long RunningServiceCount) {
        this.RunningServiceCount = RunningServiceCount;
    }

    /**
     * Get Service description.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Services Service description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Service [] getServices() {
        return this.Services;
    }

    /**
     * Set Service description.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Services Service description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServices(Service [] Services) {
        this.Services = Services;
    }

    /**
     * Get Service group status, which aligns with service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Service group status, which aligns with service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Service group status, which aligns with service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Service group status, which aligns with service status.CREATING: creating.CREATE_FAILED: creation failed.Normal: running.Stopped: stopped.Stopping: stopping.Abnormal: error.Pending: starting.Waiting: getting ready.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Service group tags.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Service group tags.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Service group tags.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Service group tags.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The latest version in the service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LatestVersion The latest version in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set The latest version in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param LatestVersion The latest version in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get Operational status of the service.CREATING: creating.CREATE_FAILED: creation failed.ARREARS_STOP: service suspended due to overdue payments.BILLING: billing.WHITELIST_USING: allowlist feature is in trial.WHITELIST_STOP: insufficient allowlist quota.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessStatus Operational status of the service.CREATING: creating.CREATE_FAILED: creation failed.ARREARS_STOP: service suspended due to overdue payments.BILLING: billing.WHITELIST_USING: allowlist feature is in trial.WHITELIST_STOP: insufficient allowlist quota.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set Operational status of the service.CREATING: creating.CREATE_FAILED: creation failed.ARREARS_STOP: service suspended due to overdue payments.BILLING: billing.WHITELIST_USING: allowlist feature is in trial.WHITELIST_STOP: insufficient allowlist quota.Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessStatus Operational status of the service.CREATING: creating.CREATE_FAILED: creation failed.ARREARS_STOP: service suspended due to overdue payments.BILLING: billing.WHITELIST_USING: allowlist feature is in trial.WHITELIST_STOP: insufficient allowlist quota.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get Billing information of the service.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingInfo Billing information of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set Billing information of the service.Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingInfo Billing information of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get Creation source of the service.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateSource Creation source of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set Creation source of the service.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateSource Creation source of the service.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get Weight update status of the service group.UPDATING: updating.UPDATED: updated successfully.UPDATE FAILED: failed to update.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WeightUpdateStatus Weight update status of the service group.UPDATING: updating.UPDATED: updated successfully.UPDATE FAILED: failed to update.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWeightUpdateStatus() {
        return this.WeightUpdateStatus;
    }

    /**
     * Set Weight update status of the service group.UPDATING: updating.UPDATED: updated successfully.UPDATE FAILED: failed to update.Note: This field may return null, indicating that no valid values can be obtained.
     * @param WeightUpdateStatus Weight update status of the service group.UPDATING: updating.UPDATED: updated successfully.UPDATE FAILED: failed to update.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeightUpdateStatus(String WeightUpdateStatus) {
        this.WeightUpdateStatus = WeightUpdateStatus;
    }

    /**
     * Get Number of running Pods in the service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReplicasCount Number of running Pods in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicasCount() {
        return this.ReplicasCount;
    }

    /**
     * Set Number of running Pods in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReplicasCount Number of running Pods in the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicasCount(Long ReplicasCount) {
        this.ReplicasCount = ReplicasCount;
    }

    /**
     * Get Expected number of Pods under the service group.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableReplicasCount Expected number of Pods under the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAvailableReplicasCount() {
        return this.AvailableReplicasCount;
    }

    /**
     * Set Expected number of Pods under the service group.Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableReplicasCount Expected number of Pods under the service group.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableReplicasCount(Long AvailableReplicasCount) {
        this.AvailableReplicasCount = AvailableReplicasCount;
    }

    /**
     * Get Service group's subuin. 
     * @return SubUin Service group's subuin.
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Service group's subuin.
     * @param SubUin Service group's subuin.
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Service group's app_id. 
     * @return AppId Service group's app_id.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Service group's app_id.
     * @param AppId Service group's app_id.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Whether to enable authentication. 
     * @return AuthorizationEnable Whether to enable authentication.
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set Whether to enable authentication.
     * @param AuthorizationEnable Whether to enable authentication.
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get List of throttling authentication tokens. 
     * @return AuthTokens List of throttling authentication tokens.
     */
    public AuthToken [] getAuthTokens() {
        return this.AuthTokens;
    }

    /**
     * Set List of throttling authentication tokens.
     * @param AuthTokens List of throttling authentication tokens.
     */
    public void setAuthTokens(AuthToken [] AuthTokens) {
        this.AuthTokens = AuthTokens;
    }

    /**
     * Get Field for monitoring creation source. 
     * @return MonitorSource Field for monitoring creation source.
     */
    public String getMonitorSource() {
        return this.MonitorSource;
    }

    /**
     * Set Field for monitoring creation source.
     * @param MonitorSource Field for monitoring creation source.
     */
    public void setMonitorSource(String MonitorSource) {
        this.MonitorSource = MonitorSource;
    }

    /**
     * Get Nickname of the sub-user. 
     * @return SubUinName Nickname of the sub-user.
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set Nickname of the sub-user.
     * @param SubUinName Nickname of the sub-user.
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    public ServiceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceGroup(ServiceGroup source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
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
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.RunningServiceCount != null) {
            this.RunningServiceCount = new Long(source.RunningServiceCount);
        }
        if (source.Services != null) {
            this.Services = new Service[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new Service(source.Services[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.WeightUpdateStatus != null) {
            this.WeightUpdateStatus = new String(source.WeightUpdateStatus);
        }
        if (source.ReplicasCount != null) {
            this.ReplicasCount = new Long(source.ReplicasCount);
        }
        if (source.AvailableReplicasCount != null) {
            this.AvailableReplicasCount = new Long(source.AvailableReplicasCount);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AuthorizationEnable != null) {
            this.AuthorizationEnable = new Boolean(source.AuthorizationEnable);
        }
        if (source.AuthTokens != null) {
            this.AuthTokens = new AuthToken[source.AuthTokens.length];
            for (int i = 0; i < source.AuthTokens.length; i++) {
                this.AuthTokens[i] = new AuthToken(source.AuthTokens[i]);
            }
        }
        if (source.MonitorSource != null) {
            this.MonitorSource = new String(source.MonitorSource);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "RunningServiceCount", this.RunningServiceCount);
        this.setParamArrayObj(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "WeightUpdateStatus", this.WeightUpdateStatus);
        this.setParamSimple(map, prefix + "ReplicasCount", this.ReplicasCount);
        this.setParamSimple(map, prefix + "AvailableReplicasCount", this.AvailableReplicasCount);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamArrayObj(map, prefix + "AuthTokens.", this.AuthTokens);
        this.setParamSimple(map, prefix + "MonitorSource", this.MonitorSource);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);

    }
}

