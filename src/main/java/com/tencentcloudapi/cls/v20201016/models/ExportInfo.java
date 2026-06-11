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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInfo extends AbstractModel {

    /**
    * <p>Log topic ID.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Log export task ID</p>
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
    * <p>Query statements of log export</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Filenames of exported logs</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Log file size</p><p>Unit: Byte</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>Sorting of log export time</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Log export format</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>Number of logs to be exported</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>Log download status. Processing: export in progress, Completed: export completed, Failed: export failure, Expired: log export expired (valid for 3 days), Queuing: queuing</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Start time of log export, with a timestamp in milliseconds</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>End time of log export, timestamp in milliseconds</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>Log export path, valid for one hour. Please download using this path as soon as possible.</p>
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * <p>Log export creation time<br>Date and Time Formats: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Syntax rule. Default value is 0.<br>0: Lucene syntax, 1: CQL syntax.</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>Export fields</p>
    */
    @SerializedName("DerivedFields")
    @Expose
    private String [] DerivedFields;

    /**
     * Get <p>Log topic ID.</p> 
     * @return TopicId <p>Log topic ID.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic ID.</p>
     * @param TopicId <p>Log topic ID.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Log export task ID</p> 
     * @return ExportId <p>Log export task ID</p>
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set <p>Log export task ID</p>
     * @param ExportId <p>Log export task ID</p>
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    /**
     * Get <p>Query statements of log export</p> 
     * @return Query <p>Query statements of log export</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query statements of log export</p>
     * @param Query <p>Query statements of log export</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Filenames of exported logs</p> 
     * @return FileName <p>Filenames of exported logs</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Filenames of exported logs</p>
     * @param FileName <p>Filenames of exported logs</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Log file size</p><p>Unit: Byte</p> 
     * @return FileSize <p>Log file size</p><p>Unit: Byte</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>Log file size</p><p>Unit: Byte</p>
     * @param FileSize <p>Log file size</p><p>Unit: Byte</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>Sorting of log export time</p> 
     * @return Order <p>Sorting of log export time</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting of log export time</p>
     * @param Order <p>Sorting of log export time</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Log export format</p> 
     * @return Format <p>Log export format</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>Log export format</p>
     * @param Format <p>Log export format</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Number of logs to be exported</p> 
     * @return Count <p>Number of logs to be exported</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of logs to be exported</p>
     * @param Count <p>Number of logs to be exported</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>Log download status. Processing: export in progress, Completed: export completed, Failed: export failure, Expired: log export expired (valid for 3 days), Queuing: queuing</p> 
     * @return Status <p>Log download status. Processing: export in progress, Completed: export completed, Failed: export failure, Expired: log export expired (valid for 3 days), Queuing: queuing</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Log download status. Processing: export in progress, Completed: export completed, Failed: export failure, Expired: log export expired (valid for 3 days), Queuing: queuing</p>
     * @param Status <p>Log download status. Processing: export in progress, Completed: export completed, Failed: export failure, Expired: log export expired (valid for 3 days), Queuing: queuing</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Start time of log export, with a timestamp in milliseconds</p> 
     * @return From <p>Start time of log export, with a timestamp in milliseconds</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>Start time of log export, with a timestamp in milliseconds</p>
     * @param From <p>Start time of log export, with a timestamp in milliseconds</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>End time of log export, timestamp in milliseconds</p> 
     * @return To <p>End time of log export, timestamp in milliseconds</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>End time of log export, timestamp in milliseconds</p>
     * @param To <p>End time of log export, timestamp in milliseconds</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>Log export path, valid for one hour. Please download using this path as soon as possible.</p> 
     * @return CosPath <p>Log export path, valid for one hour. Please download using this path as soon as possible.</p>
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set <p>Log export path, valid for one hour. Please download using this path as soon as possible.</p>
     * @param CosPath <p>Log export path, valid for one hour. Please download using this path as soon as possible.</p>
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get <p>Log export creation time<br>Date and Time Formats: yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>Log export creation time<br>Date and Time Formats: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Log export creation time<br>Date and Time Formats: yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>Log export creation time<br>Date and Time Formats: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Syntax rule. Default value is 0.<br>0: Lucene syntax, 1: CQL syntax.</p> 
     * @return SyntaxRule <p>Syntax rule. Default value is 0.<br>0: Lucene syntax, 1: CQL syntax.</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>Syntax rule. Default value is 0.<br>0: Lucene syntax, 1: CQL syntax.</p>
     * @param SyntaxRule <p>Syntax rule. Default value is 0.<br>0: Lucene syntax, 1: CQL syntax.</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>Export fields</p> 
     * @return DerivedFields <p>Export fields</p>
     */
    public String [] getDerivedFields() {
        return this.DerivedFields;
    }

    /**
     * Set <p>Export fields</p>
     * @param DerivedFields <p>Export fields</p>
     */
    public void setDerivedFields(String [] DerivedFields) {
        this.DerivedFields = DerivedFields;
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
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.DerivedFields != null) {
            this.DerivedFields = new String[source.DerivedFields.length];
            for (int i = 0; i < source.DerivedFields.length; i++) {
                this.DerivedFields[i] = new String(source.DerivedFields[i]);
            }
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
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamArraySimple(map, prefix + "DerivedFields.", this.DerivedFields);

    }
}

