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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Package extends AbstractModel {

    /**
    * AppID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * The unique ID of a resource pack Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Resource pack name Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageRegion")
    @Expose
    private String PackageRegion;

    /**
    * Resource pack status. Valid values: `creating`, `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Total number of resource packs Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageTotalSpec")
    @Expose
    private Float PackageTotalSpec;

    /**
    * Consumed usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageUsedSpec")
    @Expose
    private Float PackageUsedSpec;

    /**
    * Remaining usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasQuota")
    @Expose
    private Boolean HasQuota;

    /**
    * Information of the instance bound Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindInstanceInfos")
    @Expose
    private BindInstanceInfo [] BindInstanceInfos;

    /**
    * Validity time:  2022-07-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Validity time:  2022-08-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get AppID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId AppID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppID Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId AppID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get The unique ID of a resource pack Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageId The unique ID of a resource pack Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The unique ID of a resource pack Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageId The unique ID of a resource pack Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Resource pack name Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageName Resource pack name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Resource pack name Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageName Resource pack name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageType Resource pack type. Valid values: `CCU` (compute resource pack), `DISK` (storage resource pack). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageRegion Region of the resource pack. Valid values: `China` (Chinese mainland), `overseas` (outside Chinese mainland). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageRegion(String PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Resource pack status. Valid values: `creating`, `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Status Resource pack status. Valid values: `creating`, `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Resource pack status. Valid values: `creating`, `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Status Resource pack status. Valid values: `creating`, `using`, `expired`, `normal_finish` (used up), `apply_refund` (requesting a refund), `refund` (refunded). 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Total number of resource packs Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageTotalSpec Total number of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPackageTotalSpec() {
        return this.PackageTotalSpec;
    }

    /**
     * Set Total number of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageTotalSpec Total number of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageTotalSpec(Float PackageTotalSpec) {
        this.PackageTotalSpec = PackageTotalSpec;
    }

    /**
     * Get Consumed usage of resource packs Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageUsedSpec Consumed usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPackageUsedSpec() {
        return this.PackageUsedSpec;
    }

    /**
     * Set Consumed usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageUsedSpec Consumed usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageUsedSpec(Float PackageUsedSpec) {
        this.PackageUsedSpec = PackageUsedSpec;
    }

    /**
     * Get Remaining usage of resource packs Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasQuota Remaining usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasQuota() {
        return this.HasQuota;
    }

    /**
     * Set Remaining usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasQuota Remaining usage of resource packs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasQuota(Boolean HasQuota) {
        this.HasQuota = HasQuota;
    }

    /**
     * Get Information of the instance bound Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindInstanceInfos Information of the instance bound Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BindInstanceInfo [] getBindInstanceInfos() {
        return this.BindInstanceInfos;
    }

    /**
     * Set Information of the instance bound Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindInstanceInfos Information of the instance bound Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindInstanceInfos(BindInstanceInfo [] BindInstanceInfos) {
        this.BindInstanceInfos = BindInstanceInfos;
    }

    /**
     * Get Validity time:  2022-07-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Validity time:  2022-07-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Validity time:  2022-07-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Validity time:  2022-07-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Validity time:  2022-08-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Validity time:  2022-08-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Validity time:  2022-08-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Validity time:  2022-08-01 00:00:00 Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PackageTotalSpec", this.PackageTotalSpec);
        this.setParamSimple(map, prefix + "PackageUsedSpec", this.PackageUsedSpec);
        this.setParamSimple(map, prefix + "HasQuota", this.HasQuota);
        this.setParamArrayObj(map, prefix + "BindInstanceInfos.", this.BindInstanceInfos);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

