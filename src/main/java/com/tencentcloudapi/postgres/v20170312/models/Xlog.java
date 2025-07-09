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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Xlog extends AbstractModel {

    /**
    * Unique backup file ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * File generation start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * File generation end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Download address on private network
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Download address on public network
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * Backup file size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Unique backup file ID 
     * @return Id Unique backup file ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique backup file ID
     * @param Id Unique backup file ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get File generation start time 
     * @return StartTime File generation start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set File generation start time
     * @param StartTime File generation start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get File generation end time 
     * @return EndTime File generation end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set File generation end time
     * @param EndTime File generation end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Download address on private network 
     * @return InternalAddr Download address on private network
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Download address on private network
     * @param InternalAddr Download address on private network
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Download address on public network 
     * @return ExternalAddr Download address on public network
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Download address on public network
     * @param ExternalAddr Download address on public network
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get Backup file size 
     * @return Size Backup file size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup file size
     * @param Size Backup file size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public Xlog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Xlog(Xlog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

