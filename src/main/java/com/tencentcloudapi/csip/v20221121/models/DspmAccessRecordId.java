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

public class DspmAccessRecordId extends AbstractModel {

    /**
    * Source IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * Asset list
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Region of the asset
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Asset account
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * Host address
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Recording time
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
     * Get Source IP 
     * @return SourceIp Source IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Source IP
     * @param SourceIp Source IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get Asset list 
     * @return AssetId Asset list
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset list
     * @param AssetId Asset list
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Region of the asset 
     * @return Region Region of the asset
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the asset
     * @param Region Region of the asset
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Asset account 
     * @return Account Asset account
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Asset account
     * @param Account Asset account
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get Host address 
     * @return Host Host address
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host address
     * @param Host Host address
     */
    public void setHost(String Host) {
        this.Host = Host;
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

    public DspmAccessRecordId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccessRecordId(DspmAccessRecordId source) {
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);

    }
}

