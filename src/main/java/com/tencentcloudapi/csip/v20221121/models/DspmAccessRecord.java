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

public class DspmAccessRecord extends AbstractModel {

    /**
    * Asset information
    */
    @SerializedName("Asset")
    @Expose
    private DspmDbAsset Asset;

    /**
    * Account
    */
    @SerializedName("Accounts")
    @Expose
    private DspmAssetAccount [] Accounts;

    /**
    * Source ip information
    */
    @SerializedName("SourceIpList")
    @Expose
    private DspmIp [] SourceIpList;

    /**
    * Recording time
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
    * Number of successful logins
    */
    @SerializedName("LoginSuccessCount")
    @Expose
    private Long LoginSuccessCount;

    /**
    * Login failure count
    */
    @SerializedName("LoginFailedCount")
    @Expose
    private Long LoginFailedCount;

    /**
     * Get Asset information 
     * @return Asset Asset information
     */
    public DspmDbAsset getAsset() {
        return this.Asset;
    }

    /**
     * Set Asset information
     * @param Asset Asset information
     */
    public void setAsset(DspmDbAsset Asset) {
        this.Asset = Asset;
    }

    /**
     * Get Account 
     * @return Accounts Account
     */
    public DspmAssetAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set Account
     * @param Accounts Account
     */
    public void setAccounts(DspmAssetAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Source ip information 
     * @return SourceIpList Source ip information
     */
    public DspmIp [] getSourceIpList() {
        return this.SourceIpList;
    }

    /**
     * Set Source ip information
     * @param SourceIpList Source ip information
     */
    public void setSourceIpList(DspmIp [] SourceIpList) {
        this.SourceIpList = SourceIpList;
    }

    /**
     * Get Recording time 
     * @return RecordTime Recording time
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set Recording time
     * @param RecordTime Recording time
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    /**
     * Get Number of successful logins 
     * @return LoginSuccessCount Number of successful logins
     */
    public Long getLoginSuccessCount() {
        return this.LoginSuccessCount;
    }

    /**
     * Set Number of successful logins
     * @param LoginSuccessCount Number of successful logins
     */
    public void setLoginSuccessCount(Long LoginSuccessCount) {
        this.LoginSuccessCount = LoginSuccessCount;
    }

    /**
     * Get Login failure count 
     * @return LoginFailedCount Login failure count
     */
    public Long getLoginFailedCount() {
        return this.LoginFailedCount;
    }

    /**
     * Set Login failure count
     * @param LoginFailedCount Login failure count
     */
    public void setLoginFailedCount(Long LoginFailedCount) {
        this.LoginFailedCount = LoginFailedCount;
    }

    public DspmAccessRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccessRecord(DspmAccessRecord source) {
        if (source.Asset != null) {
            this.Asset = new DspmDbAsset(source.Asset);
        }
        if (source.Accounts != null) {
            this.Accounts = new DspmAssetAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new DspmAssetAccount(source.Accounts[i]);
            }
        }
        if (source.SourceIpList != null) {
            this.SourceIpList = new DspmIp[source.SourceIpList.length];
            for (int i = 0; i < source.SourceIpList.length; i++) {
                this.SourceIpList[i] = new DspmIp(source.SourceIpList[i]);
            }
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
        if (source.LoginSuccessCount != null) {
            this.LoginSuccessCount = new Long(source.LoginSuccessCount);
        }
        if (source.LoginFailedCount != null) {
            this.LoginFailedCount = new Long(source.LoginFailedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Asset.", this.Asset);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamArrayObj(map, prefix + "SourceIpList.", this.SourceIpList);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);
        this.setParamSimple(map, prefix + "LoginSuccessCount", this.LoginSuccessCount);
        this.setParamSimple(map, prefix + "LoginFailedCount", this.LoginFailedCount);

    }
}

