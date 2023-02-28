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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogExportRequest extends AbstractModel{

    /**
    * Export identifier name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Start time (required)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query statement, which is required and can contain up to 4,096 characters.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * End time (required)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Project ID (required)
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Filter field
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
     * Get Export identifier name 
     * @return Name Export identifier name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Export identifier name
     * @param Name Export identifier name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Start time (required) 
     * @return StartTime Start time (required)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (required)
     * @param StartTime Start time (required)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query statement, which is required and can contain up to 4,096 characters. 
     * @return Query Query statement, which is required and can contain up to 4,096 characters.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement, which is required and can contain up to 4,096 characters.
     * @param Query Query statement, which is required and can contain up to 4,096 characters.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get End time (required) 
     * @return EndTime End time (required)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (required)
     * @param EndTime End time (required)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Project ID (required) 
     * @return ID Project ID (required)
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID (required)
     * @param ID Project ID (required)
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Filter field 
     * @return Fields Filter field
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set Filter field
     * @param Fields Filter field
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    public DescribeRumLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogExportRequest(DescribeRumLogExportRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);

    }
}

