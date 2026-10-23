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

public class Package extends AbstractModel {

    /**
    * AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Unique ID of the resource package
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Resource package name.
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Resource package type
CCU: compute resource package. DISK: storage resource package.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Resource package edition
base - basic, common - general, enterprise - business
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Region of resource package use
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource package status
creating
using - in use;
expired
normal_finish: used up;
apply_refund: Refund requested
refund: refunded.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Total resource package quantity
    */
    @SerializedName("PackageTotalSpec")
    @Expose
    private Float PackageTotalSpec;

    /**
    * Used amount of the resource package
    */
    @SerializedName("PackageUsedSpec")
    @Expose
    private Float PackageUsedSpec;

    /**
    * Whether there is still inventory surplus
    */
    @SerializedName("HasQuota")
    @Expose
    private Boolean HasQuota;

    /**
    * Bound instance information
    */
    @SerializedName("BindInstanceInfos")
    @Expose
    private BindInstanceInfo [] BindInstanceInfos;

    /**
    * Effective time: 2022-07-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Expiration time: 2022-08-01 00:00:00
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Resource package historic bound (unbound) instance information
    */
    @SerializedName("HistoryBindResourceInfos")
    @Expose
    private BindInstanceInfo [] HistoryBindResourceInfos;

    /**
     * Get AppID 
     * @return AppId AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID
     * @param AppId AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Unique ID of the resource package 
     * @return PackageId Unique ID of the resource package
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Unique ID of the resource package
     * @param PackageId Unique ID of the resource package
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Resource package name. 
     * @return PackageName Resource package name.
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource package name.
     * @param PackageName Resource package name.
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Resource package type
CCU: compute resource package. DISK: storage resource package. 
     * @return PackageType Resource package type
CCU: compute resource package. DISK: storage resource package.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource package type
CCU: compute resource package. DISK: storage resource package.
     * @param PackageType Resource package type
CCU: compute resource package. DISK: storage resource package.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Resource package edition
base - basic, common - general, enterprise - business 
     * @return PackageVersion Resource package edition
base - basic, common - general, enterprise - business
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set Resource package edition
base - basic, common - general, enterprise - business
     * @param PackageVersion Resource package edition
base - basic, common - general, enterprise - business
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Region of resource package use
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions 
     * @return PackageRegion Region of resource package use
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of resource package use
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     * @param PackageRegion Region of resource package use
china: common in the Chinese mainland; overseas: common in Hong Kong (China), Macao (China), Taiwan (China), and overseas regions
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource package status
creating
using - in use;
expired
normal_finish: used up;
apply_refund: Refund requested
refund: refunded. 
     * @return Status Resource package status
creating
using - in use;
expired
normal_finish: used up;
apply_refund: Refund requested
refund: refunded.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Resource package status
creating
using - in use;
expired
normal_finish: used up;
apply_refund: Refund requested
refund: refunded.
     * @param Status Resource package status
creating
using - in use;
expired
normal_finish: used up;
apply_refund: Refund requested
refund: refunded.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Total resource package quantity 
     * @return PackageTotalSpec Total resource package quantity
     */
    public Float getPackageTotalSpec() {
        return this.PackageTotalSpec;
    }

    /**
     * Set Total resource package quantity
     * @param PackageTotalSpec Total resource package quantity
     */
    public void setPackageTotalSpec(Float PackageTotalSpec) {
        this.PackageTotalSpec = PackageTotalSpec;
    }

    /**
     * Get Used amount of the resource package 
     * @return PackageUsedSpec Used amount of the resource package
     */
    public Float getPackageUsedSpec() {
        return this.PackageUsedSpec;
    }

    /**
     * Set Used amount of the resource package
     * @param PackageUsedSpec Used amount of the resource package
     */
    public void setPackageUsedSpec(Float PackageUsedSpec) {
        this.PackageUsedSpec = PackageUsedSpec;
    }

    /**
     * Get Whether there is still inventory surplus 
     * @return HasQuota Whether there is still inventory surplus
     */
    public Boolean getHasQuota() {
        return this.HasQuota;
    }

    /**
     * Set Whether there is still inventory surplus
     * @param HasQuota Whether there is still inventory surplus
     */
    public void setHasQuota(Boolean HasQuota) {
        this.HasQuota = HasQuota;
    }

    /**
     * Get Bound instance information 
     * @return BindInstanceInfos Bound instance information
     */
    public BindInstanceInfo [] getBindInstanceInfos() {
        return this.BindInstanceInfos;
    }

    /**
     * Set Bound instance information
     * @param BindInstanceInfos Bound instance information
     */
    public void setBindInstanceInfos(BindInstanceInfo [] BindInstanceInfos) {
        this.BindInstanceInfos = BindInstanceInfos;
    }

    /**
     * Get Effective time: 2022-07-01 00:00:00 
     * @return StartTime Effective time: 2022-07-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Effective time: 2022-07-01 00:00:00
     * @param StartTime Effective time: 2022-07-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Expiration time: 2022-08-01 00:00:00 
     * @return ExpireTime Expiration time: 2022-08-01 00:00:00
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time: 2022-08-01 00:00:00
     * @param ExpireTime Expiration time: 2022-08-01 00:00:00
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Resource package historic bound (unbound) instance information 
     * @return HistoryBindResourceInfos Resource package historic bound (unbound) instance information
     */
    public BindInstanceInfo [] getHistoryBindResourceInfos() {
        return this.HistoryBindResourceInfos;
    }

    /**
     * Set Resource package historic bound (unbound) instance information
     * @param HistoryBindResourceInfos Resource package historic bound (unbound) instance information
     */
    public void setHistoryBindResourceInfos(BindInstanceInfo [] HistoryBindResourceInfos) {
        this.HistoryBindResourceInfos = HistoryBindResourceInfos;
    }

    public Package() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Package(Package source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new String(source.PackageRegion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PackageTotalSpec != null) {
            this.PackageTotalSpec = new Float(source.PackageTotalSpec);
        }
        if (source.PackageUsedSpec != null) {
            this.PackageUsedSpec = new Float(source.PackageUsedSpec);
        }
        if (source.HasQuota != null) {
            this.HasQuota = new Boolean(source.HasQuota);
        }
        if (source.BindInstanceInfos != null) {
            this.BindInstanceInfos = new BindInstanceInfo[source.BindInstanceInfos.length];
            for (int i = 0; i < source.BindInstanceInfos.length; i++) {
                this.BindInstanceInfos[i] = new BindInstanceInfo(source.BindInstanceInfos[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.HistoryBindResourceInfos != null) {
            this.HistoryBindResourceInfos = new BindInstanceInfo[source.HistoryBindResourceInfos.length];
            for (int i = 0; i < source.HistoryBindResourceInfos.length; i++) {
                this.HistoryBindResourceInfos[i] = new BindInstanceInfo(source.HistoryBindResourceInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PackageTotalSpec", this.PackageTotalSpec);
        this.setParamSimple(map, prefix + "PackageUsedSpec", this.PackageUsedSpec);
        this.setParamSimple(map, prefix + "HasQuota", this.HasQuota);
        this.setParamArrayObj(map, prefix + "BindInstanceInfos.", this.BindInstanceInfos);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "HistoryBindResourceInfos.", this.HistoryBindResourceInfos);

    }
}

