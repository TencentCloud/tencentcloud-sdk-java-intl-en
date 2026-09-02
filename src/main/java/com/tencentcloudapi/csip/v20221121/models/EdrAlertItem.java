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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertItem extends AbstractModel {

    /**
    * <p>Alarm table id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Alarm ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>Major category of alarm</p>
    */
    @SerializedName("AlertCategory")
    @Expose
    private String AlertCategory;

    /**
    * <p>Alarm subcategory</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>Alarm level.</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>Alarm status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Attack phase</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>Detection mode</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>QUUID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Whether to pay</p>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Long IsProVersion;

    /**
    * <p>Alarm source</p>
    */
    @SerializedName("AlertSource")
    @Expose
    private String AlertSource;

    /**
    * <p>Machine type (specific to the list API; not limited to container alerts, and the same is returned for host alerts). Enriched from machines.machine_type by Quuid. The original enumeration value is passed through as-is without i18n translation, and the frontend performs row mapping for display. Parameter values include CVM / LH / Other / EKS-NATIVE. If no corresponding machine information is found, it is downgraded to an empty string "" (consistent with the downgrade action for asset enrichment fields such as InstanceName / PublicIp / PrivateIp). This field will not be returned by the alert details API (DescribeEdrAlertInfo)</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Container id</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Number of alarms.</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>Initial discovery time</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>Most recent discovery time</p>
    */
    @SerializedName("LatestDetectTime")
    @Expose
    private String LatestDetectTime;

    /**
    * <p>Rule name.</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Policy type</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Public IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>Whether application protection is enabled for this machine</p>
    */
    @SerializedName("RaspOpen")
    @Expose
    private Boolean RaspOpen;

    /**
    * <p>Container name</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Container image name</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>Alarm table id</p> 
     * @return Id <p>Alarm table id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Alarm table id</p>
     * @param Id <p>Alarm table id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Alarm ID</p> 
     * @return AlertId <p>Alarm ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>Alarm ID</p>
     * @param AlertId <p>Alarm ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>Major category of alarm</p> 
     * @return AlertCategory <p>Major category of alarm</p>
     */
    public String getAlertCategory() {
        return this.AlertCategory;
    }

    /**
     * Set <p>Major category of alarm</p>
     * @param AlertCategory <p>Major category of alarm</p>
     */
    public void setAlertCategory(String AlertCategory) {
        this.AlertCategory = AlertCategory;
    }

    /**
     * Get <p>Alarm subcategory</p> 
     * @return AlertSubType <p>Alarm subcategory</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>Alarm subcategory</p>
     * @param AlertSubType <p>Alarm subcategory</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    /**
     * Get <p>Policy ID.</p> 
     * @return RuleId <p>Policy ID.</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param RuleId <p>Policy ID.</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Policy type</p> 
     * @return RuleType <p>Policy type</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Policy type</p>
     * @param RuleType <p>Policy type</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Alarm level.</p> 
     * @return Level <p>Alarm level.</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm level.</p>
     * @param Level <p>Alarm level.</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Alarm status</p> 
     * @return Status <p>Alarm status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Alarm status</p>
     * @param Status <p>Alarm status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Attack phase</p> 
     * @return AttackStage <p>Attack phase</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>Attack phase</p>
     * @param AttackStage <p>Attack phase</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>Detection mode</p> 
     * @return DetectMode <p>Detection mode</p>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>Detection mode</p>
     * @param DetectMode <p>Detection mode</p>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>QUUID</p> 
     * @return Quuid <p>QUUID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>QUUID</p>
     * @param Quuid <p>QUUID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Whether to pay</p> 
     * @return IsProVersion <p>Whether to pay</p>
     */
    public Long getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>Whether to pay</p>
     * @param IsProVersion <p>Whether to pay</p>
     */
    public void setIsProVersion(Long IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>Alarm source</p> 
     * @return AlertSource <p>Alarm source</p>
     */
    public String getAlertSource() {
        return this.AlertSource;
    }

    /**
     * Set <p>Alarm source</p>
     * @param AlertSource <p>Alarm source</p>
     */
    public void setAlertSource(String AlertSource) {
        this.AlertSource = AlertSource;
    }

    /**
     * Get <p>Machine type (specific to the list API; not limited to container alerts, and the same is returned for host alerts). Enriched from machines.machine_type by Quuid. The original enumeration value is passed through as-is without i18n translation, and the frontend performs row mapping for display. Parameter values include CVM / LH / Other / EKS-NATIVE. If no corresponding machine information is found, it is downgraded to an empty string "" (consistent with the downgrade action for asset enrichment fields such as InstanceName / PublicIp / PrivateIp). This field will not be returned by the alert details API (DescribeEdrAlertInfo)</p> 
     * @return MachineType <p>Machine type (specific to the list API; not limited to container alerts, and the same is returned for host alerts). Enriched from machines.machine_type by Quuid. The original enumeration value is passed through as-is without i18n translation, and the frontend performs row mapping for display. Parameter values include CVM / LH / Other / EKS-NATIVE. If no corresponding machine information is found, it is downgraded to an empty string "" (consistent with the downgrade action for asset enrichment fields such as InstanceName / PublicIp / PrivateIp). This field will not be returned by the alert details API (DescribeEdrAlertInfo)</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Machine type (specific to the list API; not limited to container alerts, and the same is returned for host alerts). Enriched from machines.machine_type by Quuid. The original enumeration value is passed through as-is without i18n translation, and the frontend performs row mapping for display. Parameter values include CVM / LH / Other / EKS-NATIVE. If no corresponding machine information is found, it is downgraded to an empty string "" (consistent with the downgrade action for asset enrichment fields such as InstanceName / PublicIp / PrivateIp). This field will not be returned by the alert details API (DescribeEdrAlertInfo)</p>
     * @param MachineType <p>Machine type (specific to the list API; not limited to container alerts, and the same is returned for host alerts). Enriched from machines.machine_type by Quuid. The original enumeration value is passed through as-is without i18n translation, and the frontend performs row mapping for display. Parameter values include CVM / LH / Other / EKS-NATIVE. If no corresponding machine information is found, it is downgraded to an empty string "" (consistent with the downgrade action for asset enrichment fields such as InstanceName / PublicIp / PrivateIp). This field will not be returned by the alert details API (DescribeEdrAlertInfo)</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Container id</p> 
     * @return ContainerId <p>Container id</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container id</p>
     * @param ContainerId <p>Container id</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Number of alarms.</p> 
     * @return EventCount <p>Number of alarms.</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>Number of alarms.</p>
     * @param EventCount <p>Number of alarms.</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>Initial discovery time</p> 
     * @return FirstDetectTime <p>Initial discovery time</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>Initial discovery time</p>
     * @param FirstDetectTime <p>Initial discovery time</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>Most recent discovery time</p> 
     * @return LatestDetectTime <p>Most recent discovery time</p>
     */
    public String getLatestDetectTime() {
        return this.LatestDetectTime;
    }

    /**
     * Set <p>Most recent discovery time</p>
     * @param LatestDetectTime <p>Most recent discovery time</p>
     */
    public void setLatestDetectTime(String LatestDetectTime) {
        this.LatestDetectTime = LatestDetectTime;
    }

    /**
     * Get <p>Rule name.</p> 
     * @return RuleName <p>Rule name.</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name.</p>
     * @param RuleName <p>Rule name.</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Policy type</p> 
     * @return ContentType <p>Policy type</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>Policy type</p>
     * @param ContentType <p>Policy type</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Public IP</p> 
     * @return PublicIp <p>Public IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IP</p>
     * @param PublicIp <p>Public IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIp <p>Private IP address.</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIp <p>Private IP address.</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>Whether application protection is enabled for this machine</p> 
     * @return RaspOpen <p>Whether application protection is enabled for this machine</p>
     */
    public Boolean getRaspOpen() {
        return this.RaspOpen;
    }

    /**
     * Set <p>Whether application protection is enabled for this machine</p>
     * @param RaspOpen <p>Whether application protection is enabled for this machine</p>
     */
    public void setRaspOpen(Boolean RaspOpen) {
        this.RaspOpen = RaspOpen;
    }

    /**
     * Get <p>Container name</p> 
     * @return ContainerName <p>Container name</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name</p>
     * @param ContainerName <p>Container name</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Container image name</p> 
     * @return ImageName <p>Container image name</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Container image name</p>
     * @param ImageName <p>Container image name</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public EdrAlertItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertItem(EdrAlertItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AlertCategory != null) {
            this.AlertCategory = new String(source.AlertCategory);
        }
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Long(source.IsProVersion);
        }
        if (source.AlertSource != null) {
            this.AlertSource = new String(source.AlertSource);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LatestDetectTime != null) {
            this.LatestDetectTime = new String(source.LatestDetectTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.RaspOpen != null) {
            this.RaspOpen = new Boolean(source.RaspOpen);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AlertCategory", this.AlertCategory);
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "AlertSource", this.AlertSource);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "RaspOpen", this.RaspOpen);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

