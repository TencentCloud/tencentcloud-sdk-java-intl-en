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

public class DspmDbAssetId extends AbstractModel {

    /**
    * Asset instance ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Asset name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Asset record id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * app id of the account that owns the asset
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Account uin of the asset owner
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get Asset instance ID. 
     * @return AssetId Asset instance ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset instance ID.
     * @param AssetId Asset instance ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Asset name 
     * @return Name Asset name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Asset name
     * @param Name Asset name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Asset record id 
     * @return Id Asset record id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Asset record id
     * @param Id Asset record id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get app id of the account that owns the asset 
     * @return AppId app id of the account that owns the asset
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id of the account that owns the asset
     * @param AppId app id of the account that owns the asset
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get Account uin of the asset owner 
     * @return Uin Account uin of the asset owner
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin of the asset owner
     * @param Uin Account uin of the asset owner
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmDbAssetId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmDbAssetId(DspmDbAssetId source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

