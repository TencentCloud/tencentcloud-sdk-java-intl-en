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

public class DspmAssetTableInfo extends AbstractModel {

    /**
    * <p>Asset instance id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Database name</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>schema name.</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>Table name</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>number of fields</p>
    */
    @SerializedName("FieldCount")
    @Expose
    private Long FieldCount;

    /**
    * <p>Number of sensitive fields</p>
    */
    @SerializedName("SensitiveFieldCount")
    @Expose
    private Long SensitiveFieldCount;

    /**
    * <p>Data item id set</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * <p>Set of data item names</p>
    */
    @SerializedName("RuleNames")
    @Expose
    private String [] RuleNames;

    /**
    * <p>Categorization id set</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>Category name collection</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>Category details</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>Data table id</p>
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * <p>Table annotation</p>
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
     * Get <p>Asset instance id</p> 
     * @return AssetId <p>Asset instance id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset instance id</p>
     * @param AssetId <p>Asset instance id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Database name</p> 
     * @return DbName <p>Database name</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>Database name</p>
     * @param DbName <p>Database name</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>schema name.</p> 
     * @return SchemaName <p>schema name.</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema name.</p>
     * @param SchemaName <p>schema name.</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>Table name</p> 
     * @return TableName <p>Table name</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>Table name</p>
     * @param TableName <p>Table name</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>number of fields</p> 
     * @return FieldCount <p>number of fields</p>
     */
    public Long getFieldCount() {
        return this.FieldCount;
    }

    /**
     * Set <p>number of fields</p>
     * @param FieldCount <p>number of fields</p>
     */
    public void setFieldCount(Long FieldCount) {
        this.FieldCount = FieldCount;
    }

    /**
     * Get <p>Number of sensitive fields</p> 
     * @return SensitiveFieldCount <p>Number of sensitive fields</p>
     */
    public Long getSensitiveFieldCount() {
        return this.SensitiveFieldCount;
    }

    /**
     * Set <p>Number of sensitive fields</p>
     * @param SensitiveFieldCount <p>Number of sensitive fields</p>
     */
    public void setSensitiveFieldCount(Long SensitiveFieldCount) {
        this.SensitiveFieldCount = SensitiveFieldCount;
    }

    /**
     * Get <p>Data item id set</p> 
     * @return RuleIds <p>Data item id set</p>
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>Data item id set</p>
     * @param RuleIds <p>Data item id set</p>
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>Set of data item names</p> 
     * @return RuleNames <p>Set of data item names</p>
     */
    public String [] getRuleNames() {
        return this.RuleNames;
    }

    /**
     * Set <p>Set of data item names</p>
     * @param RuleNames <p>Set of data item names</p>
     */
    public void setRuleNames(String [] RuleNames) {
        this.RuleNames = RuleNames;
    }

    /**
     * Get <p>Categorization id set</p> 
     * @return CategoryIds <p>Categorization id set</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>Categorization id set</p>
     * @param CategoryIds <p>Categorization id set</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>Category name collection</p> 
     * @return CategoryNames <p>Category name collection</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>Category name collection</p>
     * @param CategoryNames <p>Category name collection</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>Category details</p> 
     * @return CategoryDetails <p>Category details</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>Category details</p>
     * @param CategoryDetails <p>Category details</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>Data table id</p> 
     * @return TableId <p>Data table id</p>
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>Data table id</p>
     * @param TableId <p>Data table id</p>
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>Table annotation</p> 
     * @return TableComment <p>Table annotation</p>
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set <p>Table annotation</p>
     * @param TableComment <p>Table annotation</p>
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    public DspmAssetTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetTableInfo(DspmAssetTableInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldCount != null) {
            this.FieldCount = new Long(source.FieldCount);
        }
        if (source.SensitiveFieldCount != null) {
            this.SensitiveFieldCount = new Long(source.SensitiveFieldCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.RuleNames != null) {
            this.RuleNames = new String[source.RuleNames.length];
            for (int i = 0; i < source.RuleNames.length; i++) {
                this.RuleNames[i] = new String(source.RuleNames[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldCount", this.FieldCount);
        this.setParamSimple(map, prefix + "SensitiveFieldCount", this.SensitiveFieldCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);

    }
}

