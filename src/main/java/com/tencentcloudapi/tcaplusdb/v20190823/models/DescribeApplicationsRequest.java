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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationsRequest extends AbstractModel{

    /**
    * ID of the cluster whose applications will be queried
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The maximum number of results returned per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Application status used as a filter condition
    */
    @SerializedName("CensorStatus")
    @Expose
    private Long CensorStatus;

    /**
    * Table group ID used as a filter condition
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name used as a filter condition
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Applicant UIN used as a filter condition
    */
    @SerializedName("Applicant")
    @Expose
    private String Applicant;

    /**
    * Application type used as a filter condition
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
     * Get ID of the cluster whose applications will be queried 
     * @return ClusterId ID of the cluster whose applications will be queried
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster whose applications will be queried
     * @param ClusterId ID of the cluster whose applications will be queried
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The maximum number of results returned per page 
     * @return Limit The maximum number of results returned per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned per page
     * @param Limit The maximum number of results returned per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Application status used as a filter condition 
     * @return CensorStatus Application status used as a filter condition
     */
    public Long getCensorStatus() {
        return this.CensorStatus;
    }

    /**
     * Set Application status used as a filter condition
     * @param CensorStatus Application status used as a filter condition
     */
    public void setCensorStatus(Long CensorStatus) {
        this.CensorStatus = CensorStatus;
    }

    /**
     * Get Table group ID used as a filter condition 
     * @return TableGroupId Table group ID used as a filter condition
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID used as a filter condition
     * @param TableGroupId Table group ID used as a filter condition
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name used as a filter condition 
     * @return TableName Table name used as a filter condition
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name used as a filter condition
     * @param TableName Table name used as a filter condition
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Applicant UIN used as a filter condition 
     * @return Applicant Applicant UIN used as a filter condition
     */
    public String getApplicant() {
        return this.Applicant;
    }

    /**
     * Set Applicant UIN used as a filter condition
     * @param Applicant Applicant UIN used as a filter condition
     */
    public void setApplicant(String Applicant) {
        this.Applicant = Applicant;
    }

    /**
     * Get Application type used as a filter condition 
     * @return ApplyType Application type used as a filter condition
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Application type used as a filter condition
     * @param ApplyType Application type used as a filter condition
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CensorStatus != null) {
            this.CensorStatus = new Long(source.CensorStatus);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Applicant != null) {
            this.Applicant = new String(source.Applicant);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CensorStatus", this.CensorStatus);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Applicant", this.Applicant);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

