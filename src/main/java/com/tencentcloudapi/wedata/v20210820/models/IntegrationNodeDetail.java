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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeDetail extends AbstractModel {

    /**
    * Integration Node Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Integration Node Type
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node Data Source Type
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * Node Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Node Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * Node Extension Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Schema")
    @Expose
    private IntegrationNodeSchema [] Schema;

    /**
    * Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeMapping")
    @Expose
    private IntegrationNodeMapping NodeMapping;

    /**
    * owner uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get Integration Node Name 
     * @return Name Integration Node Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Integration Node Name
     * @param Name Integration Node Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Integration Node Type 
     * @return NodeType Integration Node Type
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Integration Node Type
     * @param NodeType Integration Node Type
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node Data Source Type 
     * @return DataSourceType Node Data Source Type
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set Node Data Source Type
     * @param DataSourceType Node Data Source Type
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get Node Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Node Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Node Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Description Node Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Node Configuration Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Config Node Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set Node Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Config Node Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get Node Extension Configuration Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtConfig Node Extension Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set Node Extension Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtConfig Node Extension Configuration Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get Node Schema
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Schema Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeSchema [] getSchema() {
        return this.Schema;
    }

    /**
     * Set Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Schema Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchema(IntegrationNodeSchema [] Schema) {
        this.Schema = Schema;
    }

    /**
     * Get Node Mapping
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeMapping Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeMapping getNodeMapping() {
        return this.NodeMapping;
    }

    /**
     * Set Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeMapping Node Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeMapping(IntegrationNodeMapping NodeMapping) {
        this.NodeMapping = NodeMapping;
    }

    /**
     * Get owner uin 
     * @return OwnerUin owner uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin
     * @param OwnerUin owner uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public IntegrationNodeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeDetail(IntegrationNodeDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.Schema != null) {
            this.Schema = new IntegrationNodeSchema[source.Schema.length];
            for (int i = 0; i < source.Schema.length; i++) {
                this.Schema[i] = new IntegrationNodeSchema(source.Schema[i]);
            }
        }
        if (source.NodeMapping != null) {
            this.NodeMapping = new IntegrationNodeMapping(source.NodeMapping);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "Schema.", this.Schema);
        this.setParamObj(map, prefix + "NodeMapping.", this.NodeMapping);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

