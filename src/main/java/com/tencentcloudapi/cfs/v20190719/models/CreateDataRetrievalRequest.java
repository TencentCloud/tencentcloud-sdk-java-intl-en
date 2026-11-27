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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataRetrievalRequest extends AbstractModel {

    /**
    * <p>File system instance ID, which can be obtained through the DescribeCfsFileSystems API. Example value: cfs-xxxxxx</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Data retrieval name. Example value: DataDive</p>
    */
    @SerializedName("DataRetrievalName")
    @Expose
    private String DataRetrievalName;

    /**
    * <p>Aggregated retrieval condition. Example value: from entries|where size &gt;4096</p>
    */
    @SerializedName("CompoundCondition")
    @Expose
    private String CompoundCondition;

    /**
    * <p>List retrieval condition.</p>
    */
    @SerializedName("QueryCondition")
    @Expose
    private String QueryCondition;

    /**
    * <p>Monthly data retrieval. Valid values: 1–31. The retrieval will be automatically created on the specified day of each month. For example, 1 indicates the 1st day of a month. You must specify either this parameter or DayOfWeek. Example value: 1</p>
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * <p>Day of the week for data retrieval repetition. Valid values: 1–7. 1 indicates Monday and 7 indicates Sunday. You must specify either this parameter or DayOfMonth. Example value: 2,3</p>
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * <p>Hour of the day for repetition. Valid values: 0–23. Example value: 1,3,5</p>
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
     * Get <p>File system instance ID, which can be obtained through the DescribeCfsFileSystems API. Example value: cfs-xxxxxx</p> 
     * @return FileSystemId <p>File system instance ID, which can be obtained through the DescribeCfsFileSystems API. Example value: cfs-xxxxxx</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system instance ID, which can be obtained through the DescribeCfsFileSystems API. Example value: cfs-xxxxxx</p>
     * @param FileSystemId <p>File system instance ID, which can be obtained through the DescribeCfsFileSystems API. Example value: cfs-xxxxxx</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Data retrieval name. Example value: DataDive</p> 
     * @return DataRetrievalName <p>Data retrieval name. Example value: DataDive</p>
     */
    public String getDataRetrievalName() {
        return this.DataRetrievalName;
    }

    /**
     * Set <p>Data retrieval name. Example value: DataDive</p>
     * @param DataRetrievalName <p>Data retrieval name. Example value: DataDive</p>
     */
    public void setDataRetrievalName(String DataRetrievalName) {
        this.DataRetrievalName = DataRetrievalName;
    }

    /**
     * Get <p>Aggregated retrieval condition. Example value: from entries|where size &gt;4096</p> 
     * @return CompoundCondition <p>Aggregated retrieval condition. Example value: from entries|where size &gt;4096</p>
     */
    public String getCompoundCondition() {
        return this.CompoundCondition;
    }

    /**
     * Set <p>Aggregated retrieval condition. Example value: from entries|where size &gt;4096</p>
     * @param CompoundCondition <p>Aggregated retrieval condition. Example value: from entries|where size &gt;4096</p>
     */
    public void setCompoundCondition(String CompoundCondition) {
        this.CompoundCondition = CompoundCondition;
    }

    /**
     * Get <p>List retrieval condition.</p> 
     * @return QueryCondition <p>List retrieval condition.</p>
     */
    public String getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set <p>List retrieval condition.</p>
     * @param QueryCondition <p>List retrieval condition.</p>
     */
    public void setQueryCondition(String QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get <p>Monthly data retrieval. Valid values: 1–31. The retrieval will be automatically created on the specified day of each month. For example, 1 indicates the 1st day of a month. You must specify either this parameter or DayOfWeek. Example value: 1</p> 
     * @return DayOfMonth <p>Monthly data retrieval. Valid values: 1–31. The retrieval will be automatically created on the specified day of each month. For example, 1 indicates the 1st day of a month. You must specify either this parameter or DayOfWeek. Example value: 1</p>
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set <p>Monthly data retrieval. Valid values: 1–31. The retrieval will be automatically created on the specified day of each month. For example, 1 indicates the 1st day of a month. You must specify either this parameter or DayOfWeek. Example value: 1</p>
     * @param DayOfMonth <p>Monthly data retrieval. Valid values: 1–31. The retrieval will be automatically created on the specified day of each month. For example, 1 indicates the 1st day of a month. You must specify either this parameter or DayOfWeek. Example value: 1</p>
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get <p>Day of the week for data retrieval repetition. Valid values: 1–7. 1 indicates Monday and 7 indicates Sunday. You must specify either this parameter or DayOfMonth. Example value: 2,3</p> 
     * @return DayOfWeek <p>Day of the week for data retrieval repetition. Valid values: 1–7. 1 indicates Monday and 7 indicates Sunday. You must specify either this parameter or DayOfMonth. Example value: 2,3</p>
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set <p>Day of the week for data retrieval repetition. Valid values: 1–7. 1 indicates Monday and 7 indicates Sunday. You must specify either this parameter or DayOfMonth. Example value: 2,3</p>
     * @param DayOfWeek <p>Day of the week for data retrieval repetition. Valid values: 1–7. 1 indicates Monday and 7 indicates Sunday. You must specify either this parameter or DayOfMonth. Example value: 2,3</p>
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get <p>Hour of the day for repetition. Valid values: 0–23. Example value: 1,3,5</p> 
     * @return Hour <p>Hour of the day for repetition. Valid values: 0–23. Example value: 1,3,5</p>
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set <p>Hour of the day for repetition. Valid values: 0–23. Example value: 1,3,5</p>
     * @param Hour <p>Hour of the day for repetition. Valid values: 0–23. Example value: 1,3,5</p>
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    public CreateDataRetrievalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataRetrievalRequest(CreateDataRetrievalRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.DataRetrievalName != null) {
            this.DataRetrievalName = new String(source.DataRetrievalName);
        }
        if (source.CompoundCondition != null) {
            this.CompoundCondition = new String(source.CompoundCondition);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new String(source.QueryCondition);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "DataRetrievalName", this.DataRetrievalName);
        this.setParamSimple(map, prefix + "CompoundCondition", this.CompoundCondition);
        this.setParamSimple(map, prefix + "QueryCondition", this.QueryCondition);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);

    }
}

