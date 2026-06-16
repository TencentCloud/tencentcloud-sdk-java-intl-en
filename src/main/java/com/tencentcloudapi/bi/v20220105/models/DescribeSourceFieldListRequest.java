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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSourceFieldListRequest extends AbstractModel {

    /**
    * data source Id
    */
    @SerializedName("DataSourceId")
    @Expose
    private Long DataSourceId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * sql content
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * whether
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * async transaction id
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * 11
    */
    @SerializedName("ParamList")
    @Expose
    private ParamCreateDTO [] ParamList;

    /**
    * DLC extension parameter
    */
    @SerializedName("DlcExtInfo")
    @Expose
    private String DlcExtInfo;

    /**
    * Query database required or not
    */
    @SerializedName("QueryDbData")
    @Expose
    private String QueryDbData;

    /**
    * Data table Id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
    */
    @SerializedName("TableType")
    @Expose
    private Long TableType;

    /**
     * Get data source Id 
     * @return DataSourceId data source Id
     */
    public Long getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set data source Id
     * @param DataSourceId data source Id
     */
    public void setDataSourceId(Long DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get sql content 
     * @return Sql sql content
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set sql content
     * @param Sql sql content
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get whether 
     * @return AsyncRequest whether
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set whether
     * @param AsyncRequest whether
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get async transaction id 
     * @return TranId async transaction id
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set async transaction id
     * @param TranId async transaction id
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get 11 
     * @return ParamList 11
     */
    public ParamCreateDTO [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set 11
     * @param ParamList 11
     */
    public void setParamList(ParamCreateDTO [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get DLC extension parameter 
     * @return DlcExtInfo DLC extension parameter
     */
    public String getDlcExtInfo() {
        return this.DlcExtInfo;
    }

    /**
     * Set DLC extension parameter
     * @param DlcExtInfo DLC extension parameter
     */
    public void setDlcExtInfo(String DlcExtInfo) {
        this.DlcExtInfo = DlcExtInfo;
    }

    /**
     * Get Query database required or not 
     * @return QueryDbData Query database required or not
     */
    public String getQueryDbData() {
        return this.QueryDbData;
    }

    /**
     * Set Query database required or not
     * @param QueryDbData Query database required or not
     */
    public void setQueryDbData(String QueryDbData) {
        this.QueryDbData = QueryDbData;
    }

    /**
     * Get Data table Id 
     * @return TableId Data table Id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Data table Id
     * @param TableId Data table Id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query. 
     * @return TableType The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     */
    public Long getTableType() {
        return this.TableType;
    }

    /**
     * Set The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     * @param TableType The backend provides a dictionary: table type, 1. database table creation, 2. SQL table creation, 3. Excel upload, 4. API connection, 5. Tencent documentation, 6. cloud database, 7. manually enter, 8. join query.
     */
    public void setTableType(Long TableType) {
        this.TableType = TableType;
    }

    public DescribeSourceFieldListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceFieldListRequest(DescribeSourceFieldListRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new Long(source.DataSourceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamCreateDTO[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamCreateDTO(source.ParamList[i]);
            }
        }
        if (source.DlcExtInfo != null) {
            this.DlcExtInfo = new String(source.DlcExtInfo);
        }
        if (source.QueryDbData != null) {
            this.QueryDbData = new String(source.QueryDbData);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableType != null) {
            this.TableType = new Long(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "DlcExtInfo", this.DlcExtInfo);
        this.setParamSimple(map, prefix + "QueryDbData", this.QueryDbData);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

