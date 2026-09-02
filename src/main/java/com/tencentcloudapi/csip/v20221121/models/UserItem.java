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

public class UserItem extends AbstractModel {

    /**
    * <p>Login user appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Type of user</p>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>User payment mode</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>Total quota count</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>Consumed quota count</p>
    */
    @SerializedName("CostQuota")
    @Expose
    private Long CostQuota;

    /**
    * <p>Cloud vendor information</p>
    */
    @SerializedName("Providers")
    @Expose
    private String [] Providers;

    /**
    * <p>refresh: update next time; expire: no longer update next time</p>
    */
    @SerializedName("QuotaFlushType")
    @Expose
    private String QuotaFlushType;

    /**
    * <p>Next quota refresh time</p>
    */
    @SerializedName("QuotaFlushTime")
    @Expose
    private String QuotaFlushTime;

    /**
    * <p>Purchase type</p>
    */
    @SerializedName("QuotaSource")
    @Expose
    private Long QuotaSource;

    /**
    * <p>The appid of the sharing party when shared, or 0 when purchased or out of quota</p>
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * <p>Quota sharing party account</p>
    */
    @SerializedName("ShareFromUser")
    @Expose
    private String ShareFromUser;

    /**
     * Get <p>Login user appid</p> 
     * @return AppID <p>Login user appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Login user appid</p>
     * @param AppID <p>Login user appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Type of user</p> 
     * @return AccountType <p>Type of user</p>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>Type of user</p>
     * @param AccountType <p>Type of user</p>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>User payment mode</p> 
     * @return PayType <p>User payment mode</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>User payment mode</p>
     * @param PayType <p>User payment mode</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>Total quota count</p> 
     * @return TotalQuota <p>Total quota count</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>Total quota count</p>
     * @param TotalQuota <p>Total quota count</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>Consumed quota count</p> 
     * @return CostQuota <p>Consumed quota count</p>
     */
    public Long getCostQuota() {
        return this.CostQuota;
    }

    /**
     * Set <p>Consumed quota count</p>
     * @param CostQuota <p>Consumed quota count</p>
     */
    public void setCostQuota(Long CostQuota) {
        this.CostQuota = CostQuota;
    }

    /**
     * Get <p>Cloud vendor information</p> 
     * @return Providers <p>Cloud vendor information</p>
     */
    public String [] getProviders() {
        return this.Providers;
    }

    /**
     * Set <p>Cloud vendor information</p>
     * @param Providers <p>Cloud vendor information</p>
     */
    public void setProviders(String [] Providers) {
        this.Providers = Providers;
    }

    /**
     * Get <p>refresh: update next time; expire: no longer update next time</p> 
     * @return QuotaFlushType <p>refresh: update next time; expire: no longer update next time</p>
     */
    public String getQuotaFlushType() {
        return this.QuotaFlushType;
    }

    /**
     * Set <p>refresh: update next time; expire: no longer update next time</p>
     * @param QuotaFlushType <p>refresh: update next time; expire: no longer update next time</p>
     */
    public void setQuotaFlushType(String QuotaFlushType) {
        this.QuotaFlushType = QuotaFlushType;
    }

    /**
     * Get <p>Next quota refresh time</p> 
     * @return QuotaFlushTime <p>Next quota refresh time</p>
     */
    public String getQuotaFlushTime() {
        return this.QuotaFlushTime;
    }

    /**
     * Set <p>Next quota refresh time</p>
     * @param QuotaFlushTime <p>Next quota refresh time</p>
     */
    public void setQuotaFlushTime(String QuotaFlushTime) {
        this.QuotaFlushTime = QuotaFlushTime;
    }

    /**
     * Get <p>Purchase type</p> 
     * @return QuotaSource <p>Purchase type</p>
     */
    public Long getQuotaSource() {
        return this.QuotaSource;
    }

    /**
     * Set <p>Purchase type</p>
     * @param QuotaSource <p>Purchase type</p>
     */
    public void setQuotaSource(Long QuotaSource) {
        this.QuotaSource = QuotaSource;
    }

    /**
     * Get <p>The appid of the sharing party when shared, or 0 when purchased or out of quota</p> 
     * @return ShareFromAppID <p>The appid of the sharing party when shared, or 0 when purchased or out of quota</p>
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set <p>The appid of the sharing party when shared, or 0 when purchased or out of quota</p>
     * @param ShareFromAppID <p>The appid of the sharing party when shared, or 0 when purchased or out of quota</p>
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get <p>Quota sharing party account</p> 
     * @return ShareFromUser <p>Quota sharing party account</p>
     */
    public String getShareFromUser() {
        return this.ShareFromUser;
    }

    /**
     * Set <p>Quota sharing party account</p>
     * @param ShareFromUser <p>Quota sharing party account</p>
     */
    public void setShareFromUser(String ShareFromUser) {
        this.ShareFromUser = ShareFromUser;
    }

    public UserItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserItem(UserItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.CostQuota != null) {
            this.CostQuota = new Long(source.CostQuota);
        }
        if (source.Providers != null) {
            this.Providers = new String[source.Providers.length];
            for (int i = 0; i < source.Providers.length; i++) {
                this.Providers[i] = new String(source.Providers[i]);
            }
        }
        if (source.QuotaFlushType != null) {
            this.QuotaFlushType = new String(source.QuotaFlushType);
        }
        if (source.QuotaFlushTime != null) {
            this.QuotaFlushTime = new String(source.QuotaFlushTime);
        }
        if (source.QuotaSource != null) {
            this.QuotaSource = new Long(source.QuotaSource);
        }
        if (source.ShareFromAppID != null) {
            this.ShareFromAppID = new Long(source.ShareFromAppID);
        }
        if (source.ShareFromUser != null) {
            this.ShareFromUser = new String(source.ShareFromUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "CostQuota", this.CostQuota);
        this.setParamArraySimple(map, prefix + "Providers.", this.Providers);
        this.setParamSimple(map, prefix + "QuotaFlushType", this.QuotaFlushType);
        this.setParamSimple(map, prefix + "QuotaFlushTime", this.QuotaFlushTime);
        this.setParamSimple(map, prefix + "QuotaSource", this.QuotaSource);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "ShareFromUser", this.ShareFromUser);

    }
}

