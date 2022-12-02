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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompareReportRequest extends AbstractModel{

    /**
    * Migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Check task ID
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * Number of inconsistent objects to be returned
    */
    @SerializedName("DifferenceLimit")
    @Expose
    private Long DifferenceLimit;

    /**
    * Offset of inconsistent objects
    */
    @SerializedName("DifferenceOffset")
    @Expose
    private Long DifferenceOffset;

    /**
    * Search criterion: Inconsistent database name
    */
    @SerializedName("DifferenceDB")
    @Expose
    private String DifferenceDB;

    /**
    * Search criterion: Inconsistent table name
    */
    @SerializedName("DifferenceTable")
    @Expose
    private String DifferenceTable;

    /**
    * Number of unchecked objects to be returned
    */
    @SerializedName("SkippedLimit")
    @Expose
    private Long SkippedLimit;

    /**
    * Offset of unchecked objects
    */
    @SerializedName("SkippedOffset")
    @Expose
    private Long SkippedOffset;

    /**
    * Search criterion: Unchecked database name
    */
    @SerializedName("SkippedDB")
    @Expose
    private String SkippedDB;

    /**
    * Search criterion: Unchecked table name
    */
    @SerializedName("SkippedTable")
    @Expose
    private String SkippedTable;

    /**
     * Get Migration task ID 
     * @return JobId Migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Migration task ID
     * @param JobId Migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Check task ID 
     * @return CompareTaskId Check task ID
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set Check task ID
     * @param CompareTaskId Check task ID
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get Number of inconsistent objects to be returned 
     * @return DifferenceLimit Number of inconsistent objects to be returned
     */
    public Long getDifferenceLimit() {
        return this.DifferenceLimit;
    }

    /**
     * Set Number of inconsistent objects to be returned
     * @param DifferenceLimit Number of inconsistent objects to be returned
     */
    public void setDifferenceLimit(Long DifferenceLimit) {
        this.DifferenceLimit = DifferenceLimit;
    }

    /**
     * Get Offset of inconsistent objects 
     * @return DifferenceOffset Offset of inconsistent objects
     */
    public Long getDifferenceOffset() {
        return this.DifferenceOffset;
    }

    /**
     * Set Offset of inconsistent objects
     * @param DifferenceOffset Offset of inconsistent objects
     */
    public void setDifferenceOffset(Long DifferenceOffset) {
        this.DifferenceOffset = DifferenceOffset;
    }

    /**
     * Get Search criterion: Inconsistent database name 
     * @return DifferenceDB Search criterion: Inconsistent database name
     */
    public String getDifferenceDB() {
        return this.DifferenceDB;
    }

    /**
     * Set Search criterion: Inconsistent database name
     * @param DifferenceDB Search criterion: Inconsistent database name
     */
    public void setDifferenceDB(String DifferenceDB) {
        this.DifferenceDB = DifferenceDB;
    }

    /**
     * Get Search criterion: Inconsistent table name 
     * @return DifferenceTable Search criterion: Inconsistent table name
     */
    public String getDifferenceTable() {
        return this.DifferenceTable;
    }

    /**
     * Set Search criterion: Inconsistent table name
     * @param DifferenceTable Search criterion: Inconsistent table name
     */
    public void setDifferenceTable(String DifferenceTable) {
        this.DifferenceTable = DifferenceTable;
    }

    /**
     * Get Number of unchecked objects to be returned 
     * @return SkippedLimit Number of unchecked objects to be returned
     */
    public Long getSkippedLimit() {
        return this.SkippedLimit;
    }

    /**
     * Set Number of unchecked objects to be returned
     * @param SkippedLimit Number of unchecked objects to be returned
     */
    public void setSkippedLimit(Long SkippedLimit) {
        this.SkippedLimit = SkippedLimit;
    }

    /**
     * Get Offset of unchecked objects 
     * @return SkippedOffset Offset of unchecked objects
     */
    public Long getSkippedOffset() {
        return this.SkippedOffset;
    }

    /**
     * Set Offset of unchecked objects
     * @param SkippedOffset Offset of unchecked objects
     */
    public void setSkippedOffset(Long SkippedOffset) {
        this.SkippedOffset = SkippedOffset;
    }

    /**
     * Get Search criterion: Unchecked database name 
     * @return SkippedDB Search criterion: Unchecked database name
     */
    public String getSkippedDB() {
        return this.SkippedDB;
    }

    /**
     * Set Search criterion: Unchecked database name
     * @param SkippedDB Search criterion: Unchecked database name
     */
    public void setSkippedDB(String SkippedDB) {
        this.SkippedDB = SkippedDB;
    }

    /**
     * Get Search criterion: Unchecked table name 
     * @return SkippedTable Search criterion: Unchecked table name
     */
    public String getSkippedTable() {
        return this.SkippedTable;
    }

    /**
     * Set Search criterion: Unchecked table name
     * @param SkippedTable Search criterion: Unchecked table name
     */
    public void setSkippedTable(String SkippedTable) {
        this.SkippedTable = SkippedTable;
    }

    public DescribeCompareReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareReportRequest(DescribeCompareReportRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.DifferenceLimit != null) {
            this.DifferenceLimit = new Long(source.DifferenceLimit);
        }
        if (source.DifferenceOffset != null) {
            this.DifferenceOffset = new Long(source.DifferenceOffset);
        }
        if (source.DifferenceDB != null) {
            this.DifferenceDB = new String(source.DifferenceDB);
        }
        if (source.DifferenceTable != null) {
            this.DifferenceTable = new String(source.DifferenceTable);
        }
        if (source.SkippedLimit != null) {
            this.SkippedLimit = new Long(source.SkippedLimit);
        }
        if (source.SkippedOffset != null) {
            this.SkippedOffset = new Long(source.SkippedOffset);
        }
        if (source.SkippedDB != null) {
            this.SkippedDB = new String(source.SkippedDB);
        }
        if (source.SkippedTable != null) {
            this.SkippedTable = new String(source.SkippedTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "DifferenceLimit", this.DifferenceLimit);
        this.setParamSimple(map, prefix + "DifferenceOffset", this.DifferenceOffset);
        this.setParamSimple(map, prefix + "DifferenceDB", this.DifferenceDB);
        this.setParamSimple(map, prefix + "DifferenceTable", this.DifferenceTable);
        this.setParamSimple(map, prefix + "SkippedLimit", this.SkippedLimit);
        this.setParamSimple(map, prefix + "SkippedOffset", this.SkippedOffset);
        this.setParamSimple(map, prefix + "SkippedDB", this.SkippedDB);
        this.setParamSimple(map, prefix + "SkippedTable", this.SkippedTable);

    }
}

