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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogExport extends AbstractModel {

    /**
    * Log export path
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * Number of logs to be exported
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Log export task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Log export task ID
    */
    @SerializedName("ExportID")
    @Expose
    private String ExportID;

    /**
    * Log export filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Log file size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Log export format
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Log export time sorting
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Log export query statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Log export start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log export end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Log download status. Valid values: Queuing: queuing; Processing: exporting; Complete: completed; Failed: failed; Expired: expired (3-day validity period).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Log export path 
     * @return CosPath Log export path
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set Log export path
     * @param CosPath Log export path
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get Number of logs to be exported 
     * @return Count Number of logs to be exported
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of logs to be exported
     * @param Count Number of logs to be exported
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Log export task creation time 
     * @return CreateTime Log export task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Log export task creation time
     * @param CreateTime Log export task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Log export task ID 
     * @return ExportID Log export task ID
     */
    public String getExportID() {
        return this.ExportID;
    }

    /**
     * Set Log export task ID
     * @param ExportID Log export task ID
     */
    public void setExportID(String ExportID) {
        this.ExportID = ExportID;
    }

    /**
     * Get Log export filename 
     * @return FileName Log export filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Log export filename
     * @param FileName Log export filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Log file size 
     * @return FileSize Log file size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Log file size
     * @param FileSize Log file size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Log export format 
     * @return Format Log export format
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Log export format
     * @param Format Log export format
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Log export time sorting 
     * @return Order Log export time sorting
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Log export time sorting
     * @param Order Log export time sorting
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Log export query statement 
     * @return Query Log export query statement
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Log export query statement
     * @param Query Log export query statement
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Log export start time 
     * @return StartTime Log export start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log export start time
     * @param StartTime Log export start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log export end time 
     * @return EndTime Log export end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log export end time
     * @param EndTime Log export end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Log download status. Valid values: Queuing: queuing; Processing: exporting; Complete: completed; Failed: failed; Expired: expired (3-day validity period). 
     * @return Status Log download status. Valid values: Queuing: queuing; Processing: exporting; Complete: completed; Failed: failed; Expired: expired (3-day validity period).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Log download status. Valid values: Queuing: queuing; Processing: exporting; Complete: completed; Failed: failed; Expired: expired (3-day validity period).
     * @param Status Log download status. Valid values: Queuing: queuing; Processing: exporting; Complete: completed; Failed: failed; Expired: expired (3-day validity period).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public LogExport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogExport(LogExport source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExportID != null) {
            this.ExportID = new String(source.ExportID);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExportID", this.ExportID);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

