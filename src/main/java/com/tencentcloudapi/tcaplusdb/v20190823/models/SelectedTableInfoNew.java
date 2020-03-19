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

public class SelectedTableInfoNew extends AbstractModel{

    /**
    * ID of the table group where a table resides
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table instance ID
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Table description language type. Valid values: PROTO, TDR
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * Table data structure type. Valid values: GENERIC, LIST
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Number of LIST-type table elements
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * Reserved table capacity in GB
    */
    @SerializedName("ReservedVolume")
    @Expose
    private Long ReservedVolume;

    /**
    * Reserved table read QPS
    */
    @SerializedName("ReservedReadQps")
    @Expose
    private Long ReservedReadQps;

    /**
    * Reserved table write QPS
    */
    @SerializedName("ReservedWriteQps")
    @Expose
    private Long ReservedWriteQps;

    /**
    * Table remarks
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
    * Key rollback filename, which is only used for rollback
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Key rollback file extension, which is only used for rollback
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * Key rollback file size, which is only used for rollback
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Key rollback file content, which is only used for rollback
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get ID of the table group where a table resides 
     * @return TableGroupId ID of the table group where a table resides
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group where a table resides
     * @param TableGroupId ID of the table group where a table resides
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table instance ID 
     * @return TableInstanceId Table instance ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Table instance ID
     * @param TableInstanceId Table instance ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Table description language type. Valid values: PROTO, TDR 
     * @return TableIdlType Table description language type. Valid values: PROTO, TDR
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set Table description language type. Valid values: PROTO, TDR
     * @param TableIdlType Table description language type. Valid values: PROTO, TDR
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get Table data structure type. Valid values: GENERIC, LIST 
     * @return TableType Table data structure type. Valid values: GENERIC, LIST
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table data structure type. Valid values: GENERIC, LIST
     * @param TableType Table data structure type. Valid values: GENERIC, LIST
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Number of LIST-type table elements 
     * @return ListElementNum Number of LIST-type table elements
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set Number of LIST-type table elements
     * @param ListElementNum Number of LIST-type table elements
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get Reserved table capacity in GB 
     * @return ReservedVolume Reserved table capacity in GB
     */
    public Long getReservedVolume() {
        return this.ReservedVolume;
    }

    /**
     * Set Reserved table capacity in GB
     * @param ReservedVolume Reserved table capacity in GB
     */
    public void setReservedVolume(Long ReservedVolume) {
        this.ReservedVolume = ReservedVolume;
    }

    /**
     * Get Reserved table read QPS 
     * @return ReservedReadQps Reserved table read QPS
     */
    public Long getReservedReadQps() {
        return this.ReservedReadQps;
    }

    /**
     * Set Reserved table read QPS
     * @param ReservedReadQps Reserved table read QPS
     */
    public void setReservedReadQps(Long ReservedReadQps) {
        this.ReservedReadQps = ReservedReadQps;
    }

    /**
     * Get Reserved table write QPS 
     * @return ReservedWriteQps Reserved table write QPS
     */
    public Long getReservedWriteQps() {
        return this.ReservedWriteQps;
    }

    /**
     * Set Reserved table write QPS
     * @param ReservedWriteQps Reserved table write QPS
     */
    public void setReservedWriteQps(Long ReservedWriteQps) {
        this.ReservedWriteQps = ReservedWriteQps;
    }

    /**
     * Get Table remarks 
     * @return Memo Table remarks
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set Table remarks
     * @param Memo Table remarks
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * Get Key rollback filename, which is only used for rollback 
     * @return FileName Key rollback filename, which is only used for rollback
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Key rollback filename, which is only used for rollback
     * @param FileName Key rollback filename, which is only used for rollback
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Key rollback file extension, which is only used for rollback 
     * @return FileExtType Key rollback file extension, which is only used for rollback
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set Key rollback file extension, which is only used for rollback
     * @param FileExtType Key rollback file extension, which is only used for rollback
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get Key rollback file size, which is only used for rollback 
     * @return FileSize Key rollback file size, which is only used for rollback
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Key rollback file size, which is only used for rollback
     * @param FileSize Key rollback file size, which is only used for rollback
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Key rollback file content, which is only used for rollback 
     * @return FileContent Key rollback file content, which is only used for rollback
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set Key rollback file content, which is only used for rollback
     * @param FileContent Key rollback file content, which is only used for rollback
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamSimple(map, prefix + "ReservedVolume", this.ReservedVolume);
        this.setParamSimple(map, prefix + "ReservedReadQps", this.ReservedReadQps);
        this.setParamSimple(map, prefix + "ReservedWriteQps", this.ReservedWriteQps);
        this.setParamSimple(map, prefix + "Memo", this.Memo);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

