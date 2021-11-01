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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInfo extends AbstractModel{

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log export task ID
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
    * Log export query statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

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
    * Log export time sorting
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
    * Log download status. Valid values: `Processing`: exporting; `Complete`: completed; `Failed`: failed; `Expired`: expired (3-day validity period).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Log export start time
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * Log export end time
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Log export path
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * Log export creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log export task ID 
     * @return ExportId Log export task ID
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set Log export task ID
     * @param ExportId Log export task ID
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
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
     * Get Log download status. Valid values: `Processing`: exporting; `Complete`: completed; `Failed`: failed; `Expired`: expired (3-day validity period). 
     * @return Status Log download status. Valid values: `Processing`: exporting; `Complete`: completed; `Failed`: failed; `Expired`: expired (3-day validity period).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Log download status. Valid values: `Processing`: exporting; `Complete`: completed; `Failed`: failed; `Expired`: expired (3-day validity period).
     * @param Status Log download status. Valid values: `Processing`: exporting; `Complete`: completed; `Failed`: failed; `Expired`: expired (3-day validity period).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Log export start time 
     * @return From Log export start time
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Log export start time
     * @param From Log export start time
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get Log export end time 
     * @return To Log export end time
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set Log export end time
     * @param To Log export end time
     */
    public void setTo(Long To) {
        this.To = To;
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
     * Get Log export creation time 
     * @return CreateTime Log export creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Log export creation time
     * @param CreateTime Log export creation time
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
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
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
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

