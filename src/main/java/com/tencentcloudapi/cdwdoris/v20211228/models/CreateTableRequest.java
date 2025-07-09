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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTableRequest extends AbstractModel {

    /**
    * Resource ID, which is the TCHouse-D resource ID used for table creation.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The database where the table is located; if it does not exist, create one.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Name of the table to be created
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table data model: 
AGG_KEY: aggregation model; 
UNI_KEY: primary key model; 
DUP_KEY: detail model
    */
    @SerializedName("KeysType")
    @Expose
    private String KeysType;

    /**
    * Column information of the table
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * Bucket information
    */
    @SerializedName("Distribution")
    @Expose
    private Distribution Distribution;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Index information. The inverted index and N-Gram index can be configured through this parameter. The Prefix index is related to the sort key and key column, and do not require additional configuration. Configure bloom_filter_columns in the table attribute when BloomFilter index is required.
    */
    @SerializedName("IndexInfos")
    @Expose
    private IndexInfo [] IndexInfos;

    /**
    * Partition information
    */
    @SerializedName("Partition")
    @Expose
    private Partition Partition;

    /**
    * Table description
    */
    @SerializedName("TableComment")
    @Expose
    private String TableComment;

    /**
    * Table attribute
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
     * Get Resource ID, which is the TCHouse-D resource ID used for table creation. 
     * @return InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Resource ID, which is the TCHouse-D resource ID used for table creation.
     * @param InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The database where the table is located; if it does not exist, create one. 
     * @return DbName The database where the table is located; if it does not exist, create one.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set The database where the table is located; if it does not exist, create one.
     * @param DbName The database where the table is located; if it does not exist, create one.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Name of the table to be created 
     * @return TableName Name of the table to be created
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Name of the table to be created
     * @param TableName Name of the table to be created
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table data model: 
AGG_KEY: aggregation model; 
UNI_KEY: primary key model; 
DUP_KEY: detail model 
     * @return KeysType Table data model: 
AGG_KEY: aggregation model; 
UNI_KEY: primary key model; 
DUP_KEY: detail model
     */
    public String getKeysType() {
        return this.KeysType;
    }

    /**
     * Set Table data model: 
AGG_KEY: aggregation model; 
UNI_KEY: primary key model; 
DUP_KEY: detail model
     * @param KeysType Table data model: 
AGG_KEY: aggregation model; 
UNI_KEY: primary key model; 
DUP_KEY: detail model
     */
    public void setKeysType(String KeysType) {
        this.KeysType = KeysType;
    }

    /**
     * Get Column information of the table 
     * @return Columns Column information of the table
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Column information of the table
     * @param Columns Column information of the table
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Bucket information 
     * @return Distribution Bucket information
     */
    public Distribution getDistribution() {
        return this.Distribution;
    }

    /**
     * Set Bucket information
     * @param Distribution Bucket information
     */
    public void setDistribution(Distribution Distribution) {
        this.Distribution = Distribution;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Index information. The inverted index and N-Gram index can be configured through this parameter. The Prefix index is related to the sort key and key column, and do not require additional configuration. Configure bloom_filter_columns in the table attribute when BloomFilter index is required. 
     * @return IndexInfos Index information. The inverted index and N-Gram index can be configured through this parameter. The Prefix index is related to the sort key and key column, and do not require additional configuration. Configure bloom_filter_columns in the table attribute when BloomFilter index is required.
     */
    public IndexInfo [] getIndexInfos() {
        return this.IndexInfos;
    }

    /**
     * Set Index information. The inverted index and N-Gram index can be configured through this parameter. The Prefix index is related to the sort key and key column, and do not require additional configuration. Configure bloom_filter_columns in the table attribute when BloomFilter index is required.
     * @param IndexInfos Index information. The inverted index and N-Gram index can be configured through this parameter. The Prefix index is related to the sort key and key column, and do not require additional configuration. Configure bloom_filter_columns in the table attribute when BloomFilter index is required.
     */
    public void setIndexInfos(IndexInfo [] IndexInfos) {
        this.IndexInfos = IndexInfos;
    }

    /**
     * Get Partition information 
     * @return Partition Partition information
     */
    public Partition getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition information
     * @param Partition Partition information
     */
    public void setPartition(Partition Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Table description 
     * @return TableComment Table description
     */
    public String getTableComment() {
        return this.TableComment;
    }

    /**
     * Set Table description
     * @param TableComment Table description
     */
    public void setTableComment(String TableComment) {
        this.TableComment = TableComment;
    }

    /**
     * Get Table attribute 
     * @return Properties Table attribute
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Table attribute
     * @param Properties Table attribute
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    public CreateTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTableRequest(CreateTableRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.KeysType != null) {
            this.KeysType = new String(source.KeysType);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.Distribution != null) {
            this.Distribution = new Distribution(source.Distribution);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.IndexInfos != null) {
            this.IndexInfos = new IndexInfo[source.IndexInfos.length];
            for (int i = 0; i < source.IndexInfos.length; i++) {
                this.IndexInfos[i] = new IndexInfo(source.IndexInfos[i]);
            }
        }
        if (source.Partition != null) {
            this.Partition = new Partition(source.Partition);
        }
        if (source.TableComment != null) {
            this.TableComment = new String(source.TableComment);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "KeysType", this.KeysType);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamObj(map, prefix + "Distribution.", this.Distribution);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamArrayObj(map, prefix + "IndexInfos.", this.IndexInfos);
        this.setParamObj(map, prefix + "Partition.", this.Partition);
        this.setParamSimple(map, prefix + "TableComment", this.TableComment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

