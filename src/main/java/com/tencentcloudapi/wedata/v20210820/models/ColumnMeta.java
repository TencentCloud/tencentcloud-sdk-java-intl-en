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

public class ColumnMeta extends AbstractModel {

    /**
    * Field English Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * Field TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Field Sequence Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * Field nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * HBase Column Family Attribute Set
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnFamiliesFieldSet")
    @Expose
    private Pair [] ColumnFamiliesFieldSet;

    /**
    * Corresponding Code Table Dictionary ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DictionaryId")
    @Expose
    private String DictionaryId;

    /**
    * Corresponding Code Table Dictionary Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DictionaryName")
    @Expose
    private String DictionaryName;

    /**
    * Security Level: Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * Security Level: Value Range 1-10
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LevelRank")
    @Expose
    private Long LevelRank;

    /**
     * Get Field English Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NameEn Field English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set Field English Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NameEn Field English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NameCn Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NameCn Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get Field TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Field DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Field Sequence Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Position Field Sequence Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Field Sequence Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Position Field Sequence Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsPartition Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsPartition Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get Field nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Field nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Field nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get HBase Column Family Attribute Set
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnFamiliesFieldSet HBase Column Family Attribute Set
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Pair [] getColumnFamiliesFieldSet() {
        return this.ColumnFamiliesFieldSet;
    }

    /**
     * Set HBase Column Family Attribute Set
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnFamiliesFieldSet HBase Column Family Attribute Set
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnFamiliesFieldSet(Pair [] ColumnFamiliesFieldSet) {
        this.ColumnFamiliesFieldSet = ColumnFamiliesFieldSet;
    }

    /**
     * Get Corresponding Code Table Dictionary ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DictionaryId Corresponding Code Table Dictionary ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDictionaryId() {
        return this.DictionaryId;
    }

    /**
     * Set Corresponding Code Table Dictionary ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DictionaryId Corresponding Code Table Dictionary ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDictionaryId(String DictionaryId) {
        this.DictionaryId = DictionaryId;
    }

    /**
     * Get Corresponding Code Table Dictionary Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DictionaryName Corresponding Code Table Dictionary Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDictionaryName() {
        return this.DictionaryName;
    }

    /**
     * Set Corresponding Code Table Dictionary Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DictionaryName Corresponding Code Table Dictionary Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDictionaryName(String DictionaryName) {
        this.DictionaryName = DictionaryName;
    }

    /**
     * Get Security Level: Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LevelName Security Level: Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set Security Level: Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LevelName Security Level: Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get Security Level: Value Range 1-10
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LevelRank Security Level: Value Range 1-10
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLevelRank() {
        return this.LevelRank;
    }

    /**
     * Set Security Level: Value Range 1-10
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LevelRank Security Level: Value Range 1-10
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLevelRank(Long LevelRank) {
        this.LevelRank = LevelRank;
    }

    public ColumnMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnMeta(ColumnMeta source) {
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColumnFamiliesFieldSet != null) {
            this.ColumnFamiliesFieldSet = new Pair[source.ColumnFamiliesFieldSet.length];
            for (int i = 0; i < source.ColumnFamiliesFieldSet.length; i++) {
                this.ColumnFamiliesFieldSet[i] = new Pair(source.ColumnFamiliesFieldSet[i]);
            }
        }
        if (source.DictionaryId != null) {
            this.DictionaryId = new String(source.DictionaryId);
        }
        if (source.DictionaryName != null) {
            this.DictionaryName = new String(source.DictionaryName);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelRank != null) {
            this.LevelRank = new Long(source.LevelRank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "ColumnFamiliesFieldSet.", this.ColumnFamiliesFieldSet);
        this.setParamSimple(map, prefix + "DictionaryId", this.DictionaryId);
        this.setParamSimple(map, prefix + "DictionaryName", this.DictionaryName);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelRank", this.LevelRank);

    }
}

