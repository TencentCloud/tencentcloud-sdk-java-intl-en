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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewRow extends AbstractModel {

    /**
    * Table name
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Number of read requests
    */
    @SerializedName("ReadRequestCount")
    @Expose
    private Float ReadRequestCount;

    /**
    * Number of write requests
    */
    @SerializedName("WriteRequestCount")
    @Expose
    private Float WriteRequestCount;

    /**
    * Current memstore size
    */
    @SerializedName("MemstoreSize")
    @Expose
    private Float MemstoreSize;

    /**
    * Size of StoreFile in the current region
    */
    @SerializedName("StoreFileSize")
    @Expose
    private Float StoreFileSize;

    /**
    * Regions. Click to jump.
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * StoreFile quantity. 
    */
    @SerializedName("StoreFileNum")
    @Expose
    private Float StoreFileNum;

    /**
     * Get Table name 
     * @return Table Table name
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name
     * @param Table Table name
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Number of read requests 
     * @return ReadRequestCount Number of read requests
     */
    public Float getReadRequestCount() {
        return this.ReadRequestCount;
    }

    /**
     * Set Number of read requests
     * @param ReadRequestCount Number of read requests
     */
    public void setReadRequestCount(Float ReadRequestCount) {
        this.ReadRequestCount = ReadRequestCount;
    }

    /**
     * Get Number of write requests 
     * @return WriteRequestCount Number of write requests
     */
    public Float getWriteRequestCount() {
        return this.WriteRequestCount;
    }

    /**
     * Set Number of write requests
     * @param WriteRequestCount Number of write requests
     */
    public void setWriteRequestCount(Float WriteRequestCount) {
        this.WriteRequestCount = WriteRequestCount;
    }

    /**
     * Get Current memstore size 
     * @return MemstoreSize Current memstore size
     */
    public Float getMemstoreSize() {
        return this.MemstoreSize;
    }

    /**
     * Set Current memstore size
     * @param MemstoreSize Current memstore size
     */
    public void setMemstoreSize(Float MemstoreSize) {
        this.MemstoreSize = MemstoreSize;
    }

    /**
     * Get Size of StoreFile in the current region 
     * @return StoreFileSize Size of StoreFile in the current region
     */
    public Float getStoreFileSize() {
        return this.StoreFileSize;
    }

    /**
     * Set Size of StoreFile in the current region
     * @param StoreFileSize Size of StoreFile in the current region
     */
    public void setStoreFileSize(Float StoreFileSize) {
        this.StoreFileSize = StoreFileSize;
    }

    /**
     * Get Regions. Click to jump. 
     * @return Operation Regions. Click to jump.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Regions. Click to jump.
     * @param Operation Regions. Click to jump.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get StoreFile quantity.  
     * @return StoreFileNum StoreFile quantity. 
     */
    public Float getStoreFileNum() {
        return this.StoreFileNum;
    }

    /**
     * Set StoreFile quantity. 
     * @param StoreFileNum StoreFile quantity. 
     */
    public void setStoreFileNum(Float StoreFileNum) {
        this.StoreFileNum = StoreFileNum;
    }

    public OverviewRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewRow(OverviewRow source) {
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.ReadRequestCount != null) {
            this.ReadRequestCount = new Float(source.ReadRequestCount);
        }
        if (source.WriteRequestCount != null) {
            this.WriteRequestCount = new Float(source.WriteRequestCount);
        }
        if (source.MemstoreSize != null) {
            this.MemstoreSize = new Float(source.MemstoreSize);
        }
        if (source.StoreFileSize != null) {
            this.StoreFileSize = new Float(source.StoreFileSize);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.StoreFileNum != null) {
            this.StoreFileNum = new Float(source.StoreFileNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "ReadRequestCount", this.ReadRequestCount);
        this.setParamSimple(map, prefix + "WriteRequestCount", this.WriteRequestCount);
        this.setParamSimple(map, prefix + "MemstoreSize", this.MemstoreSize);
        this.setParamSimple(map, prefix + "StoreFileSize", this.StoreFileSize);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "StoreFileNum", this.StoreFileNum);

    }
}

