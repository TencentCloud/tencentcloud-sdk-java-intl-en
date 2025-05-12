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
    * AppId account ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * The unique ID of the resource package.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Successfully deduct capacity.
    */
    @SerializedName("SuccessDeductSpec")
    @Expose
    private Float SuccessDeductSpec;

    /**
    * The used capacity of the resource package up to the present.
    */
    @SerializedName("PackageTotalUsedSpec")
    @Expose
    private Float PackageTotalUsedSpec;

    /**
    * Deduction start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Deduction end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Extension Information
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

    /**
     * Get AppId account ID. 
     * @return AppId AppId account ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId account ID.
     * @param AppId AppId account ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get The unique ID of the resource package. 
     * @return PackageId The unique ID of the resource package.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The unique ID of the resource package.
     * @param PackageId The unique ID of the resource package.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Successfully deduct capacity. 
     * @return SuccessDeductSpec Successfully deduct capacity.
     */
    public Float getSuccessDeductSpec() {
        return this.SuccessDeductSpec;
    }

    /**
     * Set Successfully deduct capacity.
     * @param SuccessDeductSpec Successfully deduct capacity.
     */
    public void setSuccessDeductSpec(Float SuccessDeductSpec) {
        this.SuccessDeductSpec = SuccessDeductSpec;
    }

    /**
     * Get The used capacity of the resource package up to the present. 
     * @return PackageTotalUsedSpec The used capacity of the resource package up to the present.
     */
    public Float getPackageTotalUsedSpec() {
        return this.PackageTotalUsedSpec;
    }

    /**
     * Set The used capacity of the resource package up to the present.
     * @param PackageTotalUsedSpec The used capacity of the resource package up to the present.
     */
    public void setPackageTotalUsedSpec(Float PackageTotalUsedSpec) {
        this.PackageTotalUsedSpec = PackageTotalUsedSpec;
    }

    /**
     * Get Deduction start time. 
     * @return StartTime Deduction start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Deduction start time.
     * @param StartTime Deduction start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Deduction end time. 
     * @return EndTime Deduction end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Deduction end time.
     * @param EndTime Deduction end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Extension Information 
     * @return ExtendInfo Extension Information
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set Extension Information
     * @param ExtendInfo Extension Information
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

