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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInstanceErrorLogsRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Earliest log time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Latest log time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Limit of Items
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Log level.
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * Keyword.
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
    * File type. Available values: csv, original
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Available values: Timestamp
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. ASC or DESC.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Earliest log time 
     * @return StartTime Earliest log time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Earliest log time
     * @param StartTime Earliest log time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Latest log time 
     * @return EndTime Latest log time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Latest log time
     * @param EndTime Latest log time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Limit of Items 
     * @return Limit Limit of Items
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit of Items
     * @param Limit Limit of Items
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Log level. 
     * @return LogLevels Log level.
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level.
     * @param LogLevels Log level.
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get Keyword. 
     * @return KeyWords Keyword.
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set Keyword.
     * @param KeyWords Keyword.
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get File type. Available values: csv, original 
     * @return FileType File type. Available values: csv, original
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. Available values: csv, original
     * @param FileType File type. Available values: csv, original
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Available values: Timestamp 
     * @return OrderBy Available values: Timestamp
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Available values: Timestamp
     * @param OrderBy Available values: Timestamp
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. ASC or DESC. 
     * @return OrderByType Sorting type. ASC or DESC.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. ASC or DESC.
     * @param OrderByType Sorting type. ASC or DESC.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public ExportInstanceErrorLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInstanceErrorLogsRequest(ExportInstanceErrorLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String[source.KeyWords.length];
            for (int i = 0; i < source.KeyWords.length; i++) {
                this.KeyWords[i] = new String(source.KeyWords[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

