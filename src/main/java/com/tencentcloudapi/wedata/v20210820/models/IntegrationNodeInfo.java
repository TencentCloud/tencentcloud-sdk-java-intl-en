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

public class IntegrationNodeInfo extends AbstractModel {

    /**
    * Integration Node ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Task ID of the Integrated Node
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Integration Node Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Integration Node Type, INPUT: Input Node, OUTPUT: Output Node
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
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
    * Data source IDNote: This field may return null, indicating that no valid value can be obtained.
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
    * Belonging User AppId, Display Fields Non-passed
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Creator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * Operator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * owner uin Display Fields Non-passed
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Integration Node ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Integration Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Integration Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Integration Node ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Task ID of the Integrated Node 
     * @return TaskId Task ID of the Integrated Node
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID of the Integrated Node
     * @param TaskId Task ID of the Integrated Node
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

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
     * Get Integration Node Type, INPUT: Input Node, OUTPUT: Output Node 
     * @return NodeType Integration Node Type, INPUT: Input Node, OUTPUT: Output Node
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Integration Node Type, INPUT: Input Node, OUTPUT: Output Node
     * @param NodeType Integration Node Type, INPUT: Input Node, OUTPUT: Output Node
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE 
     * @return DataSourceType Node Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set Node Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
     * @param DataSourceType Node Data Source Type: MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
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
     * Get Data source IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data source IDNote: This field may return null, indicating that no valid value can be obtained.
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
     * Get Belonging User AppId, Display Fields Non-passed 
     * @return AppId Belonging User AppId, Display Fields Non-passed
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Belonging User AppId, Display Fields Non-passed
     * @param AppId Belonging User AppId, Display Fields Non-passed
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Creator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreatorUin Creator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreatorUin Creator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Operator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUin Operator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set Operator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUin Operator UIN, Display Fields Non-passed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get owner uin Display Fields Non-passed 
     * @return OwnerUin owner uin Display Fields Non-passed
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin Display Fields Non-passed
     * @param OwnerUin owner uin Display Fields Non-passed
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public IntegrationNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeInfo(IntegrationNodeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
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
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "Schema.", this.Schema);
        this.setParamObj(map, prefix + "NodeMapping.", this.NodeMapping);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

