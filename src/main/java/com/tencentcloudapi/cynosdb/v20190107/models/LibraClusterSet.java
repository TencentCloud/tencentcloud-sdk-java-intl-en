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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraClusterSet extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Database version.
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * instance information
    */
    @SerializedName("InstanceSet")
    @Expose
    private LibraInstanceSet [] InstanceSet;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Expiration time.
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * Project ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Storage size
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Used Capacity
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * VIP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get User ID 
     * @return AppId User ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
     * @param AppId User ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get Database version. 
     * @return DbVersion Database version.
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version.
     * @param DbVersion Database version.
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get instance information 
     * @return InstanceSet instance information
     */
    public LibraInstanceSet [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set instance information
     * @param InstanceSet instance information
     */
    public void setInstanceSet(LibraInstanceSet [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiration time. 
     * @return PeriodEndTime Expiration time.
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set Expiration time.
     * @param PeriodEndTime Expiration time.
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get Project ID 
     * @return ProjectID Project ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID
     * @param ProjectID Project ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration. 
     * @return RenewFlag Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     * @param RenewFlag Auto-renewal flag. 1: Automatic renewal. 0: Non-renewal upon expiration.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Storage size 
     * @return Storage Storage size
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage size
     * @param Storage Storage size
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Used Capacity 
     * @return UsedStorage Used Capacity
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set Used Capacity
     * @param UsedStorage Used Capacity
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get VIP address 
     * @return Vip VIP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP address
     * @param Vip VIP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport port 
     * @return Vport vport port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport port
     * @param Vport vport port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public LibraClusterSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraClusterSet(LibraClusterSet source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new LibraInstanceSet[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new LibraInstanceSet(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

