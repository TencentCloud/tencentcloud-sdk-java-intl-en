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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Asset extends AbstractModel {

    /**
    * Primary key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Object GUID value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * Data directory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Object owner
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Object owner account
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * Permission
    */
    @SerializedName("PermValues")
    @Expose
    private KVPair [] PermValues;

    /**
    * Additional attributes
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * Additional business attributes
    */
    @SerializedName("BizParams")
    @Expose
    private KVPair [] BizParams;

    /**
    * Data version
    */
    @SerializedName("DataVersion")
    @Expose
    private Long DataVersion;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Data source primary key
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
     * Get Primary key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Object GUID value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Guid Object GUID value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set Object GUID value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Guid Object GUID value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get Data directory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Catalog Data directory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Data directory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Catalog Data directory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Description information 
     * @return Description Description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information
     * @param Description Description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Object owner 
     * @return Owner Object owner
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Object owner
     * @param Owner Object owner
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Object owner account 
     * @return OwnerAccount Object owner account
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set Object owner account
     * @param OwnerAccount Object owner account
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get Permission 
     * @return PermValues Permission
     */
    public KVPair [] getPermValues() {
        return this.PermValues;
    }

    /**
     * Set Permission
     * @param PermValues Permission
     */
    public void setPermValues(KVPair [] PermValues) {
        this.PermValues = PermValues;
    }

    /**
     * Get Additional attributes 
     * @return Params Additional attributes
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set Additional attributes
     * @param Params Additional attributes
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get Additional business attributes 
     * @return BizParams Additional business attributes
     */
    public KVPair [] getBizParams() {
        return this.BizParams;
    }

    /**
     * Set Additional business attributes
     * @param BizParams Additional business attributes
     */
    public void setBizParams(KVPair [] BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get Data version 
     * @return DataVersion Data version
     */
    public Long getDataVersion() {
        return this.DataVersion;
    }

    /**
     * Set Data version
     * @param DataVersion Data version
     */
    public void setDataVersion(Long DataVersion) {
        this.DataVersion = DataVersion;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifiedTime Modification time
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Modification time
     * @param ModifiedTime Modification time
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Data source primary key 
     * @return DatasourceId Data source primary key
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source primary key
     * @param DatasourceId Data source primary key
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    public Asset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Asset(Asset source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.PermValues != null) {
            this.PermValues = new KVPair[source.PermValues.length];
            for (int i = 0; i < source.PermValues.length; i++) {
                this.PermValues[i] = new KVPair(source.PermValues[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.BizParams != null) {
            this.BizParams = new KVPair[source.BizParams.length];
            for (int i = 0; i < source.BizParams.length; i++) {
                this.BizParams[i] = new KVPair(source.BizParams[i]);
            }
        }
        if (source.DataVersion != null) {
            this.DataVersion = new Long(source.DataVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamArrayObj(map, prefix + "PermValues.", this.PermValues);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "DataVersion", this.DataVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);

    }
}

