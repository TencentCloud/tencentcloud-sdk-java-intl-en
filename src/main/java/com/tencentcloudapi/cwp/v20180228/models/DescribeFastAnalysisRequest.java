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

public class DescribeFastAnalysisRequest extends AbstractModel {

    /**
    * Start time. Unit: ms.
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time. Unit: ms.
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Query statement, up to 4096 in statement length
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Log field name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get Start time. Unit: ms. 
     * @return From Start time. Unit: ms.
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time. Unit: ms.
     * @param From Start time. Unit: ms.
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time. Unit: ms. 
     * @return To End time. Unit: ms.
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time. Unit: ms.
     * @param To End time. Unit: ms.
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Query statement, up to 4096 in statement length 
     * @return Query Query statement, up to 4096 in statement length
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement, up to 4096 in statement length
     * @param Query Query statement, up to 4096 in statement length
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Log field name 
     * @return FieldName Log field name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Log field name
     * @param FieldName Log field name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public DescribeFastAnalysisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFastAnalysisRequest(DescribeFastAnalysisRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

