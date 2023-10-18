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

public class PackageDetail extends AbstractModel {

    /**
    * Account ID of `AppId` Note: This field may return null, indicating that no valid values can be obtained.
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
    * Instance ID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The successfully deducted capacity Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuccessDeductSpec")
    @Expose
    private Float SuccessDeductSpec;

    /**
    * Used capacity of a resource pack as of now Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PackageTotalUsedSpec")
    @Expose
    private Float PackageTotalUsedSpec;

    /**
    * Deduction start time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Deduction end time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Extended information Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

    /**
     * Get Account ID of `AppId` Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId Account ID of `AppId` Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Account ID of `AppId` Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId Account ID of `AppId` Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Instance ID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The successfully deducted capacity Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuccessDeductSpec The successfully deducted capacity Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getSuccessDeductSpec() {
        return this.SuccessDeductSpec;
    }

    /**
     * Set The successfully deducted capacity Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuccessDeductSpec The successfully deducted capacity Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuccessDeductSpec(Float SuccessDeductSpec) {
        this.SuccessDeductSpec = SuccessDeductSpec;
    }

    /**
     * Get Used capacity of a resource pack as of now Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PackageTotalUsedSpec Used capacity of a resource pack as of now Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getPackageTotalUsedSpec() {
        return this.PackageTotalUsedSpec;
    }

    /**
     * Set Used capacity of a resource pack as of now Note: This field may return null, indicating that no valid values can be obtained.
     * @param PackageTotalUsedSpec Used capacity of a resource pack as of now Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPackageTotalUsedSpec(Float PackageTotalUsedSpec) {
        this.PackageTotalUsedSpec = PackageTotalUsedSpec;
    }

    /**
     * Get Deduction start time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Deduction start time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Deduction start time Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Deduction start time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Deduction end time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Deduction end time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Deduction end time Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Deduction end time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Extended information Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtendInfo Extended information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set Extended information Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtendInfo Extended information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtendInfo(String ExtendInfo) {
        this.ExtendInfo = ExtendInfo;
    }

    public PackageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageDetail(PackageDetail source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SuccessDeductSpec != null) {
            this.SuccessDeductSpec = new Float(source.SuccessDeductSpec);
        }
        if (source.PackageTotalUsedSpec != null) {
            this.PackageTotalUsedSpec = new Float(source.PackageTotalUsedSpec);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExtendInfo != null) {
            this.ExtendInfo = new String(source.ExtendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SuccessDeductSpec", this.SuccessDeductSpec);
        this.setParamSimple(map, prefix + "PackageTotalUsedSpec", this.PackageTotalUsedSpec);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExtendInfo", this.ExtendInfo);

    }
}

