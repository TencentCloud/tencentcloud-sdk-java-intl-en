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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInfo extends AbstractModel {

    /**
    * Task ID of exported logs
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
    * Query statements of log export
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Filenames of exported logs
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
    * Sorting of log export time
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Log export format
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Number of logs to be exported
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Log download status. Processing: export in progress; Completed: export completed; Failed: export failed; Expired: log export expired (valid for 3 days).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Start time of log export, with a millisecond-level UNIX timestamp
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of log export, with a millisecond-level UNIX timestamp
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Log export path
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * Creation time of log export
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Task ID of exported logs 
     * @return ExportId Task ID of exported logs
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set Task ID of exported logs
     * @param ExportId Task ID of exported logs
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    /**
     * Get Query statements of log export 
     * @return Query Query statements of log export
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statements of log export
     * @param Query Query statements of log export
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Filenames of exported logs 
     * @return FileName Filenames of exported logs
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filenames of exported logs
     * @param FileName Filenames of exported logs
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
     * Get Sorting of log export time 
     * @return Order Sorting of log export time
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting of log export time
     * @param Order Sorting of log export time
     */
    public void setOrder(String Order) {
        this.Order = Order;
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
     * Get Log download status. Processing: export in progress; Completed: export completed; Failed: export failed; Expired: log export expired (valid for 3 days). 
     * @return Status Log download status. Processing: export in progress; Completed: export completed; Failed: export failed; Expired: log export expired (valid for 3 days).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Log download status. Processing: export in progress; Completed: export completed; Failed: export failed; Expired: log export expired (valid for 3 days).
     * @param Status Log download status. Processing: export in progress; Completed: export completed; Failed: export failed; Expired: log export expired (valid for 3 days).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Start time of log export, with a millisecond-level UNIX timestamp 
     * @return StartTime Start time of log export, with a millisecond-level UNIX timestamp
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of log export, with a millisecond-level UNIX timestamp
     * @param StartTime Start time of log export, with a millisecond-level UNIX timestamp
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of log export, with a millisecond-level UNIX timestamp 
     * @return EndTime End time of log export, with a millisecond-level UNIX timestamp
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of log export, with a millisecond-level UNIX timestamp
     * @param EndTime End time of log export, with a millisecond-level UNIX timestamp
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

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
     * Get Creation time of log export 
     * @return CreateTime Creation time of log export
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of log export
     * @param CreateTime Creation time of log export
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ExportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInfo(ExportInfo source) {
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

