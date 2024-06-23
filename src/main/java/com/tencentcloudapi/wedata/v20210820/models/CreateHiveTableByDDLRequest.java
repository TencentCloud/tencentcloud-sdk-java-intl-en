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

public class CreateHiveTableByDDLRequest extends AbstractModel {

    /**
    * Data Source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Database
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Create Hive Table DDL
    */
    @SerializedName("DDLSql")
    @Expose
    private String DDLSql;

    /**
    * Table permissions, default is 0: Project share; 1: Individual and administrator only
    */
    @SerializedName("Privilege")
    @Expose
    private Long Privilege;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Target Table Type (HIVE or GBASE)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Person in Charge
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * Schema Name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get Data Source ID 
     * @return DatasourceId Data Source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
     * @param DatasourceId Data Source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database 
     * @return Database Database
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database
     * @param Database Database
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Create Hive Table DDL 
     * @return DDLSql Create Hive Table DDL
     */
    public String getDDLSql() {
        return this.DDLSql;
    }

    /**
     * Set Create Hive Table DDL
     * @param DDLSql Create Hive Table DDL
     */
    public void setDDLSql(String DDLSql) {
        this.DDLSql = DDLSql;
    }

    /**
     * Get Table permissions, default is 0: Project share; 1: Individual and administrator only 
     * @return Privilege Table permissions, default is 0: Project share; 1: Individual and administrator only
     */
    public Long getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Table permissions, default is 0: Project share; 1: Individual and administrator only
     * @param Privilege Table permissions, default is 0: Project share; 1: Individual and administrator only
     */
    public void setPrivilege(Long Privilege) {
        this.Privilege = Privilege;
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
     * Get Target Table Type (HIVE or GBASE) 
     * @return Type Target Table Type (HIVE or GBASE)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Target Table Type (HIVE or GBASE)
     * @param Type Target Table Type (HIVE or GBASE)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Person in Charge 
     * @return Incharge Person in Charge
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set Person in Charge
     * @param Incharge Person in Charge
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get Schema Name 
     * @return SchemaName Schema Name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema Name
     * @param SchemaName Schema Name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public CreateHiveTableByDDLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHiveTableByDDLRequest(CreateHiveTableByDDLRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.DDLSql != null) {
            this.DDLSql = new String(source.DDLSql);
        }
        if (source.Privilege != null) {
            this.Privilege = new Long(source.Privilege);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "DDLSql", this.DDLSql);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

