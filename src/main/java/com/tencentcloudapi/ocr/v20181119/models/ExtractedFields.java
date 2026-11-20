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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractedFields extends AbstractModel {

    /**
    * <p>Title, such as &quot;Exit and Entry Record Query Result of the National Immigration Administration (Electronic Document)&quot;</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>Query number</p>
    */
    @SerializedName("QueryNo")
    @Expose
    private String QueryNo;

    /**
    * <p>Query date</p>
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
    * <p>Date of issue</p>
    */
    @SerializedName("GenerateDate")
    @Expose
    private String GenerateDate;

    /**
    * <p>Information of the inquirer</p>
    */
    @SerializedName("PersonInfo")
    @Expose
    private PersonInfo PersonInfo;

    /**
    * <p>List of entry and exit records</p>
    */
    @SerializedName("Records")
    @Expose
    private Record [] Records;

    /**
    * <p>Start time of the query range</p>
    */
    @SerializedName("QueryPeriodStart")
    @Expose
    private String QueryPeriodStart;

    /**
    * <p>End time of the query range</p>
    */
    @SerializedName("QueryPeriodEnd")
    @Expose
    private String QueryPeriodEnd;

    /**
     * Get <p>Title, such as &quot;Exit and Entry Record Query Result of the National Immigration Administration (Electronic Document)&quot;</p> 
     * @return Title <p>Title, such as &quot;Exit and Entry Record Query Result of the National Immigration Administration (Electronic Document)&quot;</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>Title, such as &quot;Exit and Entry Record Query Result of the National Immigration Administration (Electronic Document)&quot;</p>
     * @param Title <p>Title, such as &quot;Exit and Entry Record Query Result of the National Immigration Administration (Electronic Document)&quot;</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>Query number</p> 
     * @return QueryNo <p>Query number</p>
     */
    public String getQueryNo() {
        return this.QueryNo;
    }

    /**
     * Set <p>Query number</p>
     * @param QueryNo <p>Query number</p>
     */
    public void setQueryNo(String QueryNo) {
        this.QueryNo = QueryNo;
    }

    /**
     * Get <p>Query date</p> 
     * @return QueryDate <p>Query date</p>
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set <p>Query date</p>
     * @param QueryDate <p>Query date</p>
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    /**
     * Get <p>Date of issue</p> 
     * @return GenerateDate <p>Date of issue</p>
     */
    public String getGenerateDate() {
        return this.GenerateDate;
    }

    /**
     * Set <p>Date of issue</p>
     * @param GenerateDate <p>Date of issue</p>
     */
    public void setGenerateDate(String GenerateDate) {
        this.GenerateDate = GenerateDate;
    }

    /**
     * Get <p>Information of the inquirer</p> 
     * @return PersonInfo <p>Information of the inquirer</p>
     */
    public PersonInfo getPersonInfo() {
        return this.PersonInfo;
    }

    /**
     * Set <p>Information of the inquirer</p>
     * @param PersonInfo <p>Information of the inquirer</p>
     */
    public void setPersonInfo(PersonInfo PersonInfo) {
        this.PersonInfo = PersonInfo;
    }

    /**
     * Get <p>List of entry and exit records</p> 
     * @return Records <p>List of entry and exit records</p>
     */
    public Record [] getRecords() {
        return this.Records;
    }

    /**
     * Set <p>List of entry and exit records</p>
     * @param Records <p>List of entry and exit records</p>
     */
    public void setRecords(Record [] Records) {
        this.Records = Records;
    }

    /**
     * Get <p>Start time of the query range</p> 
     * @return QueryPeriodStart <p>Start time of the query range</p>
     */
    public String getQueryPeriodStart() {
        return this.QueryPeriodStart;
    }

    /**
     * Set <p>Start time of the query range</p>
     * @param QueryPeriodStart <p>Start time of the query range</p>
     */
    public void setQueryPeriodStart(String QueryPeriodStart) {
        this.QueryPeriodStart = QueryPeriodStart;
    }

    /**
     * Get <p>End time of the query range</p> 
     * @return QueryPeriodEnd <p>End time of the query range</p>
     */
    public String getQueryPeriodEnd() {
        return this.QueryPeriodEnd;
    }

    /**
     * Set <p>End time of the query range</p>
     * @param QueryPeriodEnd <p>End time of the query range</p>
     */
    public void setQueryPeriodEnd(String QueryPeriodEnd) {
        this.QueryPeriodEnd = QueryPeriodEnd;
    }

    public ExtractedFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractedFields(ExtractedFields source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QueryNo != null) {
            this.QueryNo = new String(source.QueryNo);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
        }
        if (source.GenerateDate != null) {
            this.GenerateDate = new String(source.GenerateDate);
        }
        if (source.PersonInfo != null) {
            this.PersonInfo = new PersonInfo(source.PersonInfo);
        }
        if (source.Records != null) {
            this.Records = new Record[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new Record(source.Records[i]);
            }
        }
        if (source.QueryPeriodStart != null) {
            this.QueryPeriodStart = new String(source.QueryPeriodStart);
        }
        if (source.QueryPeriodEnd != null) {
            this.QueryPeriodEnd = new String(source.QueryPeriodEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QueryNo", this.QueryNo);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);
        this.setParamSimple(map, prefix + "GenerateDate", this.GenerateDate);
        this.setParamObj(map, prefix + "PersonInfo.", this.PersonInfo);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "QueryPeriodStart", this.QueryPeriodStart);
        this.setParamSimple(map, prefix + "QueryPeriodEnd", this.QueryPeriodEnd);

    }
}

