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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSCloneInstancesRequest extends AbstractModel {

    /**
    * <p>Source instance ID.</p>
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * <P>Engine type</p>
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * <P>Creation end time</p>
    */
    @SerializedName("EndCreateTime")
    @Expose
    private String EndCreateTime;

    /**
    * <p>Clone kind: PITR time point BackupSet backup set</p>
    */
    @SerializedName("FilterCloneType")
    @Expose
    private String FilterCloneType;

    /**
    * <P>Query count [0,200]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Query offset [0,INF]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting field: CloneTime, CreateTime</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting type: ASC, DESC</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <P>Creation start time</p>
    */
    @SerializedName("StartCreateTime")
    @Expose
    private String StartCreateTime;

    /**
     * Get <p>Source instance ID.</p> 
     * @return SourceInstanceId <p>Source instance ID.</p>
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set <p>Source instance ID.</p>
     * @param SourceInstanceId <p>Source instance ID.</p>
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get <P>Engine type</p> 
     * @return DBType <P>Engine type</p>
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set <P>Engine type</p>
     * @param DBType <P>Engine type</p>
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get <P>Creation end time</p> 
     * @return EndCreateTime <P>Creation end time</p>
     */
    public String getEndCreateTime() {
        return this.EndCreateTime;
    }

    /**
     * Set <P>Creation end time</p>
     * @param EndCreateTime <P>Creation end time</p>
     */
    public void setEndCreateTime(String EndCreateTime) {
        this.EndCreateTime = EndCreateTime;
    }

    /**
     * Get <p>Clone kind: PITR time point BackupSet backup set</p> 
     * @return FilterCloneType <p>Clone kind: PITR time point BackupSet backup set</p>
     */
    public String getFilterCloneType() {
        return this.FilterCloneType;
    }

    /**
     * Set <p>Clone kind: PITR time point BackupSet backup set</p>
     * @param FilterCloneType <p>Clone kind: PITR time point BackupSet backup set</p>
     */
    public void setFilterCloneType(String FilterCloneType) {
        this.FilterCloneType = FilterCloneType;
    }

    /**
     * Get <P>Query count [0,200]</p> 
     * @return Limit <P>Query count [0,200]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <P>Query count [0,200]</p>
     * @param Limit <P>Query count [0,200]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Query offset [0,INF]</p> 
     * @return Offset <p>Query offset [0,INF]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Query offset [0,INF]</p>
     * @param Offset <p>Query offset [0,INF]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting field: CloneTime, CreateTime</p> 
     * @return OrderBy <p>Sorting field: CloneTime, CreateTime</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field: CloneTime, CreateTime</p>
     * @param OrderBy <p>Sorting field: CloneTime, CreateTime</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting type: ASC, DESC</p> 
     * @return OrderType <p>Sorting type: ASC, DESC</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting type: ASC, DESC</p>
     * @param OrderType <p>Sorting type: ASC, DESC</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <P>Creation start time</p> 
     * @return StartCreateTime <P>Creation start time</p>
     */
    public String getStartCreateTime() {
        return this.StartCreateTime;
    }

    /**
     * Set <P>Creation start time</p>
     * @param StartCreateTime <P>Creation start time</p>
     */
    public void setStartCreateTime(String StartCreateTime) {
        this.StartCreateTime = StartCreateTime;
    }

    public DescribeDBSCloneInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSCloneInstancesRequest(DescribeDBSCloneInstancesRequest source) {
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.EndCreateTime != null) {
            this.EndCreateTime = new String(source.EndCreateTime);
        }
        if (source.FilterCloneType != null) {
            this.FilterCloneType = new String(source.FilterCloneType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.StartCreateTime != null) {
            this.StartCreateTime = new String(source.StartCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "EndCreateTime", this.EndCreateTime);
        this.setParamSimple(map, prefix + "FilterCloneType", this.FilterCloneType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartCreateTime", this.StartCreateTime);

    }
}

