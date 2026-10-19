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

public class CosAssetInfo extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>cos bucket name</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>cos region name</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>Region code value</p>
    */
    @SerializedName("BucketRegionCode")
    @Expose
    private String BucketRegionCode;

    /**
    * <p>cos bucket remark</p>
    */
    @SerializedName("BucketMarker")
    @Expose
    private String BucketMarker;

    /**
    * <p>Owner of the cos bucket root account</p>
    */
    @SerializedName("BucketOwnerUin")
    @Expose
    private String BucketOwnerUin;

    /**
    * <p>Nickname of the cos root account owner</p>
    */
    @SerializedName("BucketOwnerNickName")
    @Expose
    private String BucketOwnerNickName;

    /**
    * <p>cos bucket tag detail</p>
    */
    @SerializedName("BucketTagInfo")
    @Expose
    private String BucketTagInfo;

    /**
    * <p>Security advice<br>1 No abnormality detected<br>2 Hardening recommended<br>3 Process now</p>
    */
    @SerializedName("BucketSecuritySuggestion")
    @Expose
    private Long BucketSecuritySuggestion;

    /**
    * <p>alarm list</p>
    */
    @SerializedName("BucketAlarmList")
    @Expose
    private CosRiskAlarmInfo [] BucketAlarmList;

    /**
    * <p>Risk list</p>
    */
    @SerializedName("BucketRiskList")
    @Expose
    private CosRiskAlarmInfo [] BucketRiskList;

    /**
    * <p>Number of source IPs for calls</p>
    */
    @SerializedName("BucketInvokeSourceIpCount")
    @Expose
    private Long BucketInvokeSourceIpCount;

    /**
    * <p>Access policy</p>
    */
    @SerializedName("BucketAccessWay")
    @Expose
    private CosBucketAccessWay BucketAccessWay;

    /**
    * <p>Creation time Unix timestamp in milliseconds</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Last access time in Unix timestamp in milliseconds</p>
    */
    @SerializedName("LastAccessTime")
    @Expose
    private Long LastAccessTime;

    /**
    * <p>Bucket id</p>
    */
    @SerializedName("BucketId")
    @Expose
    private Long BucketId;

    /**
    * <p>0 Off<br>1 On</p>
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * <p>Data identification scan information.</p>
    */
    @SerializedName("DataScanInfo")
    @Expose
    private CosAssetDataScanDetail DataScanInfo;

    /**
    * <p>Bucket Az type</p><p>Enumeration values:</p><ul><li>MAZ: Multi-Az</li><li>SAZ: Single-Az</li></ul>
    */
    @SerializedName("BucketAzType")
    @Expose
    private String BucketAzType;

    /**
    * <p>Bucket storage size</p><p>Default value: 0</p>
    */
    @SerializedName("BucketStorageSize")
    @Expose
    private Long BucketStorageSize;

    /**
    * <p>Bucket object count</p><p>Default value: 0</p>
    */
    @SerializedName("BucketObjectCount")
    @Expose
    private Long BucketObjectCount;

    /**
    * <p>Bucket sensitive identification sampling rate</p><p>Value range: [0, 1]</p><p>Default value: 0</p>
    */
    @SerializedName("IdentifySampleRate")
    @Expose
    private Float IdentifySampleRate;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>cos bucket name</p> 
     * @return BucketName <p>cos bucket name</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>cos bucket name</p>
     * @param BucketName <p>cos bucket name</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>cos region name</p> 
     * @return BucketRegion <p>cos region name</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>cos region name</p>
     * @param BucketRegion <p>cos region name</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>Region code value</p> 
     * @return BucketRegionCode <p>Region code value</p>
     */
    public String getBucketRegionCode() {
        return this.BucketRegionCode;
    }

    /**
     * Set <p>Region code value</p>
     * @param BucketRegionCode <p>Region code value</p>
     */
    public void setBucketRegionCode(String BucketRegionCode) {
        this.BucketRegionCode = BucketRegionCode;
    }

    /**
     * Get <p>cos bucket remark</p> 
     * @return BucketMarker <p>cos bucket remark</p>
     */
    public String getBucketMarker() {
        return this.BucketMarker;
    }

    /**
     * Set <p>cos bucket remark</p>
     * @param BucketMarker <p>cos bucket remark</p>
     */
    public void setBucketMarker(String BucketMarker) {
        this.BucketMarker = BucketMarker;
    }

    /**
     * Get <p>Owner of the cos bucket root account</p> 
     * @return BucketOwnerUin <p>Owner of the cos bucket root account</p>
     */
    public String getBucketOwnerUin() {
        return this.BucketOwnerUin;
    }

    /**
     * Set <p>Owner of the cos bucket root account</p>
     * @param BucketOwnerUin <p>Owner of the cos bucket root account</p>
     */
    public void setBucketOwnerUin(String BucketOwnerUin) {
        this.BucketOwnerUin = BucketOwnerUin;
    }

    /**
     * Get <p>Nickname of the cos root account owner</p> 
     * @return BucketOwnerNickName <p>Nickname of the cos root account owner</p>
     */
    public String getBucketOwnerNickName() {
        return this.BucketOwnerNickName;
    }

    /**
     * Set <p>Nickname of the cos root account owner</p>
     * @param BucketOwnerNickName <p>Nickname of the cos root account owner</p>
     */
    public void setBucketOwnerNickName(String BucketOwnerNickName) {
        this.BucketOwnerNickName = BucketOwnerNickName;
    }

    /**
     * Get <p>cos bucket tag detail</p> 
     * @return BucketTagInfo <p>cos bucket tag detail</p>
     */
    public String getBucketTagInfo() {
        return this.BucketTagInfo;
    }

    /**
     * Set <p>cos bucket tag detail</p>
     * @param BucketTagInfo <p>cos bucket tag detail</p>
     */
    public void setBucketTagInfo(String BucketTagInfo) {
        this.BucketTagInfo = BucketTagInfo;
    }

    /**
     * Get <p>Security advice<br>1 No abnormality detected<br>2 Hardening recommended<br>3 Process now</p> 
     * @return BucketSecuritySuggestion <p>Security advice<br>1 No abnormality detected<br>2 Hardening recommended<br>3 Process now</p>
     */
    public Long getBucketSecuritySuggestion() {
        return this.BucketSecuritySuggestion;
    }

    /**
     * Set <p>Security advice<br>1 No abnormality detected<br>2 Hardening recommended<br>3 Process now</p>
     * @param BucketSecuritySuggestion <p>Security advice<br>1 No abnormality detected<br>2 Hardening recommended<br>3 Process now</p>
     */
    public void setBucketSecuritySuggestion(Long BucketSecuritySuggestion) {
        this.BucketSecuritySuggestion = BucketSecuritySuggestion;
    }

    /**
     * Get <p>alarm list</p> 
     * @return BucketAlarmList <p>alarm list</p>
     */
    public CosRiskAlarmInfo [] getBucketAlarmList() {
        return this.BucketAlarmList;
    }

    /**
     * Set <p>alarm list</p>
     * @param BucketAlarmList <p>alarm list</p>
     */
    public void setBucketAlarmList(CosRiskAlarmInfo [] BucketAlarmList) {
        this.BucketAlarmList = BucketAlarmList;
    }

    /**
     * Get <p>Risk list</p> 
     * @return BucketRiskList <p>Risk list</p>
     */
    public CosRiskAlarmInfo [] getBucketRiskList() {
        return this.BucketRiskList;
    }

    /**
     * Set <p>Risk list</p>
     * @param BucketRiskList <p>Risk list</p>
     */
    public void setBucketRiskList(CosRiskAlarmInfo [] BucketRiskList) {
        this.BucketRiskList = BucketRiskList;
    }

    /**
     * Get <p>Number of source IPs for calls</p> 
     * @return BucketInvokeSourceIpCount <p>Number of source IPs for calls</p>
     */
    public Long getBucketInvokeSourceIpCount() {
        return this.BucketInvokeSourceIpCount;
    }

    /**
     * Set <p>Number of source IPs for calls</p>
     * @param BucketInvokeSourceIpCount <p>Number of source IPs for calls</p>
     */
    public void setBucketInvokeSourceIpCount(Long BucketInvokeSourceIpCount) {
        this.BucketInvokeSourceIpCount = BucketInvokeSourceIpCount;
    }

    /**
     * Get <p>Access policy</p> 
     * @return BucketAccessWay <p>Access policy</p>
     */
    public CosBucketAccessWay getBucketAccessWay() {
        return this.BucketAccessWay;
    }

    /**
     * Set <p>Access policy</p>
     * @param BucketAccessWay <p>Access policy</p>
     */
    public void setBucketAccessWay(CosBucketAccessWay BucketAccessWay) {
        this.BucketAccessWay = BucketAccessWay;
    }

    /**
     * Get <p>Creation time Unix timestamp in milliseconds</p> 
     * @return CreateTime <p>Creation time Unix timestamp in milliseconds</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time Unix timestamp in milliseconds</p>
     * @param CreateTime <p>Creation time Unix timestamp in milliseconds</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last access time in Unix timestamp in milliseconds</p> 
     * @return LastAccessTime <p>Last access time in Unix timestamp in milliseconds</p>
     */
    public Long getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set <p>Last access time in Unix timestamp in milliseconds</p>
     * @param LastAccessTime <p>Last access time in Unix timestamp in milliseconds</p>
     */
    public void setLastAccessTime(Long LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get <p>Bucket id</p> 
     * @return BucketId <p>Bucket id</p>
     */
    public Long getBucketId() {
        return this.BucketId;
    }

    /**
     * Set <p>Bucket id</p>
     * @param BucketId <p>Bucket id</p>
     */
    public void setBucketId(Long BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get <p>0 Off<br>1 On</p> 
     * @return MonitorStatus <p>0 Off<br>1 On</p>
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set <p>0 Off<br>1 On</p>
     * @param MonitorStatus <p>0 Off<br>1 On</p>
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get <p>Data identification scan information.</p> 
     * @return DataScanInfo <p>Data identification scan information.</p>
     */
    public CosAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set <p>Data identification scan information.</p>
     * @param DataScanInfo <p>Data identification scan information.</p>
     */
    public void setDataScanInfo(CosAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
    }

    /**
     * Get <p>Bucket Az type</p><p>Enumeration values:</p><ul><li>MAZ: Multi-Az</li><li>SAZ: Single-Az</li></ul> 
     * @return BucketAzType <p>Bucket Az type</p><p>Enumeration values:</p><ul><li>MAZ: Multi-Az</li><li>SAZ: Single-Az</li></ul>
     */
    public String getBucketAzType() {
        return this.BucketAzType;
    }

    /**
     * Set <p>Bucket Az type</p><p>Enumeration values:</p><ul><li>MAZ: Multi-Az</li><li>SAZ: Single-Az</li></ul>
     * @param BucketAzType <p>Bucket Az type</p><p>Enumeration values:</p><ul><li>MAZ: Multi-Az</li><li>SAZ: Single-Az</li></ul>
     */
    public void setBucketAzType(String BucketAzType) {
        this.BucketAzType = BucketAzType;
    }

    /**
     * Get <p>Bucket storage size</p><p>Default value: 0</p> 
     * @return BucketStorageSize <p>Bucket storage size</p><p>Default value: 0</p>
     */
    public Long getBucketStorageSize() {
        return this.BucketStorageSize;
    }

    /**
     * Set <p>Bucket storage size</p><p>Default value: 0</p>
     * @param BucketStorageSize <p>Bucket storage size</p><p>Default value: 0</p>
     */
    public void setBucketStorageSize(Long BucketStorageSize) {
        this.BucketStorageSize = BucketStorageSize;
    }

    /**
     * Get <p>Bucket object count</p><p>Default value: 0</p> 
     * @return BucketObjectCount <p>Bucket object count</p><p>Default value: 0</p>
     */
    public Long getBucketObjectCount() {
        return this.BucketObjectCount;
    }

    /**
     * Set <p>Bucket object count</p><p>Default value: 0</p>
     * @param BucketObjectCount <p>Bucket object count</p><p>Default value: 0</p>
     */
    public void setBucketObjectCount(Long BucketObjectCount) {
        this.BucketObjectCount = BucketObjectCount;
    }

    /**
     * Get <p>Bucket sensitive identification sampling rate</p><p>Value range: [0, 1]</p><p>Default value: 0</p> 
     * @return IdentifySampleRate <p>Bucket sensitive identification sampling rate</p><p>Value range: [0, 1]</p><p>Default value: 0</p>
     */
    public Float getIdentifySampleRate() {
        return this.IdentifySampleRate;
    }

    /**
     * Set <p>Bucket sensitive identification sampling rate</p><p>Value range: [0, 1]</p><p>Default value: 0</p>
     * @param IdentifySampleRate <p>Bucket sensitive identification sampling rate</p><p>Value range: [0, 1]</p><p>Default value: 0</p>
     */
    public void setIdentifySampleRate(Float IdentifySampleRate) {
        this.IdentifySampleRate = IdentifySampleRate;
    }

    public CosAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetInfo(CosAssetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketRegionCode != null) {
            this.BucketRegionCode = new String(source.BucketRegionCode);
        }
        if (source.BucketMarker != null) {
            this.BucketMarker = new String(source.BucketMarker);
        }
        if (source.BucketOwnerUin != null) {
            this.BucketOwnerUin = new String(source.BucketOwnerUin);
        }
        if (source.BucketOwnerNickName != null) {
            this.BucketOwnerNickName = new String(source.BucketOwnerNickName);
        }
        if (source.BucketTagInfo != null) {
            this.BucketTagInfo = new String(source.BucketTagInfo);
        }
        if (source.BucketSecuritySuggestion != null) {
            this.BucketSecuritySuggestion = new Long(source.BucketSecuritySuggestion);
        }
        if (source.BucketAlarmList != null) {
            this.BucketAlarmList = new CosRiskAlarmInfo[source.BucketAlarmList.length];
            for (int i = 0; i < source.BucketAlarmList.length; i++) {
                this.BucketAlarmList[i] = new CosRiskAlarmInfo(source.BucketAlarmList[i]);
            }
        }
        if (source.BucketRiskList != null) {
            this.BucketRiskList = new CosRiskAlarmInfo[source.BucketRiskList.length];
            for (int i = 0; i < source.BucketRiskList.length; i++) {
                this.BucketRiskList[i] = new CosRiskAlarmInfo(source.BucketRiskList[i]);
            }
        }
        if (source.BucketInvokeSourceIpCount != null) {
            this.BucketInvokeSourceIpCount = new Long(source.BucketInvokeSourceIpCount);
        }
        if (source.BucketAccessWay != null) {
            this.BucketAccessWay = new CosBucketAccessWay(source.BucketAccessWay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new Long(source.LastAccessTime);
        }
        if (source.BucketId != null) {
            this.BucketId = new Long(source.BucketId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.DataScanInfo != null) {
            this.DataScanInfo = new CosAssetDataScanDetail(source.DataScanInfo);
        }
        if (source.BucketAzType != null) {
            this.BucketAzType = new String(source.BucketAzType);
        }
        if (source.BucketStorageSize != null) {
            this.BucketStorageSize = new Long(source.BucketStorageSize);
        }
        if (source.BucketObjectCount != null) {
            this.BucketObjectCount = new Long(source.BucketObjectCount);
        }
        if (source.IdentifySampleRate != null) {
            this.IdentifySampleRate = new Float(source.IdentifySampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketRegionCode", this.BucketRegionCode);
        this.setParamSimple(map, prefix + "BucketMarker", this.BucketMarker);
        this.setParamSimple(map, prefix + "BucketOwnerUin", this.BucketOwnerUin);
        this.setParamSimple(map, prefix + "BucketOwnerNickName", this.BucketOwnerNickName);
        this.setParamSimple(map, prefix + "BucketTagInfo", this.BucketTagInfo);
        this.setParamSimple(map, prefix + "BucketSecuritySuggestion", this.BucketSecuritySuggestion);
        this.setParamArrayObj(map, prefix + "BucketAlarmList.", this.BucketAlarmList);
        this.setParamArrayObj(map, prefix + "BucketRiskList.", this.BucketRiskList);
        this.setParamSimple(map, prefix + "BucketInvokeSourceIpCount", this.BucketInvokeSourceIpCount);
        this.setParamObj(map, prefix + "BucketAccessWay.", this.BucketAccessWay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamObj(map, prefix + "DataScanInfo.", this.DataScanInfo);
        this.setParamSimple(map, prefix + "BucketAzType", this.BucketAzType);
        this.setParamSimple(map, prefix + "BucketStorageSize", this.BucketStorageSize);
        this.setParamSimple(map, prefix + "BucketObjectCount", this.BucketObjectCount);
        this.setParamSimple(map, prefix + "IdentifySampleRate", this.IdentifySampleRate);

    }
}

