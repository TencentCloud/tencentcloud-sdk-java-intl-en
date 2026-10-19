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

public class CosAkAssetInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * ak id
    */
    @SerializedName("AkId")
    @Expose
    private String AkId;

    /**
    * ak name
    */
    @SerializedName("AkName")
    @Expose
    private String AkName;

    /**
    * ak remark
    */
    @SerializedName("AkRemark")
    @Expose
    private String AkRemark;

    /**
    * uin associated with the ak
    */
    @SerializedName("AkOwnerUin")
    @Expose
    private String AkOwnerUin;

    /**
    * ak type. 1: primary. 2: sub
    */
    @SerializedName("AkOwnerType")
    @Expose
    private Long AkOwnerType;

    /**
    * ak account name
    */
    @SerializedName("AkOwnerName")
    @Expose
    private String AkOwnerName;

    /**
    * ak main account name
    */
    @SerializedName("AkMainOwnerName")
    @Expose
    private String AkMainOwnerName;

    /**
    * ak-associated bucket collection
    */
    @SerializedName("AkRelBucketSet")
    @Expose
    private String [] AkRelBucketSet;

    /**
    * ak associated alarm collection
    */
    @SerializedName("AkRelAlarmSet")
    @Expose
    private CosRiskInfo [] AkRelAlarmSet;

    /**
    * Number of IPs associated with Ak
    */
    @SerializedName("AkRelIpCount")
    @Expose
    private Long AkRelIpCount;

    /**
    * ak status. 0: disabled. 1: enabled.
    */
    @SerializedName("AkStatus")
    @Expose
    private Long AkStatus;

    /**
    * Creation time.
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private Long CreateTimestamp;

    /**
    * Last access time
    */
    @SerializedName("LastAccessTimestamp")
    @Expose
    private Long LastAccessTimestamp;

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get ak id 
     * @return AkId ak id
     */
    public String getAkId() {
        return this.AkId;
    }

    /**
     * Set ak id
     * @param AkId ak id
     */
    public void setAkId(String AkId) {
        this.AkId = AkId;
    }

    /**
     * Get ak name 
     * @return AkName ak name
     */
    public String getAkName() {
        return this.AkName;
    }

    /**
     * Set ak name
     * @param AkName ak name
     */
    public void setAkName(String AkName) {
        this.AkName = AkName;
    }

    /**
     * Get ak remark 
     * @return AkRemark ak remark
     */
    public String getAkRemark() {
        return this.AkRemark;
    }

    /**
     * Set ak remark
     * @param AkRemark ak remark
     */
    public void setAkRemark(String AkRemark) {
        this.AkRemark = AkRemark;
    }

    /**
     * Get uin associated with the ak 
     * @return AkOwnerUin uin associated with the ak
     */
    public String getAkOwnerUin() {
        return this.AkOwnerUin;
    }

    /**
     * Set uin associated with the ak
     * @param AkOwnerUin uin associated with the ak
     */
    public void setAkOwnerUin(String AkOwnerUin) {
        this.AkOwnerUin = AkOwnerUin;
    }

    /**
     * Get ak type. 1: primary. 2: sub 
     * @return AkOwnerType ak type. 1: primary. 2: sub
     */
    public Long getAkOwnerType() {
        return this.AkOwnerType;
    }

    /**
     * Set ak type. 1: primary. 2: sub
     * @param AkOwnerType ak type. 1: primary. 2: sub
     */
    public void setAkOwnerType(Long AkOwnerType) {
        this.AkOwnerType = AkOwnerType;
    }

    /**
     * Get ak account name 
     * @return AkOwnerName ak account name
     */
    public String getAkOwnerName() {
        return this.AkOwnerName;
    }

    /**
     * Set ak account name
     * @param AkOwnerName ak account name
     */
    public void setAkOwnerName(String AkOwnerName) {
        this.AkOwnerName = AkOwnerName;
    }

    /**
     * Get ak main account name 
     * @return AkMainOwnerName ak main account name
     */
    public String getAkMainOwnerName() {
        return this.AkMainOwnerName;
    }

    /**
     * Set ak main account name
     * @param AkMainOwnerName ak main account name
     */
    public void setAkMainOwnerName(String AkMainOwnerName) {
        this.AkMainOwnerName = AkMainOwnerName;
    }

    /**
     * Get ak-associated bucket collection 
     * @return AkRelBucketSet ak-associated bucket collection
     */
    public String [] getAkRelBucketSet() {
        return this.AkRelBucketSet;
    }

    /**
     * Set ak-associated bucket collection
     * @param AkRelBucketSet ak-associated bucket collection
     */
    public void setAkRelBucketSet(String [] AkRelBucketSet) {
        this.AkRelBucketSet = AkRelBucketSet;
    }

    /**
     * Get ak associated alarm collection 
     * @return AkRelAlarmSet ak associated alarm collection
     */
    public CosRiskInfo [] getAkRelAlarmSet() {
        return this.AkRelAlarmSet;
    }

    /**
     * Set ak associated alarm collection
     * @param AkRelAlarmSet ak associated alarm collection
     */
    public void setAkRelAlarmSet(CosRiskInfo [] AkRelAlarmSet) {
        this.AkRelAlarmSet = AkRelAlarmSet;
    }

    /**
     * Get Number of IPs associated with Ak 
     * @return AkRelIpCount Number of IPs associated with Ak
     */
    public Long getAkRelIpCount() {
        return this.AkRelIpCount;
    }

    /**
     * Set Number of IPs associated with Ak
     * @param AkRelIpCount Number of IPs associated with Ak
     */
    public void setAkRelIpCount(Long AkRelIpCount) {
        this.AkRelIpCount = AkRelIpCount;
    }

    /**
     * Get ak status. 0: disabled. 1: enabled. 
     * @return AkStatus ak status. 0: disabled. 1: enabled.
     */
    public Long getAkStatus() {
        return this.AkStatus;
    }

    /**
     * Set ak status. 0: disabled. 1: enabled.
     * @param AkStatus ak status. 0: disabled. 1: enabled.
     */
    public void setAkStatus(Long AkStatus) {
        this.AkStatus = AkStatus;
    }

    /**
     * Get Creation time. 
     * @return CreateTimestamp Creation time.
     */
    public Long getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set Creation time.
     * @param CreateTimestamp Creation time.
     */
    public void setCreateTimestamp(Long CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get Last access time 
     * @return LastAccessTimestamp Last access time
     */
    public Long getLastAccessTimestamp() {
        return this.LastAccessTimestamp;
    }

    /**
     * Set Last access time
     * @param LastAccessTimestamp Last access time
     */
    public void setLastAccessTimestamp(Long LastAccessTimestamp) {
        this.LastAccessTimestamp = LastAccessTimestamp;
    }

    public CosAkAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAkAssetInfo(CosAkAssetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AkId != null) {
            this.AkId = new String(source.AkId);
        }
        if (source.AkName != null) {
            this.AkName = new String(source.AkName);
        }
        if (source.AkRemark != null) {
            this.AkRemark = new String(source.AkRemark);
        }
        if (source.AkOwnerUin != null) {
            this.AkOwnerUin = new String(source.AkOwnerUin);
        }
        if (source.AkOwnerType != null) {
            this.AkOwnerType = new Long(source.AkOwnerType);
        }
        if (source.AkOwnerName != null) {
            this.AkOwnerName = new String(source.AkOwnerName);
        }
        if (source.AkMainOwnerName != null) {
            this.AkMainOwnerName = new String(source.AkMainOwnerName);
        }
        if (source.AkRelBucketSet != null) {
            this.AkRelBucketSet = new String[source.AkRelBucketSet.length];
            for (int i = 0; i < source.AkRelBucketSet.length; i++) {
                this.AkRelBucketSet[i] = new String(source.AkRelBucketSet[i]);
            }
        }
        if (source.AkRelAlarmSet != null) {
            this.AkRelAlarmSet = new CosRiskInfo[source.AkRelAlarmSet.length];
            for (int i = 0; i < source.AkRelAlarmSet.length; i++) {
                this.AkRelAlarmSet[i] = new CosRiskInfo(source.AkRelAlarmSet[i]);
            }
        }
        if (source.AkRelIpCount != null) {
            this.AkRelIpCount = new Long(source.AkRelIpCount);
        }
        if (source.AkStatus != null) {
            this.AkStatus = new Long(source.AkStatus);
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new Long(source.CreateTimestamp);
        }
        if (source.LastAccessTimestamp != null) {
            this.LastAccessTimestamp = new Long(source.LastAccessTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AkId", this.AkId);
        this.setParamSimple(map, prefix + "AkName", this.AkName);
        this.setParamSimple(map, prefix + "AkRemark", this.AkRemark);
        this.setParamSimple(map, prefix + "AkOwnerUin", this.AkOwnerUin);
        this.setParamSimple(map, prefix + "AkOwnerType", this.AkOwnerType);
        this.setParamSimple(map, prefix + "AkOwnerName", this.AkOwnerName);
        this.setParamSimple(map, prefix + "AkMainOwnerName", this.AkMainOwnerName);
        this.setParamArraySimple(map, prefix + "AkRelBucketSet.", this.AkRelBucketSet);
        this.setParamArrayObj(map, prefix + "AkRelAlarmSet.", this.AkRelAlarmSet);
        this.setParamSimple(map, prefix + "AkRelIpCount", this.AkRelIpCount);
        this.setParamSimple(map, prefix + "AkStatus", this.AkStatus);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "LastAccessTimestamp", this.LastAccessTimestamp);

    }
}

