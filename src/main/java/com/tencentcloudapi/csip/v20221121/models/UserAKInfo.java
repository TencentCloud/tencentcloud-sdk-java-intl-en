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

public class UserAKInfo extends AbstractModel {

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
    * Number of AKs under the account
    */
    @SerializedName("AKNum")
    @Expose
    private Long AKNum;

    /**
    * Whether it is shared. 1: shared. 2: not shared.
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
    * Source account of the quota
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * Cloud vendor type
0: Tencent Cloud
1: Amazon Web Services
2: Microsoft Azure.
3: Google Cloud
4: Alibaba Cloud
5: Huawei Cloud
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

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
     * Get Number of AKs under the account 
     * @return AKNum Number of AKs under the account
     */
    public Long getAKNum() {
        return this.AKNum;
    }

    /**
     * Set Number of AKs under the account
     * @param AKNum Number of AKs under the account
     */
    public void setAKNum(Long AKNum) {
        this.AKNum = AKNum;
    }

    /**
     * Get Whether it is shared. 1: shared. 2: not shared. 
     * @return IsShared Whether it is shared. 1: shared. 2: not shared.
     */
    public Long getIsShared() {
        return this.IsShared;
    }

    /**
     * Set Whether it is shared. 1: shared. 2: not shared.
     * @param IsShared Whether it is shared. 1: shared. 2: not shared.
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
     * Get Source account of the quota 
     * @return ShareFromAppID Source account of the quota
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set Source account of the quota
     * @param ShareFromAppID Source account of the quota
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get Cloud vendor type
0: Tencent Cloud
1: Amazon Web Services
2: Microsoft Azure.
3: Google Cloud
4: Alibaba Cloud
5: Huawei Cloud 
     * @return CloudType Cloud vendor type
0: Tencent Cloud
1: Amazon Web Services
2: Microsoft Azure.
3: Google Cloud
4: Alibaba Cloud
5: Huawei Cloud
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud vendor type
0: Tencent Cloud
1: Amazon Web Services
2: Microsoft Azure.
3: Google Cloud
4: Alibaba Cloud
5: Huawei Cloud
     * @param CloudType Cloud vendor type
0: Tencent Cloud
1: Amazon Web Services
2: Microsoft Azure.
3: Google Cloud
4: Alibaba Cloud
5: Huawei Cloud
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public UserAKInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserAKInfo(UserAKInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.AKNum != null) {
            this.AKNum = new Long(source.AKNum);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "AKNum", this.AKNum);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

