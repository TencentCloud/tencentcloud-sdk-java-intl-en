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

public class AutoMapRule extends AbstractModel {

    /**
    * Source instance Id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * Source database regular
    */
    @SerializedName("SrcDatabaseRegex")
    @Expose
    private String SrcDatabaseRegex;

    /**
    * Source table regular
    */
    @SerializedName("SrcTableRegex")
    @Expose
    private String SrcTableRegex;

    /**
    * Target database regular
    */
    @SerializedName("DstDatabaseRegex")
    @Expose
    private String DstDatabaseRegex;

    /**
    * Target table regular
    */
    @SerializedName("DstTableRegex")
    @Expose
    private String DstTableRegex;

    /**
     * Get Source instance Id 
     * @return SrcInstanceId Source instance Id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set Source instance Id
     * @param SrcInstanceId Source instance Id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get Source database regular 
     * @return SrcDatabaseRegex Source database regular
     */
    public String getSrcDatabaseRegex() {
        return this.SrcDatabaseRegex;
    }

    /**
     * Set Source database regular
     * @param SrcDatabaseRegex Source database regular
     */
    public void setSrcDatabaseRegex(String SrcDatabaseRegex) {
        this.SrcDatabaseRegex = SrcDatabaseRegex;
    }

    /**
     * Get Source table regular 
     * @return SrcTableRegex Source table regular
     */
    public String getSrcTableRegex() {
        return this.SrcTableRegex;
    }

    /**
     * Set Source table regular
     * @param SrcTableRegex Source table regular
     */
    public void setSrcTableRegex(String SrcTableRegex) {
        this.SrcTableRegex = SrcTableRegex;
    }

    /**
     * Get Target database regular 
     * @return DstDatabaseRegex Target database regular
     */
    public String getDstDatabaseRegex() {
        return this.DstDatabaseRegex;
    }

    /**
     * Set Target database regular
     * @param DstDatabaseRegex Target database regular
     */
    public void setDstDatabaseRegex(String DstDatabaseRegex) {
        this.DstDatabaseRegex = DstDatabaseRegex;
    }

    /**
     * Get Target table regular 
     * @return DstTableRegex Target table regular
     */
    public String getDstTableRegex() {
        return this.DstTableRegex;
    }

    /**
     * Set Target table regular
     * @param DstTableRegex Target table regular
     */
    public void setDstTableRegex(String DstTableRegex) {
        this.DstTableRegex = DstTableRegex;
    }

    public AutoMapRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoMapRule(AutoMapRule source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcDatabaseRegex != null) {
            this.SrcDatabaseRegex = new String(source.SrcDatabaseRegex);
        }
        if (source.SrcTableRegex != null) {
            this.SrcTableRegex = new String(source.SrcTableRegex);
        }
        if (source.DstDatabaseRegex != null) {
            this.DstDatabaseRegex = new String(source.DstDatabaseRegex);
        }
        if (source.DstTableRegex != null) {
            this.DstTableRegex = new String(source.DstTableRegex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcDatabaseRegex", this.SrcDatabaseRegex);
        this.setParamSimple(map, prefix + "SrcTableRegex", this.SrcTableRegex);
        this.setParamSimple(map, prefix + "DstDatabaseRegex", this.DstDatabaseRegex);
        this.setParamSimple(map, prefix + "DstTableRegex", this.DstTableRegex);

    }
}

