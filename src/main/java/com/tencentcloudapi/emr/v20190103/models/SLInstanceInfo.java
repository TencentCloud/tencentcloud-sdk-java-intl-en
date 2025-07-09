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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLInstanceInfo extends AbstractModel {

    /**
    * Instance string ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance numeric ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Health status.
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * Instance name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Primary AZ ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Primary AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * User APP ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Primary AZ VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Primary AZ subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Status code
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Cluster billing type. 0 indicates pay-as-you-go. 1 indicates monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Multi-AZ information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * Instance tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. If the business does not support renewal, the value is set to 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Isolation time. For instances that are not isolated, the API returns 0000-00-00 00:00:00.
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Expiration time. For post-paid instances, the API returns 0000-00-00 00:00:00.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Instance string ID. 
     * @return ClusterId Instance string ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Instance string ID.
     * @param ClusterId Instance string ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance numeric ID 
     * @return Id Instance numeric ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Instance numeric ID
     * @param Id Instance numeric ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Status description. 
     * @return StatusDesc Status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description.
     * @param StatusDesc Status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Health status. 
     * @return HealthStatus Health status.
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health status.
     * @param HealthStatus Health status.
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Instance name 
     * @return ClusterName Instance name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Instance name
     * @param ClusterName Instance name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Primary AZ ID. 
     * @return ZoneId Primary AZ ID.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Primary AZ ID.
     * @param ZoneId Primary AZ ID.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Primary AZ. 
     * @return Zone Primary AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Primary AZ.
     * @param Zone Primary AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get User APP ID. 
     * @return AppId User APP ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User APP ID.
     * @param AppId User APP ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Primary AZ VPC ID. 
     * @return VpcId Primary AZ VPC ID.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Primary AZ VPC ID.
     * @param VpcId Primary AZ VPC ID.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Primary AZ subnet ID. 
     * @return SubnetId Primary AZ subnet ID.
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Primary AZ subnet ID.
     * @param SubnetId Primary AZ subnet ID.
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Status code 
     * @return Status Status code
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status code
     * @param Status Status code
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return AddTime Creation time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time.
     * @param AddTime Creation time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Cluster billing type. 0 indicates pay-as-you-go. 1 indicates monthly subscription. 
     * @return PayMode Cluster billing type. 0 indicates pay-as-you-go. 1 indicates monthly subscription.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Cluster billing type. 0 indicates pay-as-you-go. 1 indicates monthly subscription.
     * @param PayMode Cluster billing type. 0 indicates pay-as-you-go. 1 indicates monthly subscription.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Multi-AZ information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneSettings Multi-AZ information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set Multi-AZ information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneSettings Multi-AZ information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get Instance tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Instance tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Instance tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Instance tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. If the business does not support renewal, the value is set to 0. 
     * @return AutoRenewFlag Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. If the business does not support renewal, the value is set to 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. If the business does not support renewal, the value is set to 0.
     * @param AutoRenewFlag Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. If the business does not support renewal, the value is set to 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Isolation time. For instances that are not isolated, the API returns 0000-00-00 00:00:00. 
     * @return IsolateTime Isolation time. For instances that are not isolated, the API returns 0000-00-00 00:00:00.
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time. For instances that are not isolated, the API returns 0000-00-00 00:00:00.
     * @param IsolateTime Isolation time. For instances that are not isolated, the API returns 0000-00-00 00:00:00.
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Expiration time. For post-paid instances, the API returns 0000-00-00 00:00:00. 
     * @return ExpireTime Expiration time. For post-paid instances, the API returns 0000-00-00 00:00:00.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time. For post-paid instances, the API returns 0000-00-00 00:00:00.
     * @param ExpireTime Expiration time. For post-paid instances, the API returns 0000-00-00 00:00:00.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public SLInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLInstanceInfo(SLInstanceInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

