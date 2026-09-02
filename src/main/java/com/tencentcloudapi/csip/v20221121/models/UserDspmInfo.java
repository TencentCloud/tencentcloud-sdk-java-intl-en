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

public class UserDspmInfo extends AbstractModel {

    /**
    * APPID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Number of database assets under the account
    */
    @SerializedName("AssetNum")
    @Expose
    private Long AssetNum;

    /**
    * Number of security analysis database assets enabled under the account
    */
    @SerializedName("UsedAssetNum")
    @Expose
    private Long UsedAssetNum;

    /**
    * Whether it is shared. 1: shared; 2: not shared
    */
    @SerializedName("IsShared")
    @Expose
    private Long IsShared;

    /**
    * Whether to purchase separately. 1: separate purchase; 2: not purchased separately
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * Quota source account
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * Cloud type (0: Tencent Cloud; 1: Amazon Web Services; 2: Microsoft Azure; 3: Google Cloud; 4: Alibaba Cloud; 5: Huawei Cloud)
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Whether the account is isolated
    */
    @SerializedName("IsIsolating")
    @Expose
    private Boolean IsIsolating;

    /**
    * Whether data clearing is underway
    */
    @SerializedName("IsDataCleaning")
    @Expose
    private Boolean IsDataCleaning;

    /**
     * Get APPID 
     * @return AppID APPID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set APPID
     * @param AppID APPID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Account nickname 
     * @return NickName Account nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account nickname
     * @param NickName Account nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Number of database assets under the account 
     * @return AssetNum Number of database assets under the account
     */
    public Long getAssetNum() {
        return this.AssetNum;
    }

    /**
     * Set Number of database assets under the account
     * @param AssetNum Number of database assets under the account
     */
    public void setAssetNum(Long AssetNum) {
        this.AssetNum = AssetNum;
    }

    /**
     * Get Number of security analysis database assets enabled under the account 
     * @return UsedAssetNum Number of security analysis database assets enabled under the account
     */
    public Long getUsedAssetNum() {
        return this.UsedAssetNum;
    }

    /**
     * Set Number of security analysis database assets enabled under the account
     * @param UsedAssetNum Number of security analysis database assets enabled under the account
     */
    public void setUsedAssetNum(Long UsedAssetNum) {
        this.UsedAssetNum = UsedAssetNum;
    }

    /**
     * Get Whether it is shared. 1: shared; 2: not shared 
     * @return IsShared Whether it is shared. 1: shared; 2: not shared
     */
    public Long getIsShared() {
        return this.IsShared;
    }

    /**
     * Set Whether it is shared. 1: shared; 2: not shared
     * @param IsShared Whether it is shared. 1: shared; 2: not shared
     */
    public void setIsShared(Long IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get Whether to purchase separately. 1: separate purchase; 2: not purchased separately 
     * @return IsSelfBuy Whether to purchase separately. 1: separate purchase; 2: not purchased separately
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set Whether to purchase separately. 1: separate purchase; 2: not purchased separately
     * @param IsSelfBuy Whether to purchase separately. 1: separate purchase; 2: not purchased separately
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get Quota source account 
     * @return ShareFromAppID Quota source account
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set Quota source account
     * @param ShareFromAppID Quota source account
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get Cloud type (0: Tencent Cloud; 1: Amazon Web Services; 2: Microsoft Azure; 3: Google Cloud; 4: Alibaba Cloud; 5: Huawei Cloud) 
     * @return CloudType Cloud type (0: Tencent Cloud; 1: Amazon Web Services; 2: Microsoft Azure; 3: Google Cloud; 4: Alibaba Cloud; 5: Huawei Cloud)
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud type (0: Tencent Cloud; 1: Amazon Web Services; 2: Microsoft Azure; 3: Google Cloud; 4: Alibaba Cloud; 5: Huawei Cloud)
     * @param CloudType Cloud type (0: Tencent Cloud; 1: Amazon Web Services; 2: Microsoft Azure; 3: Google Cloud; 4: Alibaba Cloud; 5: Huawei Cloud)
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Whether the account is isolated 
     * @return IsIsolating Whether the account is isolated
     */
    public Boolean getIsIsolating() {
        return this.IsIsolating;
    }

    /**
     * Set Whether the account is isolated
     * @param IsIsolating Whether the account is isolated
     */
    public void setIsIsolating(Boolean IsIsolating) {
        this.IsIsolating = IsIsolating;
    }

    /**
     * Get Whether data clearing is underway 
     * @return IsDataCleaning Whether data clearing is underway
     */
    public Boolean getIsDataCleaning() {
        return this.IsDataCleaning;
    }

    /**
     * Set Whether data clearing is underway
     * @param IsDataCleaning Whether data clearing is underway
     */
    public void setIsDataCleaning(Boolean IsDataCleaning) {
        this.IsDataCleaning = IsDataCleaning;
    }

    public UserDspmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDspmInfo(UserDspmInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.AssetNum != null) {
            this.AssetNum = new Long(source.AssetNum);
        }
        if (source.UsedAssetNum != null) {
            this.UsedAssetNum = new Long(source.UsedAssetNum);
        }
        if (source.IsShared != null) {
            this.IsShared = new Long(source.IsShared);
        }
        if (source.IsSelfBuy != null) {
            this.IsSelfBuy = new Long(source.IsSelfBuy);
        }
        if (source.ShareFromAppID != null) {
            this.ShareFromAppID = new Long(source.ShareFromAppID);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.IsIsolating != null) {
            this.IsIsolating = new Boolean(source.IsIsolating);
        }
        if (source.IsDataCleaning != null) {
            this.IsDataCleaning = new Boolean(source.IsDataCleaning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "AssetNum", this.AssetNum);
        this.setParamSimple(map, prefix + "UsedAssetNum", this.UsedAssetNum);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "IsIsolating", this.IsIsolating);
        this.setParamSimple(map, prefix + "IsDataCleaning", this.IsDataCleaning);

    }
}

