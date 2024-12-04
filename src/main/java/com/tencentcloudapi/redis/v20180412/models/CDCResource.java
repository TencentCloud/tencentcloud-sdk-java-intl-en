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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CDCResource extends AbstractModel {

    /**
    * App ID of a user.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * AZ ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * ID of the dedicated Redis cluster.
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * Billing mode. 1: monthly subscription; 0: pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Automatic renewal flag. 0: default status (manual renewal); 1: automatic renewal; 2: no automatic renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Dedicated cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Instance creation time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Instance expiration time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cluster status. 1: in process; 2: running; 3: isolated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Basic control resource package.
    */
    @SerializedName("BaseBundles")
    @Expose
    private ResourceBundle [] BaseBundles;

    /**
    * Resource package list.
    */
    @SerializedName("ResourceBundles")
    @Expose
    private ResourceBundle [] ResourceBundles;

    /**
    * Local dedicated cluster ID.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get App ID of a user. 
     * @return AppId App ID of a user.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID of a user.
     * @param AppId App ID of a user.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get AZ ID. 
     * @return ZoneId AZ ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID.
     * @param ZoneId AZ ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ID of the dedicated Redis cluster. 
     * @return RedisClusterId ID of the dedicated Redis cluster.
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set ID of the dedicated Redis cluster.
     * @param RedisClusterId ID of the dedicated Redis cluster.
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get Billing mode. 1: monthly subscription; 0: pay-as-you-go. 
     * @return PayMode Billing mode. 1: monthly subscription; 0: pay-as-you-go.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 1: monthly subscription; 0: pay-as-you-go.
     * @param PayMode Billing mode. 1: monthly subscription; 0: pay-as-you-go.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Automatic renewal flag. 0: default status (manual renewal); 1: automatic renewal; 2: no automatic renewal. 
     * @return AutoRenewFlag Automatic renewal flag. 0: default status (manual renewal); 1: automatic renewal; 2: no automatic renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Automatic renewal flag. 0: default status (manual renewal); 1: automatic renewal; 2: no automatic renewal.
     * @param AutoRenewFlag Automatic renewal flag. 0: default status (manual renewal); 1: automatic renewal; 2: no automatic renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Dedicated cluster name. 
     * @return ClusterName Dedicated cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Dedicated cluster name.
     * @param ClusterName Dedicated cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Instance creation time 
     * @return StartTime Instance creation time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Instance creation time
     * @param StartTime Instance creation time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Instance expiration time. 
     * @return EndTime Instance expiration time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Instance expiration time.
     * @param EndTime Instance expiration time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cluster status. 1: in process; 2: running; 3: isolated. 
     * @return Status Cluster status. 1: in process; 2: running; 3: isolated.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 1: in process; 2: running; 3: isolated.
     * @param Status Cluster status. 1: in process; 2: running; 3: isolated.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Basic control resource package. 
     * @return BaseBundles Basic control resource package.
     */
    public ResourceBundle [] getBaseBundles() {
        return this.BaseBundles;
    }

    /**
     * Set Basic control resource package.
     * @param BaseBundles Basic control resource package.
     */
    public void setBaseBundles(ResourceBundle [] BaseBundles) {
        this.BaseBundles = BaseBundles;
    }

    /**
     * Get Resource package list. 
     * @return ResourceBundles Resource package list.
     */
    public ResourceBundle [] getResourceBundles() {
        return this.ResourceBundles;
    }

    /**
     * Set Resource package list.
     * @param ResourceBundles Resource package list.
     */
    public void setResourceBundles(ResourceBundle [] ResourceBundles) {
        this.ResourceBundles = ResourceBundles;
    }

    /**
     * Get Local dedicated cluster ID. 
     * @return DedicatedClusterId Local dedicated cluster ID.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Local dedicated cluster ID.
     * @param DedicatedClusterId Local dedicated cluster ID.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public CDCResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CDCResource(CDCResource source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BaseBundles != null) {
            this.BaseBundles = new ResourceBundle[source.BaseBundles.length];
            for (int i = 0; i < source.BaseBundles.length; i++) {
                this.BaseBundles[i] = new ResourceBundle(source.BaseBundles[i]);
            }
        }
        if (source.ResourceBundles != null) {
            this.ResourceBundles = new ResourceBundle[source.ResourceBundles.length];
            for (int i = 0; i < source.ResourceBundles.length; i++) {
                this.ResourceBundles[i] = new ResourceBundle(source.ResourceBundles[i]);
            }
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "BaseBundles.", this.BaseBundles);
        this.setParamArrayObj(map, prefix + "ResourceBundles.", this.ResourceBundles);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

