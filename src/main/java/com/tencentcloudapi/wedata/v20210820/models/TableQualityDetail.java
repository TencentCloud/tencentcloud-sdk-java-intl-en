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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableQualityDetail extends AbstractModel {

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Table ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUserId")
    @Expose
    private Long OwnerUserId;

    /**
    * Table Owner Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * Database Score
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseScore")
    @Expose
    private Float DatabaseScore;

    /**
    * Table Score
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableScore")
    @Expose
    private Float TableScore;

    /**
    * Table Month-over-Month Growth
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastPeriodRatio")
    @Expose
    private Float LastPeriodRatio;

    /**
    * 0 or not returned or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
     * Get Database ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Table ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUserId Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUserId Table Owner ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUserId(Long OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get Table Owner Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUserName Table Owner Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set Table Owner Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUserName Table Owner Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get Database Score
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseScore Database Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getDatabaseScore() {
        return this.DatabaseScore;
    }

    /**
     * Set Database Score
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseScore Database Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseScore(Float DatabaseScore) {
        this.DatabaseScore = DatabaseScore;
    }

    /**
     * Get Table Score
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableScore Table Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getTableScore() {
        return this.TableScore;
    }

    /**
     * Set Table Score
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableScore Table Score
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableScore(Float TableScore) {
        this.TableScore = TableScore;
    }

    /**
     * Get Table Month-over-Month Growth
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastPeriodRatio Table Month-over-Month Growth
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLastPeriodRatio() {
        return this.LastPeriodRatio;
    }

    /**
     * Set Table Month-over-Month Growth
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastPeriodRatio Table Month-over-Month Growth
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastPeriodRatio(Float LastPeriodRatio) {
        this.LastPeriodRatio = LastPeriodRatio;
    }

    /**
     * Get 0 or not returned or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DsEnvType 0 or not returned or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 0 or not returned or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DsEnvType 0 or not returned or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    public TableQualityDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableQualityDetail(TableQualityDetail source) {
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new Long(source.OwnerUserId);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.DatabaseScore != null) {
            this.DatabaseScore = new Float(source.DatabaseScore);
        }
        if (source.TableScore != null) {
            this.TableScore = new Float(source.TableScore);
        }
        if (source.LastPeriodRatio != null) {
            this.LastPeriodRatio = new Float(source.LastPeriodRatio);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "DatabaseScore", this.DatabaseScore);
        this.setParamSimple(map, prefix + "TableScore", this.TableScore);
        this.setParamSimple(map, prefix + "LastPeriodRatio", this.LastPeriodRatio);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);

    }
}

