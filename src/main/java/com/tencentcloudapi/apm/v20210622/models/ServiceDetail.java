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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDetail extends AbstractModel {

    /**
    * <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * <p>Business system ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * <p>User appid</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>main account uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUIN")
    @Expose
    private String CreateUIN;

    /**
    * <p>Application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>Application description</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>Business system name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableThresholdConfig")
    @Expose
    private Boolean EnableThresholdConfig;

    /**
    * <p>Error rate threshold (%) used to judge the application health status as "red".</p><p>Unit: %</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrRateThreshold")
    @Expose
    private Long ErrRateThreshold;

    /**
    * <p>Alert threshold for response time (ms), used to judge application health status as "yellow".</p><p>Unit: ms</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseDurationWarningThreshold")
    @Expose
    private Long ResponseDurationWarningThreshold;

    /**
     * Get <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceID <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceID <p>Application ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get <p>Business system ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceKey <p>Business system ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set <p>Business system ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceKey <p>Business system ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get <p>User appid</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppID <p>User appid</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>User appid</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppID <p>User appid</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>main account uin</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUIN <p>main account uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUIN() {
        return this.CreateUIN;
    }

    /**
     * Set <p>main account uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUIN <p>main account uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUIN(String CreateUIN) {
        this.CreateUIN = CreateUIN;
    }

    /**
     * Get <p>Application name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName <p>Application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceName <p>Application name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>Application description</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDescription <p>Application description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set <p>Application description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceDescription <p>Application description</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Tag</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags <p>Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags <p>Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Business system name</p> 
     * @return InstanceName <p>Business system name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Business system name</p>
     * @param InstanceName <p>Business system name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableThresholdConfig <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableThresholdConfig() {
        return this.EnableThresholdConfig;
    }

    /**
     * Set <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableThresholdConfig <p>Threshold configuration switch. true means use application level threshold; false means use business system level threshold.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableThresholdConfig(Boolean EnableThresholdConfig) {
        this.EnableThresholdConfig = EnableThresholdConfig;
    }

    /**
     * Get <p>Error rate threshold (%) used to judge the application health status as "red".</p><p>Unit: %</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrRateThreshold <p>Error rate threshold (%) used to judge the application health status as "red".</p><p>Unit: %</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getErrRateThreshold() {
        return this.ErrRateThreshold;
    }

    /**
     * Set <p>Error rate threshold (%) used to judge the application health status as "red".</p><p>Unit: %</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrRateThreshold <p>Error rate threshold (%) used to judge the application health status as "red".</p><p>Unit: %</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrRateThreshold(Long ErrRateThreshold) {
        this.ErrRateThreshold = ErrRateThreshold;
    }

    /**
     * Get <p>Alert threshold for response time (ms), used to judge application health status as "yellow".</p><p>Unit: ms</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResponseDurationWarningThreshold <p>Alert threshold for response time (ms), used to judge application health status as "yellow".</p><p>Unit: ms</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResponseDurationWarningThreshold() {
        return this.ResponseDurationWarningThreshold;
    }

    /**
     * Set <p>Alert threshold for response time (ms), used to judge application health status as "yellow".</p><p>Unit: ms</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResponseDurationWarningThreshold <p>Alert threshold for response time (ms), used to judge application health status as "yellow".</p><p>Unit: ms</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseDurationWarningThreshold(Long ResponseDurationWarningThreshold) {
        this.ResponseDurationWarningThreshold = ResponseDurationWarningThreshold;
    }

    public ServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDetail(ServiceDetail source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.CreateUIN != null) {
            this.CreateUIN = new String(source.CreateUIN);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.EnableThresholdConfig != null) {
            this.EnableThresholdConfig = new Boolean(source.EnableThresholdConfig);
        }
        if (source.ErrRateThreshold != null) {
            this.ErrRateThreshold = new Long(source.ErrRateThreshold);
        }
        if (source.ResponseDurationWarningThreshold != null) {
            this.ResponseDurationWarningThreshold = new Long(source.ResponseDurationWarningThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CreateUIN", this.CreateUIN);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "EnableThresholdConfig", this.EnableThresholdConfig);
        this.setParamSimple(map, prefix + "ErrRateThreshold", this.ErrRateThreshold);
        this.setParamSimple(map, prefix + "ResponseDurationWarningThreshold", this.ResponseDurationWarningThreshold);

    }
}

